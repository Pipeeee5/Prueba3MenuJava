/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection; // java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Carrera;
import modelo.Persona;
import modelo.Profesor;


/**
 *
 * @author Laboratorio
 */                 //implements DAO 
public class CarreraDAO {
    
//    public int agregar (Carrera carrera){
//    return 1;
//        
//    }
    private static ArrayList<Carrera> carreras = new ArrayList();
    private static Connection conn = null;
    private static Statement st;
    private static ResultSet rs;

    public static int agregar(Carrera carrera) {
        /* valores de ret
           1 ok, agregado

        */
        int ret = 0; //ret es una variable de retorno de datos
        try {
            conn = new Conector().getConexion("instituto2022");
            String sql = "INSERT INTO carrera (id, nombreCarrera)"
                    + "VALUES (?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt   (1, carrera.getId());
            statement.setString(2, carrera.getNombreCarrera());

           
            int filasInsertadas = statement.executeUpdate();//ejecuta el sql
            if (filasInsertadas > 0) {
                System.out.println("Un nuevo registro agregado!");
                ret = 1;// agregado
            }
        } catch (Exception ev) {
            System.out.println("Error en Agregar " + ev.getMessage());
        }
        return ret;
    }

    public static boolean modificar(Carrera carrera) {
        boolean estado = false; //no modificado, no existe

        try {
            conn = new Conector().getConexion("instituto2022");
            String sql = "UPDATE carrera SET nombreCarrera=? WHERE id=?  ";

            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, carrera.getNombreCarrera());
            statement.setInt   (2, carrera.getId());
            

            int filasActualizadas = statement.executeUpdate();
            System.out.println("modificar fila modificadas= " + filasActualizadas);
            if (filasActualizadas > 0) {
                System.out.println("A new user was inserted successfully!");
                estado = true; //actualizado
            }
        } catch (Exception ev) {
            System.out.println("Error en modificar " + ev.getMessage());
        }

        return estado;
    }

    public static ArrayList<Carrera> obtenerDatos() {
        try {
            carreras.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "SELECT * FROM carrera";

            st = conn.createStatement();
            rs = st.executeQuery(sql);// es el que conecta con la base de datos
            //rs : lista

            int count = 0;

            while (rs.next()) {
                int id              = rs.getInt(1);
                String nombreCarrera= rs.getString(2);

                carreras.add(new Carrera(id, nombreCarrera));
                //(String rut, String nombre, int edad, String genero, String email, String carrera) 
            }

        } catch (Exception e) {
            System.out.println("Error en ObtenerDatos  " + e.getMessage());
        }

        return carreras;
    }

    public static boolean eliminar(String pk) {
        boolean estado = false; //NO encontrado, no eliminado

        try {
            carreras.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "DELETE FROM carrera where id='" + pk + "'";

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

    public static Carrera buscar(String pk) {
        Carrera carrera = null;
        try {
            carreras.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "SELECT * FROM carrera where id='" + pk + "'";

            st = conn.createStatement();
            rs = st.executeQuery(sql);

            int count = 0;

            while (rs.next()) {
                int id = rs.getInt(1);
                String numeroCarrera = rs.getString(2);
                

                carrera = new Carrera(id, numeroCarrera);
                break;
                //(String rut, String nombre, int edad, String genero, String email, String carrera) 

            }
        } catch (Exception e) {
            System.out.println("Error en ObtenerDatos  " + e.getMessage());
        }

        return carrera;
    }

    
    
    
}
