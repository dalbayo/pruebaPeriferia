package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.EmpleadoSupervisor;
import co.gtcloud.riopaila.repository.EmpleadoSupervisorRepository;
import co.gtcloud.riopaila.service.IEmpleadoSupervisorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmpleadoSupervisorServiceImpl implements IEmpleadoSupervisorService {
    private final EmpleadoSupervisorRepository repository;

    @Override @Transactional(readOnly = true)
    public List<EmpleadoSupervisor> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<EmpleadoSupervisor> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public EmpleadoSupervisor save(EmpleadoSupervisor entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
