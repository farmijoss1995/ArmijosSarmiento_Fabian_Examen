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
public class GestionAutor {

	
	
	@Inject
	private AutorDAO adao;
	
	public void guardarAutor(Autor autor) {
		adao.insertar(autor);
	}
	
}
