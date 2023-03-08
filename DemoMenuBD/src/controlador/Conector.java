/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.*; //<- importante... reconoce las sentencias que trabajan con la base de datos.


/**
 *
 * @author profe
 */
public class Conector {
    private Connection con = null; //crea objeto conexion nulo
   
    public  Connection getConexion(String baseDeDatos) throws Exception{
        try {
              String user = "root"; // el root de mysql

              String pass = ""; //passwd del mysql, sin password

              String url = "jdbc:mysql://localhost:3306/"+baseDeDatos;

              Class.forName("com.mysql.jdbc.Driver").newInstance();//declaraciÃ³n del driver para conectarse

              con = DriverManager.getConnection(url,user,pass); //este conecta
            }
            catch (SQLException sqle){
                       System.out.println("Error SQL.....conexion" +sqle);
            }

        if ( con != null )
            System.out.println("Se ha establecido una conexiÃ³n a la base de datos ");

     return con;
    }

    public void cerrarConexion()
    {
        try
            {
                if(con != null)
                {
                    con.close();
                }
               
            }
            catch(SQLException e)
            {
                System.out.println("Problemas con la conexiÃ³n");
            }
        }


}
