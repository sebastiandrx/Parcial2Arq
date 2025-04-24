package com.example.Futbol.Repository;

import com.example.Futbol.Models.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Integer> {

    @Query(value = "SELECT * FROM jugador WHERE id_equipo = :idEquipo", nativeQuery = true)
    List<Jugador> findJugadoresByEquipo(@Param("idEquipo") Integer idEquipo);

    @Query(value = """
    SELECT j.* FROM jugador j
    JOIN estadistica_jugador e ON j.id_jugador = e.id_jugador
    GROUP BY j.id_jugador
    HAVING SUM(e.goles) > :minGoles
""", nativeQuery = true)
    List<Jugador> findJugadoresConMasGoles(@Param("minGoles") Integer minGoles);



}
