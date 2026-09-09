package com.periferia.prueba.service.impl;

import com.periferia.prueba.model.ParametroSistema;
import com.periferia.prueba.repository.ParametroSistemaRepository;
import com.periferia.prueba.service.IParametroSistemaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ParametroSistemaServiceImpl implements IParametroSistemaService {
    private final ParametroSistemaRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<ParametroSistema> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<ParametroSistema> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public ParametroSistema save(ParametroSistema entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
