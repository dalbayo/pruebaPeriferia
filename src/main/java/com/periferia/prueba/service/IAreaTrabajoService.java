package com.periferia.prueba.service;

import com.periferia.prueba.model.AreaTrabajo;
import java.util.List;
import java.util.Optional;

public interface IAreaTrabajoService {
    List<AreaTrabajo> findAll();

    Optional<AreaTrabajo> findById(Long id);

    AreaTrabajo save(AreaTrabajo entity);

    void deleteById(Long id);
}
