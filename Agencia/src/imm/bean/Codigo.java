/**
 * Codigo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package imm.bean;

public class Codigo  implements java.io.Serializable {
    private long codigo_anulacion;

    public Codigo() {
    }

    public Codigo(
           long codigo_anulacion) {
           this.codigo_anulacion = codigo_anulacion;
    }


    /**
     * Gets the codigo_anulacion value for this Codigo.
     * 
     * @return codigo_anulacion
     */
    public long getCodigo_anulacion() {
        return codigo_anulacion;
    }


    /**
     * Sets the codigo_anulacion value for this Codigo.
     * 
     * @param codigo_anulacion
     */
    public void setCodigo_anulacion(long codigo_anulacion) {
        this.codigo_anulacion = codigo_anulacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Codigo)) return false;
        Codigo other = (Codigo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codigo_anulacion == other.getCodigo_anulacion();
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
        _hashCode += new Long(getCodigo_anulacion()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Codigo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bean.imm/", "codigo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo_anulacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigo_anulacion"));
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
