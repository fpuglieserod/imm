import imm.bean.Agencia;
import imm.bean.ImmB2B;
import imm.bean.ImmB2BService;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

public class IAdministracionImp implements IAdministracion {
	
	private static IAdministracionImp miIAdminImpl;
	
	public static IAdministracionImp getIAdminImp() {
		 
		 if (miIAdminImpl == null) {
		 
			 miIAdminImpl = new IAdministracionImp();
		 }
		 return miIAdminImpl;
	}
	
	public String ventaTicket(String matricula, Date hora_inicio, int minutos) {
		
		String mensaje;
		Ticket tk = new Ticket();
		tk.setMatricula(matricula);
		tk.setHoraInicio(hora_inicio);
		tk.setCantidadMinutos(minutos);
		
		try{
			//invocar por ws a la venta de la imm
			ImmB2BService srvimm = new ImmB2BService();
			ImmB2B imm = srvimm.getImmB2BPort();
			Agencia agencia = new Agencia();
			agencia.setNombre("tickantel");
			
			//long hi = hora_inicio.getTime(); //en version definitiva pasar datetime
			imm.bean.Ticket t = imm.venta(agencia, matricula, minutos);
			if (t != null) {
				
				tk.setNumero(t.getNumero());
				LocalDate fecha_now = LocalDate.now();
				tk.setFechaHoraVenta(java.sql.Date.valueOf(fecha_now));
				tk.setImporte(t.getImporte());
								
				AccesoDB accesoDB = new AccesoDB();
				accesoDB.guardarTicket(tk);
				mensaje = "Venta realizada con exito";
			} else mensaje = "La venta no pudo realizarse en la imm";
		} catch (Exception ex){
			mensaje = "No se pudo realizar la venta " + ex.getMessage();
		}
		
		return mensaje;
	}
	
	public String anularTicket(int numero) {
		
		String mensaje;
	
		try{
			//invocar anularVenta de la imm
			
			ImmB2BService svrimm = new ImmB2BService();
			ImmB2B imm = svrimm.getImmB2BPort();
			Agencia agencia2 = new Agencia();
			agencia2.setNombre("tickantel");
			int codigo = imm.anular(numero, agencia2);
			if (codigo != -1) {
			
				AccesoDB accesoDB = new AccesoDB();
				mensaje = accesoDB.guardarAnulacion(numero, codigo);
				} else mensaje = "La venta no pudo anularse en la imm";
			} catch (Exception ex){
				mensaje = "No se pudo anular el ticket " + ex.getMessage();
			}

		return mensaje;
	}
	
	public void reporteTotalDiario(Date dia) {
		AccesoDB accesoDB = new AccesoDB();
		try {
			accesoDB.reporteTotal((java.sql.Date) dia);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void reporteTotalXFranjaHoraria(Timestamp inicio, Timestamp fin) {
		AccesoDB accesoDB = new AccesoDB();
		try {
			accesoDB.reporteXFranja(inicio, fin);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
