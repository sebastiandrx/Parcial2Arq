package com.example.Futbol.Controller;

import com.example.Futbol.Models.Entrenador;
import com.example.Futbol.Service.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entrenadores")
@CrossOrigin
public class EntrenadorController {

    @Autowired
    private EntrenadorService entrenadorService;

    @GetMapping
    public List<Entrenador> getAllEntrenadores() {
        return entrenadorService.getAllEntrenadores();
    }

    @GetMapping("/{id}")
    public Optional<Entrenador> getEntrenadorById(@PathVariable Integer id) {
        return entrenadorService.getEntrenadorById(id);
    }

    @PostMapping
    public Entrenador createEntrenador(@RequestBody Entrenador entrenador) {
        return entrenadorService.saveEntrenador(entrenador);
    }

    @PutMapping("/{id}")
    public Entrenador updateEntrenador(@PathVariable Integer id, @RequestBody Entrenador entrenador) {
        return entrenadorService.updateEntrenador(id, entrenador);
    }

    @DeleteMapping("/{id}")
    public void deleteEntrenador(@PathVariable Integer id) {
        entrenadorService.deleteEntrenador(id);
    }
}
