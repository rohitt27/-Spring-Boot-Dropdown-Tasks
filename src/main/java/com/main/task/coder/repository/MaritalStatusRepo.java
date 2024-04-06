package com.main.task.coder.repository;

import com.main.task.coder.dto.MaritalStatusDto;
import com.main.task.coder.entity.MaritalStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MaritalStatusRepo extends JpaRepository<MaritalStatus, Long> {

    @Query(value = "select * from fn_marital_dropDown()",nativeQuery = true)
    List<MaritalStatusDto> getAllDropDownValues();
}
