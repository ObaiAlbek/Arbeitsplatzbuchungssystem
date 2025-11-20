package com.workspace.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startZeit;
    private LocalDateTime endZeit;

    @Enumerated(EnumType.STRING)
    private BookingStatus status;

    @ManyToOne
    private Ressource ressource;

    @ManyToOne
    private Mitarbeiter mitarbeiter;
}
