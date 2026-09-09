package co.gtcloud.riopaila.repository;

import co.gtcloud.riopaila.model.MarcacionInconsistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcacionInconsistenciaRepository extends JpaRepository<MarcacionInconsistencia, Long> {
}
