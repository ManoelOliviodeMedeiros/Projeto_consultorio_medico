
package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Manoel Olivio de Mediros
 */
public class ConexBD {
    
    public Connection Conecta(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/projetoclinica?characterEncoding=utf-8","med","Med57l61");
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
       
    }
   
}
