<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="shop.type.ClientType" %>
<%
	String strType = "CLIENT";
	ClientType type = ClientType.getType(strType);
	out.println(type == ClientType.CLIENT);
%>