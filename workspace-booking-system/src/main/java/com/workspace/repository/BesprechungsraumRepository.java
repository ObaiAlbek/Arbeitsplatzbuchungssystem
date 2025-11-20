package com.workspace.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.workspace.model.Besprechungsraum;

public interface BesprechungsraumRepository extends JpaRepository<Besprechungsraum, Long> {}
