
package vista;

import javax.swing.SpinnerNumberModel;
import modelo.*;
import controlador.*;
import controlador.ProfesorDAO;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;


public class CrudDocentes extends javax.swing.JFrame {

    /**
     * Creates new form CrudDocentes
     */
    public CrudDocentes() {
        initComponents();
        SpinnerNumberModel modelo = new SpinnerNumberModel();
        modelo.setMinimum(1);
        modelo.setMaximum(100);
        jSpinnerEdadDocentes.setModel(modelo);
        jSpinnerEdadDocentes.setValue(1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAgregarDocentes = new javax.swing.JButton();
        jButtonBuscarDocentes = new javax.swing.JButton();
        jButtonEliminarDocentes = new javax.swing.JButton();
        jButtonModificarDocentes = new javax.swing.JButton();
        jButtonDocentes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldRutDocentes = new javax.swing.JTextField();
        jTextFieldNombreDocentes = new javax.swing.JTextField();
        jSpinnerEdadDocentes = new javax.swing.JSpinner();
        jComboBoxTrabajoDocente = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEmailDocentes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxGeneroDocentes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonAgregarDocentes.setText("Agregar");
        jButtonAgregarDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarDocentesActionPerformed(evt);
            }
        });

        jButtonBuscarDocentes.setText("Buscar");
        jButtonBuscarDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarDocentesActionPerformed(evt);
            }
        });

        jButtonEliminarDocentes.setText("Eliminar");
        jButtonEliminarDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarDocentesActionPerformed(evt);
            }
        });

        jButtonModificarDocentes.setText("Modificar");
        jButtonModificarDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarDocentesActionPerformed(evt);
            }
        });

        jButtonDocentes.setText("Limpiar");
        jButtonDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDocentesActionPerformed(evt);
            }
        });

        jLabel1.setText("MANTENDOR DOCENTES");

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jLabel2.setText("Rut:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Edad:");

        jLabel5.setText("Lugar de trabajo:");

        jComboBoxTrabajoDocente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Duoc Antonio Varas", "Duoc San Bernando", "Duoc Sede Alameda", " " }));

        jLabel6.setText("Email");

        jTextFieldEmailDocentes.setToolTipText("Debe ingresar un @");

        jLabel7.setText("genero");

        jComboBoxGeneroDocentes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino", "No binario", "etc" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinnerEdadDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jComboBoxGeneroDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldEmailDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldNombreDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldRutDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonDocentes)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButtonBuscarDocentes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonEliminarDocentes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonModificarDocentes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                        .addComponent(jButtonAgregarDocentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxTrabajoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 284, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldRutDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAgregarDocentes)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNombreDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscarDocentes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEliminarDocentes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonModificarDocentes))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerEdadDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxGeneroDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDocentes)
                    .addComponent(jTextFieldEmailDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTrabajoDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(82, 82, 82)
                .addComponent(jButtonVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarDocentesActionPerformed
        // TODO add your handling code here:

        try {
            String rut = jTextFieldRutDocentes.getText();
            String nombre = jTextFieldNombreDocentes.getText();
            byte edad = Byte.parseByte(jSpinnerEdadDocentes.getValue().toString());
            String genero = jComboBoxGeneroDocentes.getSelectedItem().toString();
            String email = jTextFieldEmailDocentes.getText();
            String trabajo = jComboBoxTrabajoDocente.getSelectedItem().toString();

            if (!rut.equals("") && !nombre.equals("") && edad >= 0 && !genero.equals("") && !email.equals("") && !trabajo.equals("")) {

                Profesor x = new Profesor(rut, nombre, edad, genero, email, trabajo);
                //String rut, String nombre, int edad, String genero, String email, String lugarTrabajo

                if (ProfesorDAO.agregar(x) == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Bien, datos grabados");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error, rut ya existe");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error, los campos NO deben estar vacios");
            }

            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error, edad debe ser un número");
        }
    }//GEN-LAST:event_jButtonAgregarDocentesActionPerformed

    private void jButtonBuscarDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarDocentesActionPerformed
        // TODO add your handling code here:
        Persona profesor = null;
        String rut = jTextFieldRutDocentes.getText();
        jTextFieldRutDocentes.setEnabled(false);

        if (!rut.equals("")) {
            profesor = ProfesorDAO.buscar(rut);
            if (profesor != null && profesor instanceof Profesor) {
                jTextFieldNombreDocentes.setText(profesor.getNombre());
                jSpinnerEdadDocentes.setValue(profesor.getEdad());
                jComboBoxGeneroDocentes.setSelectedItem(profesor.getGenero());
                jTextFieldEmailDocentes.setText(profesor.getEmail());
                jComboBoxTrabajoDocente.setSelectedItem(((Profesor)profesor).getLugarTrabajo());
                

                jButtonEliminarDocentes.setEnabled(true);
                jButtonModificarDocentes.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error, rut no existe");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error, rut no debe estar en blanco");
        }

    }//GEN-LAST:event_jButtonBuscarDocentesActionPerformed

    private void jButtonEliminarDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarDocentesActionPerformed
        // TODO add your handling code here:
        try {

            if (jTextFieldRutDocentes.isEnabled() == false) {
                String rut = jTextFieldRutDocentes.getText();

                if (ProfesorDAO.eliminar(rut) == true) {
                    JOptionPane.showMessageDialog(rootPane, "Bien,rut eliminado...");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error,rut no existe...");
                }
                limpiar();
            }
        } catch (Exception ev) {
            JOptionPane.showMessageDialog(rootPane, "Error,rut no debe estar en blanco...");
        }
    }//GEN-LAST:event_jButtonEliminarDocentesActionPerformed

    private void jButtonModificarDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarDocentesActionPerformed
        // TODO add your handling code here:
        try {
            String rut = jTextFieldRutDocentes.getText();
            String nombre = jTextFieldNombreDocentes.getText();
            byte edad = Byte.parseByte(jSpinnerEdadDocentes.getValue().toString());
            String genero = jComboBoxGeneroDocentes.getSelectedItem().toString();
            String email = jTextFieldEmailDocentes.getText();
            String trabajo = jComboBoxTrabajoDocente.getSelectedItem().toString();

            if (!rut.equals("") && !nombre.equals("") && edad >= 0 && !genero.equals("") && !email.equals("") && !trabajo.equals("")) {

                Profesor x = new Profesor(rut, nombre, edad, genero, email, trabajo);
                //String rut, String nombre, int edad, String genero, String email, String lugarTrabajo

                if (ProfesorDAO.modificar(x) == true) {
                    JOptionPane.showMessageDialog(rootPane, "Bien, datos modificados");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error, rut ya existe");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error, los campos NO deben estar vacios");
            }

            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error, edad debe ser un número");
        }
    }//GEN-LAST:event_jButtonModificarDocentesActionPerformed

    private void jButtonDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDocentesActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButtonDocentesActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed
    public void limpiar() {
        jTextFieldRutDocentes.setEnabled(true);
        jTextFieldRutDocentes.setText("");
        jTextFieldNombreDocentes.setText("");
        jSpinnerEdadDocentes.setValue(1);
        jComboBoxGeneroDocentes.setSelectedItem(0);
        jTextFieldEmailDocentes.setText("");
        jButtonEliminarDocentes.setEnabled(false);
        jButtonModificarDocentes.setEnabled(false);
        jComboBoxTrabajoDocente.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(CrudDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudDocentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudDocentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarDocentes;
    private javax.swing.JButton jButtonBuscarDocentes;
    private javax.swing.JButton jButtonDocentes;
    private javax.swing.JButton jButtonEliminarDocentes;
    private javax.swing.JButton jButtonModificarDocentes;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxGeneroDocentes;
    private javax.swing.JComboBox<String> jComboBoxTrabajoDocente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner jSpinnerEdadDocentes;
    private javax.swing.JTextField jTextFieldEmailDocentes;
    private javax.swing.JTextField jTextFieldNombreDocentes;
    private javax.swing.JTextField jTextFieldRutDocentes;
    // End of variables declaration//GEN-END:variables
}
