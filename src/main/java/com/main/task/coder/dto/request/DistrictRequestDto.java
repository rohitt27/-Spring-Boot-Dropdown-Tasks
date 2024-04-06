package com.main.task.coder.dto.request;

import com.main.task.coder.entity.State;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DistrictRequestDto {
    private String districtName;
    private State states;
}
