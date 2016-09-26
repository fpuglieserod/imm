package imm.modelo;

import java.sql.Date;

public interface Imm {

public Boolean esAgencia (Agencia agencia);
public Ticket ventaTicket (Agencia agencia, String matricula, Date hora_inicio, int minutos);
public Codigo anularVenta (long numero, Agencia agencia);


}
