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

	FuncionarioDAO FUNCIONARIOS = new FuncionarioDAO();

	String nome = "";
	String login = "";
	String senha = "";

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("tipoFunc"));
		nome = req.getParameter("nome");
		login = req.getParameter("login");
		senha = req.getParameter("senha");
		
		if (req.getParameter("tipoFunc").contentEquals("Medico")) {
			
			FUNCIONARIOS.cadastrarMedico(login, senha);
			System.out.println("Médico(a) adicionado(a).");
		}
		else if (req.getParameter("tipoFunc").equals("Secretaria")) {
			FUNCIONARIOS.cadastrarSecretaria(login, senha);
			
			
			System.out.println("Secretaria(o) adicionada(o).");
		}
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}
}
