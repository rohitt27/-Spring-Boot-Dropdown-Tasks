package com.main.task.coder.service;

import com.main.task.coder.entity.Heading;

import java.util.List;

public interface HeadingService {
    List<Heading> getListEntity();
    Heading saveEntity(Heading headingEntity);
    Heading updateEntity(Heading headingEntity);
}
