package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.FuncionarioDAO;

@WebServlet(urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {

	FuncionarioDAO FUNCIONARIOS;

	String login = "";
	String senha = "";

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		login = req.getParameter("login");
		senha = req.getParameter("senha");

		if (FUNCIONARIOS.verificarLogin(login, senha) == "Medico") {
			// mandar para jsp loginMedico
		} else if (FUNCIONARIOS.verificarLogin(login, senha) == "Secretaria") {
			// mandar para jsp loginMedico
		} else {
			System.out.println("Login invalido");
		}
	}
}
