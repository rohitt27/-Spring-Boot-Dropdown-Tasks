package com.main.task.coder.service.serviceImpl;

import com.main.task.coder.dto.BloodGroupDto;
import com.main.task.coder.entity.BloodGroup;
import com.main.task.coder.repository.BloodGroupRepo;
import com.main.task.coder.service.BloodGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class BloodGroupServiceImpl implements BloodGroupService {
@Autowired
   private BloodGroupRepo bloodGroupRepo;
    @Override
    public ResponseEntity<?> getBloodGroupDropDown() {
        List<BloodGroupDto> getData = bloodGroupRepo.getAllDropDownValues();
        return ResponseEntity.ok(getData);
    }

    @Override
    public BloodGroup saveBloodGroup(BloodGroup bloodGroupEntity) {
        return bloodGroupRepo.save(bloodGroupEntity);
    }
}
