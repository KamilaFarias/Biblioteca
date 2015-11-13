package br.edu.ifpb.biblioteca;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login.do")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String nome = request.getParameter("nomeAdmin");
		String senha = request.getParameter("senhaAdmin");
		
		if ((nome.equals("admin") && (senha.equals("admin")))){
			response.sendRedirect("http://localhost:8080/Biblioteca/admin.html");
		}else{
			response.sendRedirect("http://localhost:8080/Biblioteca/index.jsp");
		}
				
	}

}