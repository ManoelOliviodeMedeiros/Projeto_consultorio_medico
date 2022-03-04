

package modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import beans.BeansMedicos;
import connection.ConexBD;



public class DaoMedicos {
    private Connection Conecta;
    BeansMedicos mod = new BeansMedicos();
    
  public DaoMedicos() {
    this.Conecta = new ConexBD().Conecta();
    
} 
    
    public void Salvar(BeansMedicos mod){
       
        try {
           PreparedStatement pst = Conecta.prepareStatement("insert into medicos(nome_medico,especialidade_medico,crm_medico) values(?,?,?)");
           pst.setString(1,mod.getNome());
           pst.setString(2,mod.getEspecialidade());
           pst.setInt(3,mod.getCrm());
           pst.execute();
           pst.close();
           JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso");
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Cadastrar" + ex);
       }
         
    }
    
    public void Alterar(BeansMedicos mod){
         
        try {
            PreparedStatement pst = Conecta.prepareStatement("update medicos set nome_medico=?, especialidade_medico=?, crm_medico=? where cod_medico=?");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getEspecialidade());
            pst.setInt(3,mod.getCrm());
            pst.setInt(4,mod.getCodigo());
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null,"Alterado com Sucesso");
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"erro na Alteração"+ ex);
        }
          //conex.desconecta();
    }
    
    public void Excluir(BeansMedicos mod){
        
        try {
            PreparedStatement pst = Conecta.prepareStatement("delete from medicos where cod_medico=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos");
            pst.close();
           
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "erro ao excluiir dados" + ex.getMessage());
     }
  }
 
    //CONSULTA POR NOME E PARA PREENCHER TABELA
    public List<BeansMedicos> getMedico(BeansMedicos mod){
       
      String sql = "SELECT * FROM medicos where nome_medico like ? ORDER BY nome_medico";
    try {
        PreparedStatement stmt = Conecta.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        stmt.setString(1, '%' + mod.getPesquisa() + '%');
        ResultSet rs = stmt.executeQuery();
        List<BeansMedicos> listaMedicos = new ArrayList<>();
        while (rs.next()){
           BeansMedicos medico = new BeansMedicos();
           medico.setCodigo(rs.getInt("cod_medico"));
           medico.setNome(rs.getString("nome_medico"));
           medico.setEspecialidade(rs.getString("especialidade_medico"));
           medico.setCrm(rs.getInt("crm_medico"));
           listaMedicos.add(medico);
        }
        rs.close();
        stmt.close();
        return listaMedicos;
        } catch (Exception e) {
        return null;
   }
 }

}
