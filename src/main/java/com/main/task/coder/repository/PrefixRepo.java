package com.main.task.coder.repository;

import com.main.task.coder.dto.PrefixDto;
import com.main.task.coder.entity.Prefix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PrefixRepo extends JpaRepository<Prefix, Long> {
@Query(value = "select * from fn_prefix_dropDown()",nativeQuery = true)
List<PrefixDto> getPrefixDropDownValues();
}
