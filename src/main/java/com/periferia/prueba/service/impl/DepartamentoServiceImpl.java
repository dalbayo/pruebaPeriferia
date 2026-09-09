package com.periferia.prueba.service.impl;

import com.periferia.prueba.model.Departamento;
import com.periferia.prueba.repository.DepartamentoRepository;
import com.periferia.prueba.service.IDepartamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartamentoServiceImpl implements IDepartamentoService {
    private final DepartamentoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Departamento> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Departamento> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Departamento save(Departamento entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
