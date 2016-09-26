package imm.persistencia;
import imm.modelo.Agencia;
//import laboratoriojee.modelo.EditorialExisteException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class AccesoDB {

	
	
	public Boolean consultaAgencia (Agencia agencia) throws Exception{
	
	try {
	InitialContext initContext = new InitialContext();
	DataSource ds = (DataSource) initContext.lookup("java:jboss/datasources/MySqlDS2");
	Connection conn = ds.getConnection();
	PreparedStatement ps = conn.prepareStatement("Select * from agenciass WHERE nombre = '" + agencia.getNombre() +"'");
	ResultSet rs = ps.executeQuery();
	
	if(!rs.absolute(1)) {//aparentemente la consulta devuelve 1 si es verdadera
	     
	     System.out.println("la agencia existe");
	     
	     ps.execute();
	     conn.close();
	     return true;
	 }else return false;
	
	} catch (Exception ex){}	
	return null;
	}

}
