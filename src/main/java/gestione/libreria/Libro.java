package gestione.libreria;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	@Override
	public String toString() 
	{
		return "Libro [id=" + id + ", titolo=" + titolo + ", autore=" + autore + "]";
	}
	

}
