package com.periferia.prueba.service;

import com.periferia.prueba.model.AuditoriaEventos;
import java.util.List;
import java.util.Optional;

public interface IAuditoriaEventosService {
    List<AuditoriaEventos> findAll();

    Optional<AuditoriaEventos> findById(Long id);

    AuditoriaEventos save(AuditoriaEventos entity);

    void deleteById(Long id);
}
