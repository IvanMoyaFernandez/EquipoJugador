package com.moya.Repository;

import com.moya.Entity.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long>  {

// Para registrar el equipo en cada jugador. --> Utilizado en JugadorService
    public List<Equipo> findByNombre(String nombreEquipo);

// PT 1 EJERCICIO 2 ENTIDAD EQUIPO
    // A
    public List<Equipo> findByLocalidad(String localidadEquipo);
}