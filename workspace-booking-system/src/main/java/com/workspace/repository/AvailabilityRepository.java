package com.workspace.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.workspace.model.AvailabilityPeriod;

public interface AvailabilityRepository extends JpaRepository<AvailabilityPeriod, Long> {}
