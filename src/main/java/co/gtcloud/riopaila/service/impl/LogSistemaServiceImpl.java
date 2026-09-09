package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.LogSistema;
import co.gtcloud.riopaila.repository.LogSistemaRepository;
import co.gtcloud.riopaila.service.ILogSistemaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LogSistemaServiceImpl implements ILogSistemaService {
    private final LogSistemaRepository repository;

    @Override @Transactional(readOnly = true)
    public List<LogSistema> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<LogSistema> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public LogSistema save(LogSistema entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
