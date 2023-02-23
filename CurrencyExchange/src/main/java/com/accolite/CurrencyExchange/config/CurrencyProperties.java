package com.accolite.CurrencyExchange.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class CurrencyProperties {
    @Value("${api.url}")
    private String apiUrl;
}
