package com.coderhouse.desafioOpenApi.controller;

import com.coderhouse.desafioOpenApi.model.Restaurante;
import com.coderhouse.desafioOpenApi.service.RestauranteService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class Controller {
    private final RestauranteService service;

    @PostMapping("/restaurantes")
    public Restaurante crearRestaurante(@RequestBody Restaurante restaurante) throws JsonProcessingException {
        return service.crearRestaurante(restaurante);
    }

    @GetMapping("/restaurantes/{id}")
    public Restaurante getRestaurante(@PathVariable Long id){
        return service.getRestaurante(id);
    }
}
