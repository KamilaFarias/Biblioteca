<%@page import="java.util.List"%>
<%@page import="br.edu.ifpb.biblioteca.Volume"%>
<%@page import="br.edu.ifpb.biblioteca.VolumeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
</head>
<body>
	<table>
		<tr>
			<th>Titulo</th>
			<th>Autores</th>
			<th>Descrição</th>
			<th>Numero de páginas</th>
			<th>Ano de publicação</th>
			<th>Editora</th>
		</tr>
		<%
      VolumeDAO dao = new VolumeDAO();
      List<Volume> volumes = dao.getAll();
      
   
      for (Volume volume : volumes ) {
      %>
		<tr>
			<td><%=volume.getTitulo() %></td>
			<td><%=volume.getAutores() %></td>
			<td><%=volume.getDescricao() %></td>
			<td><%=volume.getNumPaginas() %></td>
			<td><%=volume.getAnoPublicacao() %></td>
			<td><%=volume.getEditora() %></td>
		</tr>
		<%
      }
      %>
	</table>

</body>
</html>