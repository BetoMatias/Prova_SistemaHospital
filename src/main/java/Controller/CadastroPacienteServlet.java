package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.FuncionarioDAO;

@WebServlet(urlPatterns = { "/cadastroPaciente" })
public class CadastroPacienteServlet extends HttpServlet{

	private static final long serialVersionUID = -4855914994149928785L;
	FuncionarioDAO FUNCIONARIOS = new FuncionarioDAO();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String nome = req.getParameter("Nome");
	String telefone = req.getParameter("telefone");
	String sintomas = req.getParameter("sintomas");
	
	FUNCIONARIOS.cadastrarPaciente(nome, telefone, sintomas);
	
	resp.sendRedirect("loginSecretaria.jsp");
	}
}
