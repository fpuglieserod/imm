
import java.util.Date;


public interface IAdministracion {

	public String ventaTicket(String matricula, Date hora_inicio, int minutos);
	
	public String anularTicket(int numero);
	
//	public void reporteTotalDiario();
//	
//	public void reporteTotalXFranjaHoraria();
	
}
