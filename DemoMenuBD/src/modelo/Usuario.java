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
public class Usuario {
    private String rut;
    private String nombre;
    private String tipoUsuario;
    private String userName;
    private String password;

    public Usuario(String rut, String nombre, String tipoUsuario, String userName, String password) {
        this.rut = rut;
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
        this.userName = userName;
        this.password = password;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return rut + ", " + nombre + ", " + tipoUsuario + ", " + userName + ", " + password;
    }
    
    

    
 
    
    
    

    
}
