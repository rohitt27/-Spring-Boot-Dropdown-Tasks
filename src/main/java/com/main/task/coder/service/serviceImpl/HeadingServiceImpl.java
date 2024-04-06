package com.main.task.coder.service.serviceImpl;

import com.main.task.coder.entity.Heading;
import com.main.task.coder.repository.HeadingRepo;
import com.main.task.coder.service.HeadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeadingServiceImpl implements HeadingService {
    @Autowired
    private HeadingRepo headingRepo;

    @Override
    public List<Heading> getListEntity() {
        return headingRepo.findAll();
    }

    @Override
    public Heading saveEntity(Heading headingEntity) {
        return headingRepo.save(headingEntity);
    }

    @Override
    public Heading updateEntity(Heading headingEntity) {
        return headingRepo.save(headingEntity);
    }
}
