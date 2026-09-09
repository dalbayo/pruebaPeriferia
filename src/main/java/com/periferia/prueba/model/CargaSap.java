package com.periferia.prueba.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "carga_sap")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CargaSap implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -1589910882597057115L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private Integer totalRegistros;

    @ManyToOne
    @JoinColumn(name = "estado_id", foreignKey = @ForeignKey(name = "fk9va7h9wkq032dqq5k80yresmy"))
    private EstadoCargaSap estado;

    @ManyToOne
    @JoinColumn(name = "tipo_carga_id", foreignKey = @ForeignKey(name = "fkk58a6uyunmp01ju4at8p4dcki"))
    private TipoCargaSap tipoCarga;
}
