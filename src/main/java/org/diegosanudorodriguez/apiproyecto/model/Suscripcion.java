package org.diegosanudorodriguez.apiproyecto.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "suscripciones")
public class Suscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_suscripcion")
    private Integer idSuscripcion;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "nombre_servicio", length = 100)
    private String nombreServicio;

    @Column(name = "costo_mensual", precision = 10, scale = 2)
    private BigDecimal costoMensual;

    @Column(name = "fecha_cobro")
    private LocalDate fechaCobro;

    @Column(name = "categoria", length = 50)
    private String categoria;

    @Column(name = "url_cancelacion")
    private String urlCancelacion;

    @Column(name = "estado", length = 20)
    private String estado;

    @Column(name = "imagen_url")
    private String imagenUrl;

    // Getters and Setters
    public Integer getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(Integer idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public BigDecimal getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(BigDecimal costoMensual) {
        this.costoMensual = costoMensual;
    }

    public LocalDate getFechaCobro() {
        return fechaCobro;
    }

    public void setFechaCobro(LocalDate fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUrlCancelacion() {
        return urlCancelacion;
    }

    public void setUrlCancelacion(String urlCancelacion) {
        this.urlCancelacion = urlCancelacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }
}

