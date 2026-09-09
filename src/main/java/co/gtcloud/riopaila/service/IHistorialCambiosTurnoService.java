package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.HistorialCambiosTurno;
import java.util.List;
import java.util.Optional;

public interface IHistorialCambiosTurnoService {
    List<HistorialCambiosTurno> findAll();
    Optional<HistorialCambiosTurno> findById(Long id);
    HistorialCambiosTurno save(HistorialCambiosTurno entity);
    void deleteById(Long id);
}
