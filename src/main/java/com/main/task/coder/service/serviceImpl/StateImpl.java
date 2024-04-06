package com.main.task.coder.service.serviceImpl;

import com.main.task.coder.apiResponse.ApiResponse;
import com.main.task.coder.dto.StateDto;
import com.main.task.coder.dto.request.CountryRequestDto;
import com.main.task.coder.dto.request.StateRequestDto;
import com.main.task.coder.entity.State;
import com.main.task.coder.repository.StateRepo;
import com.main.task.coder.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StateImpl implements StateService {
    @Autowired
    private StateRepo stateRepo;

    @Override
    public ResponseEntity<?> getStateDropdown(Long countryId) throws Exception {
//        ApiResponse response = new ApiResponse();
        List<StateDto> getData = stateRepo.getAllDropDownValues(countryId);
        if (getData.isEmpty()){
            throw new Exception("State Not Found" + "xx :"+ countryId);
        }
//        else {
//            response.setMessage("State fetch successfully");
//            response.setResult(getData);
//        }
        return ResponseEntity.status(HttpStatus.CREATED).body("State fetch Successsfully");
    }
    @Override
    public ResponseEntity<?> getCountryName(StateRequestDto stateRequestDto) {
      ApiResponse response = new ApiResponse();
      State states = new State();
      states.setDescription(stateRequestDto.getStateName());
      states.setCountry(stateRequestDto.getCountries());



      stateRepo.save(states);
      response.setMessage("State save successfully");
      response.setResult("State Saved");
      return ResponseEntity.ok(response);
    }
}
