package com.main.task.coder.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder({
        "Id",
        "Label",
        "Value"
})
public interface TalukaDto {
    @JsonProperty("Id")
    Long getId();

    @JsonProperty("Label")
    String getlabel();

    @JsonProperty("Value")
    String getvalue();

//    List<CityDto> getCites();
}
