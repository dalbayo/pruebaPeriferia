package com.periferia.prueba.service.impl;

import com.periferia.prueba.model.Cargo;
import com.periferia.prueba.repository.CargoRepository;
import com.periferia.prueba.service.ICargoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CargoServiceImpl implements ICargoService {
    private final CargoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Cargo> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Cargo> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Cargo save(Cargo entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
