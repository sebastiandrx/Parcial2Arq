package com.example.Futbol.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class EstadisticaJugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_estadistica;

    private Integer minutos_jugados;
    private Integer goles;
    private Integer asistencias;
    private Integer tarjetas_amarillas;
    private Integer tarjetas_rojas;

    @ManyToOne
    @JoinColumn(name = "id_jugador")
    @JsonBackReference
    private Jugador jugador;

    @ManyToOne
    @JoinColumn(name = "id_partido")
    @JsonBackReference
    @JsonIgnore
    private Partido partido;

    public Integer getId_estadistica() {
        return id_estadistica;
    }

    public void setId_estadistica(Integer id_estadistica) {
        this.id_estadistica = id_estadistica;
    }

    public Integer getMinutos_jugados() {
        return minutos_jugados;
    }

    public void setMinutos_jugados(Integer minutos_jugados) {
        this.minutos_jugados = minutos_jugados;
    }

    public Integer getGoles() {
        return goles;
    }

    public void setGoles(Integer goles) {
        this.goles = goles;
    }

    public Integer getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(Integer asistencias) {
        this.asistencias = asistencias;
    }

    public Integer getTarjetas_amarillas() {
        return tarjetas_amarillas;
    }

    public void setTarjetas_amarillas(Integer tarjetas_amarillas) {
        this.tarjetas_amarillas = tarjetas_amarillas;
    }

    public Integer getTarjetas_rojas() {
        return tarjetas_rojas;
    }

    public void setTarjetas_rojas(Integer tarjetas_rojas) {
        this.tarjetas_rojas = tarjetas_rojas;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
}
