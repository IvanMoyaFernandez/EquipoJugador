package com.moya.Service;

import com.moya.Entity.Equipo;
import com.moya.Entity.Jugador;
import com.moya.Repository.EquipoRepository;
import com.moya.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
@Transactional
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;
    @Autowired
    private EquipoRepository equipoRepository;

    Calendar calendar = GregorianCalendar.getInstance();
// CREAMOS LOS JUGADORES
// REGISTRAR JUGADORES EN CADA EQUIPO
public void registrarJugadores() {
    Equipo equipo;

    // JUGADORES DEL BarcelonaB
    Jugador jugador1 = new Jugador();
    jugador1.setNombre("Ivan");
    calendar.set(1995, Calendar.AUGUST, 11);
    jugador1.setNacimiento(calendar.getTime());
    jugador1.setCanastas(5);
    jugador1.setAsistencias(10);
    jugador1.setRebotes(5);
    jugador1.setPosicion("base");
    equipo = equipoRepository.findByNombre("BarcelonaB").get(0);
    jugador1.setEquipo(equipo);
    jugadorRepository.save(jugador1);

    // jugador para hacer la prueba de la consulta C (ya que juega en la misma pisción y mismo equipo que el jugador1)
    Jugador jugador26 = new Jugador();
    jugador26.setNombre("Pedro");
    calendar.set(1993, Calendar.JANUARY, 18);
    jugador26.setNacimiento(calendar.getTime());
    jugador26.setCanastas(40);
    jugador26.setAsistencias(38);
    jugador26.setRebotes(20);
    jugador26.setPosicion("base");
    equipo = equipoRepository.findByNombre("BarcelonaB").get(0);
    jugador26.setEquipo(equipo);
    jugadorRepository.save(jugador26);

    Jugador jugador2 = new Jugador();
    jugador2.setNombre("Pedro");
    calendar.set(1990, Calendar.JANUARY, 25);
    jugador2.setNacimiento(calendar.getTime());
    jugador2.setCanastas(8);
    jugador2.setAsistencias(11);
    jugador2.setRebotes(2);
    jugador2.setPosicion("escolta");
    equipo = equipoRepository.findByNombre("BarcelonaB").get(0);
    jugador2.setEquipo(equipo);
    jugadorRepository.save(jugador2);

    Jugador jugador3 = new Jugador();
    jugador3.setNombre("Kevin");
    calendar.set(1992, Calendar.SEPTEMBER, 2);
    jugador3.setNacimiento(calendar.getTime());
    jugador3.setCanastas(5);
    jugador3.setAsistencias(10);
    jugador3.setRebotes(8);
    jugador3.setPosicion("alero");
    equipo = equipoRepository.findByNombre("BarcelonaB").get(0);
    jugador3.setEquipo(equipo);
    jugadorRepository.save(jugador3);

    Jugador jugador4 = new Jugador();
    jugador4.setNombre("Alvaro");
    calendar.set(1994, Calendar.MARCH, 12);
    jugador4.setNacimiento(calendar.getTime());
    jugador4.setCanastas(14);
    jugador4.setAsistencias(12);
    jugador4.setRebotes(3);
    jugador4.setPosicion("ala-pivot");
    equipo = equipoRepository.findByNombre("BarcelonaB").get(0);
    jugador4.setEquipo(equipo);
    jugadorRepository.save(jugador4);

    Jugador jugador5 = new Jugador();
    jugador5.setNombre("Juan");
    calendar.set(1993, Calendar.APRIL, 18);
    jugador5.setNacimiento(calendar.getTime());
    jugador5.setCanastas(3);
    jugador5.setAsistencias(10);
    jugador5.setRebotes(2);
    jugador5.setPosicion("pivot");
    equipo = equipoRepository.findByNombre("BarcelonaB").get(0);
    jugador5.setEquipo(equipo);
    jugadorRepository.save(jugador5);

    // JUGADORES DEL RealMadridB
    Jugador jugador6 = new Jugador();
    jugador6.setNombre("Cristina");
    calendar.set(1996, Calendar.FEBRUARY, 28);
    jugador6.setNacimiento(calendar.getTime());
    jugador6.setCanastas(9);
    jugador6.setAsistencias(12);
    jugador6.setRebotes(8);
    jugador6.setPosicion("base");
    equipo = equipoRepository.findByNombre("RealMadridB").get(0);
    jugador6.setEquipo(equipo);
    jugadorRepository.save(jugador6);

    Jugador jugador7 = new Jugador();
    jugador7.setNombre("Juanjo");
    calendar.set(1991, Calendar.JULY, 1);
    jugador7.setNacimiento(calendar.getTime());
    jugador7.setCanastas(0);
    jugador7.setAsistencias(4);
    jugador7.setRebotes(14);
    jugador7.setPosicion("escolta");
    equipo = equipoRepository.findByNombre("RealMadridB").get(0);
    jugador7.setEquipo(equipo);
    jugadorRepository.save(jugador7);

    Jugador jugador8 = new Jugador();
    jugador8.setNombre("Angela");
    calendar.set(1998, Calendar.NOVEMBER, 13);
    jugador8.setNacimiento(calendar.getTime());
    jugador8.setCanastas(2);
    jugador8.setAsistencias(3);
    jugador8.setRebotes(14);
    jugador8.setPosicion("alero");
    equipo = equipoRepository.findByNombre("RealMadridB").get(0);
    jugador8.setEquipo(equipo);
    jugadorRepository.save(jugador8);

    Jugador jugador9 = new Jugador();
    jugador9.setNombre("Maria");
    calendar.set(1993, Calendar.DECEMBER, 29);
    jugador9.setNacimiento(calendar.getTime());
    jugador9.setCanastas(20);
    jugador9.setAsistencias(8);
    jugador9.setRebotes(6);
    jugador9.setPosicion("ala-pivot");
    equipo = equipoRepository.findByNombre("RealMadridB").get(0);
    jugador9.setEquipo(equipo);
    jugadorRepository.save(jugador9);

    Jugador jugador10 = new Jugador();
    jugador10.setNombre("David");
    calendar.set(1998, Calendar.MAY, 16);
    jugador10.setNacimiento(calendar.getTime());
    jugador10.setCanastas(8);
    jugador10.setAsistencias(5);
    jugador10.setRebotes(7);
    jugador10.setPosicion("pivot");
    equipo = equipoRepository.findByNombre("RealMadridB").get(0);
    jugador10.setEquipo(equipo);
    jugadorRepository.save(jugador10);

    // JUGADORES DEL ValenciaB
    Jugador jugador11 = new Jugador();
    jugador11.setNombre("Marta");
    calendar.set(1992, Calendar.APRIL, 10);
    jugador11.setNacimiento(calendar.getTime());
    jugador11.setCanastas(7);
    jugador11.setAsistencias(2);
    jugador11.setRebotes(9);
    jugador11.setPosicion("base");
    equipo = equipoRepository.findByNombre("ValenciaB").get(0);
    jugador11.setEquipo(equipo);
    jugadorRepository.save(jugador11);

    Jugador jugador12 = new Jugador();
    jugador12.setNombre("Valeria");
    calendar.set(1988, Calendar.AUGUST, 8);
    jugador12.setNacimiento(calendar.getTime());
    jugador12.setCanastas(2);
    jugador12.setAsistencias(6);
    jugador12.setRebotes(9);
    jugador12.setPosicion("escolta");
    equipo = equipoRepository.findByNombre("ValenciaB").get(0);
    jugador12.setEquipo(equipo);
    jugadorRepository.save(jugador12);

    Jugador jugador13 = new Jugador();
    jugador13.setNombre("Marc");
    calendar.set(1996, Calendar.FEBRUARY, 19);
    jugador13.setNacimiento(calendar.getTime());
    jugador13.setCanastas(7);
    jugador13.setAsistencias(9);
    jugador13.setRebotes(3);
    jugador13.setPosicion("alero");
    equipo = equipoRepository.findByNombre("ValenciaB").get(0);
    jugador13.setEquipo(equipo);
    jugadorRepository.save(jugador13);

    Jugador jugador14 = new Jugador();
    jugador14.setNombre("Carme");
    calendar.set(1991, Calendar.MARCH, 22);
    jugador14.setNacimiento(calendar.getTime());
    jugador14.setCanastas(7);
    jugador14.setAsistencias(2);
    jugador14.setRebotes(14);
    jugador14.setPosicion("ala-pivot");
    equipo = equipoRepository.findByNombre("ValenciaB").get(0);
    jugador14.setEquipo(equipo);
    jugadorRepository.save(jugador14);

    Jugador jugador15 = new Jugador();
    jugador15.setNombre("Juan");
    calendar.set(1995, Calendar.MAY, 9);
    jugador15.setNacimiento(calendar.getTime());
    jugador15.setCanastas(6);
    jugador15.setAsistencias(7);
    jugador15.setRebotes(10);
    jugador15.setPosicion("pivot");
    equipo = equipoRepository.findByNombre("ValenciaB").get(0);
    jugador15.setEquipo(equipo);
    jugadorRepository.save(jugador15);

    // JUGADORES DEL AtletiB
    Jugador jugador16 = new Jugador();
    jugador16.setNombre("Julian");
    calendar.set(1992, Calendar.APRIL, 10);
    jugador16.setNacimiento(calendar.getTime());
    jugador16.setCanastas(7);
    jugador16.setAsistencias(2);
    jugador16.setRebotes(9);
    jugador16.setPosicion("base");
    equipo = equipoRepository.findByNombre("AtletiB").get(0);
    jugador16.setEquipo(equipo);
    jugadorRepository.save(jugador16);

    Jugador jugador17 = new Jugador();
    jugador17.setNombre("Marcus");
    calendar.set(1988, Calendar.AUGUST, 8);
    jugador17.setNacimiento(calendar.getTime());
    jugador17.setCanastas(2);
    jugador17.setAsistencias(6);
    jugador17.setRebotes(9);
    jugador17.setPosicion("escolta");
    equipo = equipoRepository.findByNombre("AtletiB").get(0);
    jugador17.setEquipo(equipo);
    jugadorRepository.save(jugador17);

    Jugador jugador18 = new Jugador();
    jugador18.setNombre("Dani");
    calendar.set(1996, Calendar.FEBRUARY, 19);
    jugador18.setNacimiento(calendar.getTime());
    jugador18.setCanastas(7);
    jugador18.setAsistencias(9);
    jugador18.setRebotes(3);
    jugador18.setPosicion("alero");
    equipo = equipoRepository.findByNombre("AtletiB").get(0);
    jugador18.setEquipo(equipo);
    jugadorRepository.save(jugador18);

    Jugador jugador19 = new Jugador();
    jugador19.setNombre("Tamara");
    calendar.set(1991, Calendar.MARCH, 22);
    jugador19.setNacimiento(calendar.getTime());
    jugador19.setCanastas(7);
    jugador19.setAsistencias(2);
    jugador19.setRebotes(14);
    jugador19.setPosicion("ala-pivot");
    equipo = equipoRepository.findByNombre("AtletiB").get(0);
    jugador19.setEquipo(equipo);
    jugadorRepository.save(jugador19);

    Jugador jugador20 = new Jugador();
    jugador20.setNombre("Nuria");
    calendar.set(1995, Calendar.MAY, 9);
    jugador20.setNacimiento(calendar.getTime());
    jugador20.setCanastas(6);
    jugador20.setAsistencias(7);
    jugador20.setRebotes(10);
    jugador20.setPosicion("pivot");
    equipo = equipoRepository.findByNombre("AtletiB").get(0);
    jugador20.setEquipo(equipo);
    jugadorRepository.save(jugador20);

    // JUGADORES DEL SevillaB
    Jugador jugador21 = new Jugador();
    jugador21.setNombre("Eric");
    calendar.set(1992, Calendar.APRIL, 10);
    jugador21.setNacimiento(calendar.getTime());
    jugador21.setCanastas(7);
    jugador21.setAsistencias(2);
    jugador21.setRebotes(9);
    jugador21.setPosicion("base");
    equipo = equipoRepository.findByNombre("SevillaB").get(0);
    jugador21.setEquipo(equipo);
    jugadorRepository.save(jugador21);

    Jugador jugador22 = new Jugador();
    jugador22.setNombre("Alex");
    calendar.set(1988, Calendar.AUGUST, 8);
    jugador22.setNacimiento(calendar.getTime());
    jugador22.setCanastas(2);
    jugador22.setAsistencias(6);
    jugador22.setRebotes(9);
    jugador22.setPosicion("escolta");
    equipo = equipoRepository.findByNombre("SevillaB").get(0);
    jugador22.setEquipo(equipo);
    jugadorRepository.save(jugador22);

    Jugador jugador23 = new Jugador();
    jugador23.setNombre("Monica");
    calendar.set(1996, Calendar.FEBRUARY, 19);
    jugador23.setNacimiento(calendar.getTime());
    jugador23.setCanastas(7);
    jugador23.setAsistencias(9);
    jugador23.setRebotes(3);
    jugador23.setPosicion("alero");
    equipo = equipoRepository.findByNombre("SevillaB").get(0);
    jugador23.setEquipo(equipo);
    jugadorRepository.save(jugador23);

    Jugador jugador24 = new Jugador();
    jugador24.setNombre("Julia");
    calendar.set(1991, Calendar.MARCH, 22);
    jugador24.setNacimiento(calendar.getTime());
    jugador24.setCanastas(7);
    jugador24.setAsistencias(2);
    jugador24.setRebotes(14);
    jugador24.setPosicion("ala-pivot");
    equipo = equipoRepository.findByNombre("SevillaB").get(0);
    jugador24.setEquipo(equipo);
    jugadorRepository.save(jugador24);

    Jugador jugador25 = new Jugador();
    jugador25.setNombre("Gisela");
    calendar.set(1995, Calendar.MAY, 9);
    jugador25.setNacimiento(calendar.getTime());
    jugador25.setCanastas(6);
    jugador25.setAsistencias(7);
    jugador25.setRebotes(10);
    jugador25.setPosicion("pivot");
    equipo = equipoRepository.findByNombre("SevillaB").get(0);
    jugador25.setEquipo(equipo);
    jugadorRepository.save(jugador25);
}

