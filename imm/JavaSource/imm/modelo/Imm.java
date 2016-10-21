package imm.modelo;

import java.sql.Date;

public interface Imm {

public Boolean esAgencia (Agencia agencia) throws Exception;
public Ticket ventaTicket (Agencia agencia, String matricula, int minutos) throws Exception;
public int anularVenta (long numero, Agencia agencia) throws Exception;


}
