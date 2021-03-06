

import java.io.IOException;

import javax.enterprise.context.SessionScoped;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ServletLogin
 */
@WebServlet("/ServletLogin")
@SessionScoped
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario");
		String contrasena = request.getParameter("password");
		
		Login login = new Login();
		String mensajeLogin;
		try {
			mensajeLogin = login.login(usuario, contrasena);
		} catch (Exception e) {
			mensajeLogin = "error de acceso";
		}
		
		if (mensajeLogin.equals("ok")) {
			RequestDispatcher rd = request.getRequestDispatcher("/Menu.jsp");
	 		rd.forward(request, response);
		} else if (mensajeLogin.equals("error")) response.getWriter().println("Credenciales incorrectas, ingrese los datos nuevamente");
		else response.getWriter().println(mensajeLogin);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
