package com.moya.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    public Long id;

    @Column
    public String nombre;

    @Column
    public String localidad;

    @Column
    public Date fechaCreacion;

    // un equipo tendrá muchos jugadores
    // esta es la debil (la fuerte está en Jugador.java)
    @JsonIgnore
    @OneToMany(mappedBy = "equipo")
    private Set<Jugador> jugador = new HashSet<>();


    public Equipo() {}


    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    //public Set<Jugador> getJugador() {return jugador;}
    //public void setJugador(Set<Jugador> jugador) {this.jugador = jugador;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getLocalidad() {return localidad;}
    public void setLocalidad(String localidad) {this.localidad = localidad;}

    public Date getFechaCreacion() {return fechaCreacion;}
    public void setFechaCreacion(Date fechaCreacion) {this.fechaCreacion = fechaCreacion;}


    @Override
    public String toString() {
        return "Equipo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localidad=" + localidad +
                ", fecha_creacion=" + fechaCreacion +
                '}';
    }
}