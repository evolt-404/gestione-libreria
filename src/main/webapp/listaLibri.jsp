<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="gestione.libreria.Libro" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Lista libri:

	<%
	List<Libro> listaLibri = (ArrayList<Libro>) request.getAttribute("listaLibri");
	if (listaLibri != null) {
%>
	<form action="ComboBox" method="post">
	
		<input type="text" value="nomeCompleto">Nome Completo<br />
		<input type="text" value="cf">Codice Fiscale<br />
		<input type="text" value="data">Data Affitto Libro<br />
		
		
		<select name="libro">
			<%
				for (Libro l : listaLibri) {
			%>
			<option value="<%=l%>">
				<%=l%>
			</option>

			<%
				}
			%>
		</select> <br> <br> <input type="submit">
	</form>
	<% 
		} else {
	%>
	
		<p>Tutti i libri sono affittati</p>
	<%
		}
	%>	
</body>
</html>