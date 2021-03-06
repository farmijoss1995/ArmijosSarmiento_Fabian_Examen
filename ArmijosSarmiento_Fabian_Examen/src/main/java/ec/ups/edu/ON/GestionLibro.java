package ec.ups.edu.ON;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.DAO.AutorDAO;
import ec.ups.edu.DAO.CapituloDAO;
import ec.ups.edu.DAO.LibroDAO;
import ec.ups.edu.EN.Autor;
import ec.ups.edu.EN.Capitulo;
import ec.ups.edu.EN.Libro;

@Stateless
public class GestionLibro {

	@Inject
	private LibroDAO ldao;
	@Inject
	private CapituloDAO cdao;
	
	@Inject
	private AutorDAO adao;
	
	public void guardarLibro(Libro libro) {
		ldao.insertar(libro);
	}
	
	public List<Libro> listadoLibros(){
		return ldao.listar();
	}
	
	public List<Capitulo> libCapitulos(int idLibro){
		return cdao.listar(idLibro);
	}
	
	public Autor busqueda(int idAutor) {
		return adao.buscar(idAutor);
	}
}
