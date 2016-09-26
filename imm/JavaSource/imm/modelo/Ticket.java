package imm.modelo;

import java.sql.Date;

public class Ticket {


private static float VALOR_HORA = 60; 	
private long numero;
private Agencia agencia;
private String matricula;
private Date fecha_venta;
private Date hora_inicio;
private int minutos; // minutos de estacionamiento
private float importe;
private enum estado {VENDIDO,ANULADO};
private Codigo codigo;
public long getNumero() {
	return numero;
}
public void setNumero(long numero) {
	this.numero = numero;
}
public Agencia getAgencia() {
	return agencia;
}
public void setAgencia(Agencia agencia) {
	this.agencia = agencia;
}
public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public Date getFecha_venta() {
	return fecha_venta;
}
public void setFecha_venta(Date fecha_venta) {
	this.fecha_venta = fecha_venta;
}
public Date getHora_inicio() {
	return hora_inicio;
}
public void setHora_inicio(Date hora_inicio) {
	this.hora_inicio = hora_inicio;
}
public int getMinutos() {
	return minutos;
}
public void setMinutos(int minutos) {
	this.minutos = minutos;
}
public float getImporte() {
	return importe;
}
public void setImporte(float importe) {
	this.importe = importe;
}
public Codigo getCodigo() {
	return codigo;
}
public void setCodigo(Codigo codigo) {
	this.codigo = codigo;
}


private void calcular_importe (int minutos){
	    float aux = VALOR_HORA*minutos;
	    this.minutos = minutos;
	    this.setImporte(aux);
	    
}



}
