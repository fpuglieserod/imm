package imm.bean;
import java.sql.Date;
import java.time.LocalDate;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import imm.modelo.*;

@ManagedBean
@SessionScoped
public class PaginaTestBean {

	//private Date fecha_venta;
	LocalDate fecha_now = LocalDate.now();
	private Date fecha_venta= Date.valueOf(fecha_now);
	//private Agencia agencia;
	private String matricula;
	private String nombre_agencia;
	private int minutos;
	private ImmImpl gestor = new ImmImpl();
	
	public PaginaTestBean (){
		
		
	}
	public String comprar() throws Exception{
		try{
		Agencia agencia = new Agencia();
		agencia.setNombre(this.nombre_agencia);
		
		gestor.ventaTicket(agencia, this.matricula, this.fecha_venta, this.minutos);
		return null;
		}catch (Exception ex){}
		return null;
	}
	public LocalDate getFecha_now() {
		return fecha_now;
	}
	public void setFecha_now(LocalDate fecha_now) {
		this.fecha_now = fecha_now;
	}
	public Date getFecha_venta() {
		return fecha_venta;
	}
	public void setFecha_venta(Date fecha_venta) {
		this.fecha_venta = fecha_venta;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombre_agencia() {
		return nombre_agencia;
	}
	public void setNombre_agencia(String nombre_agencia) {
		this.nombre_agencia = nombre_agencia;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
}
