package com.periferia.prueba.service.impl;

import com.periferia.prueba.model.Empleado;
import com.periferia.prueba.repository.EmpleadoRepository;
import com.periferia.prueba.service.IEmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmpleadoServiceImpl implements IEmpleadoService {
    private final EmpleadoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Empleado> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Empleado save(Empleado entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
