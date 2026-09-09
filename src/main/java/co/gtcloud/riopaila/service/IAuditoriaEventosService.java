package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.AuditoriaEventos;
import java.util.List;
import java.util.Optional;

public interface IAuditoriaEventosService {
    List<AuditoriaEventos> findAll();
    Optional<AuditoriaEventos> findById(Long id);
    AuditoriaEventos save(AuditoriaEventos entity);
    void deleteById(Long id);
}
