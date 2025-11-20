package com.workspace.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Besprechungsraum extends Ressource {
    private String raumName;
    private String ausstattung;
}
