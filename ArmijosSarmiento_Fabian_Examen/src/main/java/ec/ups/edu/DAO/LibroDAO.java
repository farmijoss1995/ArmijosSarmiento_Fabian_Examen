package ec.ups.edu.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.ups.edu.EN.Libro;

@Stateless
public class LibroDAO {

	@PersistenceContext(name="EXAMENMurilloJordanPersistenceUnit")
	private EntityManager em;
	public void insertar(Libro libro) {
		em.persist(libro);
	}
	
	public List<Libro> listar(){
		String jpql = "SELECT l FROM Libro l";
		Query q = em.createQuery(jpql, Libro.class);
		return q.getResultList();
	}
}
