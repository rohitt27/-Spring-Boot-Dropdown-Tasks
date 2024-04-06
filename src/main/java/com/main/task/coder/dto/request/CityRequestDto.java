package com.main.task.coder.dto.request;

import com.main.task.coder.entity.Taluka;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityRequestDto {
    private String cityName;
    private Taluka taluka;

}
