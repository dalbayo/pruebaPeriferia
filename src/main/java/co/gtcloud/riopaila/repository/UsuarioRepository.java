package co.gtcloud.riopaila.repository;


import co.gtcloud.riopaila.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional; 
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Optional<Usuario> findByUsername(String username);
    Optional<Usuario> findByToken(String token); // Clave para el refresh
}
