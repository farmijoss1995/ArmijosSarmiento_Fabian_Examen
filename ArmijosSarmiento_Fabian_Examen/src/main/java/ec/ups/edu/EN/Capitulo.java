package ec.ups.edu.EN;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Capitulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_capitulo")
	private int idCapitulo;
	
	@Column(name="cap_titulo")
	private String capTitulo;
	
	private int numeroCap;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_autor")
	private Autor autor;
	
	public Capitulo() {
		
	}
	
	public int getIdCapitulo() {
		return idCapitulo;
	}

	public void setIdCapitulo(int idCapitulo) {
		this.idCapitulo = idCapitulo;
	}

	public String getCapTitulo() {
		return capTitulo;
	}

	public void setCapTitulo(String capTitulo) {
		this.capTitulo = capTitulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	public int getNumeroCap() {
		return numeroCap;
	}

	public void setNumeroCap(int numeroCap) {
		this.numeroCap = numeroCap;
	}

	@Override
	public String toString() {
		return "Capitulo [idCapitulo=" + idCapitulo + ", capTitulo=" + capTitulo + ", numeroCap=" + numeroCap + ", autor="
				+ autor + "]";
	}
}

