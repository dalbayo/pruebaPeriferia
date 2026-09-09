package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.Empleado;
import java.util.List;
import java.util.Optional;

public interface IEmpleadoService {
    List<Empleado> findAll();
    Optional<Empleado> findById(Long id);
    Empleado save(Empleado entity);
    void deleteById(Long id);
}
