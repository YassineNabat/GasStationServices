package com.example.pfe.service;

import com.example.pfe.model.Pump;
import com.example.pfe.repository.PumpRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PumpService {

    private final PumpRepository pumpRepository;

    public List<Pump> getAllPumps() {
        return pumpRepository.findAll();
    }

    public Pump getPumpById(Long id) {
        return pumpRepository.findById(id).orElse(null);
    }

    public Pump savePump(Pump pump) {
        return pumpRepository.save(pump);
    }

    public void deletePump(Long id) {
        pumpRepository.deleteById(id);
    }
}
