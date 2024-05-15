package tech.jamersondev.labtestsunitarios.services;

import org.springframework.stereotype.Service;
import tech.jamersondev.labtestsunitarios.domain.Planet;
import tech.jamersondev.labtestsunitarios.records.PlanetDTO;
import tech.jamersondev.labtestsunitarios.repositorys.PlanetRepository;

@Service
public class PlanetService {
    private final PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public Planet create(PlanetDTO planetDTO) {
        Planet planet = new Planet(planetDTO);
        return this.planetRepository.save(planet);
    }
}
