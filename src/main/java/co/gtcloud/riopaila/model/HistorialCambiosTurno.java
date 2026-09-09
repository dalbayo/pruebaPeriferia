package co.gtcloud.riopaila.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "historial_cambios_turno")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HistorialCambiosTurno implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -7554826915069773574L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "turno_real_id")
    private Long turnoRealId;

    @Column(name = "usuario_id")
    private Long usuarioId;

    private LocalDateTime fecha;
    
    @Column(columnDefinition = "TEXT")
    private String descripcion;
}
