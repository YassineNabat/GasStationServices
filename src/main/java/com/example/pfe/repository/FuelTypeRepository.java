package com.example.pfe.repository;

import com.example.pfe.model.FuelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "FuelType")
public interface FuelTypeRepository extends JpaRepository<FuelType, Long> {

}
