/**
 * ImmB2B.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package imm.bean;

public interface ImmB2B extends java.rmi.Remote {
    public int anular(int arg0, imm.bean.Agencia arg1) throws java.rmi.RemoteException;
    public java.lang.String getMatricula() throws java.rmi.RemoteException;
    public imm.bean.Agencia getAgencia() throws java.rmi.RemoteException;
    public int getMinutos() throws java.rmi.RemoteException;
    public void setMatricula(java.lang.String arg0) throws java.rmi.RemoteException;
    public imm.bean.TicketVO getTicketVO() throws java.rmi.RemoteException;
    public void setHora_inicio(imm.bean.Date arg0) throws java.rmi.RemoteException;
    public void setAgencia(imm.bean.Agencia arg0) throws java.rmi.RemoteException;
    public void setTicketVO(imm.bean.TicketVO arg0) throws java.rmi.RemoteException;
    public imm.bean.Date getHora_inicio() throws java.rmi.RemoteException;
    public void setMinutos(int arg0) throws java.rmi.RemoteException;
    public imm.bean.Ticket venta(imm.bean.Agencia arg0, java.lang.String arg1, int arg2) throws java.rmi.RemoteException;
}
