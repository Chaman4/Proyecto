/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anuncios;

/**
 *
 * @author Luigi
 */
public class datosvista {
    private String usuario,fecha,descripcion,titulo,tipo,disponible,metodoenvio;


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public String getMetodoenvio() {
        return metodoenvio;
    }

    public void setMetodoenvio(String metodoenvio) {
        this.metodoenvio = metodoenvio;
    }

    public datosvista(String usuario, String fecha, String descripcion, String titulo, String tipo, String disponible, String metodoenvio) {
        this.usuario = usuario;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.titulo = titulo;
        this.tipo = tipo;
        this.disponible = disponible;
        this.metodoenvio = metodoenvio;
    }

   
    

    
    
}
