package com.example.pfe.repository;

import com.example.pfe.model.Pump;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "Pump")
public interface PumpRepository extends JpaRepository<Pump,Long> {
}
