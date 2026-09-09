package com.periferia.prueba.service.impl;

import com.periferia.prueba.model.Ciudad;
import com.periferia.prueba.repository.CiudadRepository;
import com.periferia.prueba.service.ICiudadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CiudadServiceImpl implements ICiudadService {
    private final CiudadRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Ciudad> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Ciudad> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Ciudad save(Ciudad entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
