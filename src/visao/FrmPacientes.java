
package visao;

import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import beans.BeansPacientes;
import connection.ConexBD;
import modeloDAO.DaoPacientes;


public class FrmPacientes extends javax.swing.JFrame {
   int flag = 0;
    Connection conex = new ConexBD().Conecta();
    BeansPacientes mod = new BeansPacientes();
    DaoPacientes control = new DaoPacientes();
    
   
    
     public void preencheTabelaPac(){
          mod.setPesquisa(txtPesquisaPaciente.getText());
          DaoPacientes daopacientes = new DaoPacientes();
          List<BeansPacientes> listapacientes = daopacientes.Paciente(mod);
          DefaultTableModel tabpacientes = (DefaultTableModel) tabelaPaciente.getModel();
          tabpacientes.setNumRows(0);
           //  DEFINE A LARGURA DA COLUNA
         tabelaPaciente.setAutoResizeMode(tabelaPaciente.AUTO_RESIZE_OFF);  
         tabelaPaciente.getColumnModel().getColumn(0).setPreferredWidth(60);
         tabelaPaciente.getColumnModel().getColumn(1).setPreferredWidth(220);
         tabelaPaciente.getColumnModel().getColumn(2).setPreferredWidth(125);
         tabelaPaciente.getColumnModel().getColumn(3).setPreferredWidth(125);
         tabelaPaciente.getColumnModel().getColumn(4).setPreferredWidth(130);
         for (BeansPacientes c : listapacientes){
           Object[] obj = new Object[]{
            c.getCodpac(),
            c.getNomePac(),
            c.getDtNasPac(),
            c.getRgPac(),
            c.getTelPac(),
     
        };
         tabpacientes.addRow(obj);
      }  
   }
   
   
   
    public FrmPacientes() {
        initComponents();
        txtPesquisaPaciente.requestFocus();
        txtNomePaciente.setEnabled(false);
        txtNasctoPaciente.setEnabled(false);
        txtRgPaciente.setEnabled(false);
        txtTelefonePaciente.setEnabled(false);
        txtCepPaciente.setEnabled(false);
        txtRuaPaciente.setEnabled(false);
        txtNumPaciente.setEnabled(false);
        txtCompPaciente.setEnabled(false);
        txtBairroPaciente.setEnabled(false);
        txtCidadePaciente.setEnabled(false);
        txtUfPaciente.setEnabled(false);
        btnCancelarPaciente.setEnabled(false);
        btnSalvarPaciente.setEnabled(false);
        btnAlterarPaciente.setEnabled(false);
        btnExcluirPaciente.setEnabled(false);
        btnPesquisaCepPaciente.setEnabled(false);
        
        preencheTabelaPac();
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNomePaciente = new javax.swing.JTextField();
        txtRgPaciente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPaciente = new javax.swing.JTable();
        btnNovoPaciente = new javax.swing.JButton();
        btnCancelarPaciente = new javax.swing.JButton();
        btnSalvarPaciente = new javax.swing.JButton();
        btnAlterarPaciente = new javax.swing.JButton();
        btnExcluirPaciente = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtPesquisaPaciente = new javax.swing.JTextField();
        btnPesquisarPaciente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnPesquisaCepPaciente = new javax.swing.JButton();
        jlabel = new javax.swing.JLabel();
        txtRuaPaciente = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNumPaciente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCompPaciente = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtBairroPaciente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCidadePaciente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUfPaciente = new javax.swing.JTextField();
        txtCepPaciente = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCodPaciente = new javax.swing.JTextField();
        txtNasctoPaciente = new javax.swing.JFormattedTextField();
        txtTelefonePaciente = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pacientes");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Pacientes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 0, 233, 31);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Dt.Nascto:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Rg:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Telefone:");

