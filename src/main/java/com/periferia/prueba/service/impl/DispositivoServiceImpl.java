package com.periferia.prueba.service.impl;

import com.periferia.prueba.model.Dispositivo;
import com.periferia.prueba.repository.DispositivoRepository;
import com.periferia.prueba.service.IDispositivoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DispositivoServiceImpl implements IDispositivoService {
    private final DispositivoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Dispositivo> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Dispositivo> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Dispositivo save(Dispositivo entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
