package com.periferia.prueba.service.impl;

import com.periferia.prueba.model.EmpleadoSupervisor;
import com.periferia.prueba.repository.EmpleadoSupervisorRepository;
import com.periferia.prueba.service.IEmpleadoSupervisorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmpleadoSupervisorServiceImpl implements IEmpleadoSupervisorService {
    private final EmpleadoSupervisorRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<EmpleadoSupervisor> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<EmpleadoSupervisor> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public EmpleadoSupervisor save(EmpleadoSupervisor entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
