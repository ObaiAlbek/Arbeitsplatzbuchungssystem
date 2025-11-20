package com.workspace.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Parkplatz extends Ressource {
    private String parkplatzNummer;
    private String art;
}
