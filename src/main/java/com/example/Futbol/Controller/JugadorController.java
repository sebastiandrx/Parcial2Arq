package com.example.Futbol.Controller;

import com.example.Futbol.Models.Jugador;
import com.example.Futbol.Service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jugadores")
@CrossOrigin
public class JugadorController {

    @Autowired
    private JugadorService jugadorService;

    @GetMapping
    public List<Jugador> getAllJugadores() {
        return jugadorService.getAllJugadores();
    }

    @GetMapping("/{id}")
    public Optional<Jugador> getJugadorById(@PathVariable Integer id) {
        return jugadorService.getJugadorById(id);
    }

    @PostMapping
    public Jugador createJugador(@RequestBody Jugador jugador) {
        return jugadorService.saveJugador(jugador);
    }

    @PutMapping("/{id}")
    public Jugador updateJugador(@PathVariable Integer id, @RequestBody Jugador jugador) {
        return jugadorService.updateJugador(id, jugador);
    }

    @DeleteMapping("/{id}")
    public void deleteJugador(@PathVariable Integer id) {
        jugadorService.deleteJugador(id);
    }

    @GetMapping("/equipo/{idEquipo}")
    public List<Jugador> getJugadoresPorEquipo(@PathVariable Integer idEquipo) {
        return jugadorService.getJugadoresPorEquipo(idEquipo);
    }

    @GetMapping("/goleadores")
    public List<Jugador> getJugadoresConMasGoles(@RequestParam Integer minGoles) {
        return jugadorService.getJugadoresConMasGoles(minGoles);
    }

}
