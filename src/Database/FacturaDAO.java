
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class FacturaDAO {
    private String mensaje = "";
    //Este será el metodo que agregue datos a la database
    public String addDatosFactura(Connection con, FacturaGet datos)
    {
        PreparedStatement ps = null;
        String sql = "INSERT INTO ventas(id_venta, nombre_producto, marca_producto, modelo_producto, "
                + "precio_ud, cantidad_producto, total) "
                + "VALUES(FACTURA_ID.NEXTVAL,?,?,?,?,?,?)";
        try 
        {
            ps = con.prepareStatement(sql);
           
            ps.setString(1, datos.getNombre_producto());
            ps.setString(2, datos.getMarca_producto());
            ps.setString(3, datos.getModelo_producto());
            ps.setString(4, datos.getPrecio_ud());
            ps.setString(5, datos.getCantidad_producto());
            ps.setString(6, datos.getTotal_producto());
             
          
          
            mensaje = "¡Guardado Correctamente!";
            ps.execute();
            ps.close();
            
        } catch (SQLException e) 
        {
           mensaje = "¡No se guardó Correctamente! \n"+e.getMessage();
        }
     return mensaje;
    }
     public void listado(Connection con, JTable Tabla){
        DefaultTableModel modelo;
        String [] col = {"ID","Nombre","Marca","Modelo","Precio x Unidad","Cantidad","Total"}; 
        modelo = new  DefaultTableModel(null, col);
        
        String sql = "SELECT * FROM ventas ORDER BY id_venta";
        String [] filas = new String[7];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) 
            {                
                for (int i = 0; i < 7; i++) 
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
