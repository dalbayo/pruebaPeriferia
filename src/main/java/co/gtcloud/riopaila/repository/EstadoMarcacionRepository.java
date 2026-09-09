package co.gtcloud.riopaila.repository;

import co.gtcloud.riopaila.model.EstadoMarcacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoMarcacionRepository extends JpaRepository<EstadoMarcacion, Long> {
}
