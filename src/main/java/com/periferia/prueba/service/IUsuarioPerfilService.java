package com.periferia.prueba.service;

import com.periferia.prueba.model.UsuarioPerfil;
import java.util.List;
import java.util.Optional;

public interface IUsuarioPerfilService {
    List<UsuarioPerfil> findAll();

    Optional<UsuarioPerfil> findById(Long id);

    UsuarioPerfil save(UsuarioPerfil entity);

    void deleteById(Long id);
}
