package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.TurnoProgramado;
import co.gtcloud.riopaila.repository.TurnoProgramadoRepository;
import co.gtcloud.riopaila.service.ITurnoProgramadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TurnoProgramadoServiceImpl implements ITurnoProgramadoService {
    private final TurnoProgramadoRepository repository;

    @Override @Transactional(readOnly = true)
    public List<TurnoProgramado> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<TurnoProgramado> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public TurnoProgramado save(TurnoProgramado entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
