package visao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import beans.BeansAgenda;
import beans.BeansMedicos;
import beans.BeansPacientes;
import connection.ConexBD;
import modeloDAO.DaoAgenda;
import modeloDAO.DaoMedicos;
import modeloDAO.DaoPacientes;


public class FrmAgendamento extends javax.swing.JFrame {
    int flag = 1;   
    Connection conex = new ConexBD().Conecta();
       BeansPacientes modp = new BeansPacientes();
    
    
     
    
     public void preencheTabela(){
        DefaultTableModel tabList = new DefaultTableModel();
        modp.setPesquisa(TxtNomeAgPac.getText());
        DaoPacientes daopacientes = new DaoPacientes();
        List<BeansPacientes> listapacientes = daopacientes.Paciente(modp);
        DefaultTableModel tabagenda = (DefaultTableModel) tabelaAgenda.getModel();
        tabagenda.setNumRows(0);
         //  DEFINE A LARGURA DA COLUNA
         tabelaAgenda.setAutoResizeMode(tabelaAgenda.AUTO_RESIZE_OFF);  
         tabelaAgenda.getColumnModel().getColumn(0).setPreferredWidth(50);
         tabelaAgenda.getColumnModel().getColumn(1).setPreferredWidth(210);
         tabelaAgenda.getColumnModel().getColumn(2).setPreferredWidth(120);
         tabelaAgenda.getColumnModel().getColumn(3).setPreferredWidth(120);
         tabelaAgenda.getColumnModel().getColumn(4).setPreferredWidth(120);

 
      for (BeansPacientes c : listapacientes){
       Object[] obj = new Object[]{
           c.getCodpac(),
           c.getNomePac(),
           c.getDtNasPac(),
           c.getRgPac(),
           c.getTelPac(),
       };
       tabagenda.addRow(obj);
       }  
   }
   
    

    public FrmAgendamento() {
        initComponents();
         preencheTabela();
         preencherMedicos();
    }

    public void preencherMedicos(){
     
       List<String> medList = new ArrayList<String>();
       String sql = "SELECT * FROM medicos";

        try {
            PreparedStatement stmt = conex.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
            medList.add(rs.getString("nome_medico"));
            DefaultComboBoxModel medBox = new DefaultComboBoxModel(medList.toArray());
            cmbMedAg.setModel(medBox);
         }
           stmt.close();
           rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao preencher box" + ex.getMessage());
        }

     }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TxtNomeAgPac = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbAgTurn = new javax.swing.JComboBox<>();
        btnPesquisaAG = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAgenda = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cmbMedAg = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Dataagenda = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        btnSalvarAgenda = new javax.swing.JButton();
        btnCancelarAgenda = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCodPaciente = new javax.swing.JTextField();
        txtMotivoAgenda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendamento");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Paciente:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Turno:");

        cmbAgTurn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbAgTurn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primeiro", "Segundo", "Terceiro", " " }));
        cmbAgTurn.setEnabled(false);

        btnPesquisaAG.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPesquisaAG.setText("Pesquisar");
        btnPesquisaAG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaAGActionPerformed(evt);
            }
        });

        tabelaAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Dt.Nascto", "RG", "Telefone"
            }
        ));
        tabelaAgenda.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabelaAgenda.setRowHeight(18);
        tabelaAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAgendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAgenda);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Médico:");

        cmbMedAg.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Data:");

        Dataagenda.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Motivo:");

        btnSalvarAgenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvarAgenda.setText("Agendar");
        btnSalvarAgenda.setEnabled(false);
        btnSalvarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAgendaActionPerformed(evt);
            }
        });

        btnCancelarAgenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelarAgenda.setText("Cancelar");
        btnCancelarAgenda.setEnabled(false);
        btnCancelarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAgendaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Código");

        txtCodPaciente.setEnabled(false);

        txtMotivoAgenda.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMotivoAgenda, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbMedAg, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel5)
                                .addGap(28, 28, 28)
                                .addComponent(Dataagenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TxtNomeAgPac, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPesquisaAG)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbAgTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCodPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalvarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(112, 112, 112)
                                .addComponent(btnCancelarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)))
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNomeAgPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaAG)
                    .addComponent(jLabel3)
                    .addComponent(cmbAgTurn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cmbMedAg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(Dataagenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMotivoAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Agendamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(762, 552));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaAGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaAGActionPerformed
        // TODO add your handling code here:
           //mod.setPesquisa(TxtNomeAgPac.getText());
           preencheTabela();
    }//GEN-LAST:event_btnPesquisaAGActionPerformed

    private void tabelaAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAgendaMouseClicked
        // TODO add your handling code here:
        txtCodPaciente.setText(tabelaAgenda.getValueAt(tabelaAgenda.getSelectedRow(),0).toString());
        TxtNomeAgPac.setText(tabelaAgenda.getValueAt(tabelaAgenda.getSelectedRow(),1).toString());
        cmbMedAg.setEnabled(true);
        cmbAgTurn.setEnabled(true);
        txtMotivoAgenda.setEnabled(true);
        btnSalvarAgenda.setEnabled(true);
        btnCancelarAgenda.setEnabled(true);
        Dataagenda.setEnabled(true);
    }//GEN-LAST:event_tabelaAgendaMouseClicked

    private void btnSalvarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAgendaActionPerformed
        // TODO add your handling code here:
        
        BeansAgenda agenda = new BeansAgenda();
        DaoAgenda dao = new DaoAgenda();
        agenda.setNomemedico((String) cmbMedAg.getSelectedItem());
        agenda.setCodigopaciente(Integer.parseInt(txtCodPaciente.getText()));
        agenda.setTurmaagenda((String) cmbAgTurn.getSelectedItem());
        agenda.setData(Dataagenda.getDate());
        agenda.setMotivogenda(txtMotivoAgenda.getText());
        agenda.setStatusagenda("aberto");
        dao.Salvar(agenda);
        txtCodPaciente.setText("");
        TxtNomeAgPac.setText("");
        txtMotivoAgenda.setText("");
        Dataagenda.setDate(null);
        cmbMedAg.setEnabled(false);
        cmbAgTurn.setEnabled(false);
        txtMotivoAgenda.setEnabled(false);
        btnSalvarAgenda.setEnabled(false);
        btnCancelarAgenda.setEnabled(false);
        Dataagenda.setEnabled(false);
    
    }//GEN-LAST:event_btnSalvarAgendaActionPerformed

    private void btnCancelarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAgendaActionPerformed
        // TODO add your handling code here:
       txtCodPaciente.setText("");
        TxtNomeAgPac.setText("");
        txtMotivoAgenda.setText("");
        Dataagenda.setDate(null);
        cmbMedAg.setEnabled(false);
        cmbAgTurn.setEnabled(false);
        txtMotivoAgenda.setEnabled(false);
        btnSalvarAgenda.setEnabled(false);
        btnCancelarAgenda.setEnabled(false);
        Dataagenda.setEnabled(false);
    }//GEN-LAST:event_btnCancelarAgendaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        //</editor-fold>
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Dataagenda;
    private javax.swing.JTextField TxtNomeAgPac;
    private javax.swing.JButton btnCancelarAgenda;
    private javax.swing.JButton btnPesquisaAG;
    private javax.swing.JButton btnSalvarAgenda;
    private javax.swing.JComboBox<String> cmbAgTurn;
    private javax.swing.JComboBox<String> cmbMedAg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAgenda;
    private javax.swing.JTextField txtCodPaciente;
    private javax.swing.JTextField txtMotivoAgenda;
    // End of variables declaration//GEN-END:variables
}
