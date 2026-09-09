package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.SincronizacionApps;
import co.gtcloud.riopaila.repository.SincronizacionAppsRepository;
import co.gtcloud.riopaila.service.ISincronizacionAppsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SincronizacionAppsServiceImpl implements ISincronizacionAppsService {
    private final SincronizacionAppsRepository repository;

    @Override @Transactional(readOnly = true)
    public List<SincronizacionApps> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<SincronizacionApps> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public SincronizacionApps save(SincronizacionApps entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
