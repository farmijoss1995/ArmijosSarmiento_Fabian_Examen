package ec.ups.edu.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.ups.edu.EN.Capitulo;

@Stateless
public class CapituloDAO {

	@PersistenceContext(name="ArmijosSarmiento_Fabian_ExamenPersistenceUnit")
	private EntityManager em;
	
	public void insertar(Capitulo capitulo) {
		em.persist(capitulo);
	}
	
	public List<Capitulo> listar(int idLibro){
		String jpql = "SELECT c FROM Capitulo c WHERE id_libro="+idLibro;
		Query q = em.createQuery(jpql, Capitulo.class);
		return q.getResultList();
	}
}
