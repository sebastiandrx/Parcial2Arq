package com.example.Futbol.Service;

import com.example.Futbol.Models.Equipo;
import com.example.Futbol.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipoServices {

    @Autowired
    private EquipoRepository equipoRepository;

    public List<Equipo> getAllEquipos() {
        return equipoRepository.findAll();
    }

    public Optional<Equipo> getEquipoById(Integer id) {
        return equipoRepository.findById(id);
    }

    public Equipo saveEquipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    public void deleteEquipo(Integer id) {
        equipoRepository.deleteById(id);
    }

    public Equipo updateEquipo(Integer id, Equipo equipo) {
        equipo.setId_equipo(id);
        return equipoRepository.save(equipo);
    }
}
