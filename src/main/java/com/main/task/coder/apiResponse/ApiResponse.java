package com.main.task.coder.apiResponse;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class  ApiResponse<T> {
    private T result;
    private String message;
}
