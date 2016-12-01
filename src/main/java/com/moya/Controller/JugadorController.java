package com.moya.Controller;

import com.google.common.collect.ArrayListMultimap;
//import com.google.common.collect.Collections2;
import com.google.common.collect.ListMultimap;
import com.moya.Entity.Jugador;
import com.moya.Entity.Posicion;
import com.moya.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

// import java.util.Set;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jugadores")
public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;

    // POST
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador createPlayer(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    // PUT
    @PutMapping
    public Jugador updatePlayer(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    // GET TODOS LOS JUGADORES
    @GetMapping
    public List<Jugador> findAll() {
        return jugadorRepository.findAll();
    }

    // GET UN JUGADOR
    @GetMapping("/{id}")
    public Jugador findById(@PathVariable Long id) {
        Jugador jugador = jugadorRepository.findOne(id);
        return jugador;
    }

    // GET JUGADORES QUE HAN HECHO ESE NUMERO DE CANASTAS
    @GetMapping("/canastasLike/{num}")
    public List<Jugador> findByCanastasLike(@PathVariable Integer num) {
        return jugadorRepository.findByCanastasLike(num);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable Long id) {
        jugadorRepository.delete(id);
    }


// EJERCICIOS CONTROLLER
//1 GET TODOS JUGADORES ORDERBY CANASTAS
    @GetMapping("/jugadoresOrderByCanastas")
    public List<Object[]> findAllOrderByCanastas() {
        return jugadorRepository.findAllOrderByCanastas();
    }

//2 GET JUGADORES QUE HAN HECHO ESE NUMERO DE CANASTAS O MAS
    @GetMapping("/canastasGreaterThanEqual/{numCanastas}")
    public List<Jugador> findByCanastasGreaterThanEqual(@PathVariable Integer numCanastas) {
        return jugadorRepository.findByCanastasGreaterThanEqual(numCanastas);
    }

//3 GET JUGADORES QUE HAN HECHO ENTRE ESE RANGO DE CANASTAS
    @GetMapping("/canastasBetween/{minCanastas}/{maxCanastas}")
    public List<Jugador> findByCanastasBetween(@PathVariable Integer minCanastas, @PathVariable Integer maxCanastas) {
        return jugadorRepository.findByCanastasBetween(minCanastas, maxCanastas);
    }

//4 GET  TODOS JUGADORES AGRUPADOS POR POSICION
    @GetMapping("/groupByPosition")
    public Map<String, Collection<Jugador>> getJugadoresGroupByPosicion() {
        //  Creamos el multimap - MultiMapJugadores - que contendrá una key que en nuestro caso
        // será la posición del jugador y tambén contendrá unos valores que en nuestro caso
        // serán todos los datos del jugador.
        ListMultimap<String, Jugador> MultiMapJugadores = ArrayListMultimap.create();
        //  auxiliar es un array de jugadores, guarda el resultado de la query
        //  getJugadoresGroupByPosicion que está en de JugadorRepository
        List<Jugador> auxiliar = jugadorRepository.getJugadoresGroupByPosicion();
        // Por cada veulta del for recorre el array del jugador de esa posición
        // que hay dentro del array -auxiliar-
        for (Jugador jug : auxiliar ) {
            //  Al multimap - MultiMapJugadores - le añadimos como key la posición del jugador
            //  y como valores todos los valores restantes del jugador.
            MultiMapJugadores.put(jug.getPosicion(), jug);
        }
        //  Devolvemos un multimap convertido en map con todos los jugadores agrupados por su key
        return MultiMapJugadores.asMap();
    }

    // PARA HACERLO CON LA CLASE Posicion
   /*@GetMapping("/groupByPosition1")
    public Map<Posicion, Collection<Jugador>> getJugadoresGroupByPosition() {
        ListMultimap<Posicion, Jugador> MultiMapJugadores = ArrayListMultimap.create();
        List<Jugador> auxiliar = jugadorRepository.getJugadoresGroupByPosicion();
        for (Jugador jug : auxiliar ) {
            MultiMapJugadores.put(jug.getPosition(), jug);
        }
        return MultiMapJugadores.asMap();
    }*/
}