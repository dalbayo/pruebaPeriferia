package com.periferia.prueba.service.impl;

import com.periferia.prueba.model.MarcacionInconsistencia;
import com.periferia.prueba.repository.MarcacionInconsistenciaRepository;
import com.periferia.prueba.service.IMarcacionInconsistenciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MarcacionInconsistenciaServiceImpl implements IMarcacionInconsistenciaService {
    private final MarcacionInconsistenciaRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<MarcacionInconsistencia> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<MarcacionInconsistencia> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public MarcacionInconsistencia save(MarcacionInconsistencia entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
