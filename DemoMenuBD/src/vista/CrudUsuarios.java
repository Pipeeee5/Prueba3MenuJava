/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.AlumnoDAO;
import controlador.*;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import modelo.*;
import javax.swing.SpinnerNumberModel;
/**
 *
 * @author Golden Gamers
 */
public class CrudUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form CrudUsuarios
     */
    public CrudUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldRutUsu = new javax.swing.JTextField();
        jTextFieldNombreUsu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxUsu = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldUsernameUsu = new javax.swing.JTextField();
        jTextFieldPassUsu = new javax.swing.JTextField();
        jButtonAgregarUsu = new javax.swing.JButton();
        jButtonBuscarUsu = new javax.swing.JButton();
        jButtonVolverUsu = new javax.swing.JButton();
        jButtonEliminarUsu = new javax.swing.JButton();
        jButtonModificarUsu = new javax.swing.JButton();
        jButtonUsu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("rut:");

        jLabel2.setText("nombre:");

        jLabel3.setText("tipo usuario:");

        jComboBoxUsu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar ", "admin", "profesor ", "alumno" }));
        jComboBoxUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUsuActionPerformed(evt);
            }
        });

        jLabel4.setText("Username:");

        jLabel5.setText("password:");

        jButtonAgregarUsu.setText("Agregar");
        jButtonAgregarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarUsuActionPerformed(evt);
            }
        });

        jButtonBuscarUsu.setText("Buscar");
        jButtonBuscarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarUsuActionPerformed(evt);
            }
        });

        jButtonVolverUsu.setText("Volver");
        jButtonVolverUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverUsuActionPerformed(evt);
            }
        });

        jButtonEliminarUsu.setText("Eliminar");
        jButtonEliminarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarUsuActionPerformed(evt);
            }
        });

        jButtonModificarUsu.setText("Modificar");
        jButtonModificarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarUsuActionPerformed(evt);
            }
        });

        jButtonUsu.setText("Limpiar");
        jButtonUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuActionPerformed(evt);
            }
        });

        jLabel6.setText("MANTENEDOR DE USUARIOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPassUsu))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldUsernameUsu))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNombreUsu)
                            .addComponent(jTextFieldRutUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAgregarUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscarUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonModificarUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEliminarUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonUsu)
                        .addGap(72, 72, 72)
                        .addComponent(jButtonVolverUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonAgregarUsu)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonBuscarUsu)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonEliminarUsu)
                            .addGap(21, 21, 21)
                            .addComponent(jButtonModificarUsu)
                            .addGap(79, 79, 79))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonUsu)
                            .addComponent(jButtonVolverUsu)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldRutUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBoxUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldUsernameUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldPassUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarUsuActionPerformed
        // TODO add your handling code here:

        try {
            String rut = jTextFieldRutUsu.getText();
            String nombre = jTextFieldNombreUsu.getText();
            String tipoUsuario = jComboBoxUsu.getSelectedItem().toString();
            String userName = jTextFieldUsernameUsu.getText();
            String password = jTextFieldPassUsu.getText();

            if (!rut.equals("") && !nombre.equals("") && !tipoUsuario.equals("")&& !userName.equals("") && !password.equals("")) {

                Usuario x = new Usuario(rut, nombre, tipoUsuario, userName, password);
                //String rut, String nombre, int edad, String genero, String email, String carrera

                if (UsuarioDAO.agregar(x) == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Bien, datos grabados");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error, rut ya existe");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error, los campos NO deben estar vacios");
            }
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error, edad debe ser un n??mero");
        }
    }//GEN-LAST:event_jButtonAgregarUsuActionPerformed

    private void jButtonBuscarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarUsuActionPerformed
        // TODO add your handling code here:
        Usuario usuario= null;
        String rut = jTextFieldRutUsu.getText();
        jTextFieldRutUsu.setEnabled(false);

        if (!rut.equals("")) {
            usuario = UsuarioDAO.buscar(rut);
            if (usuario!= null && usuario instanceof Usuario) {
                jTextFieldNombreUsu.setText(usuario.getNombre());
                jComboBoxUsu.setSelectedItem(usuario.getTipoUsuario());
                jTextFieldUsernameUsu.setText(usuario.getUserName());
                jTextFieldPassUsu.setText(usuario.getPassword());
                
                
//                jSpinnerEdad.setValue(usuario.getEdad());
//                jComboBoxGenero.setSelectedItem(usuario.getGenero());
//                jTextFieldEmail.setText(usuario.getEmail());
//                jComboBoxUsuario.setSelectedItem(((Usuario) usuario).getUsuario());
                jButtonEliminarUsu.setEnabled(true);
                jButtonModificarUsu.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Error, rut no debe estar en blanco");
            }
        }
    }//GEN-LAST:event_jButtonBuscarUsuActionPerformed

    private void jButtonVolverUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverUsuActionPerformed
        // TODO add your handling code here:
        this.dispose();// cerrar solamente esta ventana, NO todas
    }//GEN-LAST:event_jButtonVolverUsuActionPerformed

    private void jButtonEliminarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarUsuActionPerformed
        // TODO add your handling code here:

        try {
            String rut = jTextFieldRutUsu.getText();
            if (!rut.equals("")) {
                int n = JOptionPane.showConfirmDialog(null, "??Esta seguro  que desea eliminar esta persona?",
                    "Confirmar", 0);

                if (n == 0) {
                    if (UsuarioDAO.eliminar(rut) == true) {
                        JOptionPane.showMessageDialog(rootPane, "Usuario eliminada");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El rut no existe");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Eliminacion cancelada");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "El rut no tiene que estar en blanco");
            }
            limpiar();
        } catch (Exception ev) {
            JOptionPane.showMessageDialog(rootPane, "Ocurrio un error");
        }

        //        try {
            //
            //            if (jTextFieldRut.isEnabled() == false) {
                //                String rut = jTextFieldRut.getText();
                //
                //                if (UsuarioDAO.eliminar(rut) == true) {
                    //                    JOptionPane.showMessageDialog(rootPane, "Bien,rut eliminado...");
                    //                } else {
                    //                    JOptionPane.showMessageDialog(rootPane, "Error,rut no existe...");
                    //                }
                //                limpiar();
                //            }
            //        } catch (Exception ev) {
            //            JOptionPane.showMessageDialog(rootPane, "Error,rut no debe estar en blanco...");
            //        }
    }//GEN-LAST:event_jButtonEliminarUsuActionPerformed

    private void jButtonModificarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarUsuActionPerformed
        // TODO add your handling code here:
        jTextFieldRutUsu.setEnabled(false);
        try {
            String rut = jTextFieldRutUsu.getText();
            String nombre = jTextFieldNombreUsu.getText();
            String tipoUsuario = jComboBoxUsu.getSelectedItem().toString();
            String userName = jTextFieldUsernameUsu.getText();
            String password = jTextFieldPassUsu.getText();
           
            if (!rut.equals("") && !nombre.equals("") && !tipoUsuario.equals("")&& !userName.equals("") && !password.equals("")) {

                Usuario x = new Usuario(rut, nombre, tipoUsuario, userName, password);
                //String rut, String nombre, int edad, String genero, String email, String carrera

                if (UsuarioDAO.modificar(x) == true) {
                    JOptionPane.showMessageDialog(rootPane, "Bien, datos modificados");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error, rut ya existe");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error, los campos NO deben estar vacios");
            }

            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error, desconocido 052");
        }
    }//GEN-LAST:event_jButtonModificarUsuActionPerformed

    private void jButtonUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButtonUsuActionPerformed

    private void jComboBoxUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxUsuActionPerformed
    public void limpiar() {
        jTextFieldRutUsu.setEnabled(true);
        jTextFieldRutUsu.setText("");
        jTextFieldNombreUsu.setText("");
        jComboBoxUsu.setSelectedIndex(0);
        jTextFieldUsernameUsu.setText("");
        jTextFieldPassUsu.setText("");
        
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
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarUsu;
    private javax.swing.JButton jButtonBuscarUsu;
    private javax.swing.JButton jButtonEliminarUsu;
    private javax.swing.JButton jButtonModificarUsu;
    private javax.swing.JButton jButtonUsu;
    private javax.swing.JButton jButtonVolverUsu;
    private javax.swing.JComboBox<String> jComboBoxUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldNombreUsu;
    private javax.swing.JTextField jTextFieldPassUsu;
    private javax.swing.JTextField jTextFieldRutUsu;
    private javax.swing.JTextField jTextFieldUsernameUsu;
    // End of variables declaration//GEN-END:variables
}
