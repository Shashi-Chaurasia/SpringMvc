<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help</title>
</head>
<body>

<h1>We are in help page ! </h1>

<%  
		String name = (String) request.getAttribute("name");
		Integer rollno = (Integer) request.getAttribute("rollno");
		LocalDateTime time = (LocalDateTime) request.getAttribute("time");
%>

<h1>Name Of Student : ${name} </h1>
<h2>Rollno Of Student : ${rollno }</h2>
<h3> time now :${time}</h3>

<hr>
<hr>

  <c:forEach var="item" items="${marks }">
  	<h3>${item}</h3>
  </c:forEach>


</body>
</html>