
package Database;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Insert_DatosDAO {
    private String mensaje = "";
    //Este será el metodo que agregue datos a la database
    public String addDatosRegistro(Connection con, Datos_RegistroGET datos)
    {
        PreparedStatement ps = null;
        String sql = "INSERT INTO usuarios(id_user,nombre_user,apellido_user,correo_user,clave_user,cargo,salario) "
                + "VALUES(SECUENCIA_ID.NEXTVAL,?,?,?,?,?,?)";
        try 
        {
            ps = con.prepareStatement(sql);
           
            ps.setString(1, datos.getNombre_user());
            ps.setString(2, datos.getApellido_user());
            ps.setString(3, datos.getCorreo_user());
            ps.setString(4, datos.getClave_user());
            ps.setString(5, datos.getCargo_user());
            ps.setString(6, datos.getSalario_user());
           
            mensaje = "¡Guardado Correctamente!";
            ps.execute();
            ps.close();
            
        } catch (SQLException e) 
        {
           mensaje = "¡No se guardó Correctamente! \n"+e.getMessage();
        }
     return mensaje;
    }
    
     public void listadoDatos(Connection con, JTable Tabla){
        DefaultTableModel modelo;
        String [] col = {"ID","NOMBRE","APELLIDO","E-MAIL","CARGO","SALARIO"}; 
        modelo = new  DefaultTableModel(null, col);
        
        String sql = "SELECT id_user, nombre_user, apellido_user,"
                + "correo_user, cargo, salario FROM usuarios ORDER BY id_user";
        String [] filas = new String[6];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) 
            {                
                for (int i = 0; i < 6; i++) 
                {
                    filas[i] = rs.getString(i+1);
                }
                modelo.addRow(filas);
            }
            Tabla.setModel(modelo);
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "NO SE PUDO MOSTRAR LA TABLA");
        }
    }
}
