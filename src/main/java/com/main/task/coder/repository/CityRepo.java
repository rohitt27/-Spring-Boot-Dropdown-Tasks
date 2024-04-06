package com.main.task.coder.repository;

import com.main.task.coder.dto.CityDto;
import com.main.task.coder.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepo extends JpaRepository<City,Long> {
    @Query(value = "select * from fn_city_dropDown(:talukaId) ",nativeQuery = true)
    List<CityDto> getAllDropDownValues(Long talukaId);



}
