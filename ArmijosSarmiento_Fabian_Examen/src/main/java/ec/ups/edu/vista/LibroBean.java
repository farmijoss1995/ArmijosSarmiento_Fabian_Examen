package ec.ups.edu.vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ec.ups.edu.EN.Autor;
import ec.ups.edu.EN.Capitulo;
import ec.ups.edu.EN.Libro;
import ec.ups.edu.ON.GestionAutor;
import ec.ups.edu.ON.GestionLibro;

@ManagedBean
@ViewScoped
public class LibroBean {

	@Inject
	private GestionLibro libON;
	
	private GestionAutor autON;
	
	public GestionAutor getAutON() {
		return autON;
	}

	private Libro newLibro;
	
	private Autor newAutor;
	
	private List<Libro> listado;
	
	private String codAutor;
	
	private List<Capitulo> caps;
	
	@PostConstruct
	public void init() {
		newAutor = new Autor();
		newLibro = new Libro();
		Capitulo c = new Capitulo();
		newLibro.addCapitulo(c);
		loadDataLibros();
	}
	
	
	
	public List<Capitulo> getCaps() {
		return caps;
	}

	public String cargarCaps(int idLibro) {
		System.out.println(idLibro);
		caps = libON.libCapitulos(idLibro);
		return null;
	}

	public void setCaps(List<Capitulo> caps) {
		this.caps = caps;
	}



	public GestionLibro getLibON() {
		return libON;
	}


	public void setLibON(GestionLibro libON) {
		this.libON = libON;
	}

	public void setAutON(GestionAutor autON) {
		this.autON = autON;
	}



	public Autor getNewAutor() {
		return newAutor;
	}



	public void setNewAutor(Autor newAutor) {
		this.newAutor = newAutor;
	}


	public Libro getNewLibro() {
		return newLibro;
	}


	public void setNewLibro(Libro newLibro) {
		this.newLibro = newLibro;
	}


	public List<Libro> getListado() {
		return listado;
	}


	public void setListado(List<Libro> listado) {
		this.listado = listado;
	}

	
	public String getCodAutor() {
		return codAutor;
	}

	public void setCodAutor(String codAutor) {
		this.codAutor = codAutor;
	}
	
	public String guardarDatosA() throws Exception {
		System.out.println(this.toString());
		
		autON.guardarAutor(newAutor);
		
		return "listado";
	}
	
	public String guardarDatos() throws Exception {
		System.out.println(this.toString());
		
		libON.guardarLibro(newLibro);
		
		return "listado";
	}
	
	public String addCapitulo() {
		Capitulo c = new Capitulo();
		newLibro.addCapitulo(c);
		return null;
	}
	
	public String addAutor() {
		Autor a = new Autor();
		
		return null;
	}

	private void loadDataLibros() {
		listado = libON.listadoLibros();
	}
	
	public Autor busAutor() {
		System.out.println(libON.busqueda(Integer.parseInt(codAutor)));
		Autor au= libON.busqueda(Integer.parseInt(codAutor));
		codAutor=au.getNombre() + " " + au.getNacionalidad();
		return au;
	}
}
