package com.periferia.prueba.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Table(name = "marcacion_inconsistencia")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MarcacionInconsistencia implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -2940215120134157743L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "marcacion_id")
    private Long marcacionId;

    private String observacion;
}
