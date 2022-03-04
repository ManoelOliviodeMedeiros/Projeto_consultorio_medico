
package visao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import beans.BeansUsuarios;
import beans.Hora;
import connection.ConexBD;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class FrmPrincipal extends javax.swing.JFrame {
    Connection conex = new ConexBD().Conecta();
   FrmUsuarios Telausu = new FrmUsuarios(); 
   FrmMedicos Telamed = new FrmMedicos();
   FrmPacientes telaPac = new FrmPacientes();
   FrmAgendamento telaagen = new FrmAgendamento();
   
   Calendar data = Calendar.getInstance();
   Date dt = data.getTime();
   SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
   String dthoje;
  
   
   
    public FrmPrincipal(){ 
        initComponents();
        
            
        dthoje = formato.format(dt);
        lblData.setText(dthoje);
              
       // exibe a hora atual
         timer1.start();
         
       //exibe imagem do icone do status do banco se esta conextado
         if (conex != null){
           imagemIcon();  
         }else{
         imagemIcon1();
         }
    }    
    
     public void imagemIcon(){
     ImageIcon img = new ImageIcon(getClass().getResource("bd30.png"));
     lblBD.setIcon(img);
 }
     public void imagemIcon1(){
     ImageIcon img = new ImageIcon(getClass().getResource("bde30.png"));
     lblBD.setIcon(img);
 }
       
  
  
   public void exportausuario(BeansUsuarios usu){
        lblUsuario.setText(usu.getUsu_nome());
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        internalFrame = new javax.swing.JInternalFrame();
        PanelInterno = new javax.swing.JPanel();
        btnCadMedcico = new javax.swing.JButton();
        jLabelmedico = new javax.swing.JLabel();
        btnAtendente = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        jLabelAtendentes = new javax.swing.JLabel();
        btnPacientes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelagenda = new javax.swing.JLabel();
        jLabelPainelInterno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnInternoFechar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblBD = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuItemCadMedicos = new javax.swing.JMenuItem();
        menuItemCadPacientes = new javax.swing.JMenuItem();
        menuItemCadAtendentes = new javax.swing.JMenuItem();
        menuItemCadUsuarios = new javax.swing.JMenuItem();
        menuRelPrincipal = new javax.swing.JMenu();
        jMenuItemRelPacientes = new javax.swing.JMenuItem();
        jMenuItemConsultasRealizadas = new javax.swing.JMenuItem();
        menuFerramentas = new javax.swing.JMenu();
        mItemFerrBemVindo = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        mSair = new javax.swing.JMenuItem();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        internalFrame.setTitle("Bem-vindo");
        internalFrame.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        internalFrame.setVisible(true);
        internalFrame.getContentPane().setLayout(null);

        PanelInterno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelInterno.setLayout(null);

        btnCadMedcico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgmedico60.png"))); // NOI18N
        btnCadMedcico.setToolTipText("Médicos");
        btnCadMedcico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadMedcicoActionPerformed(evt);
            }
        });
        PanelInterno.add(btnCadMedcico);
        btnCadMedcico.setBounds(20, 60, 100, 80);

        jLabelmedico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelmedico.setText("Medicos");
        PanelInterno.add(jLabelmedico);
        jLabelmedico.setBounds(50, 40, 50, 17);

        btnAtendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgAtendentes130.png"))); // NOI18N
        btnAtendente.setToolTipText("Atendentes");
        btnAtendente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelInterno.add(btnAtendente);
        btnAtendente.setBounds(150, 60, 90, 80);

        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgAgenda70.png"))); // NOI18N
        btnAgenda.setToolTipText("Agenda");
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });
        PanelInterno.add(btnAgenda);
        btnAgenda.setBounds(390, 60, 90, 80);

        jLabelAtendentes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAtendentes.setText("Atendentes");
        PanelInterno.add(jLabelAtendentes);
        jLabelAtendentes.setBounds(160, 40, 70, 14);

        btnPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgPacientes70.png"))); // NOI18N
        btnPacientes.setToolTipText("Pacientes");
        btnPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientesActionPerformed(evt);
            }
        });
        PanelInterno.add(btnPacientes);
        btnPacientes.setBounds(270, 60, 90, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Pacientes");
        PanelInterno.add(jLabel2);
        jLabel2.setBounds(280, 40, 70, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Cadsatros");
        PanelInterno.add(jLabel3);
        jLabel3.setBounds(10, 0, 100, 20);

        jLabelagenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelagenda.setText("Agenda Consulta");
        PanelInterno.add(jLabelagenda);
        jLabelagenda.setBounds(380, 40, 120, 14);

        jLabelPainelInterno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imgPainelInterno800.png"))); // NOI18N
        jLabelPainelInterno.setText(" ");
        PanelInterno.add(jLabelPainelInterno);
        jLabelPainelInterno.setBounds(0, 0, 750, 270);

        internalFrame.getContentPane().add(PanelInterno);
        PanelInterno.setBounds(0, 40, 740, 260);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Sistema de Gerenciamnto:");
        internalFrame.getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 250, 22);

        btnInternoFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imginternalFechar30.png"))); // NOI18N
        btnInternoFechar.setToolTipText("Fechar Tela Bem-Vindo");
        btnInternoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInternoFecharActionPerformed(evt);
            }
        });
        internalFrame.getContentPane().add(btnInternoFechar);
        btnInternoFechar.setBounds(690, 0, 50, 40);

        getContentPane().add(internalFrame);
        internalFrame.setBounds(0, 90, 760, 330);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Usuário:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 430, 50, 20);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(70, 430, 110, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Data:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 430, 34, 15);

        lblData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblData.setForeground(new java.awt.Color(0, 0, 255));
        lblData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblData.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblData);
        lblData.setBounds(240, 430, 80, 20);

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHora.setForeground(new java.awt.Color(0, 0, 204));
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblHora);
        lblHora.setBounds(420, 430, 70, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Hora Atual:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(340, 430, 80, 15);

        lblBD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblBD);
        lblBD.setBounds(730, 424, 30, 40);

        menuCadastro.setText("Cadastro");
        menuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroActionPerformed(evt);
            }
        });

        menuItemCadMedicos.setText("Médicos");
        menuItemCadMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadMedicosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCadMedicos);

        menuItemCadPacientes.setText("Pacientes");
        menuItemCadPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadPacientesActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCadPacientes);

        menuItemCadAtendentes.setText("Atendentes");
        menuCadastro.add(menuItemCadAtendentes);

        menuItemCadUsuarios.setText("Usuários");
        menuItemCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadUsuariosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuItemCadUsuarios);

        jMenuBar1.add(menuCadastro);

        menuRelPrincipal.setText("Relatórios");
        menuRelPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelPrincipalActionPerformed(evt);
            }
        });

        jMenuItemRelPacientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemRelPacientes.setText("Pacientes");
        jMenuItemRelPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelPacientesActionPerformed(evt);
            }
        });
        menuRelPrincipal.add(jMenuItemRelPacientes);

        jMenuItemConsultasRealizadas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemConsultasRealizadas.setText("Consultas Realizadas");
        jMenuItemConsultasRealizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultasRealizadasActionPerformed(evt);
            }
        });
        menuRelPrincipal.add(jMenuItemConsultasRealizadas);

        jMenuBar1.add(menuRelPrincipal);

        menuFerramentas.setText("Ferramentas");
        menuFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFerramentasActionPerformed(evt);
            }
        });

        mItemFerrBemVindo.setText("Tela Bem-vindo");
        mItemFerrBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemFerrBemVindoActionPerformed(evt);
            }
        });
        menuFerramentas.add(mItemFerrBemVindo);

        jMenuBar1.add(menuFerramentas);

        jMenu1.setText("Agenda");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Agendar Consulta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Agendamento");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Agenda Médica");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        menuSair.setText("Sair");

        mSair.setText("Sair");
        mSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSairActionPerformed(evt);
            }
        });
        menuSair.add(mSair);

        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(791, 543));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCadMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadMedicosActionPerformed
        // CHAMA A TELA DE MÉDCS
     
         try {
            
            String sql = "select * from usuarios where usu_nome = '"+lblUsuario.getText()+"'";
            PreparedStatement stmt = conex.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery();
            rs.first();
            if (rs.getString("usu_tipo").equals("administrador")){
               if (Telamed == null){
                  Telamed = new FrmMedicos();
                  Telamed.setVisible(true); 
                  Telamed.setResizable(false);
                   stmt.close();
               }else
                  Telamed.setVisible(true);  
                  Telamed.setResizable(false);
                  rs.close();
                  stmt.close();
            }else{
              JOptionPane.showMessageDialog(null, "usuário sem permissão: \n Contate o Admisntrado do sistema");    
            }
        } catch (Exception erro) {
           JOptionPane.showMessageDialog(null, "usuário sem permissão: \n Contate o Admisntrado do sistema");   
      }
    }//GEN-LAST:event_menuItemCadMedicosActionPerformed

    private void mSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSairActionPerformed
       try {
           // SAIR DO SISTEMA
           
            System.exit(0);
           conex.close();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "erro ao desconetar");
       }
        
        System.exit(0);
        
        
        
    }//GEN-LAST:event_mSairActionPerformed

    private void btnInternoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInternoFecharActionPerformed
        // FECHAR SÓ A TELA BEM-VINDO
        internalFrame.dispose();
        
        
        
        
    }//GEN-LAST:event_btnInternoFecharActionPerformed

    private void mItemFerrBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemFerrBemVindoActionPerformed
        // CHAMAR TELA BEM-VINDO 
        FrmPrincipal tela = new FrmPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_mItemFerrBemVindoActionPerformed

    private void btnCadMedcicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadMedcicoActionPerformed
        // CHAMA A TELA DE CADATRO 
         try {
          
            String sql = "select * from usuarios where usu_nome = '"+lblUsuario.getText()+"'";
            PreparedStatement stmt = conex.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery();
            rs.first();
            if (rs.getString("usu_tipo").equals("administrador")){
                 if (Telamed == null){
                  Telamed = new FrmMedicos();
                  Telamed.setVisible(true); 
                  Telamed.setResizable(false);
                   stmt.close();
               }else
                  Telamed.setVisible(true); 
                  Telamed.setResizable(false);
                   stmt.close();
               }else{
              JOptionPane.showMessageDialog(null, "usuário sem permissão: \n Contate o Admisntrado do sistema");    
            }
        } catch (Exception erro) {
           JOptionPane.showMessageDialog(null, "usuário sem permissão: \n Contate o Admisntrado do sistema");   
      }
   
    }//GEN-LAST:event_btnCadMedcicoActionPerformed

    private void menuItemCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadUsuariosActionPerformed
        // TODO add your handling code here:
         try {
           
            String sql = "select * from usuarios where usu_nome = '"+lblUsuario.getText()+"'";
            PreparedStatement stmt = conex.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery();
            rs.first();
            if (rs.getString("usu_tipo").equals("administrador")){
             if (Telausu == null){
                  Telausu = new FrmUsuarios();
                  Telausu.setVisible(true); 
                  Telausu.setResizable(false);
                   stmt.close();
               }else
                  Telausu.setVisible(true); 
                  Telausu.setResizable(false);
                   stmt.close();

             // FrmUsuario tela = new FrmUsuario(); 
             // tela.setVisible(true);
            }else{
              JOptionPane.showMessageDialog(null, "usuário sem permissão: \n Contate o Admisntrado do sistema");    
            }
        } catch (Exception erro) {
           JOptionPane.showMessageDialog(null, "usuário sem permissão: \n Contate o Admisntrado do sistema" + erro.getMessage());   
      }
         
    }//GEN-LAST:event_menuItemCadUsuariosActionPerformed

    private void menuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadastroActionPerformed

    private void menuItemCadPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadPacientesActionPerformed
        // TODO add your handling code here:
        telaPac = new FrmPacientes();
        telaPac.setVisible(true);
        telaPac.setResizable(false);
        
    }//GEN-LAST:event_menuItemCadPacientesActionPerformed

    private void btnPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientesActionPerformed
        // TODO add your handling code here:
        telaPac = new FrmPacientes();
        telaPac.setVisible(true);
        telaPac.setResizable(false);
    }//GEN-LAST:event_btnPacientesActionPerformed

    private void menuFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFerramentasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuFerramentasActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        // TODO add your handling code here:
        FrmAgenda telaAg = new FrmAgenda();
        telaAg.setVisible(true);
        telaAg.setResizable(false);
        
    }//GEN-LAST:event_btnAgendaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
         FrmAgendaMedica agmed = new FrmAgendaMedica();
         agmed.setVisible(true);
         agmed.setResizable(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        FrmAgenda telaAg = new FrmAgenda();
        telaAg.setVisible(true);
        telaAg.setResizable(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        telaagen.setVisible(true);
        telaagen.setResizable(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        // TODO add your handling code here:
        Hora hr = new Hora();
         hr.horaReal();
         lblHora.setText(hr.hora);
    }//GEN-LAST:event_timer1OnTime

    private void menuRelPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelPrincipalActionPerformed
        
        
    }//GEN-LAST:event_menuRelPrincipalActionPerformed

    private void jMenuItemRelPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelPacientesActionPerformed
        
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão?", "ATENÇÃO!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION){
        String src = "C:/Users/olivi/OneDrive/Documentos/relatorios/teste.jasper";
        JasperPrint jasperprint = null;
        
            try {
                 jasperprint = JasperFillManager.fillReport(src, null,conex);
            } catch (Exception e) {
               JOptionPane.showMessageDialog(rootPane, "erro ao Imprimir Reltório  |n" + e.getMessage());
            }
            JasperViewer view = new JasperViewer(jasperprint, false);
            view.setVisible(true);
        }
        
        
        
    }//GEN-LAST:event_jMenuItemRelPacientesActionPerformed

    private void jMenuItemConsultasRealizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultasRealizadasActionPerformed
        // TODO add your handling code here:
        
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão?", "ATENÇÃO!", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION){
        String src = "C:/Users/olivi/OneDrive/Documentos/relatorios/RelConsultarealizadas.jasper";
        JasperPrint jasperprint = null;
        
            try {
                 jasperprint = JasperFillManager.fillReport(src, null,conex);
            } catch (Exception e) {
               JOptionPane.showMessageDialog(rootPane, "erro ao Imprimir Reltório  |n" + e.getMessage());
            }
            JasperViewer view = new JasperViewer(jasperprint, false);
            view.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemConsultasRealizadasActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelInterno;
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnAtendente;
    private javax.swing.JButton btnCadMedcico;
    private javax.swing.JButton btnInternoFechar;
    private javax.swing.JButton btnPacientes;
    private javax.swing.JInternalFrame internalFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAtendentes;
    private javax.swing.JLabel jLabelPainelInterno;
    private javax.swing.JLabel jLabelagenda;
    private javax.swing.JLabel jLabelmedico;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemConsultasRealizadas;
    private javax.swing.JMenuItem jMenuItemRelPacientes;
    private javax.swing.JLabel lblBD;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuItem mItemFerrBemVindo;
    private javax.swing.JMenuItem mSair;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuFerramentas;
    private javax.swing.JMenuItem menuItemCadAtendentes;
    private javax.swing.JMenuItem menuItemCadMedicos;
    private javax.swing.JMenuItem menuItemCadPacientes;
    private javax.swing.JMenuItem menuItemCadUsuarios;
    private javax.swing.JMenu menuRelPrincipal;
    private javax.swing.JMenu menuSair;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables
}
