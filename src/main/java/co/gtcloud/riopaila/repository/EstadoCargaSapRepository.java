package co.gtcloud.riopaila.repository;

import co.gtcloud.riopaila.model.EstadoCargaSap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoCargaSapRepository extends JpaRepository<EstadoCargaSap, Long> {
}
