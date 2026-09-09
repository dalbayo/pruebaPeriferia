package co.gtcloud.riopaila.repository;

import co.gtcloud.riopaila.model.SincronizacionApps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SincronizacionAppsRepository extends JpaRepository<SincronizacionApps, Long> {
}
