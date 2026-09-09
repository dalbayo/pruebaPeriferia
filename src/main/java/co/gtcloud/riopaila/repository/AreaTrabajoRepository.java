package co.gtcloud.riopaila.repository;

import co.gtcloud.riopaila.model.AreaTrabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaTrabajoRepository extends JpaRepository<AreaTrabajo, Long> {
}
