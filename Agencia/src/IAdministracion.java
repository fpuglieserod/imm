import java.sql.Timestamp;
import java.util.Date;


public interface IAdministracion {

	public String ventaTicket(String matricula, Date hora_inicio, int minutos);
	
	public String anularTicket(int numero);
	
	public void reporteTotalDiario(Date dia);
	
	public void reporteTotalXFranjaHoraria(Timestamp inicio, Timestamp fin);
	
}
