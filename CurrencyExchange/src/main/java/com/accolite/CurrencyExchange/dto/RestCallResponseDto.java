package com.accolite.CurrencyExchange.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RestCallResponseDto {
    @JsonProperty("success")
    String success;
    @JsonProperty("result")
    double result;
    @JsonProperty("date")
    Date date;
    @JsonProperty("info")
    InfoDto info;
    @JsonProperty("query")
    QueryDto query;
}
