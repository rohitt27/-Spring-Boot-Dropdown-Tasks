package com.main.task.coder.service.serviceImpl;

import com.main.task.coder.apiResponse.ApiResponse;
import com.main.task.coder.dto.DistrictDto;
import com.main.task.coder.dto.request.DistrictRequestDto;
import com.main.task.coder.entity.District;
import com.main.task.coder.repository.DistrictRepo;
import com.main.task.coder.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class DistrictImpl implements DistrictService {
    @Autowired
    private DistrictRepo districtRepo;
    @Override
    public ResponseEntity<?> getdistrictDropDown(Long stateId) {
        List<DistrictDto> getData = districtRepo.getAllDropDownValues(stateId);
        return ResponseEntity.ok(getData);
    }


    @Override
    public ResponseEntity<?> getDistrictName(DistrictRequestDto districtRequestDto) {
        ApiResponse response = new ApiResponse();
        District districts = new District();
        districts.setDescription(districtRequestDto.getDistrictName());
        districts.setState(districtRequestDto.getStates());
        if(districtRequestDto.getDistrictName().equals("error")){
            throw new RuntimeException("error occured while saving district");
        }
        districtRepo.save(districts);
        response.setMessage("District save successfully");
        response.setResult("District Saved");
        return ResponseEntity.ok(response);
    }
}
