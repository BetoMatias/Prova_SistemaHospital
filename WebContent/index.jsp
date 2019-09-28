<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="index.css">
</head>
<body>
<section class="container">
	<div class="form-login">
		<h1 class="title">Hospital São Beto</h1>
		<form action="controller" method="post">
		
			<label>Login <input type="text" name="login" placeholder="Informar Usuario" required />	</label>
			
			<label>Senha: <input type="password" name="senha" placeholder="Informe sua senha" required /> </label>
			
			<button>Entrar</button>
			<a href=/cadastro>Cadastrar</a>
			
		</form>
	</div>
</section>
</body>
</html>