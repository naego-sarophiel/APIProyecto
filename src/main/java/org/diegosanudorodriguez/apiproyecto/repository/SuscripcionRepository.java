package org.diegosanudorodriguez.apiproyecto.repository;

import org.diegosanudorodriguez.apiproyecto.model.Suscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SuscripcionRepository extends JpaRepository<Suscripcion, Integer> {
    List<Suscripcion> findByIdUsuario(Integer idUsuario);
    List<Suscripcion> findByCategoria(String categoria);
    List<Suscripcion> findByEstado(String estado);

}

