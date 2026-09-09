package com.periferia.prueba.service;

import com.periferia.prueba.model.Dispositivo;
import java.util.List;
import java.util.Optional;

public interface IDispositivoService {
    List<Dispositivo> findAll();

    Optional<Dispositivo> findById(Long id);

    Dispositivo save(Dispositivo entity);

    void deleteById(Long id);
}
