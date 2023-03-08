/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Alumno;

/**
 *
 * 
 *
 */
//implementar DAO A carreraDAO y alumnoDAO
//       //como solucionar y estandarizar esto...
public interface IalumnoDAO{
    public abstract int agregar(Alumno alumno);
    public abstract Alumno Buscar (String pk);
    public abstract boolean Eliminar(String pk);
    public abstract boolean modificar(Alumno nuevoAlumno);
    public abstract ArrayList<Alumno> obtenerDatos();
}
