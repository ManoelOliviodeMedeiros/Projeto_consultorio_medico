
package modeloDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Time;
import javax.swing.JOptionPane;
import beans.BeansConsulta;
import connection.ConexBD;

/**
 *
 * @author Manoel Olivio de Mediros
 */
public class DaoConsulta {
 private Connection conecta;  
 BeansConsulta consul = new BeansConsulta();
  
 public DaoConsulta(){
     this.conecta = new ConexBD().Conecta();
 }
     
  
 public void SalvarConsulta(BeansConsulta consul){
     String sql = "insert into consulta (cod_ag_consulta, diagn_consulta, rec_consulta, data_consulta, hora_consulta)"
             + "values (?,?,?,?,?)";
       try {
         
           PreparedStatement stmt = conecta.prepareStatement(sql);
           stmt.setInt(1, consul.getCodagendaconsulta());
           stmt.setString(2, consul.getDiagnconsulta());
           stmt.setString(3, consul.getRecconsulta());
           stmt.setDate(4, new java.sql.Date(consul.getDataonsulta().getTime()));
           stmt.setTime(5, new Time(System.currentTimeMillis()));
           stmt.execute();
           JOptionPane.showMessageDialog(null, "Consulta salvo sucesso");
           stmt.close();
           
     } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, "erro ao salvar consulta" + ex.getMessage());
     }
     
 }
 
 
    
    
}
