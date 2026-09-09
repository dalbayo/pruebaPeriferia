package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.Usuario;
import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    List<Usuario> findAll();
    Optional<Usuario> findById(Long id);

    Optional<Usuario> findByUsername(String id);

    Optional<Usuario> findByToken(String id);
    Usuario save(Usuario entity);
    void deleteById(Long id);
}
