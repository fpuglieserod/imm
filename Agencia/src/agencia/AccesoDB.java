package agencia;
import java.sql.*;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class AccesoDB {

	public void guardarTicket(Ticket t) throws Exception {
		
		try {
		InitialContext initContext = new InitialContext();
		DataSource ds = (DataSource) initContext.lookup("java:jboss/datasources/MySqlDS3");
		Connection conn = ds.getConnection();
		
		String insert = "INSERT INTO ticket (id, numero, estado, matricula, fechaHoraVenta, horaInicio, cantidadMinutos, importe, terminal)" 
		+ " VALUES(?,?,?,?,?,?,?,?,?)";
		String selectId = "select NEXTVAL from secuencias";
		
		PreparedStatement ps = conn.prepareStatement(insert);
		PreparedStatement ps2 = conn.prepareStatement(selectId);
		ResultSet rs = ps2.executeQuery();
		
		ps.setInt(1, Integer.parseInt(rs.getString(1)));
		ps.setLong(2, t.getNumero());
		ps.setString(3, "VENDIDO");
		ps.setString(4, t.getMatricula());
		ps.setDate(5, (Date) t.getFechaHoraVenta());
		ps.setDate(6, (Date) t.getHoraInicio());
		ps.setInt(7, t.getCantidadMinutos());
		ps.setFloat(8, t.getImporte());
		ps.setInt(9, t.getTerminal());
		
		ps.execute();
		ps.close();
		
		conn.close();
		} 
		catch (Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	public String guardarAnulacion(int numero) throws Exception {
		
		String mensaje = "";
		InitialContext initContext = new InitialContext();
		DataSource ds = (DataSource) initContext.lookup("java:jboss/datasources/MySqlDS3");
		Connection conn = ds.getConnection();
		
		String consultaTicket = "select id from ticket where numero = " + String.valueOf(numero);
		PreparedStatement ps = conn.prepareStatement(consultaTicket);
		ResultSet rs = ps.executeQuery();
		
		if (!(rs.next())) mensaje = "no existe ticket con ese numero";
		else {
			try {
				String anula = "update ticket set estado = 'ANULADO' where id = " + rs.getString(1);
				PreparedStatement ps2 = conn.prepareStatement(anula);
				ps2.executeQuery();
				mensaje = "Se anulo el ticket exitosamente";
			} catch (Exception ex){
				mensaje = "No se pudo anular el ticket " + ex.getMessage();
			}
		}
		
		conn.close();
		return mensaje;
		}
	
}
