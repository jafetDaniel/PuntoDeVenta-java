package View;

import Controller.LoginController;
import Model.Usuarios;
import Model.UsuariosDao;


public class FrmLogin extends javax.swing.JFrame {
    Usuarios us = new Usuarios();
    UsuariosDao usDao = new UsuariosDao();

   
    public FrmLogin() {
        initComponents();
        LoginController users = new LoginController(us, usDao, this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        txtClave = new org.edisoncor.gui.passwordField.PasswordFieldRoundBackground();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new org.edisoncor.gui.button.ButtonTextDown();
        btnLogin = new org.edisoncor.gui.button.ButtonTextDown();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setColorPrimario(new java.awt.Color(0, 102, 204));
        panel1.setMinimumSize(new java.awt.Dimension(480, 630));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inciar Sesión");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 470, 65));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 90, 40));

        txtUsuario.setColorDeBorde(new java.awt.Color(255, 255, 255));
        txtUsuario.setDescripcion("user");
        txtUsuario.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        panel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 210, 40));

        txtClave.setColorDeBorde(new java.awt.Color(255, 255, 255));
        txtClave.setDescripcion("password");
        txtClave.setDoubleBuffered(true);
        txtClave.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });
        panel1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 210, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.setColorDeSombra(new java.awt.Color(255, 0, 0));
        btnCancelar.setFocusable(false);
        btnCancelar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 110, 40));

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("Login");
        btnLogin.setFocusable(false);
        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        panel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 110, 40));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 580));
        panel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

   
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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public org.edisoncor.gui.button.ButtonTextDown btnCancelar;
    public org.edisoncor.gui.button.ButtonTextDown btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private org.edisoncor.gui.panel.Panel panel1;
    public org.edisoncor.gui.passwordField.PasswordFieldRoundBackground txtClave;
    public org.edisoncor.gui.textField.TextFieldRoundBackground txtUsuario;
    // End of variables declaration//GEN-END:variables
}
