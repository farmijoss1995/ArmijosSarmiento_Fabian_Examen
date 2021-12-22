package ec.ups.edu.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.EN.Libro;

public class LibroDAO {
	
	@PersistenceContext 
	private EntityManager em;
	
	public Libro buscarLibro(int id) {
		Libro l = em.find(Libro.class, id);
		return l;
	}
	public void insert(Libro l) {
		em.persist(l);
	}
}
