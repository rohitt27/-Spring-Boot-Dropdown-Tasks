package com.main.task.coder.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
@Table(name = "mt_state")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "description",unique = true)
    private String description;

   @ManyToOne
    @JoinColumn(name = "country_Id")
    private Country country;
}
