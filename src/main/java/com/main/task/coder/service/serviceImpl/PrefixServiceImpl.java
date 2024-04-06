package com.main.task.coder.service.serviceImpl;

import com.main.task.coder.dto.PrefixDto;
import com.main.task.coder.entity.Prefix;
import com.main.task.coder.repository.PrefixRepo;
import com.main.task.coder.service.PrefixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrefixServiceImpl implements PrefixService {
    @Autowired
    private PrefixRepo prefixRepo;

    @Override
    public ResponseEntity<?> getprefixDropDown() {
        List<PrefixDto> getData =prefixRepo.getPrefixDropDownValues();
        return ResponseEntity.ok(getData);
    }

    @Override
    public Prefix save(Prefix prefixEntity) {
        return prefixRepo.save(prefixEntity);
    }
}
