package com.periferia.prueba.repository;

import com.periferia.prueba.model.EstadoCargaSap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoCargaSapRepository extends JpaRepository<EstadoCargaSap, Long> {
}
