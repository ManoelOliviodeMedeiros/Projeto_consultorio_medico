
package modeloDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import beans.BeansAgenda;
import connection.ConexBD;


/**
 *
 * @author Manoel Olivio de Mediros
 */
public class DaoAgenda {
    private Connection Conecta;
   BeansAgenda agenda = new    BeansAgenda();
   int codmedico;
    
   
   public DaoAgenda(){
       this.Conecta = new ConexBD().Conecta();
   }
   
public void Salvar(BeansAgenda agenda){
    BuscarMedicos(agenda.getNomemedico());
    if (codmedico >= 1){
   
     String sql = "insert into agenda (cod_Agenda_medico, cod_Agenda_paciente, dt_agenda, mot_agenda, status_agenda, tur_agenda) "
             + "values (?,?,?,?,?,?)";
       try {
           PreparedStatement stmt = Conecta.prepareStatement(sql);
           stmt.setInt(1, codmedico);
           stmt.setInt(2, agenda.getCodigopaciente());
           stmt.setDate(3, new java.sql.Date(agenda.getData().getTime()));
           stmt.setString(4, agenda.getMotivogenda());
           stmt.setString(5, agenda.getStatusagenda());
           stmt.setString(6, agenda.getTurmaagenda());
           stmt.execute();
           JOptionPane.showMessageDialog(null, "agendamentocom salvo sucesso");
           stmt.close();
         
           
       } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "erro ao salvar agendamento" + ex.getMessage());
  
       }
    }else{
         JOptionPane.showMessageDialog(null,"Medico não encontrao" );
    }
}  


//BUSCA CODIGO DO MÉDICO PELO NOME PORQUE NA TELA DA AGENDA SÓ TEM O NOME  
public void BuscarMedicos(String nomemedico){
   
        String sql = "select * from medicos where nome_medico = ?";
        try {
            PreparedStatement stmt = Conecta.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1, nomemedico);
            ResultSet rs = stmt.executeQuery();
            rs.first();
            codmedico = rs.getInt("cod_medico");
            
            stmt.close();
           rs.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null,"Medico não encontrao" + ex.getMessage());
    }
    
  }  
//BUSCA CODIGO DO MÉDICO PELO COM VARIAVEL DE RETORNO
public int BuscarMedAg(String nomemedico){
   
        String sql = "select * from medicos where nome_medico = ?";
        try {
            PreparedStatement stmt = Conecta.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1, nomemedico);
            ResultSet rs = stmt.executeQuery();
            rs.first();
            codmedico = rs.getInt("cod_medico");
            
            stmt.close();
           rs.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null,"Medico não encontrao" + ex.getMessage());
    }
    return codmedico;
  } 

public List<BeansAgenda> agenda(BeansAgenda agen){
         String status = "aberto";
         String sql = "SELECT * FROM agenda INNER JOIN pacientes ON cod_agenda_paciente = cod_paciente INNER JOIN "
         + "medicos ON cod_agenda_medico = cod_medico where status_agenda = '"+ status +"' ORDER BY dt_agenda";
     try {
        PreparedStatement stmt = Conecta.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        //stmt.setString(1, '%' + mod.getPesquisa() + "%");
        ResultSet rs = stmt.executeQuery();
        List<BeansAgenda> listagenda = new ArrayList<>();
        while (rs.next()){
           BeansAgenda ag = new BeansAgenda();
           ag.setCodigoagenda(rs.getInt("cod_agenda"));
           ag.setCodigopaciente(rs.getInt("cod_paciente"));
           ag.setNomemedico(rs.getString("nome_medico"));
           ag.setNomepaciente(rs.getString("nome_paciente"));
           ag.setMotivogenda(rs.getString("mot_agenda"));
           ag.setTurmaagenda(rs.getString("tur_agenda"));
           ag.setData(rs.getDate("dt_agenda"));
           ag.setStatusagenda(rs.getString("status_agenda"));
           listagenda.add(ag);
        }
        stmt.close();
        rs.close();
        
        return listagenda;
        } catch (Exception e) {
        return null;
   }
 }
