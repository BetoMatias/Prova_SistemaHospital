package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.FuncionarioDAO;

@WebServlet(urlPatterns = { "/cadastrar" })
public class CadastroServlet extends HttpServlet {

	private static final long serialVersionUID = -2369408128931801269L;

	FuncionarioDAO FUNCIONARIOS;

	String nome = "";
	String login = "";
	String senha = "";

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if (req.getParameter("radio") == "Medico") {
			FUNCIONARIOS.cadastrarMedico(nome, login, senha);
		} else if (req.getParameter("radio") == "Secretaria") {
			FUNCIONARIOS.cadastrarSecretaria(login, senha, nome);
		}
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
}
