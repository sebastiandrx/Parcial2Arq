package com.example.Futbol.Controller;

import com.example.Futbol.Models.Equipo;
import com.example.Futbol.Service.EquipoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/equipos")
@CrossOrigin
public class EquipoController {

    @Autowired
    private EquipoServices equipoService;

    @GetMapping
    public List<Equipo> getAllEquipos() {
        return equipoService.getAllEquipos();
    }

    @GetMapping("/{id}")
    public Optional<Equipo> getEquipoById(@PathVariable Integer id) {
        return equipoService.getEquipoById(id);
    }

    @PostMapping
    public Equipo createEquipo(@RequestBody Equipo equipo) {
        return equipoService.saveEquipo(equipo);
    }

    @PutMapping("/{id}")
    public Equipo updateEquipo(@PathVariable Integer id, @RequestBody Equipo equipo) {
        return equipoService.updateEquipo(id, equipo);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipo(@PathVariable Integer id) {
        equipoService.deleteEquipo(id);
    }
}
