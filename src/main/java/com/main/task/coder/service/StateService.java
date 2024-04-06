package com.main.task.coder.service;

import com.main.task.coder.dto.request.CountryRequestDto;
import com.main.task.coder.dto.request.StateRequestDto;
import com.main.task.coder.entity.State;
import org.springframework.http.ResponseEntity;

public interface StateService {
    ResponseEntity<?> getStateDropdown(Long countryId) throws Exception;

    ResponseEntity<?> getCountryName(StateRequestDto stateRequestDto);

}
