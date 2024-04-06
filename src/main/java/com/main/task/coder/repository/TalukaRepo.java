package com.main.task.coder.repository;

import com.main.task.coder.dto.TalukaDto;
import com.main.task.coder.entity.Taluka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TalukaRepo extends JpaRepository<Taluka, Long> {
    @Query(value = "select * from fn_taluka_dropDown(:districtId)",nativeQuery = true)
    List<TalukaDto> getAllDropDownValues(Long districtId);
}
