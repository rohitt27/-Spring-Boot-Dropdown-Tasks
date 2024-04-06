package com.main.task.coder.service;

import com.main.task.coder.entity.MaritalStatus;
import org.springframework.http.ResponseEntity;

public interface MaritalStatusService {
ResponseEntity<?> getMaritalDropDown();
MaritalStatus saveMaritalDropdown(MaritalStatus maritalStatusEntity);
}
