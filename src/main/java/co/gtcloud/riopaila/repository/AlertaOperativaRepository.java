package co.gtcloud.riopaila.repository;

import co.gtcloud.riopaila.model.AlertaOperativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertaOperativaRepository extends JpaRepository<AlertaOperativa, Long> {
}
