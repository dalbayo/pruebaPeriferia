package com.periferia.prueba.service.impl;

import com.periferia.prueba.model.Marcacion;
import com.periferia.prueba.repository.MarcacionRepository;
import com.periferia.prueba.service.IMarcacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MarcacionServiceImpl implements IMarcacionService {
    private final MarcacionRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Marcacion> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Marcacion> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Marcacion save(Marcacion entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
