package com.periferia.prueba.service;

import com.periferia.prueba.model.Departamento;
import java.util.List;
import java.util.Optional;

public interface IDepartamentoService {
    List<Departamento> findAll();

    Optional<Departamento> findById(Long id);

    Departamento save(Departamento entity);

    void deleteById(Long id);
}
