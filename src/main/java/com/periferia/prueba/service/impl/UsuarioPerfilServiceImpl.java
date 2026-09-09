package com.periferia.prueba.service.impl;

import com.periferia.prueba.model.UsuarioPerfil;
import com.periferia.prueba.repository.UsuarioPerfilRepository;
import com.periferia.prueba.service.IUsuarioPerfilService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioPerfilServiceImpl implements IUsuarioPerfilService {
    private final UsuarioPerfilRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<UsuarioPerfil> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<UsuarioPerfil> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public UsuarioPerfil save(UsuarioPerfil entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
