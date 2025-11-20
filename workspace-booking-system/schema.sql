CREATE TABLE ressource (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  standort VARCHAR(255),
  typ VARCHAR(50),
  kapazitaet INT,
  beschreibung VARCHAR(255)
);

CREATE TABLE arbeitsplatz (
  id BIGINT PRIMARY KEY,
  arbeitsplatz_nummer VARCHAR(255),
  ausstattung VARCHAR(255),
  FOREIGN KEY (id) REFERENCES ressource(id)
);

CREATE TABLE besprechungsraum (
  id BIGINT PRIMARY KEY,
  raum_name VARCHAR(255),
  ausstattung VARCHAR(255),
  FOREIGN KEY (id) REFERENCES ressource(id)
);

CREATE TABLE parkplatz (
  id BIGINT PRIMARY KEY,
  parkplatz_nummer VARCHAR(255),
  art VARCHAR(255),
  FOREIGN KEY (id) REFERENCES ressource(id)
);

CREATE TABLE availability_period (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  von DATETIME,
  bis DATETIME,
  verfuegbar BOOLEAN,
  ressource_id BIGINT,
  FOREIGN KEY (ressource_id) REFERENCES ressource(id)
);

CREATE TABLE mitarbeiter (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  vorname VARCHAR(255),
  nachname VARCHAR(255),
  email VARCHAR(255)
);v

CREATE TABLE booking (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  start_zeit DATETIME,
  end_zeit DATETIME,
  status VARCHAR(50),
  ressource_id BIGINT,
  mitarbeiter_id BIGINT,
  FOREIGN KEY (ressource_id) REFERENCES ressource(id),
  FOREIGN KEY (mitarbeiter_id) REFERENCES mitarbeiter(id)
);

CREATE TABLE benachrichtigung (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  text VARCHAR(500),
  timestamp DATETIME,
  typ VARCHAR(50),
  mitarbeiter_id BIGINT,
  FOREIGN KEY (mitarbeiter_id) REFERENCES mitarbeiter(id)
);
