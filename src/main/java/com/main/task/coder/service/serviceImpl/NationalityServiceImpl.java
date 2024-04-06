package com.main.task.coder.service.serviceImpl;

import com.main.task.coder.dto.NationalityDto;
import com.main.task.coder.entity.Nationality;
import com.main.task.coder.repository.NationalityRepo;
import com.main.task.coder.service.NationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class NationalityServiceImpl implements NationalityService {
    @Autowired
    private NationalityRepo nationalityRepo;
    @Override
    public ResponseEntity<?> getNationalityDropDown() {
        List<NationalityDto> getData = nationalityRepo.getAllDropDownValues();
        return ResponseEntity.ok(getData);
    }

    @Override
    public Nationality saveNationality(Nationality nationalityEntity) {
        return nationalityRepo.save(nationalityEntity);
    }
}
