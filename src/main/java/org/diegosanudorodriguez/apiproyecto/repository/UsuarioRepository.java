package org.diegosanudorodriguez.apiproyecto.repository;

import org.diegosanudorodriguez.apiproyecto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByEmail(String email);
    boolean existsByEmail(String email);
    Optional<Usuario> findByEmailAndPassword(String email, String password);

}



