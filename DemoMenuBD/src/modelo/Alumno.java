/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Alumno extends Persona{
    private String carrera;

    public Alumno(String rut, String nombre, int edad, String genero, String email, String carrera) {
        super(rut, nombre, edad, genero, email);
        this.carrera = carrera;
    }
    
    public void setCarrera(String carrera){
       this.carrera=carrera;
    }
    
    public String getCarrera(){
       return carrera;
    }
    
    @Override
    public String toString(){
        //return getRut()+", "+getNombre()+", "+getEdad()+", "+carrera;
        return super.toString()+", "+carrera;
    }
    
}
