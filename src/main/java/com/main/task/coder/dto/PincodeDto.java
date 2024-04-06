package com.main.task.coder.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
            "countryId",
        "countryName",
        "stateName",
        "districtName",
        "talukaName",
        "cityName"
})
public interface PincodeDto {

    @JsonProperty("countryId")
    Long getcountry_id();

    @JsonProperty("countryName")
    String getcountry_name();

    @JsonProperty("stateName")
    String getstate_name();

    @JsonProperty("districtName")
    String getdistrict_name();

    @JsonProperty("talukaName")
    String gettaluka_name();

    @JsonProperty("cityName")
    String getcity_name();
}
