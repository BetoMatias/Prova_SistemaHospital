<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


  <form action='index' method='POST'>

  <label>Nome:
  <input type="text" name="nome" placeholder="Favor inserir o nome do funcionário" />
  </label>

  <label>Login:
  <input type="text" name='login' placeholder='Digite um login' />
  </label>

  <label>Senha:
  <input type='password' name='senha' placeholder='Digite a senha.' />
  </label>

  <input type='radio' name='tipoFunc' value='Medico'> Medico<br>
  <input type='radio' name='tipoFunc' value='Secretaria'> Secretaria<br>

  <button>Cadastrar</button>
  </form>



</body>
</html>