package com.periferia.prueba.repository;

import com.periferia.prueba.model.TipoCargaSap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoCargaSapRepository extends JpaRepository<TipoCargaSap, Long> {
}
