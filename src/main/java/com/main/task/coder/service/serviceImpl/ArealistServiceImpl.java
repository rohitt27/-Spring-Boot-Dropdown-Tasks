package com.main.task.coder.service.serviceImpl;


import com.main.task.coder.apiResponse.ApiResponse;
import com.main.task.coder.dto.AreaListDto;
import com.main.task.coder.repository.AreaListRepository;
import com.main.task.coder.service.AreaListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArealistServiceImpl implements AreaListService {

    @Autowired
    private AreaListRepository areaListRepository;

    @Override
    public ResponseEntity<?> getAllAreas() {
        ApiResponse response = new ApiResponse();
        List<AreaListDto> getData = areaListRepository.getAreaListName();
        response.setMessage("Data fetch successfully");
        response.setResult(getData);
        return ResponseEntity.ok(response);
    }
}



