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
public class Contrato {
    private String rut;
    private String nombre;
    private String notas;
    private String nombreApoderado;
    private int edad;

    public Contrato(String rut, String nombre, String notas, String nombreApoderado, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.notas = notas;
        this.nombreApoderado = nombreApoderado;
        this.edad = edad;
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

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getNombreApoderado() {
        return nombreApoderado;
    }

    public void setNombreApoderado(String nombreApoderado) {
        this.nombreApoderado = nombreApoderado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return rut + ", " + nombre + ", " + notas + ", " + nombreApoderado + ", " + edad;
    }

    
    
    
    
}
