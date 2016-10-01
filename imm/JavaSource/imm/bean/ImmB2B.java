
package imm.bean;
import imm.modelo.*;
import javax.jws.WebService;

import java.sql.Date;
import java.time.LocalDate;

import javax.jws.WebMethod;

@WebService
public class ImmB2B {

	
private Agencia agencia;
private String matricula;
private Date hora_inicio;
private int minutos;
private static ImmImpl gestor;
private TicketVO ticketvo;
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
	public Boolean venta(Agencia agencia,String matricula, Date hora_inicio, int minutos) throws Exception{
	//TicketVO ticket;
	this.agencia = agencia;
	//es una agencia valida
	
	if (gestor.esAgencia(this.agencia)){
		//procedo a vender
		this.matricula = matricula;
		this.hora_inicio = hora_inicio;
		this.minutos = minutos;
		//ticketvo = gestor.ventaTicket(agencia, matricula, hora_inicio, minutos);
		fecha_prueba= Date.valueOf(fecha_now_prueba);
		gestor.ventaTicket(this.agencia, this.matricula, this.hora_inicio, this.minutos);
		
	
	
	}else System.out.println("Agencia no valida");
	
	
	return true;
	} 

@WebMethod 
	public Boolean anular(int numero, Agencia agencia){
	return true;
}


}
