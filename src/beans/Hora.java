
package beans;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author olivi
 */
public class Hora {
    
    public String hora;
    SimpleDateFormat formatarhora = new SimpleDateFormat("HH:mm:ss");
    
  public void horaReal(){
      Date horaAtual = new Date();
      hora = formatarhora.format(horaAtual);
      
  }
    
    
    
}
