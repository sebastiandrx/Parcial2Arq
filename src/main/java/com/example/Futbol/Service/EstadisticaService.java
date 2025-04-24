package com.example.Futbol.Service;

import com.example.Futbol.Models.EstadisticaJugador;
import com.example.Futbol.Repository.EstadisticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadisticaService {

    @Autowired
    private EstadisticaRepository estadisticaRepository;

    public List<EstadisticaJugador> getAllEstadisticas() {
        return estadisticaRepository.findAll();
    }

    public Optional<EstadisticaJugador> getEstadisticaById(Integer id) {
        return estadisticaRepository.findById(id);
    }

    public EstadisticaJugador saveEstadistica(EstadisticaJugador estadistica) {
        return estadisticaRepository.save(estadistica);
    }

    public EstadisticaJugador updateEstadistica(Integer id, EstadisticaJugador estadistica) {
        estadistica.setId_estadistica(id);
        return estadisticaRepository.save(estadistica);
    }

    public void deleteEstadistica(Integer id) {
        estadisticaRepository.deleteById(id);
    }

    public Integer getTotalGolesPorEquipo(Integer idEquipo) {
        return estadisticaRepository.totalGolesPorEquipo(idEquipo);
    }

}
