package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Funcionario;
import Model.FuncionarioDAO;

@WebServlet(urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = -9109311005532043020L;

	String login = "";
	String senha = "";
	FuncionarioDAO FUNCIONARIOS = new FuncionarioDAO();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FuncionarioDAO nDAO = new FuncionarioDAO();

		HttpSession session = req.getSession();

		login = req.getParameter("login");
		senha = req.getParameter("senha");
		Funcionario funcio = FUNCIONARIOS.verificarLogin(login, senha);

		if (funcio.getTipoFunc() == "Medico") {
			session.setAttribute("medico", login);

			List<String> pacientes = nDAO.consultarPacientes(login);
			List<String> horarios = nDAO.consultarHorarios(login);

			req.setAttribute("pacientes", pacientes);
			req.setAttribute("horarios", horarios);
			req.setAttribute("medico", login);
			req.getRequestDispatcher("loginMedico.jsp").forward(req, resp);

		} else if (funcio.getTipoFunc() == "Secretaria") {
			session.setAttribute("secretaria", login);
			req.getRequestDispatcher("loginSecretaria.jsp").forward(req, resp);
		} else {
			resp.sendRedirect("invalido.jsp");
		}
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FuncionarioDAO nDAO = new FuncionarioDAO();

		HttpSession session = req.getSession();
		if (session.getAttribute("medico") != null) {

			List<String> pacientes = nDAO.consultarPacientes(login);
			List<String> horarios = nDAO.consultarHorarios(login);
			req.setAttribute("pacientes", pacientes);
			req.setAttribute("horarios", horarios);
			req.setAttribute("medico", login);
			req.getRequestDispatcher("loginMedico.jsp").forward(req, resp);

		} else if (session.getAttribute("secretaria") != null) {
			req.getRequestDispatcher("loginSecretaria.jsp").forward(req, resp);
		} else {
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
}
