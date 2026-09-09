package com.periferia.prueba.service;

import com.periferia.prueba.model.ParametroSistema;
import java.util.List;
import java.util.Optional;

public interface IParametroSistemaService {
    List<ParametroSistema> findAll();

    Optional<ParametroSistema> findById(Long id);

    ParametroSistema save(ParametroSistema entity);

    void deleteById(Long id);
}
