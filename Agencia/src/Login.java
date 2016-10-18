
public class Login {

	public String login(String usuario, String contrasena) throws Exception {
		String mensaje = "";
		
		try {
			AccesoDB accesoDB = new AccesoDB();
			if (accesoDB.esUsuario(usuario, contrasena)) mensaje = "ok";
			else mensaje = "error";
		} catch (Exception ex) {
			mensaje = "error de acceso";
		}
		
		return mensaje;
	}
	
	public String altaUsuario(String usuario, String contrasena) {
		String mensaje = "";
		
		try {
			AccesoDB accesoDB = new AccesoDB();
			accesoDB.altaUsuario(usuario, contrasena); 
			mensaje = "Se dio de alta el usuario correctamente";
		} catch (Exception ex) {
			mensaje = "No se pudo dar de alta el usuario por error de acceso";
		}
		
		return mensaje;
	}
}
