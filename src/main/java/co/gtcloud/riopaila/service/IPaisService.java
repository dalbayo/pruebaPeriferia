package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.Pais;
import java.util.List;
import java.util.Optional;

public interface IPaisService {
    List<Pais> findAll();
    Optional<Pais> findById(Long id);
    Pais save(Pais entity);
    void deleteById(Long id);
}
