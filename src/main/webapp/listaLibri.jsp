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
	
<!-- 		Nome Completo<br /> -->
<!-- 		<input type="text" name="nomeCompleto"><br /> -->
<!-- 		Codice Fiscale<br /> -->
<!-- 		<input type="text" name="cf"><br /> -->
<!-- 		Data Affitto<br /> -->
<!-- 		<input type="text" name="data"><br /> -->
		
		
<!-- 		il campo "libro" NON assume alcun valore finché non viene effettuato il SUBMIT -->
		
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
			
			<%
			Libro libro = new Libro();
			request.setAttribute("libro",libro);
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