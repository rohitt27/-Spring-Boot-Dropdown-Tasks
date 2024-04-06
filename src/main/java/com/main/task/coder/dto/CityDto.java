package com.main.task.coder.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;


@JsonPropertyOrder({
        "Id",
        "Label",
        "Value",

})
public interface CityDto {
    @JsonProperty("Id")
    Long getId();

    @JsonProperty("Label")
    String getlabel();

    @JsonProperty("Value")
    String getvalue();


}
