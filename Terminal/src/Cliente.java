import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Cliente {

	static final String host = "localhost";
	static final int puerto = 3306;
	
	public Cliente() {
		try {
			Socket skCliente = new Socket(host,puerto);
			OutputStream out = skCliente.getOutputStream();
			DataOutputStream salida = new DataOutputStream(out);
			InputStream in = skCliente.getInputStream();
			DataInputStream entrada = new DataInputStream(in);
			Scanner ent = new Scanner(System.in);
			
			String mensaje;
			String usuario;
			String password;
			
			do {
				
				System.out.println(entrada.readUTF());
				usuario = ent.next();
				salida.writeUTF(usuario);
				System.out.println(entrada.readUTF());
				password = ent.next();
				salida.writeUTF(password);
				
				mensaje = entrada.readUTF();
				System.out.println("Resultado de login " + mensaje);
				
			} while (!(mensaje.equals("ok")));
			
			if (mensaje.equals("ok")) {
				
				String comando;
				
				do {
					System.out.println(entrada.readUTF());
					comando = ent.next();
					salida.writeUTF(comando);
					
					switch (comando) {
						
						case "1": {
							System.out.println(entrada.readUTF());
							String matricula = ent.next();
							salida.writeUTF(matricula);
							System.out.println(entrada.readUTF());
							String fecha = ent.next();
							salida.writeUTF(fecha);
							System.out.println(entrada.readUTF());
							String min = ent.next();
							salida.writeUTF(min);
							System.out.println(entrada.readUTF());
							break;
						}
						
						case "2": {
							System.out.println(entrada.readUTF());
							String num = ent.next();
							salida.writeUTF(num);
							System.out.println(entrada.readUTF());
							break;
						}
						
						case "3": {
							System.out.println(entrada.readUTF());
							entrada.close();
							salida.close();
							skCliente.close();
							ent.close();
							System.exit(0);
							break;
						}
						
						default : { System.err.println("\n Ingrese un comando v�lido\n"); break; }
					}
				} while (comando != "3");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new Cliente();

	}

}
