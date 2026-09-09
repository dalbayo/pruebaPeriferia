package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.JornadaLaboral;
import co.gtcloud.riopaila.repository.JornadaLaboralRepository;
import co.gtcloud.riopaila.service.IJornadaLaboralService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class JornadaLaboralServiceImpl implements IJornadaLaboralService {
    private final JornadaLaboralRepository repository;

    @Override @Transactional(readOnly = true)
    public List<JornadaLaboral> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<JornadaLaboral> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public JornadaLaboral save(JornadaLaboral entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
