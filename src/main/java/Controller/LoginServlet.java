package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.FuncionarioDAO;

@WebServlet(urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = -9109311005532043020L;

	FuncionarioDAO FUNCIONARIOS = new FuncionarioDAO();

	String login = "";
	String senha = "";

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		login = req.getParameter("login");
		senha = req.getParameter("senha");

		if (FUNCIONARIOS.verificarLogin(login, senha).getTipoFunc() == "Medico") {
			resp.sendRedirect("loginMedico.jsp");
		} else if (FUNCIONARIOS.verificarLogin(login, senha).getTipoFunc() == "Secretaria") {
			resp.sendRedirect("loginSecretaria.jsp");
		} else {
			resp.sendRedirect("invalido.jsp");
		}
	}
}
