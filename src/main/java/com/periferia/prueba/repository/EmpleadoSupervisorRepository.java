package com.periferia.prueba.repository;

import com.periferia.prueba.model.EmpleadoSupervisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoSupervisorRepository extends JpaRepository<EmpleadoSupervisor, Long> {
}
