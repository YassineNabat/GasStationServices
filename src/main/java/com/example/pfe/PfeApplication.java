package com.example.pfe;

import com.example.pfe.model.Pump;
import com.example.pfe.repository.PumpRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PfeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PfeApplication.class, args);
    }


    @Bean
    CommandLineRunner start(PumpRepository pumpRepository) {
        return args -> {
            Pump pump = new Pump(null,null,18.3,null);
            pumpRepository.save(pump);
        };
    }
}
