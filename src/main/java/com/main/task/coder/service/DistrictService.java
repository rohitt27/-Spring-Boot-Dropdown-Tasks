package com.main.task.coder.service;

import com.main.task.coder.dto.request.DistrictRequestDto;
import com.main.task.coder.entity.District;
import org.springframework.http.ResponseEntity;

public interface DistrictService {
    ResponseEntity<?> getdistrictDropDown(Long stateId);
//    District saveDistrictDropdown(District districtEntity);
    ResponseEntity<?> getDistrictName(DistrictRequestDto districtRequestDto);
}
