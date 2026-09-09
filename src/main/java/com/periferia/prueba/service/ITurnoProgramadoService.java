package com.periferia.prueba.service;

import com.periferia.prueba.model.TurnoProgramado;
import java.util.List;
import java.util.Optional;

public interface ITurnoProgramadoService {
    List<TurnoProgramado> findAll();

    Optional<TurnoProgramado> findById(Long id);

    TurnoProgramado save(TurnoProgramado entity);

    void deleteById(Long id);
}
