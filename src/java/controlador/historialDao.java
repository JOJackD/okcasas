
package controlador;

import conexion.ConexionOracle;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Historial;


public class historialDao {
    
    PreparedStatement comando;
    
    //Array para listar las inspecciones
    List<Historial> lista_historial = new ArrayList<>();
    
    public List<Historial> obtener_historial(){
    
    try {
            Connection cone = new ConexionOracle().getConexion();
            
            String sql = "SELECT idreservainspeccion,calle,nrovivienda " 
                    + "FROM reserva_inspeccion "; 
                   
                    //+ "inner join tipo_estado te "
                    //+ "on ri.tipo_estado_idtipoestado = te.idtipoestado" ;
            
            
                    
            
            comando = cone.prepareStatement(sql);
            ResultSet rs = comando.executeQuery();
            
            //LISTAR
            while(rs.next()) {
                
                //recorre la posicion segun la consulta
                Historial i = new Historial();
                i.setIdreservainspeccion(rs.getInt(1));
                i.setCalle(rs.getString(2));
                i.setNro_vivienda(rs.getInt(3));
                lista_historial.add(i);
               
            }
            
        } catch (Exception e) {
             System.out.println("Ha ocurrido un error al mostrar las parejas: " + e.getMessage());
        }
        return lista_historial;
    
}
}
