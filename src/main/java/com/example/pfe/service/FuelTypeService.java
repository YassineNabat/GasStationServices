package com.example.pfe.service;

import com.example.pfe.model.FuelType;
import com.example.pfe.repository.FuelTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuelTypeService {}
//    @Autowired
//    private FuelTypeRepository fuelTypeRepository;
//
//    public List<FuelType> getAllFuelTypes() {
//        return fuelTypeRepository.findAll();
//    }
//
//    public FuelType getFuelTypeById(Long id) {
//        return fuelTypeRepository.findById(id).orElse(null);
//    }
//
//    public FuelType saveFuelType(FuelType fuelType) {
//        return fuelTypeRepository.save(fuelType);
//    }
//
//    public void deleteFuelType(Long id) {
//        fuelTypeRepository.deleteById(id);
//    }
//}
