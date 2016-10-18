/**
 * ImmB2BServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package imm.bean;

public class ImmB2BServiceLocator extends org.apache.axis.client.Service implements imm.bean.ImmB2BService {

    public ImmB2BServiceLocator() {
    }


    public ImmB2BServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ImmB2BServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ImmB2BPort
    private java.lang.String ImmB2BPort_address = "http://localhost:8080/imm/ImmB2B";

    public java.lang.String getImmB2BPortAddress() {
        return ImmB2BPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ImmB2BPortWSDDServiceName = "ImmB2BPort";

    public java.lang.String getImmB2BPortWSDDServiceName() {
        return ImmB2BPortWSDDServiceName;
    }

    public void setImmB2BPortWSDDServiceName(java.lang.String name) {
        ImmB2BPortWSDDServiceName = name;
    }

    public imm.bean.ImmB2B getImmB2BPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ImmB2BPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getImmB2BPort(endpoint);
    }

    public imm.bean.ImmB2B getImmB2BPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            imm.bean.ImmB2BServiceSoapBindingStub _stub = new imm.bean.ImmB2BServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getImmB2BPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setImmB2BPortEndpointAddress(java.lang.String address) {
        ImmB2BPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (imm.bean.ImmB2B.class.isAssignableFrom(serviceEndpointInterface)) {
                imm.bean.ImmB2BServiceSoapBindingStub _stub = new imm.bean.ImmB2BServiceSoapBindingStub(new java.net.URL(ImmB2BPort_address), this);
                _stub.setPortName(getImmB2BPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ImmB2BPort".equals(inputPortName)) {
            return getImmB2BPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://bean.imm/", "ImmB2BService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://bean.imm/", "ImmB2BPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ImmB2BPort".equals(portName)) {
            setImmB2BPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
