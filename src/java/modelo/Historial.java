
package modelo;

import java.time.LocalDate;


public class Historial {
    
    private int idreservainspeccion;
    private LocalDate fechareservainspeccion;
    private int usuario_rut;
    private int tipo_estado_idtipoestado;
    private int region_idregion;
    private int comuna_idcomuna;
    private int provincia_idprovincia;
    private String calle;
    private int nro_vivienda;

    public Historial() {
    }

    public Historial(int idreservainspeccion, LocalDate fechareservainspeccion, int usuario_rut, int tipo_estado_idtipoestado, int region_idregion, int comuna_idcomuna, int provincia_idprovincia, String calle, int nro_vivienda) {
        
        setIdreservainspeccion(idreservainspeccion);
        setFechareservainspeccion(fechareservainspeccion);
        setUsuario_rut(usuario_rut);
        setTipo_estado_idtipoestado(tipo_estado_idtipoestado);
        setRegion_idregion(region_idregion);
        setComuna_idcomuna(comuna_idcomuna);
        setProvincia_idprovincia(provincia_idprovincia);
        setCalle(calle);
        setNro_vivienda(nro_vivienda);
    }

    public int getIdreservainspeccion() {
        return idreservainspeccion;
    }

    public void setIdreservainspeccion(int idreservainspeccion) {
        this.idreservainspeccion = idreservainspeccion;
    }

    public LocalDate getFechareservainspeccion() {
        return fechareservainspeccion;
    }

    public void setFechareservainspeccion(LocalDate fechareservainspeccion) {
        this.fechareservainspeccion = fechareservainspeccion;
    }

    public int getUsuario_rut() {
        return usuario_rut;
    }

    public void setUsuario_rut(int usuario_rut) {
        this.usuario_rut = usuario_rut;
    }

    public int getTipo_estado_idtipoestado() {
        return tipo_estado_idtipoestado;
    }

    public void setTipo_estado_idtipoestado(int tipo_estado_idtipoestado) {
        this.tipo_estado_idtipoestado = tipo_estado_idtipoestado;
    }

    public int getRegion_idregion() {
        return region_idregion;
    }

    public void setRegion_idregion(int region_idregion) {
        this.region_idregion = region_idregion;
    }

    public int getComuna_idcomuna() {
        return comuna_idcomuna;
    }

    public void setComuna_idcomuna(int comuna_idcomuna) {
        this.comuna_idcomuna = comuna_idcomuna;
    }

    public int getProvincia_idprovincia() {
        return provincia_idprovincia;
    }

    public void setProvincia_idprovincia(int provincia_idprovincia) {
        this.provincia_idprovincia = provincia_idprovincia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNro_vivienda() {
        return nro_vivienda;
    }

    public void setNro_vivienda(int nro_vivienda) {
        this.nro_vivienda = nro_vivienda;
    }

    public void getUsuario_rut(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
