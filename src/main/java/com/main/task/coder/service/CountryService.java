package com.main.task.coder.service;

import com.main.task.coder.dto.request.CountryRequestDto;
import com.main.task.coder.entity.Country;
import org.springframework.http.ResponseEntity;

public interface CountryService {
    ResponseEntity<?> getCountryDropDown();
    ResponseEntity<?> savecountry(CountryRequestDto countryRequestDto);
//    ResponseEntity<?> updateCountry(CountryRequestDto countryRequestDto);


}
