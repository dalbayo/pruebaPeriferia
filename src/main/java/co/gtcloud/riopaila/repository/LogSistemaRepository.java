package co.gtcloud.riopaila.repository;

import co.gtcloud.riopaila.model.LogSistema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogSistemaRepository extends JpaRepository<LogSistema, Long> {
}
