package ec.ups.edu.EN;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Libro {

	@Id
	private String isnn;
	private String Titulo;
	private String anioEdicion;
	private String editorial;
	@OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "libroIsnn")
    private List<Capitulo> capitulos;
	public String getIsnn() {
		return isnn;
	}
	public void setIsnn(String isnn) {
		this.isnn = isnn;
	}

	public List<Capitulo> getCapitulos() {
		return capitulos;
	}
	public void setCapitulos(List<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAnioEdicion() {
		return anioEdicion;
	}
	public void setAnioEdicion(String anioEdicion) {
		this.anioEdicion = anioEdicion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	 public void agregarCapitulo(Capitulo capitulo) {
			if(this.capitulos==null)
				this.capitulos = new ArrayList<>();
			this.capitulos.add(capitulo);
		}
}
