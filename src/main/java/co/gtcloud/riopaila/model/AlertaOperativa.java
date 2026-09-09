package co.gtcloud.riopaila.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "alerta_operativa")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlertaOperativa implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7148148182698522571L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    
    @Column(columnDefinition = "timestamp(6) without time zone")
    private LocalDateTime fecha;
    
    private Boolean resuelta;

    @ManyToOne
    @JoinColumn(name = "empleado_id", foreignKey = @ForeignKey(name = "fkfnplyu1rsy7r5ys9ct21rcr5c"))
    private Empleado empleado;
}
