package com.periferia.prueba.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Table(name = "usuario_perfil")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioPerfil implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -8822386500673157436L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false, foreignKey = @ForeignKey(name = "fk_usuario_perfil_usuario"))
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "perfil_id", nullable = false, foreignKey = @ForeignKey(name = "fk_usuario_perfil_perfil"))
    private Perfil perfil;
}
