package com.workspace.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.workspace.model.Benachrichtigung;

public interface BenachrichtigungRepository extends JpaRepository<Benachrichtigung, Long> {}
