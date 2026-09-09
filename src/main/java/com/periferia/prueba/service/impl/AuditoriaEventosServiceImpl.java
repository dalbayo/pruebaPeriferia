package com.periferia.prueba.service.impl;

import com.periferia.prueba.model.AuditoriaEventos;
import com.periferia.prueba.repository.AuditoriaEventosRepository;
import com.periferia.prueba.service.IAuditoriaEventosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuditoriaEventosServiceImpl implements IAuditoriaEventosService {
    private final AuditoriaEventosRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<AuditoriaEventos> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<AuditoriaEventos> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public AuditoriaEventos save(AuditoriaEventos entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
