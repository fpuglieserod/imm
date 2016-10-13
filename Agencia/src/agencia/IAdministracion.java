package agencia;
import java.util.Date;
import imm.bean.*;

public interface IAdministracion {

	public String ventaTicket(Agencia agencia, String matricula, int minutos);
	
	public String anularTicket(int numero);
	
//	public void login();
//	
//	public void reporteTotalDiario();
//	
//	public void reporteTotalXFranjaHoraria();
	
}
