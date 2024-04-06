package com.main.task.coder.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeReqDto {
    private  Long Employee_Id;
    private Long Department_Id;
    private String Email;
    private String phoneNo;

}
