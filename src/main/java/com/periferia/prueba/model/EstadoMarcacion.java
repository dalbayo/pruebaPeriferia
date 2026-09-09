package com.periferia.prueba.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Table(name = "estado_marcacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstadoMarcacion implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -7848096200575264930L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}
