package com.moya.Controller;

import com.moya.Entity.Jugador;
import com.moya.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    // GET
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

    @GetMapping("/byCanastas/{num}")
    public List<Jugador> findByCanastasGreaterThan(@PathVariable Integer num) {
        return jugadorRepository.findByCanastasGreaterThan(num);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable Long id) {
        jugadorRepository.delete(id);
    }
}