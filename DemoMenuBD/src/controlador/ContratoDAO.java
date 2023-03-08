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
import modelo.Contrato;

/**
 *
 * @author Laboratorio
 */
public class ContratoDAO implements IcontratoDAO {
    private ArrayList<Contrato> Contratos = new ArrayList();
    private Connection conn = null;
    private Statement st;
    private ResultSet rs;
    
    @Override
    public int agregar(Contrato contrato) {
        /* valores de ret
           1 ok, agregado

         */
        System.out.println("hola estoy en agregar contrato");
        int ret = 0; //ret es una variable de retorno de datos
        try {
            conn = new Conector().getConexion("instituto2022");
            String sql = "INSERT INTO contrato (rut, nombre, notas, nombreApoderado, edad)"
                    + "VALUES (?, ?, ?, ?, ?)";//rut, nombre, edad, carrera

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, contrato.getRut());
            statement.setString(2, contrato.getNombre());
            statement.setString(3, contrato.getNotas());
            statement.setString(4, contrato.getNombreApoderado());
            statement.setInt   (5, contrato.getEdad());

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
    public boolean modificar(Contrato contrato) {
        boolean estado = false; //no modificado, no existe
        try {
            conn = new Conector().getConexion("instituto2022");
            String sql = "UPDATE contrato SET nombre=?, notas=?, nombreApoderado=?, edad=? WHERE rut=?";

            PreparedStatement statement = conn.prepareStatement(sql);


            statement.setString(1, contrato.getNombre());
            statement.setString(2, contrato.getNotas());
            statement.setString(3, contrato.getNombreApoderado());
            statement.setInt   (4, contrato.getEdad());
            statement.setString(5, contrato.getRut());

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
    public ArrayList<Contrato> obtenerDatos() {
        try {
            Contratos.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "SELECT * FROM contrato";

            st = conn.createStatement();
            rs = st.executeQuery(sql);// es el que conecta con la base de datos
            //rs : lista

            int count = 0;

            while (rs.next()) {
                String rut = rs.getString(1);
                String nombre = rs.getString(2);
                String notas = rs.getString(3);
                String nombreApoderado = rs.getString(4);
                int edad = rs.getInt(5);

                Contratos.add(new Contrato(rut, nombre, notas, nombreApoderado, edad));
                //(String rut, String nombre, int edad, String genero, String email, String carrera) 
            }

        } catch (Exception e) {
            System.out.println("Error en ObtenerDatos  " + e.getMessage());
        }

        return Contratos;
    }
    
    @Override
    public boolean Eliminar(String pk) {
        boolean estado = false; //NO encontrado, no eliminado

        try {
            Contratos.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "DELETE FROM contrato where rut='" + pk + "'";

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
    public Contrato Buscar(String pk) {
        Contrato contrato = null;
        try {
            Contratos.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "SELECT * FROM contrato where rut='" + pk + "'";

            st = conn.createStatement();
            rs = st.executeQuery(sql);

            int count = 0;

            while (rs.next()) {
                String rut = rs.getString(1);
                String nombre = rs.getString(2);
                String notas = rs.getString(3);
                String nombreApoderado = rs.getString(4);
                int edad = rs.getInt(5);

                contrato = new Contrato(rut, nombre, notas, nombreApoderado, edad);
                break;
                //(String rut, String nombre, int edad, String genero, String email, String carrera) 

            }
        } catch (Exception e) {
            System.out.println("Error en ObtenerDatos  " + e.getMessage());
        }

        return contrato;
    }

    public ArrayList<Contrato> obtenerDatosFiltro(int inicial, int finnal) {//final es reservada
        try {
            Contratos.clear();
            conn = new Conector().getConexion("instituto2022");
            String sql = "SELECT * FROM contrato where edad >=" + inicial + " and edad <= " + finnal;

            st = conn.createStatement();
            rs = st.executeQuery(sql);// es el que conecta con la base de datos
            //rs : lista

            int count = 0;

            while (rs.next()) {
                String rut = rs.getString(1);
                String nombre = rs.getString(2);
                String notas = rs.getString(3);
                String nombreApoderado = rs.getString(4);
                int edad = rs.getInt(5);
                Contratos.add(new Contrato(rut, nombre, notas, nombreApoderado, edad));
                break;
                //String rut, String nombre, int edad, String genero, String email, String carrera
            }
        } catch (Exception e) {
            System.out.println("Error en ObtenerDatos  " + e.getMessage());
        }

        return Contratos;
    }
    
}
