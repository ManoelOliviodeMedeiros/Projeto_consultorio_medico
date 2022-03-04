
package visao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import beans.BeansUsuarios;
import connection.ConexBD;



public class FrmLogin extends javax.swing.JFrame {
    Connection conex = new ConexBD().Conecta();
    
 
   
    
    public FrmLogin() {
        initComponents();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAcessar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabelSenha = new javax.swing.JLabel();
        jLabelusuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        pasSenha = new javax.swing.JPasswordField();
        jLabellogo = new javax.swing.JLabel();
        lblcont = new javax.swing.JLabel();
        lblFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnAcessar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAcessar.setText("Acessar");
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcessar);
        btnAcessar.setBounds(270, 170, 90, 30);

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setToolTipText("");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(390, 170, 90, 30);

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(280, 90, 50, 20);

        jLabelusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelusuario.setText("Usuário:");
        getContentPane().add(jLabelusuario);
        jLabelusuario.setBounds(270, 50, 60, 20);

        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(330, 50, 130, 23);

        pasSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pasSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(pasSenha);
        pasSenha.setBounds(330, 90, 130, 20);

        jLabellogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imglogo250.png"))); // NOI18N
        getContentPane().add(jLabellogo);
        jLabellogo.setBounds(0, 10, 250, 250);

        lblcont.setText("jLabel1");
        getContentPane().add(lblcont);
        lblcont.setBounds(390, 230, 60, 14);

        lblFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imglogin.jpg"))); // NOI18N
        getContentPane().add(lblFundoLogin);
        lblFundoLogin.setBounds(0, 0, 520, 260);

        setSize(new java.awt.Dimension(535, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarActionPerformed
                                                  
            // CHAMATELA PRINCIPAL
       
        try {
               
                String sql = "select * from usuarios where usu_nome = '"+ txtUsuario.getText()+"'";
                PreparedStatement stmt = conex.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery();
                rs.first();
                if (rs.getString("usu_senha").equals(pasSenha.getText())){
                    FrmCarregaSistema carrega = new FrmCarregaSistema();
                    carrega.setVisible(true);
                    BeansUsuarios usu = new BeansUsuarios();
                    usu.setUsu_nome(txtUsuario.getText());
                    FrmPrincipal tela = new FrmPrincipal(); // txtUsuario.getText()
                    tela.exportausuario(usu);
                    tela.setVisible(true);
                    tela.setResizable(false);
                    stmt.close();
                    dispose();
                    carrega.dispose();
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Senha ou usuário incorreto");
                }

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Senha ou usuário incorreto");
                txtUsuario.requestFocus();
            }
     
    }//GEN-LAST:event_btnAcessarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // SAIR SISTEMA
        System.exit(0);
        
        
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == 10)
            pasSenha.requestFocus();
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void pasSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pasSenhaKeyPressed
        // TODO add your handling code here:
          if (evt.getKeyCode() == 10)
            btnAcessar.requestFocus();
    }//GEN-LAST:event_pasSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabellogo;
    private javax.swing.JLabel jLabelusuario;
    private javax.swing.JLabel lblFundoLogin;
    private javax.swing.JLabel lblcont;
    private javax.swing.JPasswordField pasSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
