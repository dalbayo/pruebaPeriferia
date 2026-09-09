package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.Marcacion;
import java.util.List;
import java.util.Optional;

public interface IMarcacionService {
    List<Marcacion> findAll();
    Optional<Marcacion> findById(Long id);
    Marcacion save(Marcacion entity);
    void deleteById(Long id);
}
