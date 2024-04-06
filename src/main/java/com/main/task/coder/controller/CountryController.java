package com.main.task.coder.controller;

import com.main.task.coder.dto.request.CountryRequestDto;
import com.main.task.coder.entity.Country;
import com.main.task.coder.service.CountryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/getcountry")
    public ResponseEntity<?> getCountryDropdown(){
        return countryService.getCountryDropDown();
    }

    @PostMapping("/saveCountry/update")
    public ResponseEntity<?> savecountry(@Valid @RequestBody CountryRequestDto countryRequestDto){
      return countryService.savecountry(countryRequestDto);
    }
//    @PutMapping("updateCountry")
//    public ResponseEntity<?> updatecountry(@RequestBody CountryRequestDto countryRequestDto){
//        return countryService.updateCountry(countryRequestDto);
//    }
}
