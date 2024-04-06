package com.main.task.coder.dto.request;

import com.main.task.coder.entity.Country;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StateRequestDto {
    @NotNull
    private String stateName;
    private Country countries;
}
