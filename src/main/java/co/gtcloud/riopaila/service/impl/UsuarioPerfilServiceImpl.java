package co.gtcloud.riopaila.service.impl;

import co.gtcloud.riopaila.model.UsuarioPerfil;
import co.gtcloud.riopaila.repository.UsuarioPerfilRepository;
import co.gtcloud.riopaila.service.IUsuarioPerfilService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioPerfilServiceImpl implements IUsuarioPerfilService {
    private final UsuarioPerfilRepository repository;

    @Override @Transactional(readOnly = true)
    public List<UsuarioPerfil> findAll() { return repository.findAll(); }
    @Override @Transactional(readOnly = true)
    public Optional<UsuarioPerfil> findById(Long id) { return repository.findById(id); }
    @Override @Transactional
    public UsuarioPerfil save(UsuarioPerfil entity) { return repository.save(entity); }
    @Override @Transactional
    public void deleteById(Long id) { repository.deleteById(id); }
}
