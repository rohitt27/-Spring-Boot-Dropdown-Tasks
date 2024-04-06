package com.main.task.coder.controller;

import com.main.task.coder.entity.BloodGroup;
import com.main.task.coder.service.BloodGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/bloodGroup")
public class BloodGroupController {
    @Autowired
    private BloodGroupService bloodGroupService;

    @GetMapping("/getBloodGroupDropDown")
    public ResponseEntity<?> getMaritalDropdown(){
        return bloodGroupService.getBloodGroupDropDown();
    }

    @PostMapping("/createBloodGroup")
    public BloodGroup saveBloodEntity(BloodGroup bloodGroupEntity){
        return bloodGroupService.saveBloodGroup(bloodGroupEntity);
    }
}
