package tech.jamersondev.labtestsunitarios.domain;

import jakarta.persistence.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import tech.jamersondev.labtestsunitarios.records.PlanetDTO;

import java.util.Objects;

@Entity
@Table(name = "planets")
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String climate;
    private String terrain;

    public Planet() {
    }

    public Planet(PlanetDTO planetDTO) {
        this.name = planetDTO.name();
        this.climate = planetDTO.climate();
        this.terrain = planetDTO.terrain();
    }

    public Planet(String name, String climate, String terrain) {
        this.name = name;
        this.climate = climate;
        this.terrain = terrain;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(obj, this);
    }

}
