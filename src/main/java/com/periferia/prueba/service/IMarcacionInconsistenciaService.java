package com.periferia.prueba.service;

import com.periferia.prueba.model.MarcacionInconsistencia;
import java.util.List;
import java.util.Optional;

public interface IMarcacionInconsistenciaService {
    List<MarcacionInconsistencia> findAll();

    Optional<MarcacionInconsistencia> findById(Long id);

    MarcacionInconsistencia save(MarcacionInconsistencia entity);

    void deleteById(Long id);
}
