
package imm.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para codigo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="codigo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo_anulacion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codigo", propOrder = {
    "codigoAnulacion"
})
public class Codigo {

    @XmlElement(name = "codigo_anulacion")
    protected long codigoAnulacion;

    /**
     * Obtiene el valor de la propiedad codigoAnulacion.
     * 
     */
    public long getCodigoAnulacion() {
        return codigoAnulacion;
    }

    /**
     * Define el valor de la propiedad codigoAnulacion.
     * 
     */
    public void setCodigoAnulacion(long value) {
        this.codigoAnulacion = value;
    }

}
