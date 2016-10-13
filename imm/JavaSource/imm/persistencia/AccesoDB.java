package imm.persistencia;
import imm.modelo.Agencia;
//import laboratoriojee.modelo.EditorialExisteException;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDate;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class AccesoDB {

	private Date fecha_venta;
	private LocalDate fecha_now = LocalDate.now();
	//private Date fecha_creacion = Date.valueOf(fecha_now);
	
	public Boolean consultaAgencia (Agencia agencia) throws Exception{
	
	try {
	InitialContext initContext = new InitialContext();
	DataSource ds = (DataSource) initContext.lookup("java:jboss/datasources/MySqlDS2");
	Connection conn = ds.getConnection();
	PreparedStatement ps = conn.prepareStatement("Select * from agencias WHERE nombre = '" + agencia.getNombre() +"'");
	ResultSet rs = ps.executeQuery();
	
	if(rs.absolute(1)) {//aparentemente la consulta devuelve 1 si es verdadera
	     
	     System.out.println("la agencia existe");
	     
	     ps.execute();
	     conn.close();
	     return true;
	 }else return false;
	
	} catch (Exception ex){
		ex.printStackTrace();
	}	
	return null;
	}
	
	// este metodo devuelve el numero de ticket y persiste los datos en la DB
	//Timestamp fecha_inicio,
	public long guardarTicket (Agencia agencia, String matricula,  int minutos, float importe) throws Exception{
		
		try{
		// guardo los datos 	
			InitialContext initContext = new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:jboss/datasources/MySqlDS2");
			Connection conn = ds.getConnection();
			// hay que ver como ingresar los datos a la DB y me tengo que quedar con el numero de ticket ademas hay que 
			// cambiar el estado a vendido
			//PreparedStatement ps = conn.prepareStatement("Select * from agenciass WHERE nombre = '" + agencia.getNombre() +"'");
				
			String query = "INSERT INTO ventas (id_a, estado,matricula,minutos, fecha_venta, monto)" + " VALUES(?,?,?,?,?,?)";
		    String query2= "Select * from agencias WHERE nombre = '" + agencia.getNombre() +"'";
			PreparedStatement ps=conn.prepareStatement(query);
			PreparedStatement ps2 = conn.prepareStatement(query2);
			ResultSet rs = ps2.executeQuery();
			int id_a=-1;
			while(rs.next()){
			 id_a = rs.getInt(1);
			}
		    // escribo el numero de ticket en la base como null ya que es autoincrement
		    //ps.setInt(1, (Integer) null);
		    //guarodo la id  de la agencia en la DB ventas 
		    ps.setInt(1,id_a);
		    //agrego Estado
		    ps.setString(2,"VENDIDO");
		    //agrego codigo
		    //ps.setInt(4, (Integer) null);
		    //agrego matricula 
		    ps.setString(3, matricula);
		    //hora_inicio
		    
		    //VER COMO PASAR UN TIME STAMP a la DB, antes le pasaba la hora-inicio y funcionaba bien 
		    
		    //ps.setTimestamp(4, new java.sql.Timestamp (fecha_inicio.getTime()));
		    //ps.setTimestamp(4, fecha_inicio);
		    //ps.setDate(4, fecha_inicio);
		    //agrego minutos
		    ps.setInt(4, minutos);
		    //agrego fecha de venta
		    fecha_venta= Date.valueOf(fecha_now);
		    ps.setDate(5, fecha_venta);
		    // guardo el importe
		    ps.setFloat(6, importe);
		    ps.execute();
		    //busco el numero de ticket 
		    ps = conn.prepareStatement("select LAST_INSERT_ID()");
		    rs = ps.executeQuery();
		    while (rs.next()){
		    	System.out.println("en guardar ticket.......");
		    	return 	rs.getInt(1);
		    
		    }
		    ps.execute();
		    conn.close();
			
		    
			
		}catch (Exception ex){
			ex.printStackTrace();
		}
		return 12313213;
		
	} 
	public int anular(long numero, Agencia agencia) throws Exception{
		
		try {
			InitialContext initContext = new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:jboss/datasources/MySqlDS2");
			Connection conn = ds.getConnection();
			String query = "Select * from agencias WHERE nombre = '" + agencia.getNombre() +"'";
			PreparedStatement ps=conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			int id_a=-1;
			while(rs.next()){
			 id_a = rs.getInt(1);
				System.out.println("id_a: " + id_a);

			}
			//agregar a la querry el numero de ticket
			query = "Select estado from ventas where id_a = '" + id_a + "' and numero = '" + numero+ "'";
			String estado = null;
			ps = conn.prepareStatement(query);
			rs=ps.executeQuery();
			while(rs.next()){
				 estado = rs.getString(1);
					System.out.println("Estado " + estado);

			}
			if(estado.equals("VENDIDO")) {
				//CAMBIO EL ESTADO A ANULADO Y GENERO EL CODIGO 
				//
				query = "Select * from ventas where numero ='" + numero +"'";
				ps = conn.prepareStatement(query);
				rs = ps.executeQuery();
				while (rs.next()){
					long aux = rs.getInt(1);
					
				}
				query = "update ventas set estado = ? where numero = '"+numero+"'";
				ps = conn.prepareStatement(query);
				ps.setString(1,"ANULADO");
				ps.execute();
				// creo un nuevo codigo de anulación al que lo asocio al numero de ticket
				query = "Insert into codigos (numero) values (?) ";
				ps = conn.prepareStatement(query);
				ps.setInt(1, (int) numero);
				ps.execute();
				//recupero el numero de codigo 
				ps = conn.prepareStatement("select LAST_INSERT_ID()");
				rs = ps.executeQuery();
				while (rs.next()){
				   return rs.getInt(1);
				}
				ps.close();
				}else {System.out.println("El ticket ya fue anulado");}
		    }catch (Exception ex){
			   ex.printStackTrace();
		   }
		   return 123445;
		
	}

}
