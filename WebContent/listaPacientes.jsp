<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.*,
				Model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="listaPacientes.css">
</head>
<body>

	<h1>Pacientes Cadastrados no Hospital São Beto</h1>	
	<section class="horarioLista">
		<table class="listaDePacientes" style="border: 1px solid black">
			<thead>
				<tr>
					<th>Pacientes  </th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="lista" items="${listaP}">
					<tr>
						<td class="listaPacientes"><c:out value="${lista.nome}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>
</body>
<a href=/HospitalP1/login>Voltar.</a>	
</html>