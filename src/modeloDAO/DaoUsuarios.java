
package modeloDAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import beans.BeansUsuarios;
import connection.ConexBD;



public class DaoUsuarios {
     private Connection Conecta;
     BeansUsuarios mod = new BeansUsuarios();
    
    public DaoUsuarios(){
        this.Conecta = new ConexBD().Conecta();
    }
    
     public void Salvar(BeansUsuarios mod){
       
        try {
           PreparedStatement pst = Conecta.prepareStatement("insert into usuarios(usu_nome, usu_senha, usu_tipo) values(?,?,?)");
           pst.setString(1,mod.getUsu_nome());
           pst.setString(2,mod.getUsu_senha());
           pst.setString(3,mod.getUsu_tipo());
           pst.execute();
           JOptionPane.showMessageDialog(null," Usuário cadastrado com Sucesso");
           pst.close();         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Cadastrar usuário" + ex);
      }
        
    }
     
   
     
  public List<BeansUsuarios> Usuarios(BeansUsuarios mod){
        
      String sql = "SELECT * FROM usuarios where Usu_nome like ?";
    try {
        PreparedStatement stmt = Conecta.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        stmt.setString(1, '%' + mod.getPesquisa() + "%");
        ResultSet rs = stmt.executeQuery();
        List<BeansUsuarios> listaUsuarios = new ArrayList<>();
        while (rs.next()){
           BeansUsuarios usuario = new BeansUsuarios();
           usuario.setUsu_codigo(rs.getInt("usu_codigo"));
           usuario.setUsu_nome(rs.getString("usu_nome"));
           usuario.setUsu_senha(rs.getString("usu_senha"));
           usuario.setUsu_tipo(rs.getString("usu_tipo"));
           listaUsuarios.add(usuario);
        }
        //conex.desconecta();
        stmt.close();
        rs.close();
        return listaUsuarios;
        } catch (Exception e) {
        return null;
   }
 }
  
  public void Excluir(BeansUsuarios mod){
        
        try {
            PreparedStatement pst = Conecta.prepareStatement("delete from usuarios where usu_codigo=?");
            pst.setInt(1, mod.getUsu_codigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario excluidos com Sucesso");
            pst.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "erro ao excluiir usuario" + ex.getMessage());
     }
  }

  public void Alterar(BeansUsuarios mod){
       
       try {
          PreparedStatement stmt = Conecta.prepareStatement("update usuarios set usu_nome =?, usu_senha=?, usu_tipo=? where usu_codigo =?");
          stmt.setString(1, mod.getUsu_nome());
          stmt.setString(2, mod.getUsu_senha());
          stmt.setString(3, mod.getUsu_tipo());
          stmt.setInt(4, mod.getUsu_codigo());
          stmt.execute();
          stmt.close();
          JOptionPane.showMessageDialog(null,"Usuário Alterado com Sucesso");
      } catch (SQLException erro) {
          JOptionPane.showMessageDialog(null,"Erro ao Alterar Usuarios" + erro.getMessage());
      }
       
  }
  
}
