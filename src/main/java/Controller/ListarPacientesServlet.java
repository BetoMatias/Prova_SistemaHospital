package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.FuncionarioDAO;
import Model.Paciente;


@WebServlet(urlPatterns = { "/listaPacientes" })
public class ListarPacientesServlet extends HttpServlet {
	
	private static final long serialVersionUID = 6708931644752526055L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FuncionarioDAO dao = new FuncionarioDAO();
		
		List<Paciente> pacienteLista = FuncionarioDAO.PACIENTES;

		req.setAttribute("listaP", pacienteLista);
		req.getRequestDispatcher("listaPacientes.jsp").forward(req, resp);
		
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		FuncionarioDAO dao = new FuncionarioDAO();
		
		List<Paciente> pacienteLista = FuncionarioDAO.PACIENTES;

		req.setAttribute("listaP", pacienteLista);
		req.getRequestDispatcher("listaPacientes.jsp").forward(req, resp);
		
	}
	

}