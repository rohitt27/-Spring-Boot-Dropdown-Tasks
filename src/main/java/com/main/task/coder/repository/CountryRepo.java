package com.main.task.coder.repository;

import com.main.task.coder.dto.CountryDto;
import com.main.task.coder.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepo extends JpaRepository<Country, Long> {
    @Query(value = "select * from fn_country_dropDown() ",nativeQuery = true)
    List<CountryDto> getAllDropDownValues();

}
