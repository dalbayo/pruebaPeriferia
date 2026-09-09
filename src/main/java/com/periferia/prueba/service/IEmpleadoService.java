package com.periferia.prueba.service;

import com.periferia.prueba.model.Empleado;
import java.util.List;
import java.util.Optional;

public interface IEmpleadoService {
    List<Empleado> findAll();

    Optional<Empleado> findById(Long id);

    Empleado save(Empleado entity);

    void deleteById(Long id);
}
