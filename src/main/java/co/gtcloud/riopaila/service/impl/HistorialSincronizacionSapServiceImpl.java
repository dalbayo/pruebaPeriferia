package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.HistorialSincronizacionSap;
import co.gtcloud.riopaila.repository.HistorialSincronizacionSapRepository;
import co.gtcloud.riopaila.service.IHistorialSincronizacionSapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HistorialSincronizacionSapServiceImpl implements IHistorialSincronizacionSapService {
    private final HistorialSincronizacionSapRepository repository;

    @Override @Transactional(readOnly = true)
    public List<HistorialSincronizacionSap> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<HistorialSincronizacionSap> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public HistorialSincronizacionSap save(HistorialSincronizacionSap entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
