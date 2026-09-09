package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.JornadaLaboral;
import java.util.List;
import java.util.Optional;

public interface IJornadaLaboralService {
    List<JornadaLaboral> findAll();
    Optional<JornadaLaboral> findById(Long id);
    JornadaLaboral save(JornadaLaboral entity);
    void deleteById(Long id);
}
