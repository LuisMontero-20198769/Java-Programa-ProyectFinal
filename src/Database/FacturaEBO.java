
package Database;

import ConexionBD.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;


public class FacturaEBO {
     private String mensaje = "";
    private FacturaDAO dao = new FacturaDAO();
    //------ADD DATOS
    public String addDatos(FacturaGet  hi)
    {
        Connection con = Conexion.getConnection();
        try {
            mensaje = dao.addDatosFactura(con, hi);
      
        } catch (Exception e) 
        {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if (con != null) {
                    con.close();
                } 
            } catch (Exception e) 
            {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
     return mensaje;
    }
     public void listado(JTable Tabla){
        Connection con = Conexion.getConnection();
        dao.listado(con, Tabla);
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
   }
}
