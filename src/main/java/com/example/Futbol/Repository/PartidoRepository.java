package com.example.Futbol.Repository;

import com.example.Futbol.Models.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartidoRepository extends JpaRepository<Partido, Integer> {

    @Query(value = """
    SELECT p.id_partido, el.nombre AS equipo_local, ev.nombre AS equipo_visita,
           p.goles_local, p.goles_visita, p.fecha
    FROM partido p
    JOIN equipo el ON p.equipo_local = el.id_equipo
    JOIN equipo ev ON p.equipo_visita = ev.id_equipo
""", nativeQuery = true)
    List<Object[]> obtenerResultadosPartidos();

}
