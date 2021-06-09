
package Componentes;

import Database.Datos_RegistroGET;
import Database.FacturaEBO;
import Database.FacturaGet;
import Menu.Menu_admin;
import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Factura_Empresa extends javax.swing.JFrame {

    private  FacturaEBO ebo = new FacturaEBO();
    DefaultTableModel model=new DefaultTableModel();
    public Factura_Empresa() {
        initComponents();
         setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Logo Empresa.png")).getImage());
        Tbla.setModel(model);
        String titu[]={"Producto","Marca","Modelo","Precio","Cantidad","Importe"};
        model.setColumnIdentifiers(titu);
        Tbla.getColumnModel().getColumn(0).setPreferredWidth(200);
        IconBotones();
    }
     public void IconBotones(){
         //Cancelar factura
        ImageIcon CANCELAR = new ImageIcon("src/Imagenes/cancelar.png");//imagen creada
        BT_Cancelar.setIcon(new ImageIcon(CANCELAR.getImage().getScaledInstance(30, 30, 
                Image.SCALE_SMOOTH)));
        
         //Limpiar campos
        ImageIcon LIMPIAR = new ImageIcon("src/Imagenes/LIMPIAR.png");//imagen creada
        BT_Limpiar.setIcon(new ImageIcon(LIMPIAR.getImage().getScaledInstance(35, 30, 
                Image.SCALE_SMOOTH)));
    }
     private double redondear(double num){
        return Math.rint(num*100)/100;
    }
    
    private void calTot(){
        double S=0,igv,tot;
        for(int i=0;i<Tbla.getRowCount();i++){
                S=S+Double.parseDouble(model.getValueAt(i, 5).toString());
            }
            S=redondear(S);
            etq_valorSub.setText(String.valueOf(S));
            igv=0.09*S;
            igv=redondear(igv);
            tot=S*1.09;
            tot=redondear(tot);
            etq_valorITBIS.setText(String.valueOf(igv));
            etq_valorTotal.setText(String.valueOf(tot));
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelA = new javax.swing.JPanel();
        etq_fact = new javax.swing.JLabel();
        etq_cliente = new javax.swing.JLabel();
        etq_marca = new javax.swing.JLabel();
        etq_producto = new javax.swing.JLabel();
        etq_precio = new javax.swing.JLabel();
        etq_cant = new javax.swing.JLabel();
        Combo_marca = new javax.swing.JComboBox<>();
        jtx_precio = new javax.swing.JTextField();
        jtx_cant = new javax.swing.JTextField();
        BT_Agregar = new javax.swing.JButton();
        BT_Modificar = new javax.swing.JButton();
        BT_Eliminar = new javax.swing.JButton();
        Combo_product = new javax.swing.JComboBox<>();
        jtx_cliente = new javax.swing.JTextField();
        etq_modelo = new javax.swing.JLabel();
        jtx_modelo = new javax.swing.JTextField();
        PanelB = new javax.swing.JPanel();
        BT_Cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbla = new javax.swing.JTable();
        etq_sub = new javax.swing.JLabel();
        etq_itbis = new javax.swing.JLabel();
        etq_total = new javax.swing.JLabel();
        etq_valorSub = new javax.swing.JLabel();
        etq_valorITBIS = new javax.swing.JLabel();
        etq_valorTotal = new javax.swing.JLabel();
        BT_Limpiar = new javax.swing.JButton();
        BT_Guardar = new javax.swing.JButton();
        PanelC = new javax.swing.JPanel();
        etq_numFact = new javax.swing.JLabel();
        JS_numFact = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Technology Soluctions Montero & Contreras");
        setBackground(new java.awt.Color(255, 255, 255));

        PanelA.setBackground(new java.awt.Color(204, 255, 255));
        PanelA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etq_fact.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        etq_fact.setForeground(new java.awt.Color(0, 0, 0));
        etq_fact.setText("*** Factura ***");

        etq_cliente.setForeground(new java.awt.Color(0, 0, 0));
        etq_cliente.setText("- Cliente: ");

        etq_marca.setForeground(new java.awt.Color(0, 0, 0));
        etq_marca.setText("- Marca: ");

        etq_producto.setForeground(new java.awt.Color(0, 0, 0));
        etq_producto.setText("- Producto: ");

        etq_precio.setForeground(new java.awt.Color(0, 0, 0));
        etq_precio.setText("- Precio ud $: ");

        etq_cant.setForeground(new java.awt.Color(0, 0, 0));
        etq_cant.setText("- Cantidad:");

        Combo_marca.setMaximumRowCount(19);
        Combo_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Apple", "Samsung", "Alcatel", "Asus", "Blackberry", "Huawei", "Xiami", "ZTE", "HTC", "Sony", "Lenovo", "LG", "Nokia" }));

        BT_Agregar.setText("Agregar");
        BT_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AgregarActionPerformed(evt);
            }
        });

        BT_Modificar.setText("Modificar");

        BT_Eliminar.setText("Eliminar");

        Combo_product.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Computadora", "Teléfono", "Table", "Laptop" }));

        etq_modelo.setForeground(new java.awt.Color(0, 0, 0));
        etq_modelo.setText("- Modelo:");

        javax.swing.GroupLayout PanelALayout = new javax.swing.GroupLayout(PanelA);
        PanelA.setLayout(PanelALayout);
        PanelALayout.setHorizontalGroup(
            PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelALayout.createSequentialGroup()
                .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelALayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelALayout.createSequentialGroup()
                                .addComponent(BT_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BT_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BT_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(etq_precio)
                            .addGroup(PanelALayout.createSequentialGroup()
                                .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etq_producto)
                                    .addComponent(etq_marca)
                                    .addComponent(etq_cliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Combo_marca, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(PanelALayout.createSequentialGroup()
                                        .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Combo_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtx_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(etq_cant)
                                            .addComponent(etq_modelo))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtx_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtx_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jtx_cliente)))))
                    .addGroup(PanelALayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(etq_fact)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelALayout.setVerticalGroup(
            PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelALayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(etq_fact)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_cliente)
                    .addComponent(jtx_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_marca)
                    .addComponent(Combo_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_producto)
                    .addComponent(Combo_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_modelo)
                    .addComponent(jtx_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_precio)
                    .addComponent(etq_cant)
                    .addComponent(jtx_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtx_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Agregar)
                    .addComponent(BT_Modificar)
                    .addComponent(BT_Eliminar))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        PanelB.setBackground(new java.awt.Color(204, 255, 255));
        PanelB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BT_Cancelar.setText("Cancelar");
        BT_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CancelarActionPerformed(evt);
            }
        });

        Tbla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tbla);

        etq_sub.setForeground(new java.awt.Color(0, 0, 0));
        etq_sub.setText("- SubTotal: ");

        etq_itbis.setForeground(new java.awt.Color(0, 0, 0));
        etq_itbis.setText("-  ITBIS %:");

        etq_total.setForeground(new java.awt.Color(0, 0, 0));
        etq_total.setText("- Total $:");

        etq_valorSub.setForeground(new java.awt.Color(0, 0, 0));
        etq_valorSub.setText("00.00");

        etq_valorITBIS.setForeground(new java.awt.Color(0, 0, 0));
        etq_valorITBIS.setText("00.00");

        etq_valorTotal.setForeground(new java.awt.Color(0, 0, 0));
        etq_valorTotal.setText("00.00");

        BT_Limpiar.setText("Limpiar");
        BT_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_LimpiarActionPerformed(evt);
            }
        });

        BT_Guardar.setText("Guardar");
        BT_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBLayout = new javax.swing.GroupLayout(PanelB);
        PanelB.setLayout(PanelBLayout);
        PanelBLayout.setHorizontalGroup(
            PanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(PanelBLayout.createSequentialGroup()
                        .addGroup(PanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etq_sub)
                            .addComponent(etq_itbis)
                            .addComponent(etq_total))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelBLayout.createSequentialGroup()
                                .addComponent(etq_valorSub)
                                .addGap(0, 361, Short.MAX_VALUE))
                            .addGroup(PanelBLayout.createSequentialGroup()
                                .addGroup(PanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etq_valorITBIS)
                                    .addComponent(etq_valorTotal))
                                .addGap(24, 24, 24)
                                .addComponent(BT_Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BT_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BT_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        PanelBLayout.setVerticalGroup(
            PanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBLayout.createSequentialGroup()
                        .addGroup(PanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etq_sub)
                            .addComponent(etq_valorSub))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etq_itbis)
                            .addComponent(etq_valorITBIS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etq_total)
                            .addComponent(etq_valorTotal))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BT_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BT_Guardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BT_Cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        PanelC.setBackground(new java.awt.Color(204, 255, 255));
        PanelC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etq_numFact.setForeground(new java.awt.Color(0, 0, 0));
        etq_numFact.setText("No. Factura");

        javax.swing.GroupLayout PanelCLayout = new javax.swing.GroupLayout(PanelC);
        PanelC.setLayout(PanelCLayout);
        PanelCLayout.setHorizontalGroup(
            PanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(etq_numFact)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JS_numFact)
                .addContainerGap())
        );
        PanelCLayout.setVerticalGroup(
            PanelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_numFact)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JS_numFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PanelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PanelC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(PanelC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CancelarActionPerformed
        // TODO add your handling code here:
        Menu_admin volver = new Menu_admin();
        volver.setVisible(true);
        dispose();
    }//GEN-LAST:event_BT_CancelarActionPerformed

    private void BT_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AgregarActionPerformed
        // TODO add your handling code here:
        String rowData[]=new String[6];
        rowData[0]=Combo_product.getSelectedItem().toString();
        rowData[1]=Combo_marca.getSelectedItem().toString();
        rowData[2]=jtx_modelo.getText();
        rowData[3]=jtx_precio.getText();
        rowData[4]=jtx_cant.getText();
        Double imp=Double.parseDouble(rowData[3])*Double.parseDouble(rowData[4]);
        imp=redondear(imp);
        rowData[5]=imp.toString();
        model.addRow(rowData);
        calTot();
         if (jtx_cliente.getText().isEmpty()||jtx_modelo.getText().isEmpty()
                || jtx_cant.getText().isEmpty()||jtx_precio.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "¡Llene todos los campos!");
        }else{
            FacturaGet dar = new FacturaGet();
            dar.setNombre_producto(Combo_product.getSelectedItem().toString());
            dar.setMarca_producto(Combo_marca.getSelectedItem().toString());
            dar.setModelo_producto(jtx_modelo.getText());
            dar.setPrecio_ud(jtx_precio.getText());
            dar.setCantidad_producto(jtx_cant.getText());
            dar.setTotal_producto(etq_valorTotal.getText());
          
           String mensaje = ebo.addDatos(dar);
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }//GEN-LAST:event_BT_AgregarActionPerformed

    private void BT_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_LimpiarActionPerformed
      limpiar();//Boton que limpiará las variables
        
    }//GEN-LAST:event_BT_LimpiarActionPerformed

    private void BT_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_GuardarActionPerformed
        // TODO add your handling code here:
        /*if (jtx_cliente.getText().isEmpty()||jtx_modelo.getText().isEmpty()
                || jtx_cant.getText().isEmpty()||jtx_precio.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, "¡Llene todos los campos!");
        }else{
            FacturaGet dar = new FacturaGet();
            dar.setNombre_producto(Combo_product.getSelectedItem().toString());
            dar.setMarca_producto(Combo_marca.getSelectedItem().toString());
            dar.setModelo_producto(jtx_modelo.getText());
            dar.setPrecio_ud(jtx_precio.getText());
            dar.setCantidad_producto(jtx_cant.getText());
            dar.setTotal_producto(etq_valorTotal.getText());
          
           String mensaje = ebo.addDatos(dar);
            JOptionPane.showMessageDialog(null, mensaje);
        }*/
        
    }//GEN-LAST:event_BT_GuardarActionPerformed
     //Metodo limpiar 
    public void limpiar()
    {
       
       Combo_marca.setSelectedIndex(0);
       Combo_product.setSelectedIndex(0);
       jtx_modelo.setText("");
       jtx_precio.setText("");
       jtx_cant.setText("");
        JOptionPane.showMessageDialog(null, "¡Se han limpiado los campos!");
        
    }
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
            java.util.logging.Logger.getLogger(Factura_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura_Empresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Agregar;
    private javax.swing.JButton BT_Cancelar;
    private javax.swing.JButton BT_Eliminar;
    private javax.swing.JButton BT_Guardar;
    private javax.swing.JButton BT_Limpiar;
    private javax.swing.JButton BT_Modificar;
    private javax.swing.JComboBox<String> Combo_marca;
    private javax.swing.JComboBox<String> Combo_product;
    private javax.swing.JSpinner JS_numFact;
    private javax.swing.JPanel PanelA;
    private javax.swing.JPanel PanelB;
    private javax.swing.JPanel PanelC;
    private javax.swing.JTable Tbla;
    private javax.swing.JLabel etq_cant;
    private javax.swing.JLabel etq_cliente;
    private javax.swing.JLabel etq_fact;
    private javax.swing.JLabel etq_itbis;
    private javax.swing.JLabel etq_marca;
    private javax.swing.JLabel etq_modelo;
    private javax.swing.JLabel etq_numFact;
    private javax.swing.JLabel etq_precio;
    private javax.swing.JLabel etq_producto;
    private javax.swing.JLabel etq_sub;
    private javax.swing.JLabel etq_total;
    private javax.swing.JLabel etq_valorITBIS;
    private javax.swing.JLabel etq_valorSub;
    private javax.swing.JLabel etq_valorTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtx_cant;
    private javax.swing.JTextField jtx_cliente;
    private javax.swing.JTextField jtx_modelo;
    private javax.swing.JTextField jtx_precio;
    // End of variables declaration//GEN-END:variables
}
