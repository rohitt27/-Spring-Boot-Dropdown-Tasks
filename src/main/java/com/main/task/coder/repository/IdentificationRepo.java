package com.main.task.coder.repository;

import com.main.task.coder.dto.IdentificationDocDto;
import com.main.task.coder.entity.IdentificationDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IdentificationRepo extends JpaRepository<IdentificationDocument, Long> {
    @Query(value = "select * from fn_identificationDoc_dropDown()",nativeQuery = true)
    List<IdentificationDocDto> getAllDropDownValues();
}
