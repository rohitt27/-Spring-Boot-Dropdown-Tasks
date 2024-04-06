package com.main.task.coder.controller;

import com.main.task.coder.service.AreaListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/areaData")
public class AreaListController {
    @Autowired
    private AreaListService areaListService;

    @GetMapping("/getAreaData")
    public ResponseEntity<?> getArealist(){
        return areaListService.getAllAreas();
    }
}
