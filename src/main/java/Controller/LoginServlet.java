package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.FuncionarioDAO;

@WebServlet(urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = -9109311005532043020L;

	String login = "";
	String senha = "";

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		FuncionarioDAO FUNCIONARIOS = new FuncionarioDAO();
		
		login = req.getParameter("login");
		senha = req.getParameter("senha");

		
		
		if (FUNCIONARIOS.verificarLogin(login, senha).getTipoFunc() == "Medico") {
			HttpSession session = req.getSession();
			session.setAttribute("medico", login);
			resp.sendRedirect("loginMedico.jsp");
		} else if (FUNCIONARIOS.verificarLogin(login, senha).getTipoFunc() == "Secretaria") {
			HttpSession session = req.getSession();
			session.setAttribute("secretaria", login);
			resp.sendRedirect("loginSecretaria.jsp");
		} else {
			resp.sendRedirect("invalido.jsp");
		}
	}
}
