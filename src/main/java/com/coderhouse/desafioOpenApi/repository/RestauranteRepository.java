package com.coderhouse.desafioOpenApi.repository;

import com.coderhouse.desafioOpenApi.model.Restaurante;
import org.springframework.data.repository.CrudRepository;

public interface RestauranteRepository extends CrudRepository<Restaurante, Long> {
}
