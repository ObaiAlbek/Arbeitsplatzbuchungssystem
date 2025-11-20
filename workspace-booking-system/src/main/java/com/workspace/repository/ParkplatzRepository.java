package com.workspace.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.workspace.model.Parkplatz;

public interface ParkplatzRepository extends JpaRepository<Parkplatz, Long> {}
