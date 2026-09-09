package com.periferia.prueba.repository;

import com.periferia.prueba.model.AlertaOperativaEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertaOperativaEmpleadoRepository extends JpaRepository<AlertaOperativaEmpleado, Long> {
}
