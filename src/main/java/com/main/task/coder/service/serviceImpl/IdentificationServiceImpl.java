package com.main.task.coder.service.serviceImpl;

import com.main.task.coder.dto.IdentificationDocDto;
import com.main.task.coder.entity.IdentificationDocument;
import com.main.task.coder.repository.IdentificationRepo;
import com.main.task.coder.service.IdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IdentificationServiceImpl implements IdentificationService {
    @Autowired
    private IdentificationRepo identificationRepo;
    @Override
    public ResponseEntity<?> getIdentificationDropDown() {
        List<IdentificationDocDto> getData = identificationRepo.getAllDropDownValues();
        return ResponseEntity.ok(getData);
    }

    @Override
    public IdentificationDocument saveIdentification(IdentificationDocument identificationDocEntity) {
        return identificationRepo.save(identificationDocEntity);
    }
}
