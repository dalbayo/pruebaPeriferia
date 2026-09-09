package com.periferia.prueba.service.impl;

import com.periferia.prueba.model.EstadoMarcacion;
import com.periferia.prueba.repository.EstadoMarcacionRepository;
import com.periferia.prueba.service.IEstadoMarcacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstadoMarcacionServiceImpl implements IEstadoMarcacionService {
    private final EstadoMarcacionRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<EstadoMarcacion> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<EstadoMarcacion> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public EstadoMarcacion save(EstadoMarcacion entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
