package com.periferia.prueba.service.impl;

import com.periferia.prueba.model.TurnoReal;
import com.periferia.prueba.repository.TurnoRealRepository;
import com.periferia.prueba.service.ITurnoRealService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TurnoRealServiceImpl implements ITurnoRealService {
    private final TurnoRealRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<TurnoReal> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<TurnoReal> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public TurnoReal save(TurnoReal entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
