package com.periferia.prueba.repository;

import com.periferia.prueba.model.ParametroSistema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParametroSistemaRepository extends JpaRepository<ParametroSistema, Long> {
}
