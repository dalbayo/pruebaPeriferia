package co.gtcloud.riopaila.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "log_sistema")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LogSistema implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8474739728694903769L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime fecha;
    private String mensaje;
    private String nivel;
}
