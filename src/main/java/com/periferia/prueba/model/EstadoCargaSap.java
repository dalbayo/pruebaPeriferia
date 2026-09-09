package com.periferia.prueba.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Table(name = "estado_carga_sap")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstadoCargaSap implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -8097428634680896816L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}
