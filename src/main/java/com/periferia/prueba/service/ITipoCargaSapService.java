package com.periferia.prueba.service;

import com.periferia.prueba.model.TipoCargaSap;
import java.util.List;
import java.util.Optional;

public interface ITipoCargaSapService {
    List<TipoCargaSap> findAll();

    Optional<TipoCargaSap> findById(Long id);

    TipoCargaSap save(TipoCargaSap entity);

    void deleteById(Long id);
}
