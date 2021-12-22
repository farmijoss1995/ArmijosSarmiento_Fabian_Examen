package ec.ups.edu.EN;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Libro  implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_libro")
	private int idLibro;
	@Column(name="cod_isnn")
	private String codISNN;
	
	private String titulo;
	
	@Column(name="num_pag")
	private int numPag;
	
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="id_libro")
	private List<Capitulo> listaCapitulos;
	
	public Libro() {
		
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getCodISNN() {
		return codISNN;
	}

	public void setCodISNN(String codISNN) {
		this.codISNN = codISNN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	public List<Capitulo> getListaCapitulos() {
		return listaCapitulos;
	}

	public void setListaCapitulos(List<Capitulo> listaCapitulos) {
		this.listaCapitulos = listaCapitulos;
	}
	
	public void addCapitulo(Capitulo capitulo) {
		if(listaCapitulos==null)
			listaCapitulos = new ArrayList<Capitulo>();
		listaCapitulos.add(capitulo);
	}

	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", codISNN=" + codISNN + ", titulo=" + titulo + ", numPag="
				+ numPag +  ", listaCapitulos=" + listaCapitulos + "]";
	}
}
