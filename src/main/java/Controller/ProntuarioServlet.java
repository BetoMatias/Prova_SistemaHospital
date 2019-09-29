package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.FuncionarioDAO;
import Model.Paciente;


@WebServlet (urlPatterns = { "/prontuarios" })
public class ProntuarioServlet extends HttpServlet {
	private static final long serialVersionUID = -2113159070295189709L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		FuncionarioDAO dao = new FuncionarioDAO();
		
		String horario = req.getParameter("horario");
		String[] prontuario = horario.split(" - ");
		
	
		
		Paciente paciente = dao.consultarPaciente(prontuario[0]);
		
		req.setAttribute("paciente", paciente);
		req.getRequestDispatcher("prontuario.jsp").forward(req, resp);
	}
	

}