        tabelaPaciente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Dt.Nascto.", "Rg", "Tel."
            }
        ));
        tabelaPaciente.setRowHeight(20);
        tabelaPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPaciente);

        btnNovoPaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNovoPaciente.setText("Novo");
        btnNovoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPacienteActionPerformed(evt);
            }
        });

        btnCancelarPaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelarPaciente.setText("Cancelar");
        btnCancelarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPacienteActionPerformed(evt);
            }
        });

        btnSalvarPaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvarPaciente.setText("Salvar");
        btnSalvarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPacienteActionPerformed(evt);
            }
        });

        btnAlterarPaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAlterarPaciente.setText("Alterar");
        btnAlterarPaciente.setPreferredSize(new java.awt.Dimension(80, 23));
        btnAlterarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarPacienteActionPerformed(evt);
            }
        });

        btnExcluirPaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluirPaciente.setText("Excluir");
        btnExcluirPaciente.setMaximumSize(new java.awt.Dimension(92, 33));
        btnExcluirPaciente.setMinimumSize(new java.awt.Dimension(92, 33));
        btnExcluirPaciente.setPreferredSize(new java.awt.Dimension(92, 33));
        btnExcluirPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPacienteActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Por Nome:");

        btnPesquisarPaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPesquisarPaciente.setText("Pesquisar");
        btnPesquisarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarPacienteActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Cep:");

        btnPesquisaCepPaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPesquisaCepPaciente.setForeground(new java.awt.Color(255, 0, 51));
        btnPesquisaCepPaciente.setText("pesquisar CEP");
        btnPesquisaCepPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaCepPacienteActionPerformed(evt);
            }
        });

        jlabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlabel.setText("Rua:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Numero:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Complemento:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Bairro:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Cidade:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("UF:");

        try {
            txtCepPaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtCepPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnPesquisaCepPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtRuaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCompPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel17)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtCidadePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBairroPaciente)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtUfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnPesquisaCepPaciente)
                    .addComponent(txtCepPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel)
                    .addComponent(txtRuaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtNumPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtCompPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtBairroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCidadePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtUfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Codigo:");

        txtCodPaciente.setEnabled(false);

        try {
            txtNasctoPaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefonePaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(593, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNasctoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRgPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefonePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNovoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btnCancelarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(btnSalvarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(btnAlterarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnExcluirPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCodPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNasctoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRgPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefonePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPesquisaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 40, 730, 510);

        setSize(new java.awt.Dimension(802, 606));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaCepPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaCepPacienteActionPerformed
        // TODO add your handling code here:
         ViaCEP viacep = new ViaCEP();
        try {
            viacep.buscar(txtCepPaciente.getText());
            txtRuaPaciente.setText(viacep.getLogradouro());
            txtBairroPaciente.setText(viacep.getBairro());
            txtCompPaciente.setText(viacep.getComplemento());
            txtCidadePaciente.setText(viacep.getLocalidade());
            txtUfPaciente.setText(viacep.getUf());
            
        } catch (ViaCEPException ex) {
            //Logger.getLogger(FrmPacientes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Atençâo - " + ex.getMessage());
        }
        
        
    }//GEN-LAST:event_btnPesquisaCepPacienteActionPerformed

    private void btnSalvarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPacienteActionPerformed
        // TODO add your handling code here:
         
        if (flag == 1) {
            mod.setNomePac(txtNomePaciente.getText());
            mod.setDtNasPac(txtNasctoPaciente.getText());
            mod.setRgPac(txtRgPaciente.getText());
            mod.setTelPac(txtTelefonePaciente.getText());
            mod.setCepPac(txtCepPaciente.getText());
            mod.setRuaPac(txtRuaPaciente.getText());
            mod.setNumRuaPac(Integer.parseInt(txtNumPaciente.getText()));
            mod.setComplPac(txtCompPaciente.getText());
            mod.setBairroPac(txtBairroPaciente.getText());
            mod.setCidPaciente(txtCidadePaciente.getText());
            mod.setUfPaciente(txtUfPaciente.getText());
            control.Salvar(mod);
            preencheTabelaPac();
            tabelaPaciente.setEnabled(true);
 
            
        }else if (flag == 2) {
                 mod.setCodpac(Integer.parseInt(txtCodPaciente.getText()));
                 mod.setNomePac(txtNomePaciente.getText());
                 mod.setDtNasPac(txtNasctoPaciente.getText());
                 mod.setRgPac(txtRgPaciente.getText());
                 mod.setTelPac(txtTelefonePaciente.getText());
                 mod.setRuaPac(txtRuaPaciente.getText());
                 mod.setNumRuaPac(Integer.parseInt(txtNumPaciente.getText()));
                 mod.setComplPac(txtCompPaciente.getText());
                 mod.setBairroPac(txtBairroPaciente.getText());
                 mod.setCidPaciente(txtCidadePaciente.getText());
                 mod.setCepPac(txtCepPaciente.getText());
                 mod.setUfPaciente(txtUfPaciente.getText());
                 control.Alterar(mod);
                preencheTabelaPac();
                tabelaPaciente.setEnabled(true);
       
        }
        txtPesquisaPaciente.requestFocus();
        txtPesquisaPaciente.setEnabled(true);
        btnPesquisarPaciente.setEnabled(true);
        txtNomePaciente.setEnabled(false);
        txtNasctoPaciente.setEnabled(false);
        txtRgPaciente.setEnabled(false);
        txtTelefonePaciente.setEnabled(false);
        txtCepPaciente.setEnabled(false);
        txtRuaPaciente.setEnabled(false);
        txtNumPaciente.setEnabled(false);
        txtCompPaciente.setEnabled(false);
        txtBairroPaciente.setEnabled(false);
        txtCidadePaciente.setEnabled(false);
        txtUfPaciente.setEnabled(false);
        btnCancelarPaciente.setEnabled(false);
        btnSalvarPaciente.setEnabled(false);
        btnAlterarPaciente.setEnabled(false);
        btnExcluirPaciente.setEnabled(false);
        btnPesquisaCepPaciente.setEnabled(false);
        txtNomePaciente.setText("");
        txtNasctoPaciente.setText("");
        txtRgPaciente.setText("");
        txtTelefonePaciente.setText("");
        txtCepPaciente.setText("");
        txtRuaPaciente.setText("");
        txtNumPaciente.setText("");
        txtCompPaciente.setText("");
        txtBairroPaciente.setText("");
        txtCidadePaciente.setText("");
        txtUfPaciente.setText("");
        txtPesquisaPaciente.setText("");

        
    }//GEN-LAST:event_btnSalvarPacienteActionPerformed

    private void btnNovoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPacienteActionPerformed
        // TODO add your handling code here:
         flag = 1;
        txtNomePaciente.setEnabled(true);
        txtNasctoPaciente.setEnabled(true);
        txtRgPaciente.setEnabled(true);
        txtTelefonePaciente.setEnabled(true);
        txtCepPaciente.setEnabled(true);
        txtRuaPaciente.setEnabled(true);
        txtNumPaciente.setEnabled(true);
        txtCompPaciente.setEnabled(true);
        txtBairroPaciente.setEnabled(true);
        txtCidadePaciente.setEnabled(true);
        txtUfPaciente.setEnabled(true);
        btnCancelarPaciente.setEnabled(true);
        btnSalvarPaciente.setEnabled(true);
        btnPesquisaCepPaciente.setEnabled(true);
        txtPesquisaPaciente.setEnabled(false);
        btnPesquisarPaciente.setEnabled(false);
        txtCodPaciente.setText("");
        txtNomePaciente.setText("");
        txtNasctoPaciente.setText("");
        txtRgPaciente.setText("");
        txtTelefonePaciente.setText("");
        txtCepPaciente.setText("");
        txtRuaPaciente.setText("");
        txtNumPaciente.setText("");
        txtCompPaciente.setText("");
        txtBairroPaciente.setText("");
        txtCidadePaciente.setText("");
        txtUfPaciente.setText("");
        txtPesquisaPaciente.setText("");
        txtNomePaciente.requestFocus();
        tabelaPaciente.setEnabled(false);
        
    }//GEN-LAST:event_btnNovoPacienteActionPerformed

    private void tabelaPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPacienteMouseClicked
           // PEGANDO DADOS NO BANCO BASEADO NO CODIGO DA TABELA
         btnAlterarPaciente.setEnabled(true);
         btnExcluirPaciente.setEnabled(true);
         btnCancelarPaciente.setEnabled(true);
         btnNovoPaciente.setEnabled(false);
          String nomepac = ""+(tabelaPaciente.getValueAt(tabelaPaciente.getSelectedRow(),0));
           mod.setPesquisa(nomepac);
          String sql = "SELECT * FROM pacientes where cod_paciente = ? ORDER BY nome_paciente";
       try {
            PreparedStatement stmt = conex.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1, mod.getPesquisa());
            ResultSet rs = stmt.executeQuery();
            rs.first();
            txtCodPaciente.setText(Integer.toString(rs.getInt("cod_paciente")));
            txtNomePaciente.setText(rs.getString("nome_paciente"));
            txtNasctoPaciente.setText(rs.getString("dt_nasc_paciente"));
            txtRgPaciente.setText(rs.getString("rg_paciente"));
            txtTelefonePaciente.setText(rs.getString("tel_paciente"));
            txtRuaPaciente.setText(rs.getString("rua_paciente"));
            txtNumPaciente.setText(rs.getString("num_rua_paciente"));
            txtCompPaciente.setText(rs.getString("c_rua_paciente"));
            txtBairroPaciente.setText(rs.getString("bairro_paciente"));
            txtCidadePaciente.setText(rs.getString("cidade_paciente"));
            txtCepPaciente.setText(rs.getString("cep_paciente"));
            txtUfPaciente.setText(rs.getString("uf_paciente"));
            rs.close();
            stmt.close();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "erro ao buscar dados" + ex.getMessage());
       }
  
    }//GEN-LAST:event_tabelaPacienteMouseClicked

    private void btnPesquisarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarPacienteActionPerformed
        // TODO add your handling code here:
            preencheTabelaPac();
        
    }//GEN-LAST:event_btnPesquisarPacienteActionPerformed

    private void btnAlterarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarPacienteActionPerformed
        // TODO add your handling code here:
        flag = 2;
        tabelaPaciente.setEnabled(false);
        txtNomePaciente.setEnabled(true);
        txtNasctoPaciente.setEnabled(true);
        txtRgPaciente.setEnabled(true);
        txtTelefonePaciente.setEnabled(true);
        txtCepPaciente.setEnabled(true);
        txtRuaPaciente.setEnabled(true);
        txtNumPaciente.setEnabled(true);
        txtCompPaciente.setEnabled(true);
        txtBairroPaciente.setEnabled(true);
        txtCidadePaciente.setEnabled(true);
        txtUfPaciente.setEnabled(true);
        btnCancelarPaciente.setEnabled(true);
        btnSalvarPaciente.setEnabled(true);
        btnNovoPaciente.setEnabled(false);
        btnExcluirPaciente.setEnabled(false);
    }//GEN-LAST:event_btnAlterarPacienteActionPerformed

    private void btnExcluirPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPacienteActionPerformed
        // TODO add your handling code here:
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir Dados?");
        if (resposta == JOptionPane.YES_OPTION){
            mod.setCodpac(Integer.parseInt(txtCodPaciente.getText()));
            control.Excluir(mod);
            btnAlterarPaciente.setEnabled(false);
            btnExcluirPaciente.setEnabled(false);
            btnNovoPaciente.setEnabled(true);
           preencheTabelaPac();
        
    }//GEN-LAST:event_btnExcluirPacienteActionPerformed
   }
    private void btnCancelarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPacienteActionPerformed
        // TODO add your handling code here:
        tabelaPaciente.setEnabled(true);
        txtPesquisaPaciente.requestFocus();
        txtPesquisaPaciente.setEnabled(true);
        btnPesquisarPaciente.setEnabled(true);
        txtNomePaciente.setEnabled(false);
        txtNasctoPaciente.setEnabled(false);
        txtRgPaciente.setEnabled(false);
        txtTelefonePaciente.setEnabled(false);
        txtCepPaciente.setEnabled(false);
        txtRuaPaciente.setEnabled(false);
        txtNumPaciente.setEnabled(false);
        txtCompPaciente.setEnabled(false);
        txtBairroPaciente.setEnabled(false);
        txtCidadePaciente.setEnabled(false);
        txtUfPaciente.setEnabled(false);
        btnCancelarPaciente.setEnabled(false);
        btnSalvarPaciente.setEnabled(false);
        btnAlterarPaciente.setEnabled(false);
        btnExcluirPaciente.setEnabled(false);
        btnPesquisaCepPaciente.setEnabled(false);
        btnNovoPaciente.setEnabled(true);
        txtCodPaciente.setText("");
        txtNomePaciente.setText("");
        txtNasctoPaciente.setText("");
        txtRgPaciente.setText("");
        txtTelefonePaciente.setText("");
        txtCepPaciente.setText("");
        txtRuaPaciente.setText("");
        txtNumPaciente.setText("");
        txtCompPaciente.setText("");
        txtBairroPaciente.setText("");
        txtCidadePaciente.setText("");
        txtUfPaciente.setText("");
        txtPesquisaPaciente.setText("");
        
    }//GEN-LAST:event_btnCancelarPacienteActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrmPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarPaciente;
    private javax.swing.JButton btnCancelarPaciente;
    private javax.swing.JButton btnExcluirPaciente;
    private javax.swing.JButton btnNovoPaciente;
    private javax.swing.JButton btnPesquisaCepPaciente;
    private javax.swing.JButton btnPesquisarPaciente;
    private javax.swing.JButton btnSalvarPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JTable tabelaPaciente;
    private javax.swing.JTextField txtBairroPaciente;
    private javax.swing.JFormattedTextField txtCepPaciente;
    private javax.swing.JTextField txtCidadePaciente;
    private javax.swing.JTextField txtCodPaciente;
    private javax.swing.JTextField txtCompPaciente;
    private javax.swing.JFormattedTextField txtNasctoPaciente;
    private javax.swing.JTextField txtNomePaciente;
    private javax.swing.JTextField txtNumPaciente;
    private javax.swing.JTextField txtPesquisaPaciente;
    private javax.swing.JTextField txtRgPaciente;
    private javax.swing.JTextField txtRuaPaciente;
    private javax.swing.JFormattedTextField txtTelefonePaciente;
    private javax.swing.JTextField txtUfPaciente;
    // End of variables declaration//GEN-END:variables
}
