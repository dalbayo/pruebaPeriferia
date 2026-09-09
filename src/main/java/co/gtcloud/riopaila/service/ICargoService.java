package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.Cargo;
import java.util.List;
import java.util.Optional;

public interface ICargoService {
    List<Cargo> findAll();
    Optional<Cargo> findById(Long id);
    Cargo save(Cargo entity);
    void deleteById(Long id);
}
