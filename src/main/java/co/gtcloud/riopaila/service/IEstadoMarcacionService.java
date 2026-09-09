package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.EstadoMarcacion;
import java.util.List;
import java.util.Optional;

public interface IEstadoMarcacionService {
    List<EstadoMarcacion> findAll();
    Optional<EstadoMarcacion> findById(Long id);
    EstadoMarcacion save(EstadoMarcacion entity);
    void deleteById(Long id);
}