public List<BeansAgenda> agenMedica(BeansAgenda agen){
         String status = "em atendimento";
         String sql = "SELECT * FROM agenda INNER JOIN pacientes ON cod_agenda_paciente = cod_paciente INNER JOIN "
         + "medicos ON cod_agenda_medico = cod_medico where status_agenda = '"+ status +"' ORDER BY dt_agenda";
     try {
        PreparedStatement stmt = Conecta.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        //stmt.setString(1, '%' + mod.getPesquisa() + "%");
        ResultSet rs = stmt.executeQuery();
        List<BeansAgenda> listagendamed = new ArrayList<>();
        while (rs.next()){
           BeansAgenda ag = new BeansAgenda();
           ag.setCodigoagenda(rs.getInt("cod_agenda"));
           ag.setCodigopaciente(rs.getInt("cod_paciente"));
           ag.setNomemedico(rs.getString("nome_medico"));
           ag.setNomepaciente(rs.getString("nome_paciente"));
           ag.setMotivogenda(rs.getString("mot_agenda"));
           ag.setTurmaagenda(rs.getString("tur_agenda"));
           ag.setDtNasPac(rs.getString("dt_nasc_paciente"));
           ag.setStatusagenda(rs.getString("status_agenda"));
           listagendamed.add(ag);
        }
        stmt.close();
        rs.close();
        
        return listagendamed;
        } catch (Exception e) {
        return null;
   }
 }
  
public List<BeansAgenda> atendMedica(BeansAgenda atend){
       
         String sql = "SELECT * FROM agenda INNER JOIN pacientes ON cod_agenda_paciente = cod_paciente INNER JOIN "
         + "medicos ON cod_agenda_medico = cod_medico where status_agenda = ? and cod_medico = ?";
     try {
        PreparedStatement stmt = Conecta.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.setString(1, atend.getStatusagenda());
        stmt.setInt(2, atend.getCodigomedico());
        List<BeansAgenda> listagendamed = new ArrayList<>();
        ResultSet rs = stmt.executeQuery();
        while (rs.next()){
           BeansAgenda ag = new BeansAgenda();
           ag.setCodigoagenda(rs.getInt("cod_agenda"));
           ag.setCodigopaciente(rs.getInt("cod_paciente"));
           ag.setNomemedico(rs.getString("nome_medico"));
           ag.setMotivogenda(rs.getString("mot_agenda"));
           ag.setNomepaciente(rs.getString("nome_paciente"));
           ag.setTurmaagenda(rs.getString("tur_agenda"));
           ag.setDtNasPac(rs.getString("dt_nasc_paciente"));
           ag.setStatusagenda(rs.getString("status_agenda"));
           listagendamed.add(ag);
        }
        stmt.close();
        rs.close();
        
        return listagendamed;
        } catch (Exception e) {
        return null;
   }
 }


  public void AtenderAg(BeansAgenda agen){
       
       try {
          PreparedStatement stmt = Conecta.prepareStatement("update agenda set status_agenda =?  where cod_agenda =?");
          stmt.setString(1, agen.getStatusagenda());
          stmt.setInt(2, agen.getCodigoagenda());
          stmt.execute();
          stmt.close();
          JOptionPane.showMessageDialog(null,"Status Alterado com Sucesso");
      } catch (SQLException erro) {
          JOptionPane.showMessageDialog(null,"Erro ao Alterar Status" + erro.getMessage());
      }
      
  }
  
  public void AlterarAgenda(BeansAgenda agen){
      BuscarMedicos(agenda.getNomemedico());  
      try {
           PreparedStatement stmt = Conecta.prepareStatement("update agenda set cod_agenda_Medico =?, "
           + "cod_agenda_paciente =?, dt_agenda =?, motivo_agenda =?, status_agenda =?, tur_agenda =? where cod_agenda =?");
           stmt.setInt(1, codmedico);
           stmt.setInt(2, agen.getCodigopaciente());
           stmt.setDate(3, new java.sql.Date(agenda.getData().getTime()));
           stmt.setString(4, agen.getMotivogenda());
           stmt.setString(5, agen.getStatusagenda());
           stmt.setString(6, agen.getTurmaagenda());
           stmt.setInt(7, agen.getCodigoagenda());
           stmt.execute();
           JOptionPane.showMessageDialog(null, "agendamentocom salvo sucesso");
           stmt.close();
         
           
          } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "erro ao salvar agendamento" + ex.getMessage());
  
       }
  
  }
}



