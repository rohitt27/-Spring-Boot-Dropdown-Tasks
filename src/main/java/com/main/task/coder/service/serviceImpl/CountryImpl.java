package com.main.task.coder.service.serviceImpl;

import com.main.task.coder.apiResponse.ApiResponse;
import com.main.task.coder.dto.CountryDto;
import com.main.task.coder.dto.request.CountryRequestDto;
import com.main.task.coder.entity.Country;
import com.main.task.coder.repository.CountryRepo;
import com.main.task.coder.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CountryImpl implements CountryService {
    @Autowired
    private CountryRepo countryRepo;

    @Override
    public ResponseEntity<?> getCountryDropDown() {
        List<CountryDto> getData = countryRepo.getAllDropDownValues();
        return ResponseEntity.ok(getData);
    }

    @Override
    public ResponseEntity<?> savecountry(CountryRequestDto countryRequestDto) {
        ApiResponse response = new ApiResponse();
        Country country = new Country();
        if (countryRequestDto.getId() != null){
            Optional<Country> optionalCountry = countryRepo.findById(countryRequestDto.getId());
            if (optionalCountry.isPresent()){
                country = optionalCountry.get();
                country.setDescription(countryRequestDto.getCountryName());
                countryRepo.save(country);
                response.setMessage("Country updated successfully");
                response.setResult("Country Updated");
            }else {
                response.setMessage("Country not found");
                response.setResult("No country found with provided ID");
                return ResponseEntity.ok(response);
            }
        }else {
            country.setDescription(countryRequestDto.getCountryName());
            countryRepo.save(country);
            response.setMessage("Country saved successfully");
            response.setResult("Country Saved");
        }
        return ResponseEntity.ok(response);
    }





}
