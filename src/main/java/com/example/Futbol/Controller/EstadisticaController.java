package com.example.Futbol.Controller;

import com.example.Futbol.Models.EstadisticaJugador;
import com.example.Futbol.Service.EstadisticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estadisticas")
@CrossOrigin
public class EstadisticaController {

    @Autowired
    private EstadisticaService estadisticaService;

    @GetMapping
    public List<EstadisticaJugador> getAllEstadisticas() {
        return estadisticaService.getAllEstadisticas();
    }

    @GetMapping("/{id}")
    public Optional<EstadisticaJugador> getEstadisticaById(@PathVariable Integer id) {
        return estadisticaService.getEstadisticaById(id);
    }

    @PostMapping
    public EstadisticaJugador createEstadistica(@RequestBody EstadisticaJugador estadistica) {
        return estadisticaService.saveEstadistica(estadistica);
    }

    @PutMapping("/{id}")
    public EstadisticaJugador updateEstadistica(@PathVariable Integer id, @RequestBody EstadisticaJugador estadistica) {
        return estadisticaService.updateEstadistica(id, estadistica);
    }

    @DeleteMapping("/{id}")
    public void deleteEstadistica(@PathVariable Integer id) {
        estadisticaService.deleteEstadistica(id);
    }

    @GetMapping("/goles/equipo/{idEquipo}")
    public Integer getTotalGolesPorEquipo(@PathVariable Integer idEquipo) {
        return estadisticaService.getTotalGolesPorEquipo(idEquipo);
    }

}
