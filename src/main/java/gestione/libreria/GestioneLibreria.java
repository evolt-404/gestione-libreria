package gestione.libreria;

import javax.persistence.Query;


public class GestioneLibreria {

	public static void creaAffitto(String nomeCompleto, String cf, String data, int id) {

		Affitto affitto = new Affitto();

		// ricezione id libro da affittare

		ServicesCrud crud_services = new ServicesCrud("jpa-example");
		Query jpaRead = crud_services.jpaRead("SELECT l FROM Libro l WHERE id = " + id);

		Libro libro = (Libro) jpaRead.getSingleResult();

		// inserisci nomeCompleto
		affitto.setNomeCompleto(nomeCompleto);
		// inserisci cf
		affitto.setCf(cf);
		// inserisci data
		affitto.setData(data);

		// Creazione record in tabella
		crud_services.jpaCreate(affitto);
		libro.getAffitto().setIdLibro(id);
		crud_services.jpaUpdate(libro);
		crud_services.closeLogicaJPA();

	}



}
