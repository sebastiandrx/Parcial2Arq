package com.example.Futbol.Service;

import com.example.Futbol.Models.Jugador;
import com.example.Futbol.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public List<Jugador> getAllJugadores() {
        return jugadorRepository.findAll();
    }

    public Optional<Jugador> getJugadorById(Integer id) {
        return jugadorRepository.findById(id);
    }

    public Jugador saveJugador(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    public Jugador updateJugador(Integer id, Jugador jugador) {
        jugador.setId_jugador(id);
        return jugadorRepository.save(jugador);
    }

    public void deleteJugador(Integer id) {
        jugadorRepository.deleteById(id);
    }
    public List<Jugador> getJugadoresPorEquipo(Integer idEquipo) {
        return jugadorRepository.findJugadoresByEquipo(idEquipo);
    }

    public List<Jugador> getJugadoresConMasGoles(Integer minGoles) {
        return jugadorRepository.findJugadoresConMasGoles(minGoles);
    }

}
