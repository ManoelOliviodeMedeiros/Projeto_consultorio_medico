
package visao;


import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import beans.BeansUsuarios;
import modeloDAO.DaoUsuarios;


public class FrmUsuarios extends javax.swing.JFrame {
    BeansUsuarios mod = new BeansUsuarios();
    DaoUsuarios control = new DaoUsuarios();   
     int flag = 0;
     
     
        public void preencheTabelaUsu(){
        mod.setPesquisa(txtPesqUsuario.getText());
        DaoUsuarios daousuarios = new DaoUsuarios();
        List<BeansUsuarios> listausuarios = daousuarios.Usuarios(mod);
        DefaultTableModel tabusuarios = (DefaultTableModel) tabelaUsuarios.getModel();
        tabusuarios.setNumRows(0);
         tabelaUsuarios.setAutoResizeMode(tabelaUsuarios.AUTO_RESIZE_OFF);  
         tabelaUsuarios.getColumnModel().getColumn(0).setPreferredWidth(60);
         tabelaUsuarios.getColumnModel().getColumn(1).setPreferredWidth(220);
         tabelaUsuarios.getColumnModel().getColumn(2).setPreferredWidth(150);
         tabelaUsuarios.getColumnModel().getColumn(3).setPreferredWidth(150);
         
      for (BeansUsuarios c : listausuarios){
       Object[] obj = new Object[]{
           c.getUsu_codigo(),
           c.getUsu_nome(),
           c.getUsu_tipo(),
           c.getUsu_senha()
       };
       tabusuarios.addRow(obj);
       }  
   }
   
    
    public FrmUsuarios() {
        initComponents();
          preencheTabelaUsu();
            txtCodUsuario.setText("");
            txtUsuario.setText("");
            cmbTipoUsuario.setSelectedItem("");
            txtUsuario.setEnabled(false);
            cmbTipoUsuario.setEnabled(false);
            senhaUsuario.setEnabled(false);
            senhaUsuarioConfirma.setEnabled(false);
            btnAlterarUsuario.setEnabled(false);
            btnExcluirUsuario.setEnabled(false);
            btnSalvarUsuario.setEnabled(false);
            btnCancelarUsuario.setEnabled(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        senhaUsuario = new javax.swing.JPasswordField();
        senhaUsuarioConfirma = new javax.swing.JPasswordField();
        cmbTipoUsuario = new javax.swing.JComboBox<>();
        txtPesqUsuario = new javax.swing.JTextField();
        btnPesqUsuario = new javax.swing.JButton();
        btnNovoUsuario = new javax.swing.JButton();
        btnSalvarUsuario = new javax.swing.JButton();
        btnCancelarUsuario = new javax.swing.JButton();
        btnAlterarUsuario = new javax.swing.JButton();
        btnExcluirUsuario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtCodUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cdastro de Usuários");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Usuários");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(227, 11, 212, 22);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Tipo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Senha:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Usuário:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Confirma Senha:");

        senhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaUsuarioActionPerformed(evt);
            }
        });

        cmbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrador", "medico", "atendente" }));

        btnPesqUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPesqUsuario.setText("Pesquisar");
        btnPesqUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqUsuarioActionPerformed(evt);
            }
        });

        btnNovoUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNovoUsuario.setText("Novo");
        btnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioActionPerformed(evt);
            }
        });

        btnSalvarUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvarUsuario.setText("Salvar");
        btnSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUsuarioActionPerformed(evt);
            }
        });

        btnCancelarUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelarUsuario.setText("Cancelar");
        btnCancelarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarUsuarioActionPerformed(evt);
            }
        });

        btnAlterarUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAlterarUsuario.setText("Alterar");
        btnAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarUsuarioActionPerformed(evt);
            }
        });

        btnExcluirUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluirUsuario.setText("Excluir");
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nome do Usuário");

        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Usuário", "Tipo", "Senha"
            }
        ));
        tabelaUsuarios.setRowHeight(18);
        tabelaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsuarios);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Codigo:");

        txtCodUsuario.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(senhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(senhaUsuarioConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnAlterarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarUsuario))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesqUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesqUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCodUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaUsuarioConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(senhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesqUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesqUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(31, 41, 620, 440);

        setSize(new java.awt.Dimension(693, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUsuarioActionPerformed
        // TODO add your handling code here:
         if (txtUsuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor preencher campo Usuário");
            txtUsuario.requestFocus();
        }else if(senhaUsuario.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Favor preencher campo Senha");
            senhaUsuario.requestFocus();
        }else if(senhaUsuarioConfirma.getText().isEmpty()){
            senhaUsuarioConfirma.requestFocus();
         JOptionPane.showMessageDialog(null, "Favor Confirmar a Senha");  
        }else if(senhaUsuario.getText().equals(senhaUsuarioConfirma.getText())){
              if(flag == 1){
                 mod.setUsu_nome(txtUsuario.getText());
                 mod.setUsu_senha(senhaUsuario.getText());
                 mod.setUsu_tipo(cmbTipoUsuario.getSelectedItem().toString());
                 control.Salvar(mod);
                 txtCodUsuario.setText("");
                 txtUsuario.setText("");
                 senhaUsuario.setText("");
                 senhaUsuarioConfirma.setText(""); 
                 
                preencheTabelaUsu();
              }else if(flag == 2){
                 mod.setUsu_codigo(Integer.parseInt(txtCodUsuario.getText()));
                 mod.setUsu_nome(txtUsuario.getText());
                 mod.setUsu_senha(senhaUsuario.getText());
                 mod.setUsu_tipo(cmbTipoUsuario.getSelectedItem().toString());
                 control.Alterar(mod);
                 preencheTabelaUsu();
                 txtPesqUsuario.setEnabled(true);
                 txtCodUsuario.setText("");
                 txtUsuario.setText("");
                 senhaUsuario.setText("");
                 cmbTipoUsuario.setSelectedItem("");
                 senhaUsuarioConfirma.setEnabled(false);
                 senhaUsuarioConfirma.setText("");
                 txtUsuario.setEnabled(false);
                 cmbTipoUsuario.setEnabled(false);
                 senhaUsuario.setEnabled(false); 
                 btnSalvarUsuario.setEnabled(false);
                 btnAlterarUsuario.setEnabled(false);
                 btnExcluirUsuario.setEnabled(false);
                 btnPesqUsuario.setEnabled(true);
                 btnCancelarUsuario.setEnabled(false);
             } 
        }else{ 
             senhaUsuarioConfirma.requestFocus();  
             JOptionPane.showMessageDialog(null, "Senha diferente da confirmação");  
        }
    }//GEN-LAST:event_btnSalvarUsuarioActionPerformed
  
    
    
    private void btnPesqUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqUsuarioActionPerformed
       
          preencheTabelaUsu();
    
 
    }//GEN-LAST:event_btnPesqUsuarioActionPerformed

    
    private void senhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaUsuarioActionPerformed

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed
        // TODO add your handling code here:
            flag = 1;
            txtCodUsuario.setText("");
            senhaUsuario.setText("");
            txtUsuario.setText("");
            cmbTipoUsuario.setSelectedItem("");
            txtPesqUsuario.setText("");
            txtUsuario.setEnabled(true);
            cmbTipoUsuario.setEnabled(true);
            senhaUsuario.setEnabled(true);
            senhaUsuarioConfirma.setEnabled(true);
            txtPesqUsuario.setEnabled(false);
            btnPesqUsuario.setEnabled(false);
            btnAlterarUsuario.setEnabled(false);
            btnExcluirUsuario.setEnabled(false);
            btnSalvarUsuario.setEnabled(true);
            btnCancelarUsuario.setEnabled(true);
            btnNovoUsuario.setEnabled(false);
        
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

    private void btnCancelarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarUsuarioActionPerformed
        // TODO add your handling code here:
            txtCodUsuario.setText("");
            txtUsuario.setText("");
            cmbTipoUsuario.setSelectedItem("");
            txtUsuario.setEnabled(false);
            cmbTipoUsuario.setEnabled(false);
            senhaUsuario.setEnabled(false);
            senhaUsuarioConfirma.setEnabled(false);
            txtPesqUsuario.setEnabled(true);
            btnPesqUsuario.setEnabled(true);
            btnAlterarUsuario.setEnabled(false);
            btnExcluirUsuario.setEnabled(false);
            btnSalvarUsuario.setEnabled(false);
            btnCancelarUsuario.setEnabled(false);
            btnNovoUsuario.setEnabled(true);
        
        
    }//GEN-LAST:event_btnCancelarUsuarioActionPerformed

    private void tabelaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuariosMouseClicked
        // TODO add your handling code here:
        // PEGANDO DADOS DO MEDICO
        txtCodUsuario.setText(tabelaUsuarios.getValueAt(tabelaUsuarios.getSelectedRow(),0).toString());
        txtUsuario.setText(tabelaUsuarios.getValueAt(tabelaUsuarios.getSelectedRow(),1).toString());
        cmbTipoUsuario.setSelectedItem(tabelaUsuarios.getValueAt(tabelaUsuarios.getSelectedRow(),2).toString());
        senhaUsuario.setText(tabelaUsuarios.getValueAt(tabelaUsuarios.getSelectedRow(),3).toString());
        btnExcluirUsuario.setEnabled(true);
        btnAlterarUsuario.setEnabled(true);
        
        
    }//GEN-LAST:event_tabelaUsuariosMouseClicked

    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed
        // TODO add your handling code here:
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir Dados?");
        if (resposta == JOptionPane.YES_OPTION){
            mod.setUsu_codigo(Integer.parseInt(txtCodUsuario.getText()));
            control.Excluir(mod);
            txtCodUsuario.setText("");
            txtUsuario.setText("");
            senhaUsuario.setText("");
            senhaUsuarioConfirma.setText(""); 
            cmbTipoUsuario.setSelectedItem("");
            btnExcluirUsuario.setEnabled(false);
            btnAlterarUsuario.setEnabled(false);
           preencheTabelaUsu();
        
    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed
  }
    private void btnAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarUsuarioActionPerformed
        // TODO add your handling code here:
         flag = 2;
         txtPesqUsuario.setEnabled(false);
         txtUsuario.setEnabled(true);
         cmbTipoUsuario.setEnabled(true);
         senhaUsuario.setEnabled(true);
         senhaUsuario.setText("");
         senhaUsuarioConfirma.setEnabled(true);
         senhaUsuarioConfirma.setText("");
         btnSalvarUsuario.setEnabled(true);
         btnExcluirUsuario.setEnabled(false);
         btnAlterarUsuario.setEnabled(false);
         btnPesqUsuario.setEnabled(false);
         btnCancelarUsuario.setEnabled(true);
        
    }//GEN-LAST:event_btnAlterarUsuarioActionPerformed
  
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
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarUsuario;
    private javax.swing.JButton btnCancelarUsuario;
    private javax.swing.JButton btnExcluirUsuario;
    private javax.swing.JButton btnNovoUsuario;
    private javax.swing.JButton btnPesqUsuario;
    private javax.swing.JButton btnSalvarUsuario;
    private javax.swing.JComboBox<String> cmbTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField senhaUsuario;
    private javax.swing.JPasswordField senhaUsuarioConfirma;
    private javax.swing.JTable tabelaUsuarios;
    private javax.swing.JTextField txtCodUsuario;
    private javax.swing.JTextField txtPesqUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
