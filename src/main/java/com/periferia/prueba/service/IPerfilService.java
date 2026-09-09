package com.periferia.prueba.service;

import com.periferia.prueba.model.Perfil;
import java.util.List;
import java.util.Optional;

public interface IPerfilService {
    List<Perfil> findAll();

    Optional<Perfil> findById(Long id);

    Perfil save(Perfil entity);

    void deleteById(Long id);
}
