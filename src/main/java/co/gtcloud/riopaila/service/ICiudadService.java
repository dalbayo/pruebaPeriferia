package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.Ciudad;
import java.util.List;
import java.util.Optional;

public interface ICiudadService {
    List<Ciudad> findAll();
    Optional<Ciudad> findById(Long id);
    Ciudad save(Ciudad entity);
    void deleteById(Long id);
}
