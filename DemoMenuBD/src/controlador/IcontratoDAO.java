/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Contrato;

/**
 *
 * @author Laboratorio
 */
public interface IcontratoDAO {
    
    public abstract int agregar(Contrato contrato);
    public abstract Contrato Buscar (String pk);
    public abstract boolean Eliminar(String pk);
    public abstract boolean modificar(Contrato nuevoContrato);
    public abstract ArrayList<Contrato> obtenerDatos();
    
    
}
