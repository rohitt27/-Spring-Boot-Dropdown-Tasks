package com.main.task.coder.repository;

import com.main.task.coder.dto.request.EmployeeReqDto;
import com.main.task.coder.entity.Employee;
import com.main.task.coder.entity.EmployeePKId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, EmployeePKId> {
//        List<Employee> getData ();
}
