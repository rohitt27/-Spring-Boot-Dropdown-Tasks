package com.main.task.coder.controller;

import com.main.task.coder.dto.request.CityRequestDto;
import com.main.task.coder.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping("/getCity/{talukaId}")
    public ResponseEntity<?> getCityDropdown(@PathVariable Long talukaId) {
        return cityService.getCountryDropDown(talukaId);
    }

    @PostMapping("/saveCity")
    public ResponseEntity<?> saveCity(@RequestBody CityRequestDto cityRequestDto) {
        return cityService.citysave(cityRequestDto);
    }


}
