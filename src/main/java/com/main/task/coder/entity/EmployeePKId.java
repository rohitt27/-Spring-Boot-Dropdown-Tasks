package com.main.task.coder.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
@EqualsAndHashCode
public class EmployeePKId implements Serializable {

    private  Long Employee_Id;

    private Long Department_Id;
}
