/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Luigi
 */
public class bajas {
    public static void borrarusuario(int id){
        try{
            Connection con = conexion.getConnection();
            anuncioiduser(id);
            chatsiduser(id);
            mensajenull();
            citasnull();
            String q = "Delete from usuario where idUsuario='"+id+"'";
            PreparedStatement ps = con.prepareStatement(q);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void anuncioiduser(int id){
        try{
            Connection con = conexion.getConnection();
            String q = "Delete from anuncios where idUsuario='"+id+"'";
            PreparedStatement ps = con.prepareStatement(q);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void mensajenull(){
        try{
            Connection con = conexion.getConnection();
            String q = "Delete from mensaje where idChat=null";
            PreparedStatement ps = con.prepareStatement(q);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void chatsiduser(int id){
        try{
            Connection con = conexion.getConnection();
            String q = "Delete from chat where idUsuario1='"+id+"' or idUsuario2='"+id+"'";
            PreparedStatement ps = con.prepareStatement(q);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void citasnull(){
        try{
            Connection con = conexion.getConnection();
            String q = "Delete from citas where idChat=null";
            PreparedStatement ps = con.prepareStatement(q);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
