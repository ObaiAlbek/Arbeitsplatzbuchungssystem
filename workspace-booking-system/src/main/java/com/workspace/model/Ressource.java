package com.workspace.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter @Setter
public abstract class Ressource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String standort;

    @Enumerated(EnumType.STRING)
    private RessourceTyp typ;

    private int kapazitaet;

    private String beschreibung;
}
