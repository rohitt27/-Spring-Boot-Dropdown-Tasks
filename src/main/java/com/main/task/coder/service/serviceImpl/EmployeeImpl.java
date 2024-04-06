package com.main.task.coder.service.serviceImpl;

import com.main.task.coder.dto.request.EmployeeReqDto;
import com.main.task.coder.entity.Employee;
import com.main.task.coder.entity.EmployeePKId;
import com.main.task.coder.repository.EmployeeRepository;
import com.main.task.coder.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllData() {
        return employeeRepository.findAll();
    }

    @Override
    public ResponseEntity<?> getReqData(EmployeeReqDto employeeReqDto) {
        EmployeePKId emp = new EmployeePKId();
        emp.setEmployee_Id(employeeReqDto.getEmployee_Id());
        emp.setDepartment_Id(employeeReqDto.getDepartment_Id());

        Employee employee = new Employee();
        employee.setEmployeePKId(emp);
        employee.setEmail(employeeReqDto.getEmail());
        employee.setPhoneNo(employeeReqDto.getPhoneNo());
        employeeRepository.save(employee);
        return ResponseEntity.ok("saved");
    }

}
