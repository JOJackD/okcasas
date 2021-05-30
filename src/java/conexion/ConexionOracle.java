/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jorge
 */
public class ConexionOracle {
    
    //atributo de conexion
    private Connection conexion;
    
    //contructor
    public ConexionOracle() {
        
        try {
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String user = "okcasa";
            String pass = "okcasa";
            
            Class.forName("oracle.jdbc.OracleDriver");
            
            conexion = DriverManager.getConnection(url, user, pass);
            System.out.println("Conectado");
            
        } catch (Exception e) {
            System.err.println("No conectado" + e.getMessage());
        }
    }
    
    //Accesadore & Mutadores

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    
    
    
}
