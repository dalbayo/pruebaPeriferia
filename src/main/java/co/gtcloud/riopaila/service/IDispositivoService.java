package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.Dispositivo;
import java.util.List;
import java.util.Optional;

public interface IDispositivoService {
    List<Dispositivo> findAll();
    Optional<Dispositivo> findById(Long id);
    Dispositivo save(Dispositivo entity);
    void deleteById(Long id);
}
