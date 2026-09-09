package co.gtcloud.riopaila.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Table(name = "turno_real")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TurnoReal implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5501115981428652189L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String horaInicio;
    private String horaFin;
}
