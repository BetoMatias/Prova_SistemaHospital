package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.FuncionarioDAO;

@WebServlet(urlPatterns = { "/agendarPaciente" })
public class AgendamentoServlet extends HttpServlet {

	private static final long serialVersionUID = -4727726527910061931L;
	FuncionarioDAO dao = new FuncionarioDAO();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		if (session.getAttribute("secretaria") != null) {

			String medico = req.getParameter("medico");
			String paciente = req.getParameter("paciente");
			String horario = req.getParameter("agenda");

			if (dao.consultarPaciente(paciente) == null) {
				System.out.println("paciente não cadastrado");
			} else {

				dao.agendarConsulta(medico, paciente, horario);
			}
			resp.sendRedirect("loginSecretaria.jsp");
		} else {
			resp.sendRedirect("index.jsp");
		}
	}
}
