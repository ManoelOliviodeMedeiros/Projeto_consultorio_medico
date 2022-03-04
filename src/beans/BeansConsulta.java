
package beans;
 
/**
 *
 * @author Manoel Olivio de Mediros
 */
import java.sql.Time;
import java.util.Date;

public class BeansConsulta {
    private int codagendaconsulta;
    private String diagnconsulta;
    private String recconsulta;
    private Date dataonsulta;
    private String horaconsuta;

    /**
     * @return the codagendaconsulta
     */
    public int getCodagendaconsulta() {
        return codagendaconsulta;
    }

    /**
     * @param codagendaconsulta the codagendaconsulta to set
     */
    public void setCodagendaconsulta(int codagendaconsulta) {
        this.codagendaconsulta = codagendaconsulta;
    }

    /**
     * @return the diagnconsulta
     */
    public String getDiagnconsulta() {
        return diagnconsulta;
    }

    /**
     * @param diagnconsulta the diagnconsulta to set
     */
    public void setDiagnconsulta(String diagnconsulta) {
        this.diagnconsulta = diagnconsulta;
    }

    /**
     * @return the recconsulta
     */
    public String getRecconsulta() {
        return recconsulta;
    }

    /**
     * @param recconsulta the recconsulta to set
     */
    public void setRecconsulta(String recconsulta) {
        this.recconsulta = recconsulta;
    }

    /**
     * @return the dataonsulta
     */
    public Date getDataonsulta() {
        return dataonsulta;
    }

    /**
     * @param dataonsulta the dataonsulta to set
     */
    public void setDataonsulta(Date dataonsulta) {
        this.dataonsulta = dataonsulta;
    }

    /**
     * @return the horaconsuta
     */
    public String getHoraconsuta() {
        return horaconsuta;
    }

    /**
     * @param horaconsuta the horaconsuta to set
     */
    public void setHoraconsuta(String horaconsuta) {
        this.horaconsuta = horaconsuta;
    }

     
}
