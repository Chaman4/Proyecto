/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.*;

/**
 *
 * @author Luigi
 */
public class altas {
    
    public static boolean registro(String datos[]){
        boolean ddd=true;
        try{
            Connection con = conexion.getConnection();
            String q,id;
            id=consultas.getmunicipio(datos[0]);
            /*
            1.- Nombre      2.- Contraseña
            3.- Correo      4.- CURP
            5.- Foto        6.- Username
            7.- CP          8.- Direccion
            */
            //INSERT INTO `padish`.`usuario` (`idMunicipio`, `Nombre`, `Contraseña`, `Correo`, `CURP`, `Foto`, `Username`, `CP`, `Direccion`) 
            //VALUES ('1', 'qwe', 'asd', 'asd', 'asd', 'asd', 'asd', '23', 'asd');
            q="insert into usuario (idMunicipio,Nombre,Contraseña,Correo,CURP,Foto,Username,CP,Direccion) "
                    + "values('"+id+"','"+datos[1]+"','"+datos[2]+"','"+datos[3]+"','"+datos[4]+"',"
                    + "'"+datos[5]+"','"+datos[6]+"','"+datos[7]+"','"+datos[8]+"')";
            System.out.println(q);
            PreparedStatement set = con.prepareStatement(q);
            set.executeUpdate(q);
        }catch(Exception e){
            System.out.println(e.getMessage());
            ddd=false;
        }
        return ddd;
    }
    
    public static void registraranuncio(String datos[],String medida){
        try{
            Connection con = conexion.getConnection();
            String q;
            q="insert into anuncios (idusuario,idtipo,idmetodoenvio,iddisponibilidad,descripcion,foto,fecharegistro,titulo,dimensiones) "
                    + "values('"+datos[0]+"','"+datos[1]+"','"+datos[2]+"','1','"+datos[3]+"','"+datos[4]+"','"+datos[5]+"',"
                    + "'"+datos[6]+"','"+datos[7]+"*"+datos[8]+" "+medida+"')";
            System.out.println(q);
            PreparedStatement set = con.prepareStatement(q);
            set.executeUpdate(q);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
    public static void meterfoto(String url){
    
    }
}
