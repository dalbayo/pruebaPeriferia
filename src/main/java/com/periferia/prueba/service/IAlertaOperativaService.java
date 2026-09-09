package com.periferia.prueba.service;

import com.periferia.prueba.model.AlertaOperativa;
import java.util.List;
import java.util.Optional;

public interface IAlertaOperativaService {
    List<AlertaOperativa> findAll();

    Optional<AlertaOperativa> findById(Long id);

    AlertaOperativa save(AlertaOperativa entity);

    void deleteById(Long id);
}
