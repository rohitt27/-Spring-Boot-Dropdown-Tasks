package com.main.task.coder.repository;

import com.main.task.coder.dto.StateDto;
import com.main.task.coder.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StateRepo extends JpaRepository<State, Long> {


    @Query(value = "select * from fn_state_dropdown(:countryId)",nativeQuery = true)
    List<StateDto> getAllDropDownValues(Long countryId);

}
