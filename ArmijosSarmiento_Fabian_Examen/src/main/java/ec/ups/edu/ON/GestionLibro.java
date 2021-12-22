package ec.ups.edu.ON;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.DAO.AutorDAO;
import ec.ups.edu.DAO.CapituloDAO;
import ec.ups.edu.DAO.LibroDAO;

@Stateless
public class LibrosON {

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
