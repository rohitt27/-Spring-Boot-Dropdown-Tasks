package com.main.task.coder.service;

import com.main.task.coder.dto.request.EmployeeReqDto;
import com.main.task.coder.entity.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {

   List<Employee> getAllData();
    ResponseEntity<?> getReqData(EmployeeReqDto employeeReqDto);
}
