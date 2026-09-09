package co.gtcloud.riopaila.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "alerta_operativa_empleado")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlertaOperativaEmpleado implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1298405566238631927L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "empleado_id", foreignKey = @ForeignKey(name = "fk_alerta_empleado"))
    private Empleado empleado;

    @Column(columnDefinition = "text")
    private String descripcion;

    private LocalDateTime fecha; // DEFAULT CURRENT_TIMESTAMP en BD

    private Boolean resuelta; // DEFAULT false en BD
}
