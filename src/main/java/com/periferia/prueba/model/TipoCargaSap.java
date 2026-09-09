package com.periferia.prueba.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Table(name = "tipo_carga_sap")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoCargaSap implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -8112955216964615715L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}
