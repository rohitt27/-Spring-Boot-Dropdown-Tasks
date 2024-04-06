package com.main.task.coder.controller;

import com.main.task.coder.entity.Prefix;
import com.main.task.coder.service.PrefixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/formController")
public class PrefixController {
    @Autowired
    private PrefixService prefixService;
    @GetMapping("/getPrefixDropdown")
    public ResponseEntity<?> getPrefixDropdown(){
        return prefixService.getprefixDropDown();
    }

    @PostMapping("/prefix")
    public Prefix saveform(@RequestBody Prefix prefixEntity){
        return prefixService.save(prefixEntity);
    }
}
