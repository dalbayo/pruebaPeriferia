package com.periferia.prueba.repository;

import com.periferia.prueba.model.EstadoMarcacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoMarcacionRepository extends JpaRepository<EstadoMarcacion, Long> {
}
