
package controlador;

import conexion.ConexionOracle;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.TipoInspe;


public class InspeccionDao {
    
    PreparedStatement comando;
    
    //Array para listar las inspecciones
    List<TipoInspe> lista_tipoinspeccion = new ArrayList<>();
    
    public List<TipoInspe> obtener_tipoinspeccion(){
    
        try {
            Connection cone = new ConexionOracle().getConexion();
            
            String sql = "SELECT idtiposervicio, nombretiposervicio FROM tipo_servicio";
            
            comando = cone.prepareStatement(sql);
            ResultSet rs = comando.executeQuery();
            
            //LISTAR
            while(rs.next()) {
                
                //recorre la posicion segun la consulta
                TipoInspe i = new TipoInspe();
                i.setIdtiposervicio(rs.getInt(1));//id
                i.setNombretiposervicio(rs.getString(2));//nombre_inspeccion
                
                lista_tipoinspeccion.add(i);
               
            }
            
        } catch (Exception e) {
        }
        return lista_tipoinspeccion;
    }
}
