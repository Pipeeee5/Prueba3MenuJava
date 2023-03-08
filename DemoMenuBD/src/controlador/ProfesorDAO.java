/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Profesor;

/**
 *
 * @author Laboratorio
 */
public class ProfesorDAO {
        private static ArrayList<Profesor> profesors = new ArrayList();
    private static Connection conn = null;
    private static Statement st;
    private static ResultSet rs;

    public static int agregar(Profesor profesor) {
        /* valores de ret
           1 ok, agregado

         */
        System.out.println("hola estoy en agregar profesor");
        int ret = 0; //ret es una variable de retorno de datos
        try {
            conn = new Conector().getConexion("instituto2022");
            String sql = "INSERT INTO profesor (rut, nombre, edad, genero, email, trabajo)"
                    + "VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, profesor.getRut());
            statement.setString(2, profesor.getNombre());
            statement.setInt   (3, profesor.getEdad());
            statement.setString(4, profesor.getGenero());
            statement.setString(5, profesor.getEmail());
            statement.setString(6, profesor.getLugarTrabajo());
            
            

            int filasInsertadas = statement.executeUpdate();//ejecuta el sql
            if (filasInsertadas  > 0) {
                System.out.println("Un nuevo registro agregado!");
                ret = 1;// agregado
            }
        } catch (Exception ev) {
              System.out.println("hola estoy en agregar profesor");
            System.out.println("Error en Agregar " + ev.getMessage());
        }
        return ret;
    }

    public static boolean modificar(Profesor profesor) {
        boolean estado = false; //no modificado, no existe
       
        try {
            conn = new Conector().getConexion("instituto2022");
            String sql = "UPDATE profesor  SET nombre=?, edad=?, lugarTrabajo=?, genero=?, email=? WHERE rut=?";
                   

            PreparedStatement statement = conn.prepareStatement(sql);
           
            statement.setString(1, profesor.getNombre());
            statement.setInt   (2, profesor.getEdad());
            statement.setString(3, profesor.getLugarTrabajo());
            statement.setString(4, profesor.getGenero());
            statement.setString(5, profesor.getEmail());
            statement.setString(6, profesor.getRut());

            int filasActualizadas = statement.executeUpdate();
            System.out.println("modificar fila modificadas= "+filasActualizadas);
            if (filasActualizadas > 0) {
                System.out.println("A new user was inserted successfully!");
                estado=true; //actualizado
            }
        } catch (Exception ev) {
            System.out.println("Error en modificar " + ev.getMessage());
        }

        return estado;
    }

    public static ArrayList<Profesor> obtenerDatos() {
        try {
            profesors.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "SELECT * FROM profesor";

            st = conn.createStatement();
            rs = st.executeQuery(sql);// es el que conecta con la base de datos
                                      //rs : lista

            int count = 0;

            while (rs.next()) {
                String rut     = rs.getString(1);
                String nombre  = rs.getString(2);
                int edad       = rs.getInt(3);
                String genero = rs.getString(4);
                String email = rs.getString(5);
                String lugarTrabajo = rs.getString(6);
                

                profesors.add(new Profesor(rut, nombre, edad, genero, email, lugarTrabajo));
                //String rut, String nombre, int edad, String genero, String email, String lugarTrabajo
            }
        } catch (Exception e) {
            System.out.println("Error en ObtenerDatos  " + e.getMessage());
        }

        return profesors;
    }

    public static boolean eliminar(String pk) {
        boolean estado = false; //NO encontrado, no eliminado

        try {
            profesors.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "DELETE FROM profesor where rut='" + pk + "'";

            st = conn.createStatement();
            int filasBorradas = st.executeUpdate(sql);

            if (filasBorradas > 0) {
                estado = true; //eliminado
            }
        } catch (Exception e) {
            System.out.println("Error en ObtenerDatos  " + e.getMessage());
        }

        return estado;
    }

    public static Profesor buscar(String pk) {
        Profesor profesor = null;
        try {
            profesors.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "SELECT * FROM profesor where rut='" + pk + "'";

            st = conn.createStatement();
            rs = st.executeQuery(sql);

            int count = 0;

            while (rs.next()) {
                String rut = rs.getString(1);
                String nombre = rs.getString(2);
                int edad = rs.getInt(3);
                String genero = rs.getString(4);
                String email = rs.getString(5);
                String lugarTrabajo = rs.getString(6);

                profesor = new Profesor(rut, nombre, edad, genero, email, lugarTrabajo);
                //String rut, String nombre, int edad, String genero, String email, String lugarTrabajo
                break;
            }
        } catch (Exception e) {
            System.out.println("Error en ObtenerDatos  " + e.getMessage());
        }

        return profesor;
    }

}
