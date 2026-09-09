package co.gtcloud.riopaila.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "marcacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Marcacion implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8235254954376306526L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "empleado_id", nullable = false)
    private Long empleadoId;
    
    private LocalDateTime fecha;
    
    @Column(name = "estado_marcacion_id")
    private Long estadoMarcacionId;
}
