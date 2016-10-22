/**
 * Ticket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package imm.bean;

public class Ticket  implements java.io.Serializable {
    private imm.bean.Agencia agencia;

    private imm.bean.Codigo codigo;

    private imm.bean.Date fecha_venta;

    private imm.bean.Date hora_inicio;

    private float importe;

    private java.lang.String matricula;

    private int minutos;

    private long numero;

    public Ticket() {
    }

    public Ticket(
           imm.bean.Agencia agencia,
           imm.bean.Codigo codigo,
           imm.bean.Date fecha_venta,
           imm.bean.Date hora_inicio,
           float importe,
           java.lang.String matricula,
           int minutos,
           long numero) {
           this.agencia = agencia;
           this.codigo = codigo;
           this.fecha_venta = fecha_venta;
           this.hora_inicio = hora_inicio;
           this.importe = importe;
           this.matricula = matricula;
           this.minutos = minutos;
           this.numero = numero;
    }


    /**
     * Gets the agencia value for this Ticket.
     * 
     * @return agencia
     */
    public imm.bean.Agencia getAgencia() {
        return agencia;
    }


    /**
     * Sets the agencia value for this Ticket.
     * 
     * @param agencia
     */
    public void setAgencia(imm.bean.Agencia agencia) {
        this.agencia = agencia;
    }


    /**
     * Gets the codigo value for this Ticket.
     * 
     * @return codigo
     */
    public imm.bean.Codigo getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this Ticket.
     * 
     * @param codigo
     */
    public void setCodigo(imm.bean.Codigo codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the fecha_venta value for this Ticket.
     * 
     * @return fecha_venta
     */
    public imm.bean.Date getFecha_venta() {
        return fecha_venta;
    }


    /**
     * Sets the fecha_venta value for this Ticket.
     * 
     * @param fecha_venta
     */
    public void setFecha_venta(imm.bean.Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }


    /**
     * Gets the hora_inicio value for this Ticket.
     * 
     * @return hora_inicio
     */
    public imm.bean.Date getHora_inicio() {
        return hora_inicio;
    }


    /**
     * Sets the hora_inicio value for this Ticket.
     * 
     * @param hora_inicio
     */
    public void setHora_inicio(imm.bean.Date hora_inicio) {
        this.hora_inicio = hora_inicio;
    }


    /**
     * Gets the importe value for this Ticket.
     * 
     * @return importe
     */
    public float getImporte() {
        return importe;
    }


    /**
     * Sets the importe value for this Ticket.
     * 
     * @param importe
     */
    public void setImporte(float importe) {
        this.importe = importe;
    }


    /**
     * Gets the matricula value for this Ticket.
     * 
     * @return matricula
     */
    public java.lang.String getMatricula() {
        return matricula;
    }


    /**
     * Sets the matricula value for this Ticket.
     * 
     * @param matricula
     */
    public void setMatricula(java.lang.String matricula) {
        this.matricula = matricula;
    }


    /**
     * Gets the minutos value for this Ticket.
     * 
     * @return minutos
     */
    public int getMinutos() {
        return minutos;
    }


    /**
     * Sets the minutos value for this Ticket.
     * 
     * @param minutos
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }


    /**
     * Gets the numero value for this Ticket.
     * 
     * @return numero
     */
    public long getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Ticket.
     * 
     * @param numero
     */
    public void setNumero(long numero) {
        this.numero = numero;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ticket)) return false;
        Ticket other = (Ticket) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agencia==null && other.getAgencia()==null) || 
             (this.agencia!=null &&
              this.agencia.equals(other.getAgencia()))) &&
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.fecha_venta==null && other.getFecha_venta()==null) || 
             (this.fecha_venta!=null &&
              this.fecha_venta.equals(other.getFecha_venta()))) &&
            ((this.hora_inicio==null && other.getHora_inicio()==null) || 
             (this.hora_inicio!=null &&
              this.hora_inicio.equals(other.getHora_inicio()))) &&
            this.importe == other.getImporte() &&
            ((this.matricula==null && other.getMatricula()==null) || 
             (this.matricula!=null &&
              this.matricula.equals(other.getMatricula()))) &&
            this.minutos == other.getMinutos() &&
            this.numero == other.getNumero();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAgencia() != null) {
            _hashCode += getAgencia().hashCode();
        }
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getFecha_venta() != null) {
            _hashCode += getFecha_venta().hashCode();
        }
        if (getHora_inicio() != null) {
            _hashCode += getHora_inicio().hashCode();
        }
        _hashCode += new Float(getImporte()).hashCode();
        if (getMatricula() != null) {
            _hashCode += getMatricula().hashCode();
        }
        _hashCode += getMinutos();
        _hashCode += new Long(getNumero()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ticket.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bean.imm/", "ticket"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean.imm/", "agencia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean.imm/", "codigo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_venta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fecha_venta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean.imm/", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hora_inicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hora_inicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://bean.imm/", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matricula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matricula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minutos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minutos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
