/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alanm
 */
public class conexion {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost/bazardb";

    public conexion() {
        conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if(conn != null){
                System.out.println("Conexion con base de datos exitosa");
            } 
            
        } catch (ClassNotFoundException | SQLException ax){
            System.out.println("Error al conectar con base de datos " + ax);
        }
    }
    
    //Metodo para retornar conexion
    
    public Connection getConection(){
        return conn;
    }
    
    //Metodo para desconectar base de datos
    
    public void desconectar(){
        conn = null;
        if(conn == null){
            System.out.println("Conexion Terminada...");
        }
    }
}
