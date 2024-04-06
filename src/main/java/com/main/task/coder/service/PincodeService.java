package com.main.task.coder.service;

import com.main.task.coder.dto.request.PincodeReqDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface PincodeService {
    ResponseEntity<?> getAllPincode(Long pinCode) throws Exception;
    ResponseEntity<?> getAllpincodes();
    ResponseEntity<?> savePincode(PincodeReqDto pincodeReqDto);
}
