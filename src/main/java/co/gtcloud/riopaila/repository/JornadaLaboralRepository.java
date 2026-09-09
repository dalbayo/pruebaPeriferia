package co.gtcloud.riopaila.repository;

import co.gtcloud.riopaila.model.JornadaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaLaboralRepository extends JpaRepository<JornadaLaboral, Long> {
}
