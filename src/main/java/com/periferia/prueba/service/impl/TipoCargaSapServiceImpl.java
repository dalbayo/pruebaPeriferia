package com.periferia.prueba.service.impl;

import com.periferia.prueba.model.TipoCargaSap;
import com.periferia.prueba.repository.TipoCargaSapRepository;
import com.periferia.prueba.service.ITipoCargaSapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TipoCargaSapServiceImpl implements ITipoCargaSapService {
    private final TipoCargaSapRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<TipoCargaSap> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<TipoCargaSap> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public TipoCargaSap save(TipoCargaSap entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
