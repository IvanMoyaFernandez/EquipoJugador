package com.moya.Controller;

import com.moya.Entity.Jugador;
import com.moya.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

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
    // GET TODOS JUGADORES ORDERBY CANASTAS
    @GetMapping("/jugadoresOrderByCanastas")
    public List<Object[]> findAllOrderByCanastas() {
        return jugadorRepository.findAllOrderByCanastas();
    }

    // GET JUGADORES QUE HAN HECHO ESE NUMERO DE CANASTAS O MAS
    @GetMapping("/canastasGreaterThanEqual/{numCanastas}")
    public List<Jugador> findByCanastasGreaterThanEqual(@PathVariable Integer numCanastas) {
        return jugadorRepository.findByCanastasGreaterThanEqual(numCanastas);
    }

    // GET JUGADORES QUE HAN HECHO ENTRE ESE RANGO DE CANASTAS
    @GetMapping("/canastasBetween/{minCanastas}/{maxCanastas}")
    public List<Jugador> findByCanastasBetween(@PathVariable Integer minCanastas, @PathVariable Integer maxCanastas) {
        return jugadorRepository.findByCanastasBetween(minCanastas, maxCanastas);
    }

    // GET  TODOS JUGADORES AGRUPADOS POR POSICION
    /* @GetMapping("/groupByPosition")
    public Map<Position, Statistic> groupByPosition(){
        List<Object[]> players = jugadorRepository.groupByPosition();

        Map<Position, Statistic> posis = new HashMap<>();

        for (Object[] p: players) {
            Statistic aux = new Statistic((Position) p[0], (double) p[1], (int) p[2], (int) p[3]);
            posis.put(aux.getPosition(), aux);
        }
        return posis;
    } */

}