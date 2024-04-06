package com.main.task.coder.service.serviceImpl;

import com.main.task.coder.apiResponse.ApiResponse;
import com.main.task.coder.dto.TalukaDto;
import com.main.task.coder.dto.request.TalukaRequestDto;
import com.main.task.coder.entity.Taluka;
import com.main.task.coder.repository.TalukaRepo;
import com.main.task.coder.service.TalukaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Set;

@Service
public class TalukaImpl implements TalukaService {
    @Autowired
    private TalukaRepo talukaRepo;
    @Override
    public ResponseEntity<?> getTalukaDropDown(Long districtId) throws Exception {
        List<TalukaDto> getData = talukaRepo.getAllDropDownValues(districtId);
        ApiResponse response = new ApiResponse();
        if (getData.isEmpty()){
            throw new Exception("DistrictId not found" +" "+ districtId);
        }else {
            response.setMessage("DistrictId fetch successfully");
            response.setResult(getData);
        }
        return ResponseEntity.ok(getData);
    }

    @Override
    public ResponseEntity<?> saveTalukaName(TalukaRequestDto talukaRequestDto) {
        ApiResponse respone = new ApiResponse();
        Taluka talukas = new Taluka();
        talukas.setDescription(talukaRequestDto.getTalukaName());
        talukas.setDistrict(talukaRequestDto.getDistricts());
        talukaRepo.save(talukas);
        respone.setMessage("Taluka save successfully");
        respone.setResult("Taluka Saved");
        return ResponseEntity.ok(respone);
    }
}
