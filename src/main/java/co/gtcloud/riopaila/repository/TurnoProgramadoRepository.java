package co.gtcloud.riopaila.repository;

import co.gtcloud.riopaila.model.TurnoProgramado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoProgramadoRepository extends JpaRepository<TurnoProgramado, Long> {
}
