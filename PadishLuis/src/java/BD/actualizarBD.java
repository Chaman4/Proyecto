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
public class actualizarBD {
    public static void actusuario(String datos[][], int id){
        try{
            String q="Update usuario Set";
            String saas="";

            for (int i = 0; i < 7; i++) {
                System.out.println("000000000000000000000000"+datos[i][0]);
            }
            
            for (int i = 0; i < 7; i++) {
                System.out.println("yyyyyyyyyyyyy"+i);
                if (!datos[i][0].isEmpty() && datos[i][0].length() > 0 && datos[i][0] != null) {
                    q=q+" "+datos[i][1]+" = '"+datos[i][0]+"', ";
                }
            }
            
            
            System.out.println("yey");
            if (q.charAt(q.length()-2) == ',') {
                for (int i = 0; i < q.length()-2; i++) {
                    saas=saas+""+q.charAt(i);
                }
            }else{
                saas=q;
            }
            saas = saas+" Where idusuario='"+id+"'";
            System.out.println(saas);
            Connection con = conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(saas);
            /*UPDATE table_name SET field1 = new-value1, field2 = new-value2
            [WHERE Clause]*/
            ps.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
