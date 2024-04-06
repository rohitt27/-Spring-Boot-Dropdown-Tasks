package com.main.task.coder.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CountryRequestDto {
    private Long id;
    @NotNull
    private String countryName;
}
