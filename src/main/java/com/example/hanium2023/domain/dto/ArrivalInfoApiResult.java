package com.example.hanium2023.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArrivalInfoApiResult {
    @JsonProperty("barvlDt")
    private long arrivalTime;

    @JsonProperty("updnLine")
    private String direction;

    @JsonProperty("subwayId")
    private String lineName;

    @JsonProperty("trainLineNm")
    private String destination;

    @JsonProperty("recptnDt")
    private String createdAt;


}
