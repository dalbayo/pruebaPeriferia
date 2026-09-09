package co.gtcloud.riopaila.repository;

import co.gtcloud.riopaila.model.AuditoriaEventos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriaEventosRepository extends JpaRepository<AuditoriaEventos, Long> {
}
