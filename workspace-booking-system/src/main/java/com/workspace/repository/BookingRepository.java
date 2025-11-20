package com.workspace.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.workspace.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {}
