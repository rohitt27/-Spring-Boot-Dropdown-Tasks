package com.main.task.coder.controller;

import com.main.task.coder.dto.request.DistrictRequestDto;
import com.main.task.coder.entity.District;
import com.main.task.coder.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/district")
public class DistrictController {
    @Autowired
    private DistrictService districtService;

    @GetMapping("/getdistrict/{stateId}")
    public ResponseEntity<?> getMaritalDropdown(@PathVariable Long stateId){
        return districtService.getdistrictDropDown(stateId);
    }

    @PostMapping("/saveDistrict")
    public ResponseEntity<?> saveDistricts(@RequestBody DistrictRequestDto districtRequestDto){
        return districtService.getDistrictName(districtRequestDto);
    }
}
