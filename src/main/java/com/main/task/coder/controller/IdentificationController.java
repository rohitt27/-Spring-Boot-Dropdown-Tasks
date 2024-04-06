package com.main.task.coder.controller;

import com.main.task.coder.entity.IdentificationDocument;
import com.main.task.coder.service.IdentificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/identification")
public class IdentificationController {
    @Autowired
    private IdentificationService identificationService;

    @GetMapping("/getIdentificationDropDown")
    public ResponseEntity<?> getMaritalDropdown(){
        return identificationService.getIdentificationDropDown();
    }

    @PostMapping("/createIdentification")
    public IdentificationDocument saveIdentification(IdentificationDocument identificationDocEntity){
        return identificationService.saveIdentification(identificationDocEntity);
    }
}
