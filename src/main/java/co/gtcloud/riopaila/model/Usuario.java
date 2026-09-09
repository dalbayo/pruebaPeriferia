package co.gtcloud.riopaila.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1721896203132664972L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 255)
    private String username;

    @Column(name = "empleado_id")
    private Long empleadoId;

    @Builder.Default
    @Column(columnDefinition = "boolean DEFAULT true")
    private Boolean activo = true;

    private String token;
    

    private String password;

    // Ajustado a LocalDateTime para coincidir con 'timestamp without time zone'
    @Column(name = "expirydate")
    private LocalDateTime expiryDate;

    // RelaciÃ³n opcional si deseas navegar al empleado desde el usuario
    @OneToOne
    @JoinColumn(name = "empleado_id", insertable = false, updatable = false)
    private Empleado empleado;
}
