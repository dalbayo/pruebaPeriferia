package com.periferia.prueba.service;

import com.periferia.prueba.model.AlertaOperativaEmpleado;
import java.util.List;
import java.util.Optional;

public interface IAlertaOperativaEmpleadoService {
    List<AlertaOperativaEmpleado> findAll();

    Optional<AlertaOperativaEmpleado> findById(Long id);

    AlertaOperativaEmpleado save(AlertaOperativaEmpleado entity);

    void deleteById(Long id);
}
