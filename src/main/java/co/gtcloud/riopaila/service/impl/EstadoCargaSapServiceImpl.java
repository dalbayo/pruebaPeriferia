package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.EstadoCargaSap;
import co.gtcloud.riopaila.repository.EstadoCargaSapRepository;
import co.gtcloud.riopaila.service.IEstadoCargaSapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstadoCargaSapServiceImpl implements IEstadoCargaSapService {
    private final EstadoCargaSapRepository repository;

    @Override @Transactional(readOnly = true)
    public List<EstadoCargaSap> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<EstadoCargaSap> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public EstadoCargaSap save(EstadoCargaSap entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
