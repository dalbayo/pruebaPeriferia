package com.periferia.prueba.repository;

import com.periferia.prueba.model.AuditoriaEventos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriaEventosRepository extends JpaRepository<AuditoriaEventos, Long> {
}
