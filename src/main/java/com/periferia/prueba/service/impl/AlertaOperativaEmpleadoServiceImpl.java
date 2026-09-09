package com.periferia.prueba.service.impl;

import com.periferia.prueba.model.AlertaOperativaEmpleado;
import com.periferia.prueba.repository.AlertaOperativaEmpleadoRepository;
import com.periferia.prueba.service.IAlertaOperativaEmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlertaOperativaEmpleadoServiceImpl implements IAlertaOperativaEmpleadoService {
    private final AlertaOperativaEmpleadoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<AlertaOperativaEmpleado> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<AlertaOperativaEmpleado> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public AlertaOperativaEmpleado save(AlertaOperativaEmpleado entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
