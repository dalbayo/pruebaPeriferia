package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.MarcacionInconsistencia;
import java.util.List;
import java.util.Optional;

public interface IMarcacionInconsistenciaService {
    List<MarcacionInconsistencia> findAll();
    Optional<MarcacionInconsistencia> findById(Long id);
    MarcacionInconsistencia save(MarcacionInconsistencia entity);
    void deleteById(Long id);
}
