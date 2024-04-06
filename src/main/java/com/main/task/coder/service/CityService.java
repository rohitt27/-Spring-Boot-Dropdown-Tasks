package com.main.task.coder.service;

import com.main.task.coder.dto.request.CityRequestDto;
import org.springframework.http.ResponseEntity;

public interface CityService {
    ResponseEntity<?> getCountryDropDown(Long talukaId);

    ResponseEntity<?> citysave(CityRequestDto cityRequestDto);

}
