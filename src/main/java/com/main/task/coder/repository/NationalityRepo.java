package com.main.task.coder.repository;

import com.main.task.coder.dto.NationalityDto;
import com.main.task.coder.entity.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NationalityRepo extends JpaRepository<Nationality, Long> {
    @Query(value = "select * from fn_nationality_dropDown()",nativeQuery = true)
    List<NationalityDto> getAllDropDownValues();
}
