package com.main.task.coder.service.serviceImpl;

import com.main.task.coder.GlobalExceptionHandler.InvalidRequestException;
import com.main.task.coder.apiResponse.ApiResponse;
import com.main.task.coder.dto.CityDto;
import com.main.task.coder.dto.request.CityRequestDto;
import com.main.task.coder.entity.City;
import com.main.task.coder.repository.CityRepo;
import com.main.task.coder.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CityImpl implements CityService {
    @Autowired
    private CityRepo cityRepo;

    @Override
    public ResponseEntity<?> getCountryDropDown(Long talukaId) {
        ApiResponse response = new ApiResponse();
        List<CityDto> getData = cityRepo.getAllDropDownValues(talukaId);
        if (getData.isEmpty()){
            throw new InvalidRequestException("TalukaId is Invalid:" +talukaId);
        }
        response.setMessage("TalukaId fetch successfully");
        response.setResult(getData);
        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<?> citysave(CityRequestDto cityRequestDto) {
        ApiResponse response = new ApiResponse();
        City cities = new City();
        cities.setDescription(cityRequestDto.getCityName());
        cities.setTaluka(cityRequestDto.getTaluka());
        cityRepo.save(cities);
        response.setMessage("City save successfully");
        response.setResult("City saved");
        return ResponseEntity.ok(response);
    }




}
