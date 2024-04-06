package com.main.task.coder.controller;

import com.main.task.coder.dto.request.EmployeeReqDto;
import com.main.task.coder.entity.Employee;
import com.main.task.coder.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
private EmployeeService employeeService;
    @GetMapping("/getEmployee")
    public List<Employee> getAll(){
        return employeeService.getAllData();
    }
    @PostMapping("/saveEmployee")
    public ResponseEntity<?> saveAllEmployee(@RequestBody EmployeeReqDto employeeReqDto){
        return employeeService.getReqData(employeeReqDto);
    }
}
