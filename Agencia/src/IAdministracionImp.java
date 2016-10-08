import imm.bean.Agencia;
import imm.bean.ImmB2B;
import imm.bean.ImmB2BService;
import imm.bean.ImmB2BServiceLocator;

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
			ImmB2BService srvimm = new ImmB2BServiceLocator();
			ImmB2B imm = srvimm.getImmB2BPort();
			Agencia agencia = imm.getAgencia();
			long hi = hora_inicio.getTime(); //en version definitiva pasar datetime
			imm.bean.Ticket t = imm.venta(agencia, matricula, hi, minutos);
			if (t != null) {
				
				tk.setNumero(t.getNumero());
				//tk.setFechaHoraVenta(t.getFecha_venta());
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
			
			ImmB2BService svrimm = new ImmB2BServiceLocator();
			ImmB2B imm = svrimm.getImmB2BPort();
			Agencia agencia = imm.getAgencia();
			if (imm.anular(numero, agencia)) {
			
				AccesoDB accesoDB = new AccesoDB();
				mensaje = accesoDB.guardarAnulacion(numero);
				} else mensaje = "La venta no pudo anularse en la imm";
			} catch (Exception ex){
				mensaje = "No se pudo anular el ticket " + ex.getMessage();
			}

		return mensaje;
	}
	
	public String altaUsuario(String usuario, String contrasena, int terminal) {
		String mensaje = "";
		
		try {
			AccesoDB accesoDB = new AccesoDB();
			accesoDB.altaUsuario(usuario, contrasena, terminal); 
			mensaje = "Se dio de alta el usuario correctamente";
		} catch (Exception ex) {
			mensaje = "No se pudo dar de alta el usuario por error de acceso";
		}
		
		return mensaje;
	}

}
