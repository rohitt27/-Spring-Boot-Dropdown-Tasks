package com.main.task.coder.controller;

import com.main.task.coder.entity.Heading;
import com.main.task.coder.service.HeadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class HeadingController {
    @Autowired
    private HeadingService headingService;
@GetMapping("/list/heading")
    public List<Heading> findAllEntity(){
        return headingService.getListEntity();
    }
@PostMapping("/insert/data")
    public Heading saveAllEntity(@RequestBody Heading headingEntity){
    return headingService.saveEntity(headingEntity);
}
@PutMapping("/update")
    public Heading updateAllEntity(@RequestBody Heading headingEntity){
    return headingService.updateEntity(headingEntity);
}


}
