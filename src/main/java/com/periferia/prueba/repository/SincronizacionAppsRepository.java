package com.periferia.prueba.repository;

import com.periferia.prueba.model.SincronizacionApps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SincronizacionAppsRepository extends JpaRepository<SincronizacionApps, Long> {
}
