package co.gtcloud.riopaila.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "turno_programado")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TurnoProgramado implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4627156068492428265L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "empleado_id")
    private Long empleadoId;
    
    private LocalDate fecha;
    
    @Column(name = "turno_real_id")
    private Long turnoRealId;
}
