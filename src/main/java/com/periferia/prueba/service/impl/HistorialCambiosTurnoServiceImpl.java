package com.periferia.prueba.service.impl;

import com.periferia.prueba.model.HistorialCambiosTurno;
import com.periferia.prueba.repository.HistorialCambiosTurnoRepository;
import com.periferia.prueba.service.IHistorialCambiosTurnoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HistorialCambiosTurnoServiceImpl implements IHistorialCambiosTurnoService {
    private final HistorialCambiosTurnoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<HistorialCambiosTurno> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<HistorialCambiosTurno> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public HistorialCambiosTurno save(HistorialCambiosTurno entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
