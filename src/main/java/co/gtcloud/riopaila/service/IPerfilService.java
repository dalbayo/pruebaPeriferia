package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.Perfil;
import java.util.List;
import java.util.Optional;

public interface IPerfilService {
    List<Perfil> findAll();
    Optional<Perfil> findById(Long id);
    Perfil save(Perfil entity);
    void deleteById(Long id);
}
