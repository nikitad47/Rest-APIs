package com.accolite.CurrencyExchange.utils;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class RestCallService {
    

    public String conversionAPIMethod(String url) throws  Exception {
        HttpHeaders headers = new HttpHeaders();// 0EO3UheNFmCdv5faA0bmBoFM35o7JKkP
        headers.add("apiKey","dYQcbVgVnQdAWDyxKwGqjWB1ZVU7TfkA");
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        RestTemplate restTemplate=new RestTemplate();
        String response=restTemplate.exchange(url, HttpMethod.GET,entity, String.class).getBody();
        return response;
    }
}
