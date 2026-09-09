package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.TipoCargaSap;
import java.util.List;
import java.util.Optional;

public interface ITipoCargaSapService {
    List<TipoCargaSap> findAll();
    Optional<TipoCargaSap> findById(Long id);
    TipoCargaSap save(TipoCargaSap entity);
    void deleteById(Long id);
}
