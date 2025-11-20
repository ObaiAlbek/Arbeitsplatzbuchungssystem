package com.workspace.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class AvailabilityPeriod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime von;
    private LocalDateTime bis;

    private boolean verfuegbar;

    @ManyToOne
    private Ressource ressource;
}
