package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.AreaTrabajo;
import co.gtcloud.riopaila.repository.AreaTrabajoRepository;
import co.gtcloud.riopaila.service.IAreaTrabajoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AreaTrabajoServiceImpl implements IAreaTrabajoService {
    private final AreaTrabajoRepository repository;

    @Override @Transactional(readOnly = true)
    public List<AreaTrabajo> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<AreaTrabajo> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public AreaTrabajo save(AreaTrabajo entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
