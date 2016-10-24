import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import imm.bean.Agencia;


public class Servidor {

	static final int puerto = 3306;
	
	public Servidor() {
		try {
			
			IAdministracionImp imp = new IAdministracionImp();
			
			ServerSocket skServidor = new ServerSocket(puerto);
			Socket skCliente = skServidor.accept();
			OutputStream out = skCliente.getOutputStream();
			DataOutputStream salida = new DataOutputStream(out);
			InputStream in = skCliente.getInputStream();
			DataInputStream entrada = new DataInputStream(in);
			
			Login login = new Login();
			String mensaje;
			String usuario;
			String password;
			
			do {
				salida.writeUTF("\n Ingrese el usuario: \n");
				usuario = entrada.readUTF();
				salida.writeUTF("\n Ingrese contraseña: \n");
				password = entrada.readUTF();
				
				mensaje = login.login(usuario, password);
				salida.writeUTF(mensaje);
				
			} while (!(mensaje.equals("ok")));
			
			if (mensaje.equals("ok")) {
				
				String comando;
				
				do {
					salida.writeUTF("\nElija una opcion: \n\r" + "1 - Venta de Ticket\n\r" 
							+ "2 - Anulacion de Ticket\n\r" + "3 - Salir\n");
					comando = entrada.readUTF();
					
					switch (comando) {
						
						case "1": {
							salida.writeUTF("\nIngrese matricula: \n");
							String matricula = entrada.readUTF();
							salida.writeUTF("\nIngrese Agencia: \n");
							String nombre_agencia= entrada.readUTF();
							Agencia agencia = new Agencia();
							agencia.setNombre(nombre_agencia);
							salida.writeUTF("\nIngrese fecha hora inicio: \n");
							String fecha = entrada.readUTF();
							SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
							Date fechainicio = formatoDelTexto.parse(fecha);
							salida.writeUTF("\nIngrese los minutos: \n");
							String min = entrada.readUTF();
							int minutos = Integer.parseInt(min);
							
							mensaje = imp.ventaTicket(agencia,matricula, minutos);
							salida.writeUTF(mensaje);
							break;
						}
						
						case "2": {
							salida.writeUTF("\nIngrese numero de ticket a anular: \n");
							String num = entrada.readUTF();
							int numero = Integer.parseInt(num);
							mensaje = imp.anularTicket(numero);
							salida.writeUTF(mensaje);
							break;
						}
						
						case "3": {
							salida.writeUTF("Fin\n");
							entrada.close();
							skCliente.close();
							skServidor.close();
							break;
						}
						
					}
				} while (comando != "3");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new Servidor();

	}

}
