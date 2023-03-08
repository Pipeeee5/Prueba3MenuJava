/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.*;

/**
 *
 * @author Laboratorio
 */
public class Controlador {

    private static ArrayList<Persona> personas = new ArrayList();

    public static int agregar(Persona persona) {
         System.out.println("hola estoy en Controlador agregar persona");
        int ret = 0; //ret es una variable de retorno de datos
        //ret retorna 0 si no pudo agregar un objeto persona
        //ret retorna 1 si agregó un objeto persona                  
        if (persona != null && buscar(persona.getRut()) == null) {
            personas.add(persona);
            ret = 1;
        }
        return ret;
    }

    public static boolean modificar(Persona persona) {
        boolean estado = false; //no modificado, no existe
        int indice = 0;

        for (Persona obj : personas) {
            if (obj.getRut().equals(persona.getRut())) {
                personas.set(indice, persona);
                estado = true; //modificado
                break;
            }
            indice++; //indice=indice+1
        }
        return estado;
    }

    public static ArrayList<Persona> obtenerDatos() {
        return personas;
    }

    public static boolean eliminar(String rut) {
        boolean estado = false; //NO encontrado, no eliminado

        for (Persona persona : personas) {

            if ( persona.getRut().equals(rut)) {
                personas.remove(persona);
                estado = true; //eliminado
                break;
            }

        }
        return estado;
    }

    public static Persona buscar(String rut) {
        Persona persona = null;

        for (Persona obj : personas) {
            if (obj.getRut().equals(rut)) {
                persona = obj;
                break;
            }
        }
        return persona;
    }

//    public static void llenar() {
//        personas.add(new Alumno("1-1",   "Susana", (byte) 22, "Analista"));
//        personas.add(new Alumno("2-2",   "Juan",   (byte) 19, "Contador"));
//        personas.add(new Alumno("3-3",   "Carlos", (byte) 23, "Ing.Informático"));
//        personas.add(new Alumno("4-4",   "Sandra", (byte) 20, "Analista"));
//        personas.add(new Alumno("5-5",   "Andrea", (byte) 21, "Analista"));
//        
//        //
//        personas.add(new Profesor("6-6", "Ignacio", (byte) 41, "Duoc Antonio Varas"));
//        personas.add(new Profesor("7-7", "Julio",   (byte) 25, "Duoc Antonio San Bernando"));
//        personas.add(new Profesor("8-8", "Michael", (byte) 25, "Duoc Sede Alameda"));
//    }



}
