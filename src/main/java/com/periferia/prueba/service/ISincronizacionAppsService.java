package com.periferia.prueba.service;

import com.periferia.prueba.model.SincronizacionApps;
import java.util.List;
import java.util.Optional;

public interface ISincronizacionAppsService {
    List<SincronizacionApps> findAll();

    Optional<SincronizacionApps> findById(Long id);

    SincronizacionApps save(SincronizacionApps entity);

    void deleteById(Long id);
}
