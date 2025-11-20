package com.workspace.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Benachrichtigung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
    private LocalDateTime timestamp;

    @Enumerated(EnumType.STRING)
    private NotificationTyp typ;

    @ManyToOne
    private Mitarbeiter mitarbeiter;
}
