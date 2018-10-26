/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Luigi
 */
public class conexion {
    public static Connection getConnection(){
        String url,UserName,password;
        url = "jdbc:mysql://localhost/padish";
        UserName ="root";
        password = "n0m3l0";
        
        Connection con = null;
        System.out.println("we");
        try{
            System.out.println("htf");
            Class.forName("org.gjt.mm.mysql.Driver");
            System.out.println("asd");
            con = DriverManager.getConnection(url,UserName,password);
            System.out.println("Si se conecto a BD");
        }catch(Exception e){
            System.out.println("Solo jugo contigo again 7-7");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        return con;
    }
   
    
    
}
