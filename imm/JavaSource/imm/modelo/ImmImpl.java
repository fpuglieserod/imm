package imm.modelo;

import java.sql.Date;
import imm.persistencia.*;
public class ImmImpl implements Imm {

private AccesoDB accesoDB;	
	
	
	@Override
	public Boolean esAgencia(Agencia agencia) {
		// TODO Auto-generated method stub
		return this.accesoDB.consultaAgencia(agencia);
	}

	@Override
	public Ticket ventaTicket(Agencia agencia, String matricula, Date hora_inicio, int minutos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Codigo anularVenta(long numero, Agencia agencia) {
		// TODO Auto-generated method stub
		return null;
	}

}
