package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.Departamento;
import java.util.List;
import java.util.Optional;

public interface IDepartamentoService {
    List<Departamento> findAll();
    Optional<Departamento> findById(Long id);
    Departamento save(Departamento entity);
    void deleteById(Long id);
}
