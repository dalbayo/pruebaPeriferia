package com.periferia.prueba.repository;

import com.periferia.prueba.model.TurnoProgramado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoProgramadoRepository extends JpaRepository<TurnoProgramado, Long> {
}
