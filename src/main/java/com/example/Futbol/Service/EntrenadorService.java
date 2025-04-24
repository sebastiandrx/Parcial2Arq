package com.example.Futbol.Service;

import com.example.Futbol.Models.Entrenador;
import com.example.Futbol.Repository.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntrenadorService {

    @Autowired
    private EntrenadorRepository entrenadorRepository;

    public List<Entrenador> getAllEntrenadores() {
        return entrenadorRepository.findAll();
    }

    public Optional<Entrenador> getEntrenadorById(Integer id) {
        return entrenadorRepository.findById(id);
    }

    public Entrenador saveEntrenador(Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }

    public Entrenador updateEntrenador(Integer id, Entrenador entrenador) {
        entrenador.setId_entrenador(id);
        return entrenadorRepository.save(entrenador);
    }

    public void deleteEntrenador(Integer id) {
        entrenadorRepository.deleteById(id);
    }
}
