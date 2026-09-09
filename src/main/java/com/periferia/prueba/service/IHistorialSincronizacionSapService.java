package com.periferia.prueba.service;

import com.periferia.prueba.model.HistorialSincronizacionSap;
import java.util.List;
import java.util.Optional;

public interface IHistorialSincronizacionSapService {
    List<HistorialSincronizacionSap> findAll();

    Optional<HistorialSincronizacionSap> findById(Long id);

    HistorialSincronizacionSap save(HistorialSincronizacionSap entity);

    void deleteById(Long id);
}
