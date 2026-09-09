package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.EmpleadoSupervisor;
import java.util.List;
import java.util.Optional;

public interface IEmpleadoSupervisorService {
    List<EmpleadoSupervisor> findAll();
    Optional<EmpleadoSupervisor> findById(Long id);
    EmpleadoSupervisor save(EmpleadoSupervisor entity);
    void deleteById(Long id);
}
