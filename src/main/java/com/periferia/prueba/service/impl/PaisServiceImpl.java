package com.periferia.prueba.service.impl;

import com.periferia.prueba.model.Pais;
import com.periferia.prueba.repository.PaisRepository;
import com.periferia.prueba.service.IPaisService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PaisServiceImpl implements IPaisService {
    private final PaisRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Pais> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Pais> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Pais save(Pais entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
