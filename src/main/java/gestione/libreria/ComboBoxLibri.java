package gestione.libreria;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ComboBoxLibri extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Libro attribute = (Libro) request.getAttribute("libro");
		List<Libro> listaLibri = creaListaLibri(attribute);
		request.setAttribute("listaLibri", listaLibri);
		RequestDispatcher requestDispatcherObj = request.getRequestDispatcher("/listaLibri.jsp");
		requestDispatcherObj.forward(request, response);

	}
	
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Libro libro = (Libro) req.getAttribute("libro");
		int id = libro.getId();
		String nomeCompleto = req.getParameter("nomeCompleto");
		String cf = req.getParameter("cf");
		String data = req.getParameter("data");
		
		GestioneLibreria.creaAffitto(nomeCompleto, cf, data, id);
		
		
		
		
		
	}

	
	private List<Libro> creaListaLibri(Libro attribute) {
		
		List<Libro> listaLibri = new ArrayList<Libro>();
		ServicesCrud crud = new ServicesCrud("jpa-example");
		listaLibri = crud.jpaRead("SELECT l FROM Libro l").getResultList();
		return listaLibri;
	}


}
