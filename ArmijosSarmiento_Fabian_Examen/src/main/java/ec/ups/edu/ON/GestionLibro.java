package ec.ups.edu.ON;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.DAO.AutorDAO;
import ec.ups.edu.DAO.CapituloDAO;
import ec.ups.edu.DAO.LibroDAO;

@Stateless
public class GestionLibro {
	@Inject
	private AutorDAO aDAO;
	@Inject
	private LibroDAO lDAO;
	@Inject
	private CapituloDAO cDAO;
}
