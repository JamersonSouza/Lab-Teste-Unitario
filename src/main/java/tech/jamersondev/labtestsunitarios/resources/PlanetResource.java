package tech.jamersondev.labtestsunitarios.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import tech.jamersondev.labtestsunitarios.domain.Planet;
import tech.jamersondev.labtestsunitarios.records.PlanetDTO;
import tech.jamersondev.labtestsunitarios.services.PlanetService;

import java.net.URI;

@RestController
@RequestMapping("/planets")
public class PlanetResource {
    private final PlanetService planetService;

    public PlanetResource(PlanetService planetService) {
        this.planetService = planetService;
    }

    @PostMapping
    public ResponseEntity<PlanetDTO> create(@RequestBody PlanetDTO planetDTO,
                                            UriComponentsBuilder uriComponentsBuilder){
        Planet planet = this.planetService.create(planetDTO);
        URI uri = uriComponentsBuilder.path("/planet/{id}").buildAndExpand(planet.getId()).toUri();
        return ResponseEntity.created(uri).body(new PlanetDTO(planet));
    }
}
