package com.periferia.prueba.service;

import com.periferia.prueba.model.Pais;
import java.util.List;
import java.util.Optional;

public interface IPaisService {
    List<Pais> findAll();

    Optional<Pais> findById(Long id);

    Pais save(Pais entity);

    void deleteById(Long id);
}
