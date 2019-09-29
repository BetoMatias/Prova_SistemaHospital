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
	<section class="horarioLista">
		<table class="tabelaAgenda" style="border: 1px solid black">
			<thead>
				<tr>
					<th>Consultas</th>
					<th>Prontuarios</th>
					<th>Remover</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="horario" items="${horarios}">
					<tr>
						<td class="listaConsulta"><c:out value="${horario}" /></td>
						<td class="prontuariocss"><a href=/HospitalP1/prontuarios?horario=<c:out value="${horario}"/>>Prontuario</a></td>
						<td class="deletarcss"><a href=/HospitalP1/deletar>Dar baixa.</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>
</body>
<a href=index.jsp>Voltar</a>	
</html>