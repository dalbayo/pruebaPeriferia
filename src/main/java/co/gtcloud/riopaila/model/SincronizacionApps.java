package co.gtcloud.riopaila.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "sincronizacion_apps")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SincronizacionApps implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5055132322072988737L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "dispositivo_id")
    private Long dispositivoId;
    
    private LocalDateTime fecha;
    private String estado;
}
