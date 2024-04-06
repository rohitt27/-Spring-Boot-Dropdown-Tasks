package com.main.task.coder.service.serviceImpl;

import com.main.task.coder.dto.MaritalStatusDto;
import com.main.task.coder.entity.MaritalStatus;
import com.main.task.coder.repository.MaritalStatusRepo;
import com.main.task.coder.service.MaritalStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaritalStatusServiceImpl implements MaritalStatusService {
@Autowired
private MaritalStatusRepo maritalStatusRepo;
    @Override
    public ResponseEntity<?> getMaritalDropDown() {
        List<MaritalStatusDto> getData = maritalStatusRepo.getAllDropDownValues();
        return ResponseEntity.ok(getData);
    }

    @Override
    public MaritalStatus saveMaritalDropdown(MaritalStatus maritalStatusEntity) {
        return maritalStatusRepo.save(maritalStatusEntity);
    }
}
