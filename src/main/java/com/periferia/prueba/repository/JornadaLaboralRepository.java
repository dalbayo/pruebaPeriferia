package com.periferia.prueba.repository;

import com.periferia.prueba.model.JornadaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaLaboralRepository extends JpaRepository<JornadaLaboral, Long> {
}
