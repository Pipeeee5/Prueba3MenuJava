/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Alumno;
import modelo.Usuario;
import modelo.Usuario;
import javax.swing.JOptionPane;
import vista.ListadoCarreras;


/**
 *
 * @author Laboratorio
 */
public class UsuarioDAO {
    

    private static ArrayList<Usuario> usuarios= new ArrayList();
    private static Connection conn = null;
    private static Statement st;
    private static ResultSet rs;
    private static Component rootPane;

    public static int agregar(Usuario usuario) {
        /* valores de ret
           1 ok, agregado

         */
        System.out.println("hola estoy en agregar usuario");
        int ret = 0; //ret es una variable de retorno de datos
        try {
            conn = new Conector().getConexion("instituto2022");
            String sql = "INSERT INTO usuario (rut, nombre, tipoUsuario, userName, password)"
                    + "VALUES (?, ?, ?, ?, ?)";//String rut, String nombre, int tipoUsuario, String userName, String password

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, usuario.getRut());
            statement.setString(2, usuario.getNombre());
            statement.setString(3, usuario.getTipoUsuario());
            statement.setString(4, usuario.getUserName());
            statement.setString(5, usuario.getPassword());

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

    public static boolean modificar(Usuario usuario) {
        boolean estado = false; //no modificado, no existe
        try {
            conn = new Conector().getConexion("instituto2022");
            String sql = "UPDATE usuario SET nombre=?, tipoUsuario=?, userName=?, password=? WHERE rut=?";
                                            //String nombre, int tipoUsuario, String userName, String password, String rut,
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getTipoUsuario());
            statement.setString(3, usuario.getUserName());
            statement.setString(4, usuario.getPassword());
            statement.setString(5, usuario.getRut());
            
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

    public static ArrayList<Usuario> obtenerDatos() {
        try {
            usuarios.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "SELECT * FROM usuario";

            st = conn.createStatement();
            rs = st.executeQuery(sql);// es el que conecta con la base de datos
            //rs : lista

            int count = 0;

            while (rs.next()) { //String rut, String nombre, int tipoUsuario, String userName, String password
                String rut = rs.getString(1);
                String nombre = rs.getString(2);
                String tipoUsuario = rs.getString(3);
                String userName = rs.getString(4);
                String password = rs.getString(5);


                usuarios.add(new Usuario(rut, nombre, tipoUsuario, userName, password));
                
            }

        } catch (Exception e) {
            System.out.println("Error en ObtenerDatos  " + e.getMessage());
        }

        return usuarios;
    }

    public static boolean eliminar(String pk) {
        boolean estado = false; //NO encontrado, no eliminado

        try {
            usuarios.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "DELETE FROM usuario where rut='" + pk + "'";

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

    public static Usuario buscar(String pk) {
        Usuario usuario = null;
        try {
            usuarios.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "SELECT * FROM usuario where rut='" + pk + "'";

            st = conn.createStatement();
            rs = st.executeQuery(sql);

            int count = 0;

            while (rs.next()) {
                String rut = rs.getString(1);
                String nombre = rs.getString(2);
                String tipoUsuario = rs.getString(3);
                String userName = rs.getString(4);
                String password = rs.getString(5);

                //String rut, String nombre, int tipoUsuario, String userName, String password

                usuario = new Usuario(rut, nombre, tipoUsuario, userName, password);
                break;
                //(String rut, String nombre, int edad, String genero, String email, String carrera) 

            }
        } catch (Exception e) {
            System.out.println("Error en ObtenerDatos  " + e.getMessage());
        }

        return usuario;
    }
    
    public static Usuario login(String user, String pass){
        //buscar, pero por 2 campos
        Usuario usuario = null;
        try {
            usuarios.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "SELECT * FROM usuario WHERE username='" + user + "' and password='"+ pass + "'";

            st = conn.createStatement();
            rs = st.executeQuery(sql);

            int count = 0;

            while (rs.next()) {
                String rut = rs.getString(1);
                String nombre = rs.getString(2);
                String tipoUsuario = rs.getString(3);
                String userName = rs.getString(4);
                String password = rs.getString(5);

                //String rut, String nombre, int tipoUsuario, String userName, String password

                usuario = new Usuario(rut, nombre, tipoUsuario, userName, password);
               
                break;
            }
        } catch (Exception e) {
            System.out.println("Error en el usuario o contrasenia ingresada  " + e.getMessage());
        }

        return usuario;
        
    }
    
}
