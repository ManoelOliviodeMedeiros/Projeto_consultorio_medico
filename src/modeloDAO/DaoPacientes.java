
package modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import beans.BeansPacientes;
import connection.ConexBD;



public class DaoPacientes {
    //ConexaoBD conex = new ConexaoBD();
    private Connection Conecta;
    BeansPacientes mod = new BeansPacientes();
    
    public DaoPacientes(){
        this.Conecta = new ConexBD().Conecta();
    }
    
     public void Salvar(BeansPacientes mod){
        
        try {
           PreparedStatement pst = Conecta.prepareStatement(
           "insert into pacientes(nome_paciente, dt_nasc_paciente, rg_paciente, tel_paciente, rua_paciente, "
            + "c_rua_Paciente, cep_paciente, num_rua_paciente, bairro_paciente, cidade_paciente, uf_paciente) values(?,?,?,?,?,?,?,?,?,?,?)");
           pst.setString(1,mod.getNomePac());
           pst.setString(2,mod.getDtNasPac());
           pst.setString(3,mod.getRgPac());
           pst.setString(4,mod.getTelPac());
           pst.setString(5,mod.getRuaPac());
           pst.setString(6,mod.getComplPac());
           pst.setString(7,mod.getCepPac());
           pst.setInt(8,mod.getNumRuaPac());
           pst.setString(9,mod.getBairroPac());
           pst.setString(10, mod.getCidPaciente());
           pst.setString(11,mod.getUfPaciente());
           pst.execute();
           JOptionPane.showMessageDialog(null," cadastrado com Sucesso");
           pst.close();         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Cadastrar Paciente" + ex);
      }
       
    }

     
     public List<BeansPacientes> Paciente(BeansPacientes mod){
        
      String sql = "SELECT * FROM pacientes where nome_paciente like ? ORDER BY nome_paciente";
     try {
        PreparedStatement stmt = Conecta.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        stmt.setString(1, '%' + mod.getPesquisa() + "%");
        ResultSet rs = stmt.executeQuery();
        List<BeansPacientes> listaPacientes = new ArrayList<>();
        while (rs.next()){
           BeansPacientes paciente = new BeansPacientes();
           paciente.setCodpac(rs.getInt("cod_paciente"));
           paciente.setNomePac(rs.getString("nome_paciente"));
           paciente.setDtNasPac(rs.getString("dt_nasc_paciente"));
           paciente.setRgPac(rs.getString("rg_paciente"));
           paciente.setTelPac(rs.getString("tel_paciente"));
           paciente.setRuaPac(rs.getString("rua_paciente"));
           paciente.setNumRuaPac(rs.getInt("num_rua_paciente"));
           paciente.setComplPac(rs.getString("c_rua_paciente"));
           paciente.setBairroPac(rs.getString("bairro_paciente"));
           paciente.setCidPaciente(rs.getString("cidade_paciente"));
           paciente.setCepPac(rs.getString("cep_paciente"));
           paciente.setUfPaciente(rs.getString("uf_paciente"));
           listaPacientes.add(paciente);
        }
        //conex.desconecta();
        rs.close();
        stmt.close();
        return listaPacientes;
        } catch (Exception e) {
        return null;
   }
 }
     public void Excluir(BeansPacientes mod){
        
        try {
            PreparedStatement pst = Conecta.prepareStatement("delete from pacientes where cod_paciente=?");
            pst.setInt(1, mod.getCodpac());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Paciente excluidos com Sucesso");
            pst.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "erro ao excluiir Paciente" + ex.getMessage());
     }
  }

  public void Alterar(BeansPacientes mod){
       
       try {
          PreparedStatement stmt = Conecta.prepareStatement(
          "update pacientes set nome_paciente =?, dt_nasc_paciente=?, rg_paciente=?, tel_paciente=?,"
           + " rua_paciente=?, num_rua_paciente=?, c_rua_paciente=?, bairro_paciente=?, "
           + "cidade_paciente=?, cep_paciente=?, uf_paciente=? where cod_paciente =?");
          stmt.setString(1, mod.getNomePac());
          stmt.setString(2, mod.getDtNasPac());
          stmt.setString(3, mod.getRgPac());
          stmt.setString(4, mod.getTelPac());
          stmt.setString(5, mod.getRuaPac());
          stmt.setInt(6, mod.getNumRuaPac());
          stmt.setString(7, mod.getComplPac());
          stmt.setString(8, mod.getBairroPac());
          stmt.setString(9, mod.getCidPaciente());
          stmt.setString(10, mod.getCepPac());
          stmt.setString(11, mod.getUfPaciente());
          stmt.setInt(12, mod.getCodpac());
          stmt.execute();
          stmt.close();
          JOptionPane.showMessageDialog(null,"Alterado com Sucesso");
      } catch (SQLException erro) {
          JOptionPane.showMessageDialog(null,"Erro ao Alterar Paciente" + erro.getMessage());
      }
      
  }
}
