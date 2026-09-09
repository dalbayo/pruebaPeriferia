package com.periferia.prueba.repository;

import com.periferia.prueba.model.HistorialCambiosTurno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialCambiosTurnoRepository extends JpaRepository<HistorialCambiosTurno, Long> {
}
