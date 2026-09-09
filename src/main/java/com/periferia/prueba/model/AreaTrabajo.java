package com.periferia.prueba.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Table(name = "area_trabajo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AreaTrabajo implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 6689706311832700445L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String nombre;
}
