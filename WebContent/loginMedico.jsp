<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.*,
				Model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="loginMedico.css">
</head>
<body>

	<h1>Consultas agendadas para ${medico}</h1>
	<section class="pacientesLista">
		<table style="border: 1px solid black">
			<thead>
				<tr>
					<th>Nome</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="nomePaciente" items="${pacientes}">
					<tr>
						<td><c:out value="${nomePaciente}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>
	<section class="horarioLista">
		<table style="border: 1px solid black">
			<thead>
				<tr>
					<th>Horário</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="horario" items="${horarios}">
					<tr>
						<td><c:out value="${horario}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>

</body>
</html>