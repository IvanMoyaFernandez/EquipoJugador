package com.moya.Entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Date;

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    public Long id;

    @Column
    public String nombre;

    @Column
    public Date nacimiento;

    @Column
    @Min(0)
    public int canastas;

    @Column
    @Min(0)
    public int asistencias;

    @Column
    @Min(0)
    public int rebotes;

    @Column
    public String posicion;

// PARA HACER CON LA CLASE POSICION
    /*@Column
    public Posicion position; */

    // un jugador solo pertenecerá a un equipo
    // esta es la fuerte (la debil está en Equipo.java)
    @ManyToOne
    private Equipo equipo;


    public Jugador() {}

// PARA HACER CON LA CLASE POSICION
    /*public Posicion getPosition() {return position;}
    public void setPosition(Posicion position) {this.position = position;}*/

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public Date getNacimiento() {return nacimiento;}
    public void setNacimiento(Date nacimiento) {this.nacimiento = nacimiento;}

    public int getCanastas() {return canastas;}
    public void setCanastas(int canastas) {this.canastas = canastas;}

    public int getAsistencias() {return asistencias;}
    public void setAsistencias(int asistencias) {this.asistencias = asistencias;}

    public int getRebotes() {return rebotes;}
    public void setRebotes(int rebotes) {this.rebotes = rebotes;}

    public String getPosicion() { return posicion; }
    public void setPosicion(String posicion) { this.posicion = posicion; }

    public Equipo getEquipo() {return equipo;}
    public void setEquipo(Equipo equipo) {this.equipo = equipo;}

    @Override
    public String toString() {

        String nombreEquipo = "";

        if (equipo != null) {nombreEquipo = equipo.getNombre();}

        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nacimiento=" + nacimiento +
                ", canastas=" + canastas +
                ", asistencias=" + asistencias +
                ", rebotes=" + rebotes +
                ", posicion='" + posicion + '\'' +
                ", nombre equipo='" + nombreEquipo + '\'' +
                '}';
    }
}