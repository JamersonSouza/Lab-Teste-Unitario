package tech.jamersondev.labtestsunitarios.records;

import tech.jamersondev.labtestsunitarios.domain.Planet;

public record PlanetDTO(String name, String climate, String terrain) {
    public PlanetDTO(Planet planet) {
        this(planet.getName(), planet.getClimate(), planet.getTerrain());
    }
}
