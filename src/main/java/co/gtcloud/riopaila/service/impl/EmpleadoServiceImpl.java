package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.Empleado;
import co.gtcloud.riopaila.repository.EmpleadoRepository;
import co.gtcloud.riopaila.service.IEmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmpleadoServiceImpl implements IEmpleadoService {
    private final EmpleadoRepository repository;

    @Override @Transactional(readOnly = true)
    public List<Empleado> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<Empleado> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public Empleado save(Empleado entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
