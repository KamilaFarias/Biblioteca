package br.edu.ifpb.biblioteca;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoverBD
 */
@WebServlet("/RemoverBD.do")
public class RemoverBD extends HttpServlet {
	private static final long serialVersionUID = 1L;
	       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		VolumeDAO dao = new VolumeDAO();
		Volume vol = dao.getById(request.getParameter("IDinserido")); 
			
		dao.delete(vol);
			
		response.sendRedirect("http://localhost:8080/Biblioteca/removerVolume.html");		
	}

}
