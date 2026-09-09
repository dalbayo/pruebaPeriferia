package co.gtcloud.riopaila.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "historial_sincronizacion_sap")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HistorialSincronizacionSap implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7902032851288671928L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fecha;

    @Column(columnDefinition = "TEXT")
    private String descripcion;
}
