package tech.jamersondev.labtestsunitarios.services;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static tech.jamersondev.labtestsunitarios.commons.PlanetConstants.PLANET;
import static tech.jamersondev.labtestsunitarios.commons.PlanetConstants.PLANETDTO;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tech.jamersondev.labtestsunitarios.domain.Planet;
import tech.jamersondev.labtestsunitarios.repositorys.PlanetRepository;

@ExtendWith(MockitoExtension.class)
public class PlanetServiceTest {
    //operation_state_return
    @InjectMocks
    private PlanetService planetService;
    @Mock
    private PlanetRepository planetRepository;
    @Test
    public void createPlanet_withDataValid_returnPlanet(){
        //arrange
        Mockito.when(planetRepository.save(PLANET)).thenReturn(PLANET);
        //system under test
        //act
        Planet sut = planetService.create(PLANETDTO);

        //assert
        Assertions.assertThat(sut).isEqualTo(PLANET);
    }
}
