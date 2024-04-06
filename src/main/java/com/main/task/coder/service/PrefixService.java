package com.main.task.coder.service;

import com.main.task.coder.entity.Prefix;
import org.springframework.http.ResponseEntity;

public interface PrefixService {
    ResponseEntity<?> getprefixDropDown();
//    Prefix saveprefix(Prefix prefixEntity);


    Prefix save(Prefix prefixEntity);
}
