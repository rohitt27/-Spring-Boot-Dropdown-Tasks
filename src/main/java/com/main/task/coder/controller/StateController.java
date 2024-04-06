package com.main.task.coder.controller;

import com.main.task.coder.dto.request.StateRequestDto;
import com.main.task.coder.entity.State;
import com.main.task.coder.service.StateService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/state")
public class StateController {
    @Autowired
    private StateService stateService;

    @GetMapping("/getState/{countryId}")
    public ResponseEntity<?> getStateDropdown(@PathVariable Long countryId)throws Exception{
        return stateService.getStateDropdown(countryId);
    }
    @PostMapping("/saveState")
    public ResponseEntity<?> saveState(@Valid @RequestBody StateRequestDto stateRequestDto){
        return stateService.getCountryName(stateRequestDto);
    }
}
