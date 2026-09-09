package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.EstadoCargaSap;
import java.util.List;
import java.util.Optional;

public interface IEstadoCargaSapService {
    List<EstadoCargaSap> findAll();
    Optional<EstadoCargaSap> findById(Long id);
    EstadoCargaSap save(EstadoCargaSap entity);
    void deleteById(Long id);
}
