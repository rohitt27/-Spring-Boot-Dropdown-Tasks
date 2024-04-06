package com.main.task.coder.repository;

import com.main.task.coder.dto.BloodGroupDto;
import com.main.task.coder.entity.BloodGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BloodGroupRepo extends JpaRepository<BloodGroup, Long> {
    @Query(value = "select * from fn_bloodGroup_dropDown() ",nativeQuery = true)
    List<BloodGroupDto> getAllDropDownValues();
}
