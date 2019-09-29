package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.FuncionarioDAO;

@WebServlet(urlPatterns = { "/agendarPaciente" })
public class AgendamentoServlet extends HttpServlet{

	private static final long serialVersionUID = -4727726527910061931L;
		FuncionarioDAO FUNCIONARIOS = new FuncionarioDAO();

		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		String medico = req.getParameter("medico");
		String paciente = req.getParameter("paciente");
		String sintomas = req.getParameter("sintomas");
		
		FUNCIONARIOS.cadastrarPaciente(medico, paciente, sintomas);
		

		}
	}

