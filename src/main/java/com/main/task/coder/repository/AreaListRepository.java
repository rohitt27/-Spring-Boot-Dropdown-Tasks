package com.main.task.coder.repository;

import com.main.task.coder.dto.AreaListDto;
import com.main.task.coder.entity.AreaListData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AreaListRepository extends JpaRepository<AreaListData, Long> {
    @Query(value="Select * from fn_area_data()",nativeQuery = true)
    List<AreaListDto> getAreaListName();
}