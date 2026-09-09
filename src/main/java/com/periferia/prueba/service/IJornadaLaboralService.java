package com.periferia.prueba.service;

import com.periferia.prueba.model.JornadaLaboral;
import java.util.List;
import java.util.Optional;

public interface IJornadaLaboralService {
    List<JornadaLaboral> findAll();

    Optional<JornadaLaboral> findById(Long id);

    JornadaLaboral save(JornadaLaboral entity);

    void deleteById(Long id);
}
