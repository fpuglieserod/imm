
package imm.bean;
import imm.modelo.*;
import javax.jws.WebService;

import java.sql.Date;

import javax.jws.WebMethod;

@WebService
public class ImmB2B {

	
private Agencia agencia;
private String matricula;
private Date hora_inicio;
private int minutos;
private static ImmImpl gestor;



public ImmB2B (){
	
}


@WebMethod
	public Boolean venta(Agencia agencia,String matricula, Date hora_inicio, int minutos) {
	//TicketVO ticket;
	this.agencia = agencia;
	//es una agencia valida
	
	if (gestor.esAgencia(this.agencia)){
		//procedo a vender
	}else System.out.println("Agencia no valida");
	
	
	return true;
	} 

@WebMethod 
	public Boolean anular(int numero, Agencia agencia){
	return true;
}


}
