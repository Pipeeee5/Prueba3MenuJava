/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Laboratorio
 */
public abstract class Persona {
    private String rut;
    private String nombre;
    private int edad;
    private String genero;
    private String email;

    public Persona(String rut, String nombre, int edad, String genero, String email) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.email = email;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
  
    
    @Override
    public String toString() {
        return rut + ", " + nombre + ", " + edad + ", " + genero + ", " +email;
    }
    
    
    
}
