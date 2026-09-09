package com.periferia.prueba.repository;

import com.periferia.prueba.model.AlertaOperativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertaOperativaRepository extends JpaRepository<AlertaOperativa, Long> {
}
