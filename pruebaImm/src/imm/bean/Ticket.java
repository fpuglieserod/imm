
package imm.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ticket complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ticket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agencia" type="{http://bean.imm/}agencia" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://bean.imm/}codigo" minOccurs="0"/>
 *         &lt;element name="fecha_venta" type="{http://bean.imm/}date" minOccurs="0"/>
 *         &lt;element name="hora_inicio" type="{http://bean.imm/}date" minOccurs="0"/>
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minutos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ticket", propOrder = {
    "agencia",
    "codigo",
    "fechaVenta",
    "horaInicio",
    "importe",
    "matricula",
    "minutos",
    "numero"
})
public class Ticket {

    protected Agencia agencia;
    protected Codigo codigo;
    @XmlElement(name = "fecha_venta")
    protected Date fechaVenta;
    @XmlElement(name = "hora_inicio")
    protected Date horaInicio;
    protected float importe;
    protected String matricula;
    protected int minutos;
    protected long numero;

    /**
     * Obtiene el valor de la propiedad agencia.
     * 
     * @return
     *     possible object is
     *     {@link Agencia }
     *     
     */
    public Agencia getAgencia() {
        return agencia;
    }

    /**
     * Define el valor de la propiedad agencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Agencia }
     *     
     */
    public void setAgencia(Agencia value) {
        this.agencia = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link Codigo }
     *     
     */
    public Codigo getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Codigo }
     *     
     */
    public void setCodigo(Codigo value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVenta.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getFechaVenta() {
        return fechaVenta;
    }

    /**
     * Define el valor de la propiedad fechaVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setFechaVenta(Date value) {
        this.fechaVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad horaInicio.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getHoraInicio() {
        return horaInicio;
    }

    /**
     * Define el valor de la propiedad horaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setHoraInicio(Date value) {
        this.horaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     */
    public float getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     */
    public void setImporte(float value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define el valor de la propiedad matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Obtiene el valor de la propiedad minutos.
     * 
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * Define el valor de la propiedad minutos.
     * 
     */
    public void setMinutos(int value) {
        this.minutos = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     */
    public long getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     */
    public void setNumero(long value) {
        this.numero = value;
    }

}
