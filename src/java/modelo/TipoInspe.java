/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jorge
 */
public class TipoInspe {
    
    private int idtiposervicio;
    private String nombretiposervicio;

    public TipoInspe() {
    }

    public TipoInspe(int idtiposervicio, String nombretiposervicio) {
        
        setIdtiposervicio(idtiposervicio);
        setNombretiposervicio(nombretiposervicio);
    }

    public int getIdtiposervicio() {
        return idtiposervicio;
    }

    public void setIdtiposervicio(int idtiposervicio) {
        this.idtiposervicio = idtiposervicio;
    }

    public String getNombretiposervicio() {
        return nombretiposervicio;
    }

    public void setNombretiposervicio(String nombretiposervicio) {
        this.nombretiposervicio = nombretiposervicio;
    }
    
    
    
}
