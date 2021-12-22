package ec.ups.edu.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.ups.edu.EN.Autor;

@Stateless
public class AutorDAO {

	@PersistenceContext(name="ArmijosSarmiento_Fabian_ExamenPersistenceUnit")
	private EntityManager em;
	
	public List<Autor> listar(){
		String jpql = "SELECT Autor FROM Autor a";
		Query q = em.createQuery(jpql, Autor.class);
		return q.getResultList();
	}
	
	public Autor buscar(int idAutor) {
		return em.find(Autor.class, idAutor);
	}
}
