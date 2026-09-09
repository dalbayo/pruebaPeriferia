package co.gtcloud.riopaila.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Table(name = "empleado")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Empleado implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8184123355094264499L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_sap", nullable = false)
    private String codigoSap;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String identificacion;

    @Column(name = "area_id")
    private Long areaId;

    @Column(name = "cargo_id")
    private Long cargoId;

    @Builder.Default
    private Boolean activo = true;
}
