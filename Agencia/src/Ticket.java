import java.util.Date;


public class Ticket {
	
	private long numero;
	public enum estado {VENDIDO,ANULADO};
	private String codigo_anulacion;
	private String matricula;
	private Date fechaHoraVenta;
	private Date horaInicio;
	private int cantidadMinutos;
	private float importe;
	private int terminal;
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	public String getCodigo_anulacion() {
		return codigo_anulacion;
	}
	public void setCodigo_anulacion(String codigo_anulacion) {
		this.codigo_anulacion = codigo_anulacion;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public Date getFechaHoraVenta() {
		return fechaHoraVenta;
	}
	public void setFechaHoraVenta(Date fechaHoraVenta) {
		this.fechaHoraVenta = fechaHoraVenta;
	}
	
	public int getCantidadMinutos() {
		return cantidadMinutos;
	}
	public void setCantidadMinutos(int cantidadMinutos) {
		this.cantidadMinutos = cantidadMinutos;
	}
	
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	
	public int getTerminal() {
		return terminal;
	}
	public void setTerminal(int terminal) {
		this.terminal = terminal;
	}
	
	public Date getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}
		
}
