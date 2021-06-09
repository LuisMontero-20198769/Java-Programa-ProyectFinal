
package Login_Admin;

import ConexionBD.Conexion;
import Menu.Menu_admin;
import java.awt.*;

import java.awt.Image;
import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;


public class Acceso_System extends javax.swing.JFrame {
    Connection conn = null;
    OraclePreparedStatement pst = null;
    OracleResultSet rs = null;
    
    public Acceso_System() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Logo Empresa.png")).getImage());
         IconBotones();
    }
    
    public void datos(String us, String pas){
       //usuario = "admin";
       //password = "admin";
    }
    public void IconBotones(){
        
        //Acceso
        ImageIcon ACCESO = new ImageIcon("src/Imagenes/acceso.png");//imagen creada
        BT_Acceso.setIcon(new ImageIcon(ACCESO.getImage().getScaledInstance(30, 25, 
                Image.SCALE_SMOOTH)));
        
         //Resgistrase
        ImageIcon REGISTRO = new ImageIcon("src/Imagenes/Icon boton registro.png");//imagen creada
        BT_Registro.setIcon(new ImageIcon(REGISTRO.getImage().getScaledInstance(25, 25, 
                Image.SCALE_SMOOTH)));
        
         //Cerrar
        ImageIcon CERRAR = new ImageIcon("src/Imagenes/salir.png");//imagen creada
        BT_Salir.setIcon(new ImageIcon(CERRAR.getImage().getScaledInstance(35, 25, 
                Image.SCALE_SMOOTH)));
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etq_admin = new javax.swing.JLabel();
        etq_contraseña = new javax.swing.JLabel();
        jtx_admin = new javax.swing.JTextField();
        jtx_contra_user = new javax.swing.JPasswordField();
        BT_Registro = new javax.swing.JButton();
        BT_Salir = new javax.swing.JButton();
        BT_Acceso = new javax.swing.JButton();
        etq_imagenLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Technology Soluctions Montero & Contreras");

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(153, 255, 255));

        etq_admin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etq_admin.setForeground(new java.awt.Color(0, 0, 0));
        etq_admin.setText("- Usuario:");

        etq_contraseña.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etq_contraseña.setForeground(new java.awt.Color(0, 0, 0));
        etq_contraseña.setText("- Contraseña:");

        jtx_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtx_adminActionPerformed(evt);
            }
        });

        BT_Registro.setText("Registrarse");
        BT_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_RegistroActionPerformed(evt);
            }
        });

        BT_Salir.setText("Cerrar");
        BT_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_SalirMouseClicked(evt);
            }
        });
        BT_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SalirActionPerformed(evt);
            }
        });

        BT_Acceso.setText("Acceder");
        BT_Acceso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_AccesoMouseClicked(evt);
            }
        });
        BT_Acceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AccesoActionPerformed(evt);
            }
        });

        etq_imagenLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user22.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Bienvenido(a)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BT_Registro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BT_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etq_contraseña)
                            .addComponent(etq_admin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtx_contra_user, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(jtx_admin))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 131, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(etq_imagenLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BT_Acceso, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(etq_imagenLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtx_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_admin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_contraseña)
                    .addComponent(jtx_contra_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BT_Acceso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Registro)
                    .addComponent(BT_Salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtx_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtx_adminActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtx_adminActionPerformed

    private void BT_AccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AccesoActionPerformed
        // TODO add your handling code here:
        conn = Conexion.getConnection();
        //String pass = new String(jtx_contra_user.getPassword());
        try {
            
            String sql = "SELECT nombre_user, clave_user FROM usuarios WHERE nombre_user=? AND clave_user=?";
            
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, jtx_admin.getText());
            pst.setString(2, jtx_contra_user.getText());
            rs = (OracleResultSet) pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "¡Acceso Permitido!");
                //Accedemos al formulario Factura 
                Menu_admin acceder = new Menu_admin();///
                acceder.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "¡Usuario Invalido!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BT_AccesoActionPerformed

    private void BT_AccesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AccesoMouseClicked
        // TODO add your handling code here:
        
      
        
    }//GEN-LAST:event_BT_AccesoMouseClicked

    private void BT_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_RegistroActionPerformed
        // TODO add your handling code here:
        registrar lg = new registrar();
        lg.setVisible(true);
        dispose();
        //dispose();
    }//GEN-LAST:event_BT_RegistroActionPerformed

    private void BT_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_SalirActionPerformed

    private void BT_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_SalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);//Cierre del programa
    }//GEN-LAST:event_BT_SalirMouseClicked

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
            java.util.logging.Logger.getLogger(Acceso_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso_System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso_System().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Acceso;
    private javax.swing.JButton BT_Registro;
    private javax.swing.JButton BT_Salir;
    private javax.swing.JLabel etq_admin;
    private javax.swing.JLabel etq_contraseña;
    private javax.swing.JLabel etq_imagenLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtx_admin;
    private javax.swing.JPasswordField jtx_contra_user;
    // End of variables declaration//GEN-END:variables
}
