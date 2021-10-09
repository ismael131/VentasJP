/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ISMAEL HUAYTALLA
 */
public class clsConexion {
    //avriable de conexion
    
    Connection cn;
    public String driver="com.mysql.jdbc.Driver";
    public String url="jdbc:mysql://localhost:3306/ventasjp";
    public String usuario="root";
    public String clave="";
    
    public Connection MyConectar(){
        try {
            Class.forName(driver);
            cn=DriverManager.getConnection(url,usuario,clave);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en: "+ e);
        }
        return cn;
    }
    
    
}
