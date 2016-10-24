package imm.main;
import imm.bean.*;
//import imm.bean.Exception;

import java.util.Date;
import java.sql.Timestamp;
import java.time.LocalDate;


public class Test {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Agencia agencia = new Agencia();
		//TicketVO ticket = new TicketVO();
		ImmB2BService service = new ImmB2BService();
		ImmB2B test = service.getImmB2BPort();
		String nombre_agencia = "tickantel";
		agencia.setNombre(nombre_agencia);
		int minutos = 30;
		String matricula = "Las vegas SWERT456";
		Date fecha_venta = new Date();
		//LocalDate fecha_now = LocalDate.now();
		//fecha_venta = Date.valueOf(fecha_now);
		long fecha_long =fecha_venta.getTime();
		
		String text = "2016-10-07 15:00:00";
		Timestamp ts = new Timestamp(fecha_long);
		ts = Timestamp.valueOf(text);
		
		Ticket result = test.venta(agencia, matricula, minutos);
		System.out.println("Resultado = " + result.toString());
		System.out.println("Agencia: "+ result.getAgencia().getNombre());
		System.out.println("matricula: "+ result.getMatricula());
		System.out.println("Numero de ticket: "+ result.getNumero());
		
		// hora inicio
		System.out.println("Hora inicio: " + result.getHoraInicio());
		// fecha venta
		System.out.println("Fecha Venta:" + result.getFechaVenta());
		
		// hora fin
		//System.out.println("hora fin: " + hora_inicio + minutos)
		
		//importe
		System.out.println("Importe : $"+result.getImporte());
		
		
		System.out.println("Anular Venta:");
		
		try {
		int codigo_anulacion = test.anular(51,agencia);
		System.out.println("codigo anulacón: "+codigo_anulacion);
		}catch (Exception ex){};
		
		//System.out.println("")
		}

}
