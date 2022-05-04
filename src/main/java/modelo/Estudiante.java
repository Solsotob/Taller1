/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
//Solange Soto Boock
public class Estudiante {
    //Atributos
    String Nombre;
    String Matricula;
    String Carrera;
    String Correo;
    //Constructores

    public Estudiante() {
    }

    public Estudiante(String Nombre, String Matricula, String Carrera, String Correo) {
        this.Nombre = Nombre;
        this.Matricula = Matricula;
        this.Carrera = Carrera;
        this.Correo = Correo;
    }
    
    //Getters y Setters

    public String getNombre() {
        return Nombre;
    }

    public String getMatricula() {
        return Matricula;
    }

    public String getCarrera() {
        return Carrera;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    //toString = mostrar datos
    @Override
    public String toString() {
        return "Estudiante{" + "Nombre=" + Nombre + ", Matricula=" + Matricula + ", Carrera=" + Carrera + ", Correo=" + Correo + '}';
    }
    
    
    
    
}
