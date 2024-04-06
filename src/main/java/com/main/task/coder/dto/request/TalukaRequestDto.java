package com.main.task.coder.dto.request;

import com.main.task.coder.entity.District;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TalukaRequestDto {
    @NotEmpty(message = "TalukaName should not Empty")
    private String talukaName;
    private District districts;
}
