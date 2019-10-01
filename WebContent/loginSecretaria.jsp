<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="loginSecretaria.css">
<title>Login Secretaria</title>
</head>
<body>
<h1 class="titulopagina">Bem vindo(a)${secretaria}</h1>
<a href=/HospitalP1/logout>Deslogar</a>	
<section class="container">

	<section class="paciente">
		<div class="formCadPaciente">
			<h1 class="title">Cadastrar Paciente</h1>
			<form class= "formPaciente" action="cadastroPaciente" method="Post">
					
				<label>Nome: <input type="text" name="Nome"
					placeholder="Informar nome" required />
				</label> 
				
				<label>Telefone: <input type="tel" name="telefone"
					placeholder="Informe o telefone" required />
				</label>
				
				<label>Sintomas: </br>
				<textarea name="sintomas" rows="5" cols="30"></textarea>
				</label>
				
				<button>Cadastrar</button>
			</form>
		</div>
	</section>	
	
		<section class="agenda">
			<div class="formAgenda">	
				<h1 class="title">Agendar Consulta</h1>
					<form class= "formuAgenda" action="agendarPaciente" method="post">
					
						<label>Médico: <input type="text" name="medico"
						placeholder="Informar Medico" required />
						</label> 
						<label>Paciente: <input type="text" name="paciente"
						placeholder="Informar Paciente" required />
						</label> 
						<label>Data: <input class="agenda" type="datetime-local" name="agenda"  min="2019-10-01" required />
						</label>
										
				<button>Agendar</button>			
			</form>
		</div>
	</section>	
</section>
<a href=index.jsp>Voltar ao inicio</a>	
</body>
</html>