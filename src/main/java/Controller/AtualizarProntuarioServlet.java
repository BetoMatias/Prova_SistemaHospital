package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.FuncionarioDAO;
import Model.Paciente;

@WebServlet (urlPatterns = { "/atualizarProntuario" })
public class AtualizarProntuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 8290558137441827185L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FuncionarioDAO dao = new FuncionarioDAO();
		
		String prontuario = req.getParameter("prontuario");
		String nomepaciente = req.getParameter("paciente");
		
		Paciente paciente = dao.consultarPaciente(nomepaciente);
		
		paciente.setProntuario(prontuario);
		
		resp.sendRedirect("loginMedico.jsp");
	}	
}
