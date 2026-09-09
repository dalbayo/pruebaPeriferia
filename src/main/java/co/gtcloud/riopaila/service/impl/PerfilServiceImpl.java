package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.Perfil;
import co.gtcloud.riopaila.repository.PerfilRepository;
import co.gtcloud.riopaila.service.IPerfilService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PerfilServiceImpl implements IPerfilService {
    private final PerfilRepository repository;

    @Override @Transactional(readOnly = true)
    public List<Perfil> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<Perfil> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public Perfil save(Perfil entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
