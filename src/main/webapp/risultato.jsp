<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="gestione.libreria.Libro"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	
	<form action ="Affitto">
	<%
		Libro libro = (Libro) request.getAttribute("libro");
	
	%>
		Nome Completo<br />
		<input type="text" name="nomeCompleto"><br />
		Codice Fiscale<br />
		<input type="text" name="cf"><br />
		Data Affitto<br />
		<input type="text" name="data"><br />
		
		<%=libro %>
		
		<br> <br> <input type="submit">
	</form>
		
		
		
		
		
	<h1>PORCO DIO! Hai Affittato il libro.</h1>
	<p>
		Per tornare indietro, clicca <a
			href="http://localhost:8080/GestioneLibreria/ComboBox">qui</a>
	</p>
</body>
</html>