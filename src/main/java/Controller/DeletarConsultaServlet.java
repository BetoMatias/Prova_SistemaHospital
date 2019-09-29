package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.FuncionarioDAO;


@WebServlet(urlPatterns = { "/deletar" })
public class DeletarConsultaServlet extends HttpServlet {
	private static final long serialVersionUID = -2921710009693193935L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		FuncionarioDAO dao = new FuncionarioDAO();
		
		String horario = req.getParameter("horario");
		
		String[] nomePaciente = horario.split(" - ");
		
		String loginMedico = req.getParameter("medico");
		
		dao.removerConsulta(loginMedico, nomePaciente[0]);
				
		req.getRequestDispatcher("/login").forward(req, resp);
		
	}
	

}
