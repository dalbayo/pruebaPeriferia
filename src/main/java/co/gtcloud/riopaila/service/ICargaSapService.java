package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.CargaSap;
import java.util.List;
import java.util.Optional;

public interface ICargaSapService {
    List<CargaSap> findAll();
    Optional<CargaSap> findById(Long id);
    CargaSap save(CargaSap entity);
    void deleteById(Long id);
}
