import java.sql.*;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class AccesoDB {

	public void guardarTicket(Ticket t) throws Exception {
		
		try {
		InitialContext initContext = new InitialContext();
		DataSource ds = (DataSource) initContext.lookup("java:jboss/datasources/MySqlDS");
		Connection conn = ds.getConnection();
		
		String insert = "INSERT INTO ticket (numero, estado, matricula, fechaHoraVenta, horaInicio, cantidadMinutos, importe, terminal)" 
		+ " VALUES(?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement ps = conn.prepareStatement(insert);
				
		ps.setLong(1, t.getNumero());
		ps.setString(2, "VENDIDO");
		ps.setString(3, t.getMatricula());
		ps.setDate(4, (Date) t.getFechaHoraVenta());
		ps.setDate(5, (Date) t.getHoraInicio());
		ps.setInt(6, t.getCantidadMinutos());
		ps.setFloat(7, t.getImporte());
		ps.setInt(8, t.getTerminal());
		
		ps.execute();
		ps.close();
		conn.close();
		} 
		catch (Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	public String guardarAnulacion(int numero, int codigo) throws Exception {
		
		String mensaje = "";
		InitialContext initContext = new InitialContext();
		DataSource ds = (DataSource) initContext.lookup("java:jboss/datasources/MySqlDS");
		Connection conn = ds.getConnection();
		
		String consultaTicket = "select id from ticket where numero = " + String.valueOf(numero);
		PreparedStatement ps = conn.prepareStatement(consultaTicket);
		ResultSet rs = ps.executeQuery();
		
		if (!(rs.next())) mensaje = "no existe ticket con ese numero";
		else {
			try {
				String anula = "update ticket set estado = 'ANULADO', codigoanulacion = ? where id = ?; ";
				PreparedStatement ps2 = conn.prepareStatement(anula);
				ps2.setInt(1, codigo);
				ps2.setInt(2, Integer.valueOf(rs.getString(1)));
				ps2.execute();
				mensaje = "Se anulo el ticket exitosamente";
				ps2.close();
			} catch (Exception ex){
				mensaje = "No se pudo anular el ticket " + ex.getMessage();
			}
		}
		
		rs.close();
		ps.close();
		conn.close();
		return mensaje;
		}
	
	public Boolean esUsuario(String usuario, String contrasena) throws Exception {
		
		InitialContext initContext = new InitialContext();
		DataSource ds = (DataSource) initContext.lookup("java:jboss/datasources/MySqlDS");
		Connection conn = ds.getConnection();
		
		String consulta = "select * from usuario where usuario = " + usuario 
							+ "password = " + contrasena + ";";
		PreparedStatement ps = conn.prepareStatement(consulta);
		ResultSet rs = ps.executeQuery();
		
		if (!(rs.next())) {
			rs.close();
			ps.close();
			conn.close();
			return false;
		}
		else {
			rs.close();
			ps.close();
			conn.close();
			return true;
		}
	}
	
	public void altaUsuario(String usuario, String contrasena) throws Exception {
		
		InitialContext initContext = new InitialContext();
		DataSource ds = (DataSource) initContext.lookup("java:jboss/datasources/MySqlDS");
		Connection conn = ds.getConnection();
		
		String insert = "insert into usuario (usuario, password, terminal) values (?,?);";
		
		PreparedStatement ps = conn.prepareStatement(insert);
		ps.setString(1, usuario);
		ps.setString(2, contrasena);
		ps.execute();
		
		ps.close();
		conn.close();
		
	}
	
	public void reporteTotal(Date dia) throws Exception {
		
		InitialContext initContext = new InitialContext();
		DataSource ds = (DataSource) initContext.lookup("java:jboss/datasources/MySqlDS");
		Connection conn = ds.getConnection();
		
		String select = "select * from ticket where date(fechaHoraVenta) = ? ;";
		
		PreparedStatement ps = conn.prepareStatement(select);
		ps.setDate(1,dia);
		ResultSet rs = ps.executeQuery();
		
		System.out.println("Id	Numero	Estado	Matricula	FechaHoraVenta	Cant Minutos	Importe");
		System.out.println();
		
		while (rs.next()) {
			System.out.print(rs.getString(1) + "	");
			System.out.print(rs.getString(2) + "	");
			System.out.print(rs.getString(3) + "	");
			System.out.print(rs.getString(4) + "	");
			System.out.print(rs.getString(5) + "	");
			System.out.print(rs.getString(7) + "	");
			System.out.println(rs.getString(8));
		}
		
		rs.close();
		ps.close();
		conn.close();
	}
	
	public void reporteXFranja(Timestamp inicio, Timestamp fin) throws Exception {
		
		InitialContext initContext = new InitialContext();
		DataSource ds = (DataSource) initContext.lookup("java:jboss/datasources/MySqlDS");
		Connection conn = ds.getConnection();
		
		String select = "select * from ticket where fechaHoraVenta between ? and ? ;";
		PreparedStatement ps = conn.prepareStatement(select);
		ps.setTimestamp(1,inicio);
		ps.setTimestamp(2,fin);
		ResultSet rs = ps.executeQuery();
		
		System.out.println("Id	Numero	Estado	Matricula	FechaHoraVenta	Cant Minutos	Importe");
		System.out.println();
		
		while (rs.next()) {
			System.out.print(rs.getString(1) + "	");
			System.out.print(rs.getString(2) + "	");
			System.out.print(rs.getString(3) + "	");
			System.out.print(rs.getString(4) + "	");
			System.out.print(rs.getString(5) + "	");
			System.out.print(rs.getString(7) + "	");
			System.out.println(rs.getString(8));
		}
		
		rs.close();
		conn.close();
	}
}