// CONSULTAS A LA BASE DE DATOS
    public void consultas() {
// PT 1 EJERCICIO 2
        System.out.println("EJERCICIOS JUGADOR:");
        // A. buscar jugador/es por nombre, sin necesidad de introducirlo entero
        System.out.println("A - Buscar jugador/es por nombre, sin necesidad de introducirlo entero");
        System.out.println(jugadorRepository.findByNombreStartingWith("Iv"));
        // B. buscar jugadores que hayan conseguido un numero mayor o igual de canastas al
        // especificado como parametro
        System.out.println("B - Buscar jugadores que hayan conseguido un numero mayor o igual de canastas al especificado como parametro");
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqual(8));
        // C. buscar jugadores que hayn efectuado un numero de asistencias dentro de un rango
        // especificado como parametro
        System.out.println("C - Buscar jugadores que hayn efectuado un numero de asistencias dentro de un rango especificado como parametro");
        System.out.println(jugadorRepository.findByAsistenciasBetween(2, 15));
        // D. buscar jugador/es que pertenezca a una posición concreta
        System.out.println("D - Buscar jugador/es que pertenezca a una posición concreta");
        System.out.println(jugadorRepository.findByPosicionLike("base"));
        // E. buscar jugador/es que hayan nacido a una fecha anterior a una fecha especificada
        // como parametro
        System.out.println("E - Buscar jugador/es que hayan nacido a una fecha anterior a una fecha especificada como parametro");
        calendar.set(1993, Calendar.APRIL, 18);
        System.out.println(jugadorRepository.findByNacimientoAfter(calendar.getTime()));
        // F. Agrupar los jugadores por la posición del campo y devolver para cada grupo la siguiente
        // información: la media de canastas, asistencias y rebotes.
        System.out.println("F - Agrupar los jugadores por la posición del campo.");




        // G. Lo mismo que el punto anterior pero devolviendo la media, el máximo y el mínimo de
        // canastas, asistencias y rebotes.
        System.out.println("G - Lo mismo que el punto anterior pero devolviendo la media, el máximo y el mínimo de canastas, asistencias y rebotes.");
    }
}