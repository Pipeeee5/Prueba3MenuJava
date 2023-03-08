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
public class Profesor extends Persona{
    private String lugarTrabajo;

    public Profesor(String rut, String nombre, int edad, String genero, String email, String lugarTrabajo) {
        super(rut, nombre, edad, genero, email);
        this.lugarTrabajo = lugarTrabajo;
    }
   
    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    @Override
    public String toString() {
        return super.toString()+", "+lugarTrabajo;
    }
    
    
}
