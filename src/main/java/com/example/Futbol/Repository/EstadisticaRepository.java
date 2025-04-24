package com.example.Futbol.Repository;

import com.example.Futbol.Models.EstadisticaJugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadisticaRepository extends JpaRepository<EstadisticaJugador, Integer> {

    @Query(value = """
    SELECT SUM(e.goles) FROM estadistica_jugador e
    JOIN jugador j ON e.id_jugador = j.id_jugador
    WHERE j.id_equipo = :idEquipo
""", nativeQuery = true)
    Integer totalGolesPorEquipo(@Param("idEquipo") Integer idEquipo);

}
