

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletVenta
 */
@WebServlet("/ServletVenta")
public class ServletVenta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletVenta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		try {
			
			IAdministracionImp adm = new IAdministracionImp();
			
			String matricula = request.getParameter("matricula");
			
			String horaInicio = request.getParameter("horaInicio");
			SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
			Date fechainicio = formatoDelTexto.parse(horaInicio);
			
			Integer minutos = new Integer(request.getParameter("minutos"));
			
			String mensaje = adm.ventaTicket(matricula, fechainicio, minutos);
			
			response.getWriter().write(mensaje);
		
			
		} catch(NumberFormatException e){
			response.getWriter().write("los parametros no son validos");
		} catch (ParseException e) {
			response.getWriter().write("formato de fecha invalido");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
