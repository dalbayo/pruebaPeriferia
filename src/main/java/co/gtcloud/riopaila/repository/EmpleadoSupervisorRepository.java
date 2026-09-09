package co.gtcloud.riopaila.repository;

import co.gtcloud.riopaila.model.EmpleadoSupervisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoSupervisorRepository extends JpaRepository<EmpleadoSupervisor, Long> {
}
