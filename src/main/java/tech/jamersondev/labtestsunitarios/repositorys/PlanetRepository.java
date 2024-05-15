package tech.jamersondev.labtestsunitarios.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.jamersondev.labtestsunitarios.domain.Planet;

public interface PlanetRepository extends JpaRepository<Planet, Long> {
}
