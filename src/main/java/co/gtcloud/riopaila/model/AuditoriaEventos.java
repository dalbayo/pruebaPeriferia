package co.gtcloud.riopaila.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "auditoria_eventos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditoriaEventos implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 633086561689732983L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", foreignKey = @ForeignKey(name = "fk_auditoria_usuario"))
    private Usuario usuario;

    private String accion;
    private String entidad;
    private LocalDateTime fecha;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "jsonb")
    private String detalle;
}
