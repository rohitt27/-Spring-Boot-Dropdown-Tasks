package com.main.task.coder.controller;

import com.main.task.coder.dto.request.PincodeReqDto;
import com.main.task.coder.entity.Pincode;
import com.main.task.coder.service.PincodeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pincode")
@Validated
public class PincodeController {
    @Autowired
    private PincodeService pincodeService;
    @GetMapping("/getPincodeList")
    public ResponseEntity<?> getpincode(){
        return pincodeService.getAllpincodes();
    }

    @GetMapping("/getPincode/{pinCode}")
    public ResponseEntity<?> getPincodes(@PathVariable Long pinCode)throws Exception{
        return pincodeService.getAllPincode(pinCode);
    }
    @PostMapping("/savePincode")
    public ResponseEntity<?> savePincodes(@Valid @RequestBody PincodeReqDto pincodeReqDto){
        return pincodeService.savePincode(pincodeReqDto);
    }
}
