package com.main.task.coder.service;

import com.main.task.coder.entity.Nationality;
import org.springframework.http.ResponseEntity;

public interface NationalityService {
    ResponseEntity<?> getNationalityDropDown();

    Nationality saveNationality(Nationality nationalityEntity);
}
