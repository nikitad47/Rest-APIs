package com.accolite.CurrencyExchange.service.impl;

import com.accolite.CurrencyExchange.utils.CSVWritter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accolite.CurrencyExchange.service.AuditInfoService;
import com.accolite.CurrencyExchange.utils.ResponseUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AuditInfoServiceImpl implements AuditInfoService {

    private static final Logger logger= LoggerFactory.getLogger(AuditInfoServiceImpl.class);
    @Autowired
    ResponseUtil responseUtil;

    @Autowired
    CSVWritter csvWritter;
    @Override
    public String calculateCurrency(int amount) throws Exception {
        List<String> list=new ArrayList<>(Arrays.asList("AED","EUR","INR","JPY","CAD"));
        String toValue="USD";
        for(String fromValue:list){
            String response=responseUtil.callMethod(fromValue,toValue,amount);
            boolean b=csvWritter.makeEntry(response);
            if(b){
                logger.info("Entry made into the csv file");
            }
            else{
                logger.error("Failed to make the entry in the file");
            }
        }
        return "Completed";
    }
}
