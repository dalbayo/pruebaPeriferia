package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.AreaTrabajo;
import java.util.List;
import java.util.Optional;

public interface IAreaTrabajoService {
    List<AreaTrabajo> findAll();
    Optional<AreaTrabajo> findById(Long id);
    AreaTrabajo save(AreaTrabajo entity);
    void deleteById(Long id);
}
