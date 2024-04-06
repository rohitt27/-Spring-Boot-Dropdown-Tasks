package com.main.task.coder.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "mt_district")
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

}
