package imm.modelo;

import java.sql.Date;
import java.sql.Timestamp;

import imm.persistencia.*;
public class ImmImpl implements Imm {

private AccesoDB accesoDB = new AccesoDB();	
private Ticket ticket = new Ticket();	
	
	@Override
	public Boolean esAgencia(Agencia agencia) throws Exception{
		// TODO Auto-generated method stub
		try {
		return this.accesoDB.consultaAgencia(agencia);
		}catch (Exception ex){}
		return null;
		}

	@Override
	public Ticket ventaTicket(Agencia agencia, String matricula, Timestamp hora_inicio, int minutos) throws Exception{
		// TODO Auto-generated method stub
		try {
		ticket.setAgencia(agencia);
		ticket.setMatricula(matricula);
		//ticket.setHora_inicio(hora_inicio);
		ticket.setMinutos(minutos);
		ticket.calcular_importe(minutos);
		System.out.println("En venta ticket");
		System.out.println("Agencia: "+ ticket.getAgencia().getNombre());
		ticket.setNumero(this.accesoDB.guardarTicket(agencia, matricula, hora_inicio, minutos, ticket.getImporte()));
	    
		return ticket;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public int anularVenta(long numero, Agencia agencia) throws Exception{
		// TODO Auto-generated method stub
		try {
		//Codigo codigo = new Codigo(); 
		System.out.println("numero de ticket a anular: (metodo anularVenta (ImmImpl)) " + numero);
		System.out.println("agencia: " + agencia.getNombre());

		int cod = this.accesoDB.anular(numero, agencia);
		return cod;	
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return -1;
	}
	public TicketVO generaTicket (Ticket ticket){
		 
		return new TicketVO();
		
	}

}
