<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<%session.setAttribute("client", new jw09.Client()); %>

name : ${sessionScope.client.name} <br/>
addr : ${client.addr} <br/>
age : ${client.age} <br/>

info[0] ${sessionScope.client.info[0]}<br/>
info[1] ${client.info[1]}