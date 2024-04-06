package com.main.task.coder.controller;

import com.main.task.coder.entity.Nationality;
import com.main.task.coder.service.NationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/nationality")
public class NationalityController {
    @Autowired
    private NationalityService nationalityService;

    @GetMapping("/getNationalityDropDown")
    public ResponseEntity<?> getMaritalDropdown(){
        return nationalityService.getNationalityDropDown();
    }

    @PostMapping("/createNationality")
    public Nationality saveEntity(Nationality nationalityEntity){
        return nationalityService.saveNationality(nationalityEntity);
    }
}
