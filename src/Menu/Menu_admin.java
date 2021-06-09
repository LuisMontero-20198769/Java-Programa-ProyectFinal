
package Menu;

import Login_Admin.Acceso_System;
import Componentes.Factura_Empresa;
import Componentes.Empleados;
import Componentes.Productos;
import Componentes.Ventas;
import ConexionBD.Conexion;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Menu_admin extends javax.swing.JFrame {

  
    public Menu_admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Technology Solutions Montero & Contreras");
        Iconos();
      
    }

    public void Iconos(){
       //Factura
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Logo Empresa.png")).getImage());
        ImageIcon FACTURA = new ImageIcon("src/Imagenes/FACTURA.jpg");//imagen creada
        BT_Factura.setIcon(new ImageIcon(FACTURA.getImage().getScaledInstance(60, 65, 
                Image.SCALE_SMOOTH)));
        //Employee
       
        ImageIcon EMPLOYEE = new ImageIcon("src/Imagenes/EMPLOYEE.png");//imagen creada
        BT_Employee.setIcon(new ImageIcon(EMPLOYEE.getImage().getScaledInstance(60, 65, 
                Image.SCALE_SMOOTH)));
        //Productos
        
        ImageIcon PRODUCTOS = new ImageIcon("src/Imagenes/PRODUCTO.jpg");//imagen creada
        BT_Productos.setIcon(new ImageIcon(PRODUCTOS.getImage().getScaledInstance(80, 65, 
                Image.SCALE_SMOOTH)));
        //Ventas
        
        ImageIcon VENTAS = new ImageIcon("src/Imagenes/VENTAS.png");//imagen creada
        BT_Ventas.setIcon(new ImageIcon(VENTAS.getImage().getScaledInstance(60, 65, 
                Image.SCALE_SMOOTH)));
        //Atras
        
        ImageIcon ATRAS = new ImageIcon("src/Imagenes/ATRAS.jpg");//imagen creada
        BT_Atras.setIcon(new ImageIcon(ATRAS.getImage().getScaledInstance(60, 65, 
                Image.SCALE_SMOOTH)));
        
        //Conectar a Base de datos
        
        ImageIcon CONEXION = new ImageIcon("src/Imagenes/conexionDB.png");//imagen creada
        BT_Conexion.setIcon(new ImageIcon(CONEXION.getImage().getScaledInstance(25, 25, 
                Image.SCALE_SMOOTH)));
        
        //desconectar a Base de datos
        
        ImageIcon DESCONEXION = new ImageIcon("src/Imagenes/desconectar.jpg");//imagen creada
        BT_DesconectarDB.setIcon(new ImageIcon(DESCONEXION.getImage().getScaledInstance(30, 25, 
                Image.SCALE_SMOOTH)));
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelA = new javax.swing.JPanel();
        etq_menu = new javax.swing.JLabel();
        etq_iconMenu = new javax.swing.JLabel();
        BT_Factura = new javax.swing.JButton();
        BT_Ventas = new javax.swing.JButton();
        BT_Productos = new javax.swing.JButton();
        BT_Employee = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BT_Atras = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        BT_Conexion = new javax.swing.JButton();
        BT_DesconectarDB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelA.setBackground(new java.awt.Color(153, 255, 255));
        PanelA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etq_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu-1.png"))); // NOI18N

        etq_iconMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon menu.png"))); // NOI18N

        BT_Factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_FacturaActionPerformed(evt);
            }
        });

        BT_Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_VentasActionPerformed(evt);
            }
        });

        BT_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ProductosActionPerformed(evt);
            }
        });

        BT_Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_EmployeeActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Factura");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ventas");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Productos");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Empleados");

        BT_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AtrasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Atrás");

        BT_Conexion.setText("Conexión Database");
        BT_Conexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ConexionActionPerformed(evt);
            }
        });

        BT_DesconectarDB.setText("Desconectar");
        BT_DesconectarDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_DesconectarDBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelALayout = new javax.swing.GroupLayout(PanelA);
        PanelA.setLayout(PanelALayout);
        PanelALayout.setHorizontalGroup(
            PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelALayout.createSequentialGroup()
                .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelALayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BT_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BT_DesconectarDB, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BT_Conexion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelALayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6))
                    .addGroup(PanelALayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BT_Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelALayout.createSequentialGroup()
                                .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BT_Factura, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(PanelALayout.createSequentialGroup()
                                            .addComponent(BT_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel3)))
                                    .addGroup(PanelALayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(31, 31, 31)))
                                .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelALayout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(BT_Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelALayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel5))))))
                    .addGroup(PanelALayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelALayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel2)
                                .addGap(11, 11, 11))
                            .addGroup(PanelALayout.createSequentialGroup()
                                .addComponent(etq_iconMenu)
                                .addGap(28, 28, 28)
                                .addComponent(etq_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelALayout.setVerticalGroup(
            PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelALayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelALayout.createSequentialGroup()
                        .addComponent(etq_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(PanelALayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(etq_iconMenu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BT_Factura, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelALayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelALayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BT_Atras, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelALayout.createSequentialGroup()
                        .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BT_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BT_DesconectarDB, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_Conexion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AtrasActionPerformed
        // TODO add your handling code here:
        Acceso_System atras = new Acceso_System();
        atras.setVisible(true);
        dispose();//se cierra la ventana 
    }//GEN-LAST:event_BT_AtrasActionPerformed

    private void BT_FacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_FacturaActionPerformed
        Factura_Empresa ir = new Factura_Empresa();
        ir.setVisible(true);
        dispose();
    }//GEN-LAST:event_BT_FacturaActionPerformed

    private void BT_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ProductosActionPerformed
        //Llamamos a la ventana productos
        Productos ir = new Productos();
        ir.setVisible(true);
        dispose();
    }//GEN-LAST:event_BT_ProductosActionPerformed

    private void BT_VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_VentasActionPerformed
        //Llamamos a la ventana ventas
        Ventas ir = new Ventas();
        ir.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_BT_VentasActionPerformed

    private void BT_EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_EmployeeActionPerformed
       //Llamamos a la ventana empleados
        Empleados ir = new Empleados();
        ir.setVisible(true);
        dispose();
    }//GEN-LAST:event_BT_EmployeeActionPerformed

    private void BT_ConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ConexionActionPerformed
        // TODO add your handling code here:
        Conexion conectar = new Conexion();
        conectar.getConnection();
    }//GEN-LAST:event_BT_ConexionActionPerformed

    private void BT_DesconectarDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_DesconectarDBActionPerformed
        Conexion desconectar = new Conexion();
        desconectar.desconexion();
    }//GEN-LAST:event_BT_DesconectarDBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Atras;
    private javax.swing.JButton BT_Conexion;
    private javax.swing.JButton BT_DesconectarDB;
    private javax.swing.JButton BT_Employee;
    private javax.swing.JButton BT_Factura;
    private javax.swing.JButton BT_Productos;
    private javax.swing.JButton BT_Ventas;
    private javax.swing.JPanel PanelA;
    private javax.swing.JLabel etq_iconMenu;
    private javax.swing.JLabel etq_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
