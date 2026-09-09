package co.gtcloud.riopaila.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "jornada_laboral")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JornadaLaboral implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1350695158649028417L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "empleado_id", nullable = false)
    private Long empleadoId;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(name = "turno_real_id")
    private Long turnoRealId;
}
