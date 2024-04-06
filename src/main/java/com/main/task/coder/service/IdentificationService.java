package com.main.task.coder.service;

import com.main.task.coder.entity.IdentificationDocument;
import org.springframework.http.ResponseEntity;

public interface IdentificationService {
    ResponseEntity<?> getIdentificationDropDown();
    IdentificationDocument saveIdentification(IdentificationDocument identificationDocEntity);
}
