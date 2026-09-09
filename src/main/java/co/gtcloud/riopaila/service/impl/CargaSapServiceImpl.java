package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.CargaSap;
import co.gtcloud.riopaila.repository.CargaSapRepository;
import co.gtcloud.riopaila.service.ICargaSapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CargaSapServiceImpl implements ICargaSapService {
    private final CargaSapRepository repository;

    @Override @Transactional(readOnly = true)
    public List<CargaSap> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<CargaSap> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public CargaSap save(CargaSap entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
