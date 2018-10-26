/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Anuncios.datosvista;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Luigi
 */
public class consultas {
    public static String getmunicipio(String id){
        String municipio="";
        try{
            System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyy"+id);
            Connection con = conexion.getConnection();
            String q;
            q="select idMunicipio from municipio where Municipio='"+id+"'";
            PreparedStatement set = con.prepareStatement(q);
            ResultSet rs = set.executeQuery();
            System.out.println(q);
            rs.next();
            municipio = ""+rs.getInt(1);
            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("vvvvvvvvvvvvvvvvvvvvvvv"+municipio);
        return municipio;
    }
    
    public static int login(String correo,String contra){
        int id=0;
        
        try{
            System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyy"+id);
            Connection con = conexion.getConnection();
            String q;
            q="select idusuario from usuario where Correo='"+correo+"' and Contraseña='"+contra+"'";
            PreparedStatement set = con.prepareStatement(q);
            ResultSet rs = set.executeQuery();
            System.out.println(q);
            rs.next();
            id = rs.getInt(1);
            con.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return id;
    }
    
    public static String[][] listmunicipio(){
        String list[][] = new String[1][2];
        try{
            Connection con = conexion.getConnection();
            String q;
            q="select * from municipio";
            PreparedStatement set = con.prepareStatement(q);
            ResultSet rs = set.executeQuery();
            System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrr");
            int ss=0;
            while(rs.next()){
                System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrr"+rs.getString(1));
                
                list[ss][0] = rs.getString(1);
                list[ss][1] = rs.getString(3);
                //el primero es el id segundo nombre
                ss++;
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        return list;
    }
    
    public static String[] listmetodo(){
        String list[] = new String[2];
        try{
            Connection con = conexion.getConnection();
            String q;
            q="select metodo from metodosenvio order by idmetodosenvio";
            PreparedStatement set = con.prepareStatement(q);
            ResultSet rs = set.executeQuery();
            System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrr");
            int ss=0;
            while(rs.next()){
                System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrr"+rs.getString(1));
                
                list[ss] = rs.getString(1);
                ss++;
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
        return list;
    }
    
    public static String[] listtipo(){
        String list[] = new String[4];
        try{
            Connection con = conexion.getConnection();
            String q;
            q="select nombre from tipoarticulo order by idtipoarticulo";
            PreparedStatement set = con.prepareStatement(q);
            ResultSet rs = set.executeQuery();
            System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrr");
            int ss=0;
            while(rs.next()){
                System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrr"+rs.getString(1));
                
                list[ss] = rs.getString(1);
                ss++;
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        return list;
    }
    
    public static ArrayList<datosvista> lista(String q){
        ArrayList<datosvista> list = new ArrayList();
        
        
        try{
            Connection con = conexion.getConnection();
            System.out.println("hhhhhhhhhhhhhhh");
            PreparedStatement ps = con.prepareStatement(q);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                datosvista baab = new datosvista(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
                list.add(baab);
            }
            
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getTitulo()+"       "+list.get(i).getFecha()+"          "+list.get(i).getTipo());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("dddddddddddddddddddddddddddddddddddd");
        }
        
        return list;
    }
    
}
