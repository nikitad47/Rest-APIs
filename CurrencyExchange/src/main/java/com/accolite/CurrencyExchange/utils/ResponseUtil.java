package com.accolite.CurrencyExchange.utils;

import com.accolite.CurrencyExchange.repository.AuditInfoRepository;
import com.accolite.CurrencyExchange.config.CurrencyProperties;
import com.accolite.CurrencyExchange.model.AuditInfo;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.*;

@Component
public class ResponseUtil {

    private static final Logger logger= LoggerFactory.getLogger(ResponseUtil.class);

    @Autowired
    RestCallService restCallService;

    @Autowired
    CurrencyProperties currencyProperties;

    @Autowired
    AuditInfoRepository auditInfoRepository;

    public String callMethod(String fromValue,String toValue,int amount) throws Exception {
            String url=currencyProperties.getApiUrl();
            logger.info(fromValue);
            url=url+"?to="+toValue+"&from="+fromValue+
                    "&amount="+amount;
            logger.info(url);
            String str=restCallService.conversionAPIMethod(url);
            JSONObject jso=new JSONObject(str);
            logger.info(jso.toString());

            AuditInfo auditInfo=new AuditInfo();
            if(jso!=null&& !jso.get("success").equals("false")){
                auditInfo.setResponse(RequestResponse.RESPONSE_JSON);
                auditInfo.setRequest(RequestResponse.REQUEST_JSON);
                auditInfo.setStatus(Status.RECEIVED_RESPONSE);
                auditInfo.setCreateTs(new Date());
                LocalDateTime localDateTime=LocalDateTime.now();
                auditInfo.setUPDATE_TS(localDateTime);
                auditInfoRepository.save(auditInfo);
            }
            else{
                logger.error("Error in the request");
            }
        return str;
    }
}
