package com.periferia.prueba.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Table(name = "dispositivo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dispositivo implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 2740289276886712846L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "empleado_id", nullable = false)
    private Long empleadoId;

    @Column(name = "device_id", nullable = false)
    private String deviceId;

    private String modelo;

    @Column(name = "version_app")
    private String versionApp;

    @Builder.Default
    private Boolean activo = true;
}
