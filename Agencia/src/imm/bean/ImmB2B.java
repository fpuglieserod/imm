
package imm.bean;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ImmB2B", targetNamespace = "http://bean.imm/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ImmB2B {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "anular", targetNamespace = "http://bean.imm/", className = "imm.bean.Anular")
    @ResponseWrapper(localName = "anularResponse", targetNamespace = "http://bean.imm/", className = "imm.bean.AnularResponse")
    public Boolean anular(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Agencia arg1);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMatricula", targetNamespace = "http://bean.imm/", className = "imm.bean.GetMatricula")
    @ResponseWrapper(localName = "getMatriculaResponse", targetNamespace = "http://bean.imm/", className = "imm.bean.GetMatriculaResponse")
    public String getMatricula();

    /**
     * 
     * @return
     *     returns imm.bean.Agencia
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAgencia", targetNamespace = "http://bean.imm/", className = "imm.bean.GetAgencia")
    @ResponseWrapper(localName = "getAgenciaResponse", targetNamespace = "http://bean.imm/", className = "imm.bean.GetAgenciaResponse")
    public Agencia getAgencia();

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMinutos", targetNamespace = "http://bean.imm/", className = "imm.bean.GetMinutos")
    @ResponseWrapper(localName = "getMinutosResponse", targetNamespace = "http://bean.imm/", className = "imm.bean.GetMinutosResponse")
    public int getMinutos();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setMatricula", targetNamespace = "http://bean.imm/", className = "imm.bean.SetMatricula")
    @ResponseWrapper(localName = "setMatriculaResponse", targetNamespace = "http://bean.imm/", className = "imm.bean.SetMatriculaResponse")
    public void setMatricula(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns imm.bean.TicketVO
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTicketVO", targetNamespace = "http://bean.imm/", className = "imm.bean.GetTicketVO")
    @ResponseWrapper(localName = "getTicketVOResponse", targetNamespace = "http://bean.imm/", className = "imm.bean.GetTicketVOResponse")
    public TicketVO getTicketVO();

    /**
     * 
     * @param arg0
     */
    @WebMethod(operationName = "setHora_inicio")
    @RequestWrapper(localName = "setHora_inicio", targetNamespace = "http://bean.imm/", className = "imm.bean.SetHoraInicio")
    @ResponseWrapper(localName = "setHora_inicioResponse", targetNamespace = "http://bean.imm/", className = "imm.bean.SetHoraInicioResponse")
    public void setHoraInicio(
        @WebParam(name = "arg0", targetNamespace = "")
        Date arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setAgencia", targetNamespace = "http://bean.imm/", className = "imm.bean.SetAgencia")
    @ResponseWrapper(localName = "setAgenciaResponse", targetNamespace = "http://bean.imm/", className = "imm.bean.SetAgenciaResponse")
    public void setAgencia(
        @WebParam(name = "arg0", targetNamespace = "")
        Agencia arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setTicketVO", targetNamespace = "http://bean.imm/", className = "imm.bean.SetTicketVO")
    @ResponseWrapper(localName = "setTicketVOResponse", targetNamespace = "http://bean.imm/", className = "imm.bean.SetTicketVOResponse")
    public void setTicketVO(
        @WebParam(name = "arg0", targetNamespace = "")
        TicketVO arg0);

    /**
     * 
     * @return
     *     returns imm.bean.Date
     */
    @WebMethod(operationName = "getHora_inicio")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHora_inicio", targetNamespace = "http://bean.imm/", className = "imm.bean.GetHoraInicio")
    @ResponseWrapper(localName = "getHora_inicioResponse", targetNamespace = "http://bean.imm/", className = "imm.bean.GetHoraInicioResponse")
    public Date getHoraInicio();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setMinutos", targetNamespace = "http://bean.imm/", className = "imm.bean.SetMinutos")
    @ResponseWrapper(localName = "setMinutosResponse", targetNamespace = "http://bean.imm/", className = "imm.bean.SetMinutosResponse")
    public void setMinutos(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns imm.bean.Ticket
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "venta", targetNamespace = "http://bean.imm/", className = "imm.bean.Venta")
    @ResponseWrapper(localName = "ventaResponse", targetNamespace = "http://bean.imm/", className = "imm.bean.VentaResponse")
    public Ticket venta(
        @WebParam(name = "arg0", targetNamespace = "")
        Agencia arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

}
