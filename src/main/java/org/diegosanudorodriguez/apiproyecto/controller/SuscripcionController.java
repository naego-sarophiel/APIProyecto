package org.diegosanudorodriguez.apiproyecto.controller;

import org.diegosanudorodriguez.apiproyecto.model.Suscripcion;
import org.diegosanudorodriguez.apiproyecto.repository.SuscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suscripciones")
public class SuscripcionController {

    @Autowired
    private SuscripcionRepository suscripcionRepository;

    // Get all subscriptions
    @GetMapping
    public List<Suscripcion> getAllSuscripciones() {
        return suscripcionRepository.findAll();
    }

    // Get subscription by ID
    @GetMapping("/{id}")
    public ResponseEntity<Suscripcion> getSuscripcionById(@PathVariable("id") Integer id) {
        return suscripcionRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Get subscriptions by user ID
    @GetMapping("/usuario/{idUsuario}")
    public List<Suscripcion> getSuscripcionesByUsuario(@PathVariable Integer idUsuario) {
        return suscripcionRepository.findByIdUsuario(idUsuario);
    }

    // Get subscriptions by category
    @GetMapping("/categoria/{categoria}")
    public List<Suscripcion> getSuscripcionesByCategoria(@PathVariable String categoria) {
        return suscripcionRepository.findByCategoria(categoria);
    }

    // Create new subscription
    @PostMapping
    public Suscripcion createSuscripcion(@RequestBody Suscripcion suscripcion) {
        return suscripcionRepository.save(suscripcion);
    }

    // Update subscription
    @PutMapping("/{id}")
    public ResponseEntity<Suscripcion> updateSuscripcion(
            @PathVariable("id") Integer id,
            @RequestBody Suscripcion suscripcion) {
        return suscripcionRepository.findById(id)
                .map(existingSuscripcion -> {
                    suscripcion.setIdSuscripcion(id);
                    return ResponseEntity.ok(suscripcionRepository.save(suscripcion));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete subscription
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSuscripcion(@PathVariable("id") Integer id) {
        return suscripcionRepository.findById(id)
                .map(suscripcion -> {
                    suscripcionRepository.delete(suscripcion);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Get subscriptions by status
    @GetMapping("/estado/{estado}")
    public List<Suscripcion> getSuscripcionesByEstado(@PathVariable String estado) {
        return suscripcionRepository.findByEstado(estado);
    }
}

