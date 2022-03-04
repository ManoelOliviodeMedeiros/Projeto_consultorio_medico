
package visao;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modeloDAO.DaoMedicos;
import beans.BeansMedicos;


public class FrmMedicos extends javax.swing.JFrame {
      
      BeansMedicos mod = new BeansMedicos();
      DaoMedicos control = new DaoMedicos();
      DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
      DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
      DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
      int flag = 0;
      
        public void preencheTabelaMed(){
        mod.setPesquisa(txtMedPesquisa.getText());    
        DaoMedicos daoMedico = new DaoMedicos();
        List<BeansMedicos> listaMedicos = daoMedico.getMedico(mod);
        DefaultTableModel tabMedicos = (DefaultTableModel) tabelaMedicos.getModel();
        tabMedicos.setNumRows(0);
          //  DEFINE A LARGURA DA COLUNA
         tabelaMedicos.setAutoResizeMode(tabelaMedicos.AUTO_RESIZE_OFF);  
         tabelaMedicos.getColumnModel().getColumn(0).setPreferredWidth(60);
         tabelaMedicos.getColumnModel().getColumn(0).setCellRenderer(centralizado);
         tabelaMedicos.getColumnModel().getColumn(1).setPreferredWidth(230);
         tabelaMedicos.getColumnModel().getColumn(2).setPreferredWidth(160);
         tabelaMedicos.getColumnModel().getColumn(3).setPreferredWidth(95);
         tabelaMedicos.getColumnModel().getColumn(3).setCellRenderer(centralizado);
         esquerda.setHorizontalAlignment(SwingConstants.LEFT);
         centralizado.setHorizontalAlignment(SwingConstants.CENTER);
         direita.setHorizontalAlignment(SwingConstants.RIGHT);
         
        // tabelaMedicos.getColumnModel().getColumn(4).setCellRenderer(direita);
       for (BeansMedicos c : listaMedicos){
       Object[] obj = new Object[]{
           c.getCodigo(),
           c.getNome(),
           c.getEspecialidade(),
           c.getCrm()
       };
       tabMedicos.addRow(obj);
       }  
   }
    
        
    public FrmMedicos() {
        initComponents();
        preencheTabelaMed();
        txtCadMedicos.setEnabled(false);
        cmbCadEspecialidade.setEnabled(false);
        txtCadCrm.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnCancelar.setEnabled(false);
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCadCrm = new javax.swing.JTextField();
        txtCadMedicos = new javax.swing.JTextField();
        cmbCadEspecialidade = new javax.swing.JComboBox<>();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMedicos = new javax.swing.JTable();
        txtMedPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoMedico = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Médicos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 230, 50, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Especialidade:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(420, 60, 88, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Código:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 30, 50, 15);

        txtCadCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadCrmActionPerformed(evt);
            }
        });
        txtCadCrm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCadCrmKeyPressed(evt);
            }
        });
        jPanel1.add(txtCadCrm);
        txtCadCrm.setBounds(70, 120, 51, 30);

        txtCadMedicos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCadMedicosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCadMedicosKeyReleased(evt);
            }
        });
        jPanel1.add(txtCadMedicos);
        txtCadMedicos.setBounds(70, 70, 310, 30);

        cmbCadEspecialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ginecologista", "Alergista", "Pediatria", "Endocrinologista", "Dermatologista" }));
        cmbCadEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCadEspecialidadeActionPerformed(evt);
            }
        });
        cmbCadEspecialidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbCadEspecialidadeKeyPressed(evt);
            }
        });
        jPanel1.add(cmbCadEspecialidade);
        cmbCadEspecialidade.setBounds(520, 60, 120, 30);

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir);
        btnExcluir.setBounds(520, 170, 90, 30);

        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        btnNovo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnNovoKeyPressed(evt);
            }
        });
        jPanel1.add(btnNovo);
        btnNovo.setBounds(40, 170, 90, 30);

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar);
        btnSalvar.setBounds(280, 170, 90, 30);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar);
        btnCancelar.setBounds(160, 170, 90, 30);

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar);
        btnEditar.setBounds(400, 170, 90, 30);

        tabelaMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome do Medico", "Especialidade", "Crm"
            }
        ));
        tabelaMedicos.setRowHeight(18);
        tabelaMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMedicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaMedicos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 270, 570, 90);
        jPanel1.add(txtMedPesquisa);
        txtMedPesquisa.setBounds(80, 220, 410, 30);

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar);
        btnPesquisar.setBounds(500, 220, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nome:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 80, 55, 15);

        txtCodigoMedico.setEnabled(false);
        jPanel1.add(txtCodigoMedico);
        txtCodigoMedico.setBounds(70, 20, 51, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Crm:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 130, 28, 15);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 40, 670, 380);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Médicos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 10, 190, 22);

        setSize(new java.awt.Dimension(727, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
            
        if (txtCadMedicos.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor preencher campo Médico");
            txtCadMedicos.requestFocus();
        }else if(txtCadCrm.getText().isEmpty()){
          JOptionPane.showMessageDialog(null, "Favor preencher campo Crm");
          txtCadCrm.requestFocus();
        }else 
        if (flag == 1) {
            mod.setNome(txtCadMedicos.getText());
            mod.setEspecialidade((String) cmbCadEspecialidade.getSelectedItem());
            mod.setCrm(Integer.parseInt(txtCadCrm.getText()));
            control.Salvar(mod);
            txtCodigoMedico.setText("");
            txtCadMedicos.setText("");
            txtCadCrm.setText("");
            btnSalvar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnNovo.setEnabled(false);
             preencheTabelaMed(); 
        }else if (flag == 2) {
            mod.setCodigo(Integer.parseInt(txtCodigoMedico.getText()));
            mod.setNome(txtCadMedicos.getText());
            mod.setEspecialidade((String) cmbCadEspecialidade.getSelectedItem());
            mod.setCrm(Integer.parseInt(txtCadCrm.getText()));
            control.Alterar(mod);
             preencheTabelaMed();      
            txtCodigoMedico.setText("");
            txtCadMedicos.setText("");
            txtCadCrm.setText("");
            txtMedPesquisa.setEnabled(true);
            txtCadMedicos.setEnabled(false);
            txtCadCrm.setEnabled(false);
            btnSalvar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnPesquisar.setEnabled(true);
          
        }
   
    }//GEN-LAST:event_btnSalvarActionPerformed

    
    
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // PESQUISAR MÉDICOS
       // mod.setPesquisa(txtMedPesquisa.getText());    
         preencheTabelaMed();
        txtMedPesquisa.setText("");
        
            
        
    }//GEN-LAST:event_btnPesquisarActionPerformed
 
    private void cmbCadEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCadEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCadEspecialidadeActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        flag = 2;
        txtMedPesquisa.setEnabled(false);
        txtCadMedicos.setEnabled(true);
        cmbCadEspecialidade.setEnabled(true);
        txtCadCrm.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnExcluir.setEnabled(false);
        btnEditar.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtCadCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadCrmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadCrmActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        flag = 1;
        txtCodigoMedico.setText("");
        txtCadMedicos.setText("");
        cmbCadEspecialidade.setSelectedItem("");
        txtCadCrm.setText("");
        txtMedPesquisa.setText("");
        txtCadMedicos.setEnabled(true);
        cmbCadEspecialidade.setEnabled(true);
        txtCadCrm.setEnabled(true);
        txtMedPesquisa.setEnabled(false);
        btnPesquisar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnNovo.setEnabled(false);
        txtCadMedicos.requestFocus();
        
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        txtCodigoMedico.setText("");
        txtCadMedicos.setText("");
        cmbCadEspecialidade.setSelectedItem("");
        txtCadCrm.setText("");
        txtCadMedicos.setEnabled(false);
        txtMedPesquisa.setEnabled(true);
        btnPesquisar.setEnabled(true);
        txtCadCrm.setEnabled(false);      
        btnSalvar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnNovo.setEnabled(true);
        btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir Dados?");
        if (resposta == JOptionPane.YES_OPTION){
          
            mod.setCodigo(Integer.parseInt(txtCodigoMedico.getText()));
            control.Excluir(mod);
            txtCodigoMedico.setText("");
            txtCadMedicos.setText("");
            cmbCadEspecialidade.setSelectedItem("");
            txtCadCrm.setText("");
            txtCadMedicos.setEnabled(false);
            txtCadCrm.setEnabled(false);
            btnSalvar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnNovo.setEnabled(true);
              preencheTabelaMed();     
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabelaMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMedicosMouseClicked
        // TODO add your handling code here:
        
        // PEGANDO DADOS DO MEDICO
        txtCodigoMedico.setText(tabelaMedicos.getValueAt(tabelaMedicos.getSelectedRow(),0).toString());
        txtCadMedicos.setText(tabelaMedicos.getValueAt(tabelaMedicos.getSelectedRow(),1).toString());
        cmbCadEspecialidade.setSelectedItem(tabelaMedicos.getValueAt(tabelaMedicos.getSelectedRow(),2).toString());
        txtCadCrm.setText(tabelaMedicos.getValueAt(tabelaMedicos.getSelectedRow(),3).toString());
        txtCadMedicos.setEnabled(false);
        txtCadCrm.setEnabled(false);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnSalvar.setEnabled(false);
        
        
    }//GEN-LAST:event_tabelaMedicosMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
      txtMedPesquisa.requestFocus();
        
    }//GEN-LAST:event_formWindowActivated

    private void txtCadMedicosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCadMedicosKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10)
            cmbCadEspecialidade.requestFocus();
    }//GEN-LAST:event_txtCadMedicosKeyPressed

    private void cmbCadEspecialidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbCadEspecialidadeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10)
            txtCadCrm.requestFocus();
    }//GEN-LAST:event_cmbCadEspecialidadeKeyPressed

    private void btnNovoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNovoKeyPressed
        // TODO add your handling code here:
       
          
    }//GEN-LAST:event_btnNovoKeyPressed

    private void txtCadCrmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCadCrmKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 10)
            btnSalvar.requestFocus();
    }//GEN-LAST:event_txtCadCrmKeyPressed

    private void txtCadMedicosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCadMedicosKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtCadMedicosKeyReleased

 
    
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
            java.util.logging.Logger.getLogger(FrmMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMedicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCadEspecialidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaMedicos;
    private javax.swing.JTextField txtCadCrm;
    private javax.swing.JTextField txtCadMedicos;
    private javax.swing.JTextField txtCodigoMedico;
    private javax.swing.JTextField txtMedPesquisa;
    // End of variables declaration//GEN-END:variables

//    private void preencheTabela(FrmMedicos med) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
}
