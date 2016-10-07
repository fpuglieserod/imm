
package imm.bean;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ImmB2BService", targetNamespace = "http://bean.imm/", wsdlLocation = "http://localhost:8080/imm/ImmB2B?wsdl")
public class ImmB2BService
    extends Service
{

    private final static URL IMMB2BSERVICE_WSDL_LOCATION;
    private final static WebServiceException IMMB2BSERVICE_EXCEPTION;
    private final static QName IMMB2BSERVICE_QNAME = new QName("http://bean.imm/", "ImmB2BService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/imm/ImmB2B?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IMMB2BSERVICE_WSDL_LOCATION = url;
        IMMB2BSERVICE_EXCEPTION = e;
    }

    public ImmB2BService() {
        super(__getWsdlLocation(), IMMB2BSERVICE_QNAME);
    }

    public ImmB2BService(WebServiceFeature... features) {
        super(__getWsdlLocation(), IMMB2BSERVICE_QNAME, features);
    }

    public ImmB2BService(URL wsdlLocation) {
        super(wsdlLocation, IMMB2BSERVICE_QNAME);
    }

    public ImmB2BService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IMMB2BSERVICE_QNAME, features);
    }

    public ImmB2BService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImmB2BService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ImmB2B
     */
    @WebEndpoint(name = "ImmB2BPort")
    public ImmB2B getImmB2BPort() {
        return super.getPort(new QName("http://bean.imm/", "ImmB2BPort"), ImmB2B.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ImmB2B
     */
    @WebEndpoint(name = "ImmB2BPort")
    public ImmB2B getImmB2BPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://bean.imm/", "ImmB2BPort"), ImmB2B.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IMMB2BSERVICE_EXCEPTION!= null) {
            throw IMMB2BSERVICE_EXCEPTION;
        }
        return IMMB2BSERVICE_WSDL_LOCATION;
    }

}