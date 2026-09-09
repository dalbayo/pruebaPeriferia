package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.HistorialSincronizacionSap;
import java.util.List;
import java.util.Optional;

public interface IHistorialSincronizacionSapService {
    List<HistorialSincronizacionSap> findAll();
    Optional<HistorialSincronizacionSap> findById(Long id);
    HistorialSincronizacionSap save(HistorialSincronizacionSap entity);
    void deleteById(Long id);
}
