package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.ParametroSistema;
import java.util.List;
import java.util.Optional;

public interface IParametroSistemaService {
    List<ParametroSistema> findAll();
    Optional<ParametroSistema> findById(Long id);
    ParametroSistema save(ParametroSistema entity);
    void deleteById(Long id);
}
