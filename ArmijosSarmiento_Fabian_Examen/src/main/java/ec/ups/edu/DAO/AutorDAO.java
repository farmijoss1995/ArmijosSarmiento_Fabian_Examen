package ec.ups.edu.DAO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.EN.Autor;

@Stateless
public class AutorDAO {
	@PersistenceContext 
	private EntityManager em;
	
	public Autor searchAutor(int id) {
		Autor autor = em.find(Autor.class, id);
		return autor;
	}

	public void insertAutor(Autor autor) {
		em.persist(autor);
	}
	public Autor buscarAutor(int id) {
		Autor f = em.find(Autor.class, id);
		return f;
	}
	
	public void update(Autor a)  {
		em.merge(a);
	}
}