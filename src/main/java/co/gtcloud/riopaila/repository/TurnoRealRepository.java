package co.gtcloud.riopaila.repository;

import co.gtcloud.riopaila.model.TurnoReal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoRealRepository extends JpaRepository<TurnoReal, Long> {
}
