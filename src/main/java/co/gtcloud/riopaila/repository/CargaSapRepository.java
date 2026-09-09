package co.gtcloud.riopaila.repository;

import co.gtcloud.riopaila.model.CargaSap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargaSapRepository extends JpaRepository<CargaSap, Long> {
}
