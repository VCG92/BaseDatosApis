package com.example.demo.controllers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.models.MovilModel;
import com.example.demo.models.MovilModelDTO;
import com.example.demo.models.MovilModelOM;

import reactor.core.publisher.Mono;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class MovilControllerTest {
	
	@LocalServerPort
    private int port;

    private WebClient webClient;

    @BeforeEach
    void setUp() {
    	MovilModelOM om = new MovilModelOM();
		List<MovilModel> moviles = om.getMoviles();  
        webClient = WebClient.builder()
                .baseUrl("http://localhost:" + port)
                .defaultHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @Test
    void testConsultarMoviles() {
        List<MovilModel> moviles = webClient.get()
                .uri("/CRUDMovil/GetMoviles")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<MovilModel>>() {})
                .block();

        assertNotNull(moviles);
        assertFalse(moviles.isEmpty());
        // Aquí puedes agregar más aserciones para verificar que los datos sean correctos
        // según tus expectativas.
    }
    
    @Test
    public void testMovilesDTO() {
        // Realizamos la petición GET al endpoint
        List<MovilModelDTO> response = webClient.get()
            .uri("/CRUDMovil/dto")
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<List<MovilModelDTO>>() {})
            .block();

        // Verificamos que la respuesta no sea nula y que contenga al menos un elemento
        assertNotNull(response);
        assertFalse(response.isEmpty());

        // Verificamos que los elementos de la lista tengan los campos que esperamos
        for (MovilModelDTO movilDTO : response) {
            assertNotNull(movilDTO.getModelo());
            assertNotNull(movilDTO.getMarca());
            assertNotNull(movilDTO.getNucleos());
            assertNotNull(movilDTO.getRam());
            assertNotNull(movilDTO.getAlmacenamiento());
            assertNotNull(movilDTO.getPrecio());
        }
    }
    //En este ejemplo estamos realizando la petición GET al endpoint /dto y esperamos recibir una lista de objetos MovilModelDTO.
    //Luego verificamos que la respuesta no sea nula ni esté vacía, y que cada elemento de la lista tenga los campos que esperamos.


    @Test
    void testBuscarMoviles() {
        // Construimos la URL del endpoint y agregamos los parámetros necesarios
        String url = "/CRUDMovil/filtrar?marca=Al&precioMin=0&precioMax=5000&ramMin=0&ramMax=3000&tecnologia=O";
        // Realizamos la petición GET a la URL
        List<MovilModelDTO> response = webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<MovilModelDTO>>() {})
                .block();
        // Verificamos que la respuesta tenga los elementos esperados
        assertNotNull(response);
        assertEquals(1, response.size());
        // Verificamos que los elementos tengan los valores esperados
        MovilModelDTO movil1 = response.get(0);
        assertEquals("Alcatel", movil1.getMarca());
        assertEquals("1s", movil1.getModelo());
        assertEquals(28, movil1.getRam());
        assertEquals(795.0f, movil1.getPrecio());
        assertEquals(27, movil1.getAlmacenamiento());
        assertEquals(9, movil1.getNucleos());
    }

    }







