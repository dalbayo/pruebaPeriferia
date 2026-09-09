package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.HistorialCambiosTurno;
import co.gtcloud.riopaila.repository.HistorialCambiosTurnoRepository;
import co.gtcloud.riopaila.service.IHistorialCambiosTurnoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HistorialCambiosTurnoServiceImpl implements IHistorialCambiosTurnoService {
    private final HistorialCambiosTurnoRepository repository;

    @Override @Transactional(readOnly = true)
    public List<HistorialCambiosTurno> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<HistorialCambiosTurno> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public HistorialCambiosTurno save(HistorialCambiosTurno entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
