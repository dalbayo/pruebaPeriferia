package co.gtcloud.riopaila.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import co.gtcloud.riopaila.model.Usuario;
import co.gtcloud.riopaila.repository.UsuarioRepository;
import co.gtcloud.riopaila.security.jwt.UserDetailsImpl;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        Usuario usuario = usuarioRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado"));

        
        return new UserDetailsImpl(usuario);
    }
}
