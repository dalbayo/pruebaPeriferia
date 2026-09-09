package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.Pais;
import co.gtcloud.riopaila.repository.PaisRepository;
import co.gtcloud.riopaila.service.IPaisService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PaisServiceImpl implements IPaisService {
    private final PaisRepository repository;

    @Override @Transactional(readOnly = true)
    public List<Pais> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<Pais> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public Pais save(Pais entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
