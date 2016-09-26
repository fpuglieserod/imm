package imm.modelo;

public class Codigo {

private enum CodigoEVA {ERROR_FALTAN_DATOS,VENTA_EXITOSA,ANULACION_EXITOSA};
	
private long codigo_anulacion;

public long getCodigo_anulacion() {
	return codigo_anulacion;
}

public void setCodigo_anulacion(long codigo_anulacion) {
	this.codigo_anulacion = codigo_anulacion;
}




}
