package com.periferia.prueba.repository;

import com.periferia.prueba.model.Marcacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcacionRepository extends JpaRepository<Marcacion, Long> {
}
