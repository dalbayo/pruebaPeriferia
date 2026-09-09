package com.periferia.prueba.service;

import com.periferia.prueba.model.HistorialCambiosTurno;
import java.util.List;
import java.util.Optional;

public interface IHistorialCambiosTurnoService {
    List<HistorialCambiosTurno> findAll();

    Optional<HistorialCambiosTurno> findById(Long id);

    HistorialCambiosTurno save(HistorialCambiosTurno entity);

    void deleteById(Long id);
}
