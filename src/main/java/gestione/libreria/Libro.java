package gestione.libreria;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "Libro", schema = "GESTIONE_LIBRERIA")
public class Libro 
{
	@Id
	@GeneratedValue
	private int id;
	private String titolo;
	private String autore;
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Affitto affitto;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getTitolo() 
	{
		return titolo;
	}
	public void setTitolo(String titolo) 
	{
		this.titolo = titolo;
	}
	public String getAutore() 
	{
		return autore;
	}
	public void setAutore(String autore) 
	{
		this.autore = autore;
	}
	public Affitto getAffitto() {
		return affitto;
	}
	public void setAffitto(Affitto affitto) {
		this.affitto = affitto;
	}

}
