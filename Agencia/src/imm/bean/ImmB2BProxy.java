package imm.bean;

public class ImmB2BProxy implements imm.bean.ImmB2B {
  private String _endpoint = null;
  private imm.bean.ImmB2B immB2B = null;
  
  public ImmB2BProxy() {
    _initImmB2BProxy();
  }
  
  public ImmB2BProxy(String endpoint) {
    _endpoint = endpoint;
    _initImmB2BProxy();
  }
  
  private void _initImmB2BProxy() {
    try {
      immB2B = (new imm.bean.ImmB2BServiceLocator()).getImmB2BPort();
      if (immB2B != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)immB2B)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)immB2B)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (immB2B != null)
      ((javax.xml.rpc.Stub)immB2B)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public imm.bean.ImmB2B getImmB2B() {
    if (immB2B == null)
      _initImmB2BProxy();
    return immB2B;
  }
  
  public java.lang.Boolean anular(int arg0, imm.bean.Agencia arg1) throws java.rmi.RemoteException{
    if (immB2B == null)
      _initImmB2BProxy();
    return immB2B.anular(arg0, arg1);
  }
  
  public java.lang.String getMatricula() throws java.rmi.RemoteException{
    if (immB2B == null)
      _initImmB2BProxy();
    return immB2B.getMatricula();
  }
  
  public imm.bean.Agencia getAgencia() throws java.rmi.RemoteException{
    if (immB2B == null)
      _initImmB2BProxy();
    return immB2B.getAgencia();
  }
  
  public int getMinutos() throws java.rmi.RemoteException{
    if (immB2B == null)
      _initImmB2BProxy();
    return immB2B.getMinutos();
  }
  
  public void setMatricula(java.lang.String arg0) throws java.rmi.RemoteException{
    if (immB2B == null)
      _initImmB2BProxy();
    immB2B.setMatricula(arg0);
  }
  
  public imm.bean.TicketVO getTicketVO() throws java.rmi.RemoteException{
    if (immB2B == null)
      _initImmB2BProxy();
    return immB2B.getTicketVO();
  }
  
  public void setHora_inicio(imm.bean.Date arg0) throws java.rmi.RemoteException{
    if (immB2B == null)
      _initImmB2BProxy();
    immB2B.setHora_inicio(arg0);
  }
  
  public void setAgencia(imm.bean.Agencia arg0) throws java.rmi.RemoteException{
    if (immB2B == null)
      _initImmB2BProxy();
    immB2B.setAgencia(arg0);
  }
  
  public void setTicketVO(imm.bean.TicketVO arg0) throws java.rmi.RemoteException{
    if (immB2B == null)
      _initImmB2BProxy();
    immB2B.setTicketVO(arg0);
  }
  
  public imm.bean.Date getHora_inicio() throws java.rmi.RemoteException{
    if (immB2B == null)
      _initImmB2BProxy();
    return immB2B.getHora_inicio();
  }
  
  public void setMinutos(int arg0) throws java.rmi.RemoteException{
    if (immB2B == null)
      _initImmB2BProxy();
    immB2B.setMinutos(arg0);
  }
  
  public imm.bean.Ticket venta(imm.bean.Agencia arg0, java.lang.String arg1, long arg2, int arg3) throws java.rmi.RemoteException{
    if (immB2B == null)
      _initImmB2BProxy();
    return immB2B.venta(arg0, arg1, arg2, arg3);
  }
  
  
}