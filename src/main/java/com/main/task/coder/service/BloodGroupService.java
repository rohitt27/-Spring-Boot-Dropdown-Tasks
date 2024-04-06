package com.main.task.coder.service;

import com.main.task.coder.entity.BloodGroup;
import org.springframework.http.ResponseEntity;

public interface BloodGroupService {
    ResponseEntity<?> getBloodGroupDropDown();
    BloodGroup saveBloodGroup(BloodGroup bloodGroupEntity);

}
