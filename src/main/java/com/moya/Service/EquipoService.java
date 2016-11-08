package com.moya.Service;

import com.moya.Entity.Equipo;
import com.moya.Repository.EquipoRepository;
import com.moya.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
@Transactional
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private JugadorRepository jugadorRepository;
    Calendar calendar = GregorianCalendar.getInstance();

    // CREAMOS LOS EQUIPOS
    public void registrarEquipos() {
        Equipo equipo1 = new Equipo();
        equipo1.setNombre("BarcelonaB");
        calendar.set(1995, Calendar.AUGUST, 11);
        equipo1.setFechaCreacion(calendar.getTime());
        equipo1.setLocalidad("Barcelona");
        equipoRepository.save(equipo1);

        Equipo equipo2 = new Equipo();
        equipo2.setNombre("RealMadridB");
        calendar.set(1997, Calendar.FEBRUARY, 29);
        equipo2.setFechaCreacion(calendar.getTime());
        equipo2.setLocalidad("Madrid");
        equipoRepository.save(equipo2);

        Equipo equipo3 = new Equipo();
        equipo3.setNombre("ValenciaB");
        calendar.set(1988, Calendar.DECEMBER, 3);
        equipo3.setFechaCreacion(calendar.getTime());
        equipo3.setLocalidad("Valencia");
        equipoRepository.save(equipo3);

        Equipo equipo4 = new Equipo();
        equipo4.setNombre("AtletiB");
        calendar.set(1980, Calendar.APRIL, 15);
        equipo4.setFechaCreacion(calendar.getTime());
        equipo4.setLocalidad("Madrid");
        equipoRepository.save(equipo4);

        Equipo equipo5 = new Equipo();
        equipo5.setNombre("SevillaB");
        calendar.set(1985, Calendar.FEBRUARY, 29);
        equipo5.setFechaCreacion(calendar.getTime());
        equipo5.setLocalidad("Sevilla");
        equipoRepository.save(equipo5);
    }

    public void consultas() {
        System.out.println("EJERCICIOS EQUIPO:");
        // A. Consultar los equipos existentes en una localidad determinada
        System.out.println("A - Equipos de una localidad introducida (localidad introducida --> Barcelona): " + equipoRepository.findByLocalidad("Barcelona"));
        // B. Devuelve todos los jugadores de un equipo, a partir del nombre completo del equipo
        System.out.println("B - Jugadores de un equipo introducido (equipo introducido --> BarcelonaB): " + jugadorRepository.findByEquipoNombre("BarcelonaB"));
        // C. Devuelve todos los jugadores de un equipo, que además jueguen en la misma posición, por ejemplo, alero.
        System.out.println("C - Jugadores de un equipo introducido que además juegan en la misma posición (equipo introducido --> BarcelonaB || posición introducida --> base): " + jugadorRepository.findByEquipoNombreAndPosicion("BarcelonaB", "base"));
        // D. Devuelve el jugador que mas canastas ha conseguido del total de jugadores
        System.out.println("D - Jugador que mas canastas a conseguido: " + jugadorRepository.findFirstByOrderByCanastasDesc());
    }
}
