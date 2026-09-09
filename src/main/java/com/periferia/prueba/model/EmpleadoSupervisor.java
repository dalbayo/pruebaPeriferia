package com.periferia.prueba.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Table(name = "empleado_supervisor")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmpleadoSupervisor implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 2846417174598306740L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "empleado_id")
    private Long empleadoId;

    @Column(name = "supervisor_id")
    private Long supervisorId;
}
