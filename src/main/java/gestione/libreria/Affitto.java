package gestione.libreria;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Affitto", schema = "GESTIONE_LIBRERIA")
public class Affitto {
	
	@Id
	@GeneratedValue
	private int id;
	private String nomeCompleto;
	private String cf;
	private String data;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Affitto [id=" + id + ", nomeCompleto=" + nomeCompleto + ", cf=" + cf + ", data=" + data + "]";
	}
	

}
