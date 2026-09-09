package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.Dispositivo;
import co.gtcloud.riopaila.repository.DispositivoRepository;
import co.gtcloud.riopaila.service.IDispositivoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DispositivoServiceImpl implements IDispositivoService {
    private final DispositivoRepository repository;

    @Override @Transactional(readOnly = true)
    public List<Dispositivo> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<Dispositivo> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public Dispositivo save(Dispositivo entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
