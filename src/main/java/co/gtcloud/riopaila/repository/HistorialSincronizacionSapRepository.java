package co.gtcloud.riopaila.repository;

import co.gtcloud.riopaila.model.HistorialSincronizacionSap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialSincronizacionSapRepository extends JpaRepository<HistorialSincronizacionSap, Long> {
}
