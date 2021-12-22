package ec.ups.edu.vista;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.ups.edu.EN.Autor;
import ec.ups.edu.EN.Capitulo;
import ec.ups.edu.EN.Libro;
import ec.ups.edu.ON.GestionLibro;

@WebServlet("/listado")
public class Vista extends HttpServlet{

	@Inject
	private GestionLibro libON;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().println("<title>Libros</title>");
		response.getWriter().println("LLEGUE Libros");
		
		Autor a1 = new Autor();
		a1.setIdAutor(1);
		
		System.out.println(a1.toString());
		
		Libro l1 = new Libro();
		l1.setTitulo("La Cueva");
		l1.setCodISNN("732478-1895");
		l1.setNumPag(200);
		
		Capitulo c1 = new Capitulo();
		Capitulo c2 = new Capitulo();
		c1.setIdCapitulo(1);
		c1.setNumeroCap(20);
		c1.setCapTitulo("Hola");
		c1.setAutor(a1);
		
		c2.setCapTitulo("2");
		c2.setNumeroCap(40);
		c2.setAutor(a1);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		List<Capitulo> caps = new ArrayList<Capitulo>();
		caps.add(c1);
		caps.add(c2);
		
		l1.setListaCapitulos(caps);
		
	System.out.println(l1.toString());
		
		libON.guardarLibro(l1);
	}
}
