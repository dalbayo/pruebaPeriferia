package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.EstadoMarcacion;
import co.gtcloud.riopaila.repository.EstadoMarcacionRepository;
import co.gtcloud.riopaila.service.IEstadoMarcacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstadoMarcacionServiceImpl implements IEstadoMarcacionService {
    private final EstadoMarcacionRepository repository;

    @Override @Transactional(readOnly = true)
    public List<EstadoMarcacion> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<EstadoMarcacion> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public EstadoMarcacion save(EstadoMarcacion entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
