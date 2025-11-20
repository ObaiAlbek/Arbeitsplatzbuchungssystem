package com.workspace.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Arbeitsplatz extends Ressource {
    private String arbeitsplatzNummer;
    private String ausstattung;
}
