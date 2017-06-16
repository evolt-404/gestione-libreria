package gestione.libreria;

import javax.persistence.Query;


public class GestioneLibreria {

	public static void creaAffitto(String nomeCompleto, String cf, String data, int id) {

		Affitto affitto = new Affitto();

		// ricezione id libro da affittare

		ServicesCrud crud_services = new ServicesCrud("jpa-example");
		Libro libro =(Libro) crud_services.jpaRead("SELECT l FROM Libro l WHERE id = " + id).getSingleResult();

		// inserisci nomeCompleto
		affitto.setNomeCompleto(nomeCompleto);
		// inserisci cf
		affitto.setCf(cf);
		// inserisci data
		affitto.setData(data);
		// inserisci id
		affitto.setIdLibro(id);
		
		libro.setAffitto(affitto);
		
		// Creazione record in tabella
		crud_services.jpaCreate(affitto);
		crud_services.closeLogicaJPA();

	}



}
