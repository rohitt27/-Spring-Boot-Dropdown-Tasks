package com.main.task.coder.service.serviceImpl;

import com.main.task.coder.apiResponse.ApiResponse;
import com.main.task.coder.dto.PincodeDto;
import com.main.task.coder.dto.PincodeListDto;
import com.main.task.coder.dto.request.PincodeReqDto;
import com.main.task.coder.entity.Pincode;
import com.main.task.coder.repository.PincodeRepository;
import com.main.task.coder.service.PincodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PincodeImplement implements PincodeService {
    @Autowired
    private PincodeRepository pincodeRepository;

    @Override
    public ResponseEntity<?> getAllPincode(Long pinCode) throws Exception{

     try {

         ApiResponse responce = new ApiResponse();
         List<PincodeDto> getPincode = pincodeRepository.getAllDropdownvalues(pinCode);


         if (getPincode.isEmpty()){
            throw new Exception("Pincode not found" + pinCode);
         }else {
             responce.setMessage("Pincode fetch successsfully");
             responce.setResult(getPincode);
         }
         return ResponseEntity.ok(responce);
     }
     catch (Exception ex){
         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                 .body("An error occured while fetching pincode:" + ex.getMessage());
     }
    }

    @Override
    public ResponseEntity<?> getAllpincodes() {
      try {
          List<PincodeListDto> getData = pincodeRepository.getAllDropdown();
          return ResponseEntity.ok(getData);
      }
      catch (Exception e){

          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                  .body("An error occured while fetching pincode:" + e.getMessage());
      }
    }

    @Override
    public ResponseEntity<?> savePincode(PincodeReqDto pincodeReqDto) {
      try {
          ApiResponse responses = new ApiResponse();
          Pincode pincode = new Pincode();
          pincode.setDescription(pincodeReqDto.getPincode());
          pincode.setCity(pincodeReqDto.getCity());
          pincodeRepository.save(pincode);
          responses.setMessage("Pincode saved successfully");
          responses.setResult("Pincode saved");
          return ResponseEntity.ok(responses);
      }
      catch (Exception e){

          return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                  .body("An error occured while saving pincode:" + e.getMessage());
      }
    }
}
