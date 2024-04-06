package com.main.task.coder.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "Id",
        "Label",
        "Value"
})
public interface PincodeListDto {
    @JsonProperty("Id")
    Long getId();

    @JsonProperty("Label")
    String getlabel();

    @JsonProperty("Value")
    String getvalue();
}
