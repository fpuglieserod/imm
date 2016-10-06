
package imm.bean;
import imm.modelo.*;
import javax.jws.WebService;

import java.sql.Date;
import java.time.LocalDate;

import javax.jws.WebMethod;

@WebService
public class ImmB2B {

//private Time hora_venta;	
private Agencia agencia = new Agencia();
private String matricula;
private Date hora_inicio;
private int minutos;
private static ImmImpl gestor = new ImmImpl();
private TicketVO ticketvo;
private Ticket ticket;
// son para probar la hora de inicio
Date fecha_prueba;
LocalDate fecha_now_prueba = LocalDate.now();

//String nombre = "abitab";
//agencia.setNombre(nombre);
public ImmB2B (){
//agencia.setNombre("abitab");	
	//this.agencia.setNombre(nombre);
}


public Agencia getAgencia() {
	return agencia;
}


public void setAgencia(Agencia agencia) {
	this.agencia = agencia;
}


public String getMatricula() {
	return matricula;
}


public void setMatricula(String matricula) {
	this.matricula = matricula;
}


public Date getHora_inicio() {
	return hora_inicio;
}


public void setHora_inicio(Date hora_inicio) {
	this.hora_inicio = hora_inicio;
}


public int getMinutos() {
	return minutos;
}


public void setMinutos(int minutos) {
	this.minutos = minutos;
}


public TicketVO getTicketVO() {
	return ticketvo;
}


public void setTicketVO(TicketVO ticketvo) {
	this.ticketvo = ticketvo;
}


@WebMethod
	public Ticket venta(Agencia agencia,String matricula, long hora_inicio, int minutos){
	//TicketVO ticket;
	try{
	this.agencia = agencia;
	//es una agencia valida
	System.out.println("Adentro de del metodo venta del webservice");
	if (gestor.esAgencia(this.agencia)){
		System.out.println("adentro del if de venta");
		//procedo a vender
		this.matricula = matricula;
		Date h = new Date (hora_inicio);
		//this.hora_inicio = hora_inicio;
		this.hora_inicio = h;
		this.minutos = minutos;
		//ticketvo = gestor.ventaTicket(agencia, matricula, hora_inicio, minutos);
		//fecha_prueba= Date.valueOf(fecha_now_prueba);
		this.ticket = gestor.ventaTicket(this.agencia, this.matricula, this.hora_inicio, this.minutos);
		
	
	
	}else System.out.println("Agencia no valida");
	} catch (Exception ex){
	ex.printStackTrace();
		return null;
	}
	
	return this.ticket;
	} 

@WebMethod 
	public Boolean anular(int numero, Agencia agencia){
	return true;
}


}
