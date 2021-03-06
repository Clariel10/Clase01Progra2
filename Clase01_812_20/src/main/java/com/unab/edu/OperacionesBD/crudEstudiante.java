/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.OperacionesBD;

import com.unab.edu.DAO.ClsEstudiante;
import com.unab.edu.DAO.ClsPersona;
import com.unab.edu.Entidades.Estudiante;
import com.unab.edu.Entidades.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class crudEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form crudEstudiante
     */
    public crudEstudiante() {
        initComponents();
        MostrarTablaMiniPersona();
        MostrarTablaPersona();
        this.setLocationRelativeTo(null);
        txtIdEstudiante.enable(false);
    }
    
    void MostrarTablaPersona ()
    {
    
        String TITULOS [] = {"ID_ESTUDIANTE","MATRICULA","ID_PERSONA","NOMBRE","USUARIO","PASSWORD","NIE"};
        DefaultTableModel ModeloTabla = new DefaultTableModel(null, TITULOS);
        ClsEstudiante claseEstudiante = new ClsEstudiante();
        ArrayList <Estudiante> Estudiantes =  claseEstudiante.MostrarEstudiante();
        String filas [] = new String [7];
        for (var IterarDatos : Estudiantes){
        
        filas[0] = String.valueOf(IterarDatos.getId());
        filas[1] = String.valueOf(IterarDatos.getMatricula());
        filas[2] = String.valueOf(IterarDatos.getIdPersona());
        filas[3] = IterarDatos.getNombre();
        filas[4] = IterarDatos.getUSU();
        filas[5] = IterarDatos.getPASS();
        filas[6] = IterarDatos.getNIE();
        
        ModeloTabla.addRow(filas);
            
        }
    
        tb_mostrarEstudiante.setModel(ModeloTabla);
    }
    
     void MostrarTablaMiniPersona ()
    {
    
        String TITULOS [] = {"ID","NOMBRE"};
        DefaultTableModel ModeloTabla = new DefaultTableModel(null, TITULOS);
        ClsPersona clasePersona = new ClsPersona();
        ArrayList <Persona> Personas =  clasePersona.MostrarPersona();
        String filas [] = new String [2];
        for (var IterarDatosPersona : Personas){
        
        filas[0] = String.valueOf(IterarDatosPersona.getIdPersona());
        filas[1] = IterarDatosPersona.getNombre();        
        
        ModeloTabla.addRow(filas);
            
        }
    
        tb_PersonasMini.setModel(ModeloTabla);
    }
    
    void Limpiar (){
        
      txtIdEstudiante.setText("");
      txtIdPersona.setText("");
      txtMatricula.setText("");
      txtPass.setText("");
      txtUsuario.setText("");
      txtNIE.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbp_mostrar = new javax.swing.JTabbedPane();
        jpanel1 = new javax.swing.JPanel();
        txtIdEstudiante = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtIdPersona = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNIE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_PersonasMini = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_mostrarEstudiante = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtIdPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdPersonaMouseClicked(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Id Estudiante");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Id Persona");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Matricula");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Uusuario");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Password");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("NIE");

        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("LIMPIAR CAMPOS");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        tb_PersonasMini.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_PersonasMini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_PersonasMiniMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_PersonasMini);

        javax.swing.GroupLayout jpanel1Layout = new javax.swing.GroupLayout(jpanel1);
        jpanel1.setLayout(jpanel1Layout);
        jpanel1Layout.setHorizontalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(45, 45, 45))
            .addGroup(jpanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                                .addComponent(txtIdPersona)
                                .addComponent(txtPass)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2)
                                .addComponent(txtUsuario)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNIE, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpanel1Layout.setVerticalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtIdEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNIE, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );

        tbp_mostrar.addTab("Edicion de Datos", jpanel1);

        tb_mostrarEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_mostrarEstudiante);

        jTabbedPane2.addTab("tab1", jScrollPane1);

        tbp_mostrar.addTab("Vista de Datos", jTabbedPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(tbp_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbp_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
                
        if (txtIdEstudiante.getText() != "" && txtIdPersona.getText() != "" && txtMatricula.getText() != "" && txtNIE.getText() != "" && txtPass.getText() != "" && txtUsuario.getText() != ""){
            
        
            ClsEstudiante Estudiantes = new ClsEstudiante();
            Estudiante Estudiante = new Estudiante();
            Estudiante.setId(Integer.parseInt(txtIdEstudiante.getText()));
            Estudiante.setMatricula(Integer.parseInt(txtMatricula.getText()));
            Estudiante.setIdPersona(Integer.parseInt(txtIdPersona.getText()));
            Estudiante.setPASS(txtPass.getText());
            Estudiante.setUSU(txtUsuario.getText());
            Estudiante.setNIE(txtNIE.getText());
            Estudiantes.ActualizarEstudiante(Estudiante);
            MostrarTablaPersona();
            Limpiar();
        }
        else{
            
            JOptionPane.showMessageDialog(null, "Hay campos Vacios");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
               
         if (txtIdEstudiante.getText() != "" && txtIdPersona.getText() != "" && txtMatricula.getText() != "" && txtNIE.getText() != "" && txtPass.getText() != "" && txtUsuario.getText() != "") {

            ClsEstudiante Estudiantes = new ClsEstudiante();
            Estudiante Estudiante = new Estudiante();
            Estudiante.setId(Integer.parseInt(txtIdEstudiante.getText()));
            Estudiantes.BorrarEstudiante(Estudiante);
            MostrarTablaPersona();
            Limpiar();
        } else {

            JOptionPane.showMessageDialog(null, "Hay campos Vacios");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if (txtIdEstudiante.getText() != "" && txtIdPersona.getText() != "" && txtMatricula.getText() != "" && txtNIE.getText() != "" && txtPass.getText() != "" && txtUsuario.getText() != "") {

            ClsEstudiante Estudiantes = new ClsEstudiante();
            Estudiante Estudiante = new Estudiante();
            Estudiante.setMatricula(Integer.parseInt(txtMatricula.getText()));
            Estudiante.setIdPersona(Integer.parseInt(txtIdPersona.getText()));
            Estudiante.setPASS(txtPass.getText());
            Estudiante.setUSU(txtUsuario.getText());
            Estudiante.setNIE(txtNIE.getText());
            Estudiantes.AgregarEstudiante(Estudiante);
            MostrarTablaPersona();
            Limpiar();
        } else{
            
            JOptionPane.showMessageDialog(null, "Hay campos Vacios");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtIdPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdPersonaMouseClicked

    }//GEN-LAST:event_txtIdPersonaMouseClicked

    public FrmListadoPersonas listapersonas = new FrmListadoPersonas();
    
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Limpiar();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void tb_PersonasMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_PersonasMiniMouseClicked
        tbp_mostrar.setSelectedIndex(tbp_mostrar.indexOfComponent(jpanel1));

        int fila = tb_PersonasMini.getSelectedRow();

        String ID = String.valueOf(tb_PersonasMini.getValueAt(fila, 0));       
        
        txtIdPersona.setText(ID);
        
        
    }//GEN-LAST:event_tb_PersonasMiniMouseClicked

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
            java.util.logging.Logger.getLogger(crudEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    public static javax.swing.JPanel jpanel1;
    private javax.swing.JTable tb_PersonasMini;
    private javax.swing.JTable tb_mostrarEstudiante;
    private javax.swing.JTabbedPane tbp_mostrar;
    private javax.swing.JTextField txtIdEstudiante;
    public static javax.swing.JTextField txtIdPersona;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNIE;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
