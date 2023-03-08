/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection; // java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Alumno;


/**
 *
 * @author profe //IMPORTANTE
 * https://www.codejava.net/java-se/jdbc/jdbc-tutorial-sql-insert-select-update-and-delete-examples
 */
public class AlumnoDAO implements IalumnoDAO {

    private ArrayList<Alumno> alumnos = new ArrayList();
    private Connection conn = null;
    private Statement st;
    private ResultSet rs;
    
    @Override
    public int agregar(Alumno alumno) {
        /* valores de ret
           1 ok, agregado
         */
        int ret = 0; //ret es una variable de retorno de datos
        try {
            conn = new Conector().getConexion("instituto2022");
            String sql = "INSERT INTO alumno (rut, nombre, edad, genero, email, carrera)"
                    + "VALUES (?, ?, ?, ?, ?, ?)";//rut, nombre, edad, carrera

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, alumno.getRut());
            statement.setString(2, alumno.getNombre());
            statement.setInt   (3, alumno.getEdad());
            statement.setString(4, alumno.getGenero());
            statement.setString(5, alumno.getEmail());
            statement.setString(6, alumno.getCarrera());

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
    
    @Override
    public boolean modificar(Alumno alumno) {
        boolean estado = false; //no modificado, no existe

        try {
            conn = new Conector().getConexion("instituto2022");
            String sql = "UPDATE alumno SET nombre=?, edad=?, genero=?, email=?, carrera=? WHERE rut=?";

            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, alumno.getNombre());
            statement.setInt   (2, alumno.getEdad());
            statement.setString(3, alumno.getGenero());
            statement.setString(4, alumno.getEmail());
            statement.setString(5, alumno.getCarrera());
            statement.setString(6, alumno.getRut());

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
    
    @Override
    
    public ArrayList<Alumno> obtenerDatos() {
        try {
            alumnos.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "SELECT * FROM alumno";

            st = conn.createStatement();
            rs = st.executeQuery(sql);// es el que conecta con la base de datos
            //rs : lista

            int count = 0;

            while (rs.next()) {
                String rut = rs.getString(1);
                String nombre = rs.getString(2);
                int edad = rs.getInt(3);
                String genero = rs.getString(4);
                String email = rs.getString(5);
                String carrera = rs.getString(6);

                alumnos.add(new Alumno(rut, nombre, edad, genero, email, carrera));
                //(String rut, String nombre, int edad, String genero, String email, String carrera) 
            }

        } catch (Exception e) {
            System.out.println("Error en ObtenerDatos  " + e.getMessage());
        }

        return alumnos;
    }
    
    @Override
    public boolean Eliminar(String pk) {
        boolean estado = false; //NO encontrado, no eliminado

        try {
            alumnos.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "DELETE FROM alumno where rut='" + pk + "'";

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
    
    @Override
    public Alumno Buscar(String pk) {
        Alumno alumno = null;
        try {
            alumnos.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "SELECT * FROM alumno where rut='" + pk + "'";

            st = conn.createStatement();
            rs = st.executeQuery(sql);

            int count = 0;

            while (rs.next()) {
                String rut = rs.getString(1);
                String nombre = rs.getString(2);
                int edad = rs.getInt(3);
                String genero = rs.getString(4);
                String email = rs.getString(5);
                String carrera = rs.getString(6);

                alumno = new Alumno(rut, nombre, edad, genero, email, carrera);
                break;
                //(String rut, String nombre, int edad, String genero, String email, String carrera) 

            }
        } catch (Exception e) {
            System.out.println("Error en ObtenerDatos  " + e.getMessage());
        }

        return alumno;
    }

    public ArrayList<Alumno> obtenerDatosFiltro(int inicial, int finnal) {//final es reservada
        try {
            alumnos.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "SELECT * FROM alumno where edad >=" + inicial + " and edad <= " + finnal;

            st = conn.createStatement();
            rs = st.executeQuery(sql);// es el que conecta con la base de datos
            //rs : lista

            int count = 0;

            while (rs.next()) {
                String rut = rs.getString(1);
                String nombre = rs.getString(2);
                int edad = rs.getInt(3);
                String genero = rs.getString(4);
                String email = rs.getString(5);
                String carrera = rs.getString(6);

                alumnos.add(new Alumno(rut, nombre, edad, genero, email, carrera));
                break;
                //String rut, String nombre, int edad, String genero, String email, String carrera
            }
        } catch (Exception e) {
            System.out.println("Error en ObtenerDatos  " + e.getMessage());
        }

        return alumnos;
    }
}
