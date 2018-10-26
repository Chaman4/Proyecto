/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

/**
 *
 * @author Alumno
 */
public class geneq {
    public static String busqueda(int id,Boolean dis, boolean nodis, boolean enpro, int tipo,String tit){
        String q="Select usuario.Username,fecharegistro,anuncios.descripcion,titulo,tipoarticulo.nombre,disponibilidad.descripcion"
                + ",metodosenvio.metodo from anuncios "
                + "inner join usuario on anuncios.idusuario=usuario.idusuario"
                + " inner join tipoarticulo on anuncios.idtipo=tipoarticulo.idtipoarticulo"
                + " inner join disponibilidad on anuncios.iddisponibilidad=disponibilidad.iddisponibilidad"
                + " inner join metodosenvio on anuncios.idmetodoenvio=metodosenvio.idmetodosenvio"
                + " where anuncios.idusuario != "+id+ "  ";

//usuario,fecha,descripcion,titulo
        //INNER JOIN table2 ON table1.column_name = table2.column_name;
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        int dd[] = new int[3];
        int gg=0;
        dd[0] = 0;
        dd[1] = 0;
        dd[2] = 0;
        
        if (dis) {
            gg++;
        }
        if (enpro) {
            gg++;
        }
        if (nodis){
            gg++;
        }
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        if(gg>0){
            q += "and (";
            if (dis) {
                q+= "anuncios.iddisponibilidad = 1 ";
                gg--;
                if (gg>0) {
                q+="or ";
            }
            }
            
            if (enpro) {
                q+= "anuncios.iddisponibilidad = 3 ";
                gg--;
                if (gg>0) {
                q+="or ";
            }
            }
            
            if (nodis) {
                q+= "anuncios.iddisponibilidad = 2 ";
                gg--;
            }
            q+= ")";
        }
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        
        if (tipo != 0) {
            q += " and anuncios.idtipo = "+tipo;
        }
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        
        if (!tit.isEmpty()) {
            q += " and anuncios.titulo like '%"+tit+"%'";
        }
        
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        q += " order by fecharegistro desc,titulo";
        System.out.println(q);
        return q;
    }
    
    public static String metoenvio(int id, int met){
        String q="Select usuario.Username,fecharegistro,anuncios.descripcion,titulo,tipoarticulo.nombre,disponibilidad.descripcion"
                + ",metodosenvio.metodo from anuncios "
                + "inner join usuario on anuncios.idusuario=usuario.idusuario"
                + " inner join tipoarticulo on anuncios.idtipo=tipoarticulo.idtipoarticulo"
                + " inner join disponibilidad on anuncios.iddisponibilidad=disponibilidad.iddisponibilidad"
                + " inner join metodosenvio on anuncios.idmetodoenvio=metodosenvio.idmetodosenvio";
        
        q += " where anuncios.idmetodoenvio = "+met+ " and anuncios.idusuario != "+id+ " order by fecharegistro desc,titulo";
        
        return q;
    }
}
