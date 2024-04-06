package com.main.task.coder.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Employee_Details")
public class Employee {
    @EmbeddedId
    private EmployeePKId employeePKId;

    private String phoneNo;
    private String Email;

    //     private String employeeName;
//     private String departmentName;
}
