package com.moya.Repository;

import com.moya.Entity.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

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
    // E
    public List<Jugador> findByNacimientoAfter(Date nacimiento);
    // F

    // G


// PT 1 EJERCICIO 2 ENTIDAD EQUIPO
    // B
    public List<Jugador> findByEquipoNombre(String nombreEquipo);
    // C
    public List<Jugador> findByEquipoNombreAndPosicion(String nombreEquipo, String posicion);
    // D
    Jugador findFirstByOrderByCanastasDesc();
}