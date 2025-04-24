package com.example.Futbol.Service;

import com.example.Futbol.Models.Partido;
import com.example.Futbol.Repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartidoService {

    @Autowired
    private PartidoRepository partidoRepository;

    public List<Partido> getAllPartidos() {
        return partidoRepository.findAll();
    }

    public Optional<Partido> getPartidoById(Integer id) {
        return partidoRepository.findById(id);
    }

    public Partido savePartido(Partido partido) {
        return partidoRepository.save(partido);
    }

    public Partido updatePartido(Integer id, Partido partido) {
        partido.setId_partido(id);
        return partidoRepository.save(partido);
    }

    public void deletePartido(Integer id) {
        partidoRepository.deleteById(id);
    }

    public List<Object[]> getResultadosPartidos() {
        return partidoRepository.obtenerResultadosPartidos();
    }

}
