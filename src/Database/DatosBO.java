
package Database;

import Componentes.Empleados;
import ConexionBD.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;


public class DatosBO {
    private String mensaje = "";
    private Insert_DatosDAO dao = new Insert_DatosDAO();
    //------ADD DATOS
    public String addDatos(Datos_RegistroGET  hi)
    {
        Connection con = Conexion.getConnection();
        try {
            mensaje = dao.addDatosRegistro(con, hi);
      
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
    
     public void listadoEmpleados(JTable Tabla){
        Connection con = Conexion.getConnection();
        dao.listadoDatos(con, Tabla);
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
   }

   
}
