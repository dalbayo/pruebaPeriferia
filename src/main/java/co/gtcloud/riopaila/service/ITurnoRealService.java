package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.TurnoReal;
import java.util.List;
import java.util.Optional;

public interface ITurnoRealService {
    List<TurnoReal> findAll();
    Optional<TurnoReal> findById(Long id);
    TurnoReal save(TurnoReal entity);
    void deleteById(Long id);
}
