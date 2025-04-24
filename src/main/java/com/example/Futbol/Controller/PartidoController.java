package com.example.Futbol.Controller;

import com.example.Futbol.Models.Partido;
import com.example.Futbol.Service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/partidos")
@CrossOrigin
public class PartidoController {

    @Autowired
    private PartidoService partidoService;

    @GetMapping
    public List<Partido> getAllPartidos() {
        return partidoService.getAllPartidos();
    }

    @GetMapping("/{id}")
    public Optional<Partido> getPartidoById(@PathVariable Integer id) {
        return partidoService.getPartidoById(id);
    }

    @PostMapping
    public Partido createPartido(@RequestBody Partido partido) {
        return partidoService.savePartido(partido);
    }

    @PutMapping("/{id}")
    public Partido updatePartido(@PathVariable Integer id, @RequestBody Partido partido) {
        return partidoService.updatePartido(id, partido);
    }

    @DeleteMapping("/{id}")
    public void deletePartido(@PathVariable Integer id) {
        partidoService.deletePartido(id);
    }

    @GetMapping("/resultados")
    public List<Object[]> getResultadosPartidos() {
        return partidoService.getResultadosPartidos();
    }

}
