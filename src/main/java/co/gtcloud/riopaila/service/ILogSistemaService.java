package co.gtcloud.riopaila.service;

import co.gtcloud.riopaila.model.LogSistema;
import java.util.List;
import java.util.Optional;

public interface ILogSistemaService {
    List<LogSistema> findAll();
    Optional<LogSistema> findById(Long id);
    LogSistema save(LogSistema entity);
    void deleteById(Long id);
}
