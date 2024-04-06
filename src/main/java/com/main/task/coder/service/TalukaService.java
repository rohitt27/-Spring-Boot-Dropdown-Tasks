package com.main.task.coder.service;

import com.main.task.coder.dto.request.DistrictRequestDto;
import com.main.task.coder.dto.request.TalukaRequestDto;
import com.main.task.coder.entity.Taluka;
import org.springframework.http.ResponseEntity;

public interface TalukaService {
    ResponseEntity<?> getTalukaDropDown(Long districtId) throws Exception;

    ResponseEntity<?> saveTalukaName(TalukaRequestDto talukaRequestDto);
}
