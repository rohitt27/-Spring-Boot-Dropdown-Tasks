package com.main.task.coder.controller;

import com.main.task.coder.dto.request.TalukaRequestDto;
import com.main.task.coder.entity.Taluka;
import com.main.task.coder.service.TalukaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/taluka")
public class TalukaController {
    @Autowired
    private TalukaService talukaService;

    @GetMapping("/getTaluka/{districtId}")
    public ResponseEntity<?> getTalukaDropdown(@PathVariable Long districtId)throws Exception{
        return talukaService.getTalukaDropDown(districtId);
    }

    @PostMapping("/saveTaluka")
    public ResponseEntity<?> saveTaluka(@Valid @RequestBody TalukaRequestDto talukaRequestDto){
        return talukaService.saveTalukaName(talukaRequestDto);
    }


}
