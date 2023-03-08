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
import modelo.Alumno;
import modelo.Genero;
import modelo.Persona;
import modelo.Profesor;
/**
 *
 * @author Laboratorio
 */
public class GeneroDAO {
    private static ArrayList<Genero> generos = new ArrayList();
    private static Connection conn = null;
    private static Statement st;
    private static ResultSet rs;

    public static int agregar(Genero genero) {
        /* valores de ret
           1 ok, agregado

         */
        System.out.println("hola estoy en agregar genero");
        int ret = 0; //ret es una variable de retorno de datos
        try {
            conn = new Conector().getConexion("instituto2022");
            String sql = "INSERT INTO genero (id, genero)"
                    + "VALUES (?, ?)";//rut, nombre, edad, genero

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, genero.getId());
            statement.setString(2, genero.getGenero());

           
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

    public static boolean modificar(Genero genero) {
        boolean estado = false; //no modificado, no existe

        try {
            conn = new Conector().getConexion("instituto2022");
            String sql = "UPDATE genero SET genero=? WHERE id=?";

            PreparedStatement statement = conn.prepareStatement(sql);

            
            statement.setString(1, genero.getGenero());
            statement.setInt(2, genero.getId());

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

    public static ArrayList<Genero> obtenerDatos() {
        try {
            generos.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "SELECT * FROM genero";

            st = conn.createStatement();
            rs = st.executeQuery(sql);// es el que conecta con la base de datos
            //rs : lista

            int count = 0;

            while (rs.next()) {
                int id = rs.getInt(1);
                String genero = rs.getString(2);

                generos.add(new Genero(id, genero));
                //(String rut, String nombre, int edad, String genero, String email, String genero) 
            }

        } catch (Exception e) {
            System.out.println("Error en ObtenerDatos  " + e.getMessage());
        }

        return generos;
    }

    public static boolean eliminar(String pk) {
        boolean estado = false; //NO encontrado, no eliminado

        try {
            generos.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "DELETE FROM genero where id='" + pk + "'";

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

    public static Genero buscar(String pk) {
        Genero genero = null;
        try {
            generos.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "SELECT * FROM genero where id='" + pk + "'";

            st = conn.createStatement();
            rs = st.executeQuery(sql);

            int count = 0;

            while (rs.next()) {
                int id = rs.getInt(1);
                String generox = rs.getString(2);
               
                genero = new Genero (id, generox);
                break;
                //(String rut, String nombre, int edad, String genero, String email, String genero) 

            }
        } catch (Exception e) {
            System.out.println("Error en ObtenerDatos  " + e.getMessage());
        }

        return genero;
    }
    
}
