<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina de test Venta de tickets</title>
</head>
<body>

<h1>Nueva Venta de Ticket de Estacionamiento</h1><br>
<f:view>
<h:messages showSummary="true" infoStyle="color:blue" errorStyle="color:red"/>
<h:form>
<h:outputText value="Agencia"/>
<h:inputText id="nombre_agencia" value="#{paginaTestBean.nombre_agencia}" 
required="true" label="Nombre Agencia"/><br>
<h:outputText value="Matricula"/>
<h:inputText id="matricula" value="#{paginaTestBean.matricula}" 
required="true" label="Matricula"/><br>
<h:outputText value="Minutos"/>
<h:inputText id="minutos" value="#{paginaTestBean.minutos}" 
required="true" label="Minutosl"/><br>
<h:commandButton value="Confirmar" type="submit" action="#{paginaTestBean.comprar}"/><br>
</h:form>
</f:view>

<br>
<br>
<h1>Anular Ticket</h1>
<f:view>
<h:messages showSummary="true" infoStyle="color:blue" errorStyle="color:red"/>
<h:form>
<h:outputText value="Agencia"/>
<h:inputText id="nombre_agencia" value="#{paginaTestBean.nombre_agencia}" 
required="true" label="Numero de ticket"/><br>
<h:inputText id="matricula" value="#{paginaTestBean.numero_ticket}"/>

<h:commandButton value="Confirmar" type="submit" action="#{paginaTestBean.anular}"/><br>
</h:form>
</f:view>


</body>
</html>