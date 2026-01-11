# 🏢 Workplace Booking System  
Ein vollständiges Spring-Boot–System zur Verwaltung und Buchung von Arbeitsplätzen,  
Besprechungsräumen und weiteren Ressourcen in einem Unternehmen.

---

## 🚀 Features

### 🔧 Ressourcenverwaltung (Admin)
- Arbeitsplätze, Räume, Parkplätze und weitere Ressourcen anlegen  
- Kapazität, Ausstattung, Standort verwalten  
- Zeiträume für Verfügbarkeit oder Sperrung festlegen  
- Ressourcen bearbeiten und löschen  

### 🧑‍💼 Buchungen (Mitarbeiter)
- Nach verfügbaren Arbeitsplätzen/Räumen suchen  
- Buchungen anlegen mit Start- und Endzeit  
- System prüft automatisch Verfügbarkeit  
- Buchungen einsehen  
- Buchungen stornieren  

### ✉️ Benachrichtigungen
- System sendet Bestätigungen per E-Mail  
- Erinnerungen  
- Stornierungsbenachrichtigungen  

### 📊 Berichte (Admin)
- Nutzung nach Zeitraum, Standort oder Ressourcentyp  
- Auslastung von Arbeitsplätzen und Räumen  

---

# 🗂 Projektstruktur

workspace-booking-system/
├── src/main/java/com/workspace
│ ├── model/
│ ├── repository/
│ ├── WorkspaceBookingSystemApplication.java
│
├── src/test/java/com/workspace
├── src/main/resources
├── pom.xml

kotlin
Code kopieren

---

# 📐 UML – Klassendiagramm

```mermaid
classDiagram

    Ressource <|-- Arbeitsplatz
    Ressource <|-- Besprechungsraum
    Ressource <|-- Parkplatz

    class Ressource {
        +Long id
        +String standort
        +RessourceTyp typ
        +int kapazitaet
        +String beschreibung
    }

    class Arbeitsplatz {
        +String arbeitsplatzNummer
        +String ausstattung
    }

    class Besprechungsraum {
        +String raumName
        +String ausstattung
    }

    class Parkplatz {
        +String parkplatzNummer
        +String art
    }

    class AvailabilityPeriod {
        +Long id
        +LocalDateTime von
        +LocalDateTime bis
        +boolean verfuegbar
    }

    Ressource "1" --> "*" AvailabilityPeriod : hat

    class Mitarbeiter {
        +Long id
        +String vorname
        +String nachname
        +String email
    }

    class Booking {
        +Long id
        +LocalDateTime startZeit
        +LocalDateTime endZeit
        +BookingStatus status
    }

    Booking "*" --> "1" Ressource : reserviert
    Booking "*" --> "1" Mitarbeiter : gehört_zu

    class Benachrichtigung {
        +Long id
        +String text
        +LocalDateTime timestamp
        +NotificationTyp typ
    }

    Mitarbeiter "1" --> "*" Benachrichtigung : erhält
