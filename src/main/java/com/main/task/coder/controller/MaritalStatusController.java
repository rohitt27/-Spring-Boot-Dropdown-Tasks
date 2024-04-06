package com.main.task.coder.controller;

import com.main.task.coder.entity.MaritalStatus;
import com.main.task.coder.service.MaritalStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/marital")
public class MaritalStatusController {
    @Autowired
    private MaritalStatusService maritalStatusService;

    @GetMapping("/getmaritalDropDown")
    public ResponseEntity<?> getMaritalDropdown(){
        return maritalStatusService.getMaritalDropDown();
    }

    @PostMapping("/maritalDD")
    public MaritalStatus saveMarital(MaritalStatus maritalStatusEntity){
        return maritalStatusService.saveMaritalDropdown(maritalStatusEntity);
    }
}
