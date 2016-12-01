package com.moya.Controller;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.moya.Entity.Equipo;
import com.moya.Entity.Jugador;
import com.moya.Repository.EquipoRepository;
import com.moya.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/equipos")
public class EquipoController {

        @Autowired
        private EquipoRepository equipoRepository;

        // POST
        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public Equipo createPlayer(@RequestBody Equipo equipo) {
            return equipoRepository.save(equipo);
        }

        // PUT
        @PutMapping
        public Equipo updatePlayer(@RequestBody Equipo equipor) {
            return equipoRepository.save(equipor);
        }

        // GET TODOS LOS EQUIPOS
        @GetMapping
        public List<Equipo> findAll() {
            return equipoRepository.findAll();
        }

        // GET UN EQUIPO
        @GetMapping("/{id}")
        public Equipo findById(@PathVariable Long id) {
            Equipo equipo = equipoRepository.findOne(id);
            return equipo;
        }

        // DELETE
        @DeleteMapping("/{id}")
        public void deleteEquipo(@PathVariable Long id) {
            equipoRepository.delete(id);
        }


// EJERCICIOS CONTROLLER
//5 GET TODOS EQUIPOS AGRUPADOS POR LOCALIDAD
    @GetMapping("/groupByLocalidad")
    public Map<String, Collection<Equipo>> getEquiposGroupByLocalidad() {
        //  Creamos el multimap - MultiMapJugadores - que contendrá una key que en nuestro caso
        // será la localidad del equipo y tambén contendrá unos valores que en nuestro caso
        // serán todos los datos del equipo.
        ListMultimap<String, Equipo> MultiMapJugadores = ArrayListMultimap.create();
        //  auxiliar es un array de equipos, guarda el resultado de la query
        //  getEquiposGroupByLocalidad que está en de EquipoRepository
        List<Equipo> auxiliar = equipoRepository.getEquiposGroupByLocalidad();
        // Por cada veulta del for recorre el array del equipo de esa posición
        // que hay dentro del array -auxiliar-
        for (Equipo equipo : auxiliar ) {
            //  Al multimap - MultiMapJugadores - le añadimos como key la localidad del equipo
            //  y como valores todos los valores restantes del equipo.
            MultiMapJugadores.put(equipo.getLocalidad(), equipo);
        }
        //  Devolvemos un multimap convertido en map con todos los equipos agrupados por su key
        return MultiMapJugadores.asMap();
    }
}
