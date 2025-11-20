package com.workspace.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.workspace.model.Mitarbeiter;

public interface MitarbeiterRepository extends JpaRepository<Mitarbeiter, Long> {}
