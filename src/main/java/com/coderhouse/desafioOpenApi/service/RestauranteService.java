package com.coderhouse.desafioOpenApi.service;

import com.coderhouse.desafioOpenApi.model.Restaurante;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface RestauranteService {
    Restaurante crearRestaurante(Restaurante restaurante) throws JsonProcessingException;
    Restaurante getRestaurante(Long id);
    Restaurante actualizarRestaurante(Restaurante restaurante, Long id);
    void borrarRestaurante(Long id);
}
