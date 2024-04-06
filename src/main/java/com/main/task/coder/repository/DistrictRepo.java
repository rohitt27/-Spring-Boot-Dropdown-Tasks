package com.main.task.coder.repository;

import com.main.task.coder.dto.DistrictDto;
import com.main.task.coder.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DistrictRepo extends JpaRepository<District, Long> {
    @Query(value = "select * from fn_district_DropDown(:stateId)",nativeQuery = true)
    List<DistrictDto> getAllDropDownValues(Long stateId);
}
