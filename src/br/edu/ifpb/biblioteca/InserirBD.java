package br.edu.ifpb.biblioteca;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InserirBD.do")
public class InserirBD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		VolumeDAO dao = new VolumeDAO();
		
		Volume vol = new Volume();
		
		vol.setAutores(request.getParameter("autor"));
		vol.setAnoPublicacao(request.getParameter("ano"));
		vol.setDescricao(request.getParameter("descricao"));
		vol.setEditora(request.getParameter("editora"));
		vol.setNumPaginas(Integer.parseInt(request.getParameter("numPaginas")));
		vol.setTipoVolume(request.getParameter("tipoVolume"));
		vol.setTitulo(request.getParameter("titulo"));
		
		dao.insert(vol);
		
		response.sendRedirect("http://localhost:8080/Biblioteca/inserirVolume.html");
	}

}
