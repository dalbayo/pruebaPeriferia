package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.AlertaOperativa;
import co.gtcloud.riopaila.repository.AlertaOperativaRepository;
import co.gtcloud.riopaila.service.IAlertaOperativaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlertaOperativaServiceImpl implements IAlertaOperativaService {
    private final AlertaOperativaRepository repository;

    @Override @Transactional(readOnly = true)
    public List<AlertaOperativa> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<AlertaOperativa> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public AlertaOperativa save(AlertaOperativa entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
