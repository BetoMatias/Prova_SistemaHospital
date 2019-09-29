<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.*,
				Model.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="index.css">
<title>Prontuario do ${paciente.nome}</title>
</head>
<body>
	<h1>${paciente.nome}</h1><br>
	<label>Sintomas: ${paciente.sintomas}</label><br>
	<form class="prontuarioCss" action="atualizarProntuario">
	<input type="hidden" name="paciente" value="${paciente.nome }"/> 
	<label>Prontuario: </br> <textarea name="prontuario" rows="10" cols="60"> ${paciente.prontuario}</textarea>
	</label>
	<button>Enviar/Atualizar</button>
	</form>
</body>
</html>