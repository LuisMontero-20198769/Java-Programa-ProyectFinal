
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static Connection con = null;
    private static String user = "JAVA APP";
    private static String clave = "1234";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    
    public static Connection getConnection()
    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url, user, clave);
            con.setAutoCommit(false);
            if(con != null)
            {
                System.out.println("¡Conexión Exitosa!");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"¡Conexión Fallida!");
            }
        } catch (ClassNotFoundException | SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "¡Conexión Erronea!"+e.getMessage());
        }
       return con;
    }
    
    public void desconexion(){
        try {
            con.close();
            JOptionPane.showMessageDialog(null,"¡Database desconectada ._.! ");
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"¡Error al desconectar ._.! "+e.getMessage());
        }
    }
    
}
