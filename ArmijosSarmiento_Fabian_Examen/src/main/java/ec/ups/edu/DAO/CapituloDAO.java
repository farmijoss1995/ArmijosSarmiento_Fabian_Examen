package ec.ups.edu.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.ups.edu.EN.Capitulo;

public class CapituloDAO {
	@PersistenceContext 
	private EntityManager em;
	
	public void insertCapitulo(Capitulo dcapitulo) {
		em.persist(dcapitulo);
	}
}
