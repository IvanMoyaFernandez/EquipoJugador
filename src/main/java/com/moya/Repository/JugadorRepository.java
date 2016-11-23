package com.moya.Repository;

import com.moya.Entity.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Long> {
// PT 1 EJERCICIO 2 ENTIDAD JUGADOR
    // A
    public List<Jugador> findByNombreStartingWith(String nombreJugador);
    // B
    public List<Jugador> findByCanastasGreaterThanEqual(int numCanastas);
    // C
    public List<Jugador> findByAsistenciasBetween(int minAsistencias, int maxAsistencias);
    // D
    public List<Jugador> findByPosicionLike(String posicion);
    // E.
    public List<Jugador> findByNacimientoAfter(Date nacimiento);
    // F
    @Query("SELECT jugador.posicion, AVG(jugador.canastas), AVG(jugador.asistencias), AVG(jugador.rebotes) " +
            "FROM Jugador jugador " +
            "GROUP BY jugador.posicion")
    List<Object[]> getStatisticsGroupByPosition();
    // G
    @Query("SELECT jugador.posicion, AVG(jugador.canastas), AVG(jugador.asistencias), AVG(jugador.rebotes), " +
            "MAX(jugador.canastas), MAX(jugador.asistencias), MAX(jugador.rebotes)," +
            "MIN(jugador.canastas), MIN(jugador.asistencias), MIN(jugador.rebotes)" +
            "FROM Jugador jugador " +
            "GROUP BY jugador.posicion")
    List<Object[]> getStatisticsGroupByPositionDevolverMedias();



// PT 1 EJERCICIO 2 ENTIDAD EQUIPO
    // B
    public List<Jugador> findByEquipoNombre(String nombreEquipo);
    // C
    public List<Jugador> findByEquipoNombreAndPosicion(String nombreEquipo, String posicion);
    // D
    Jugador findFirstByOrderByCanastasDesc();



// EJERCICIOS CONTROLLERS
    // Buscar jugadores que hayan hechos tantas canastas o mas.
    List<Jugador> findByCanastasLike(Integer canastas);

    // Buscar todos los jugadores ordenados por canastas.
    @Query("SELECT jugador.canastas, jugador.nombre " +
            "FROM Jugador jugador " +
            "ORDER BY jugador.canastas DESC")
    List<Object[]> findAllOrderByCanastas();

    // Jugadores entre un rango de canastas
    List<Jugador> findByCanastasBetween(int minCanastas, int maxCanastas);

    // Jugadores agrupados por posicion
    /*@Query("SELECT jugador.posicion, jugador.nombre " +
            "FROM Jugador jugador " +
            "GROUP BY jugador.posicion")
    List<Object[]> groupByPosition();*/
}