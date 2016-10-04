package imm.main;
import imm.bean.*;
//import imm.bean.Exception;

import java.sql.Date;
import java.time.LocalDate;

public class Test {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Agencia agencia = new Agencia();
		TicketVO ticket = new TicketVO();
		ImmB2BService service = new ImmB2BService();
		ImmB2B test = service.getImmB2BPort();
		String nombre_agencia = "abitab";
		agencia.setNombre(nombre_agencia);
		int minutos = 80;
		String matricula = "WKR1234";
		Date fecha_venta;
		LocalDate fecha_now = LocalDate.now();
		fecha_venta = Date.valueOf(fecha_now);
		long fecha_long =fecha_venta.getTime();
		
		Boolean result = test.venta(agencia, matricula, fecha_long, minutos);
		System.out.println("Resultado = " + result.toString() + ". Se esta complicando" );
		
		}

}
