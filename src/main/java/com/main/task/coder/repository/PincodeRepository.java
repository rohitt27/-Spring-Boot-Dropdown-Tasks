package com.main.task.coder.repository;

import com.main.task.coder.dto.PincodeDto;
import com.main.task.coder.dto.PincodeListDto;
import com.main.task.coder.entity.Pincode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PincodeRepository extends JpaRepository<Pincode, Long> {
    @Query(value = "select * from fn_pincode_dropdown(?)",nativeQuery = true)
    List<PincodeDto> getAllDropdownvalues(Long pinCode);
    @Query(value = "Select * from fn_pincode_list()",nativeQuery = true)
    List<PincodeListDto> getAllDropdown();
}
