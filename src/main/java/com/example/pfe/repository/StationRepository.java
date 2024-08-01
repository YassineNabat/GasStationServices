package com.example.pfe.repository;

import com.example.pfe.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "Station")
public interface StationRepository extends JpaRepository<Station, Long> {
    // Custom query methods can be added here if needed
}