package com.main.task.coder.dto.request;

import com.main.task.coder.entity.City;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Size;
import lombok.Getter;

import lombok.Setter;

@Getter
@Setter
public class PincodeReqDto {
    @Digits(integer = 6,fraction = 0,message = "Pincode must be a numeric value with maximum 6 digits")
    private Long pincode;
    private City city;
}
