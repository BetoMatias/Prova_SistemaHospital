package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FuncionarioDAO {

	private static List<Funcionario> FUNCIONARIOS = new ArrayList<>();

	private static List<Paciente> PACIENTES = new ArrayList<>();

	static {
		try {
			// Secretarias
			FUNCIONARIOS.add(new Funcionario("JoseLogin", "123abc", "Jose", "Secretaria",
					new Agenda("", new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("01/01/2019 00:00"))));
			FUNCIONARIOS.add(new Funcionario("MartaLogin", "123abc", "Marta", "Secretaria",
					new Agenda("", new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("01/01/2019 00:00"))));

			// Medicos
			FUNCIONARIOS.add(new Funcionario("Beto", "123", "Beto", "Medico",
					new Agenda("Testson", new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("30/09/2019 13:20"))));
			FUNCIONARIOS.add(new Funcionario("MariaLogin", "123abc", "Maria", "Medico",
					new Agenda("Pedrinho", new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("30/09/2019 10:20"))));
			FUNCIONARIOS.add(new Funcionario("PauloLogin", "123abc", "Paulo", "Medico",
					new Agenda("Mariazinha", new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("29/09/2019 07:20"))));

			// Pacientes
			PACIENTES.add(new Paciente("Pedrinho", "Dor de cabeça"));
			PACIENTES.add(new Paciente("Mariazinha", "Braço com formigamento"));

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void cadastrarSecretaria(String login, String senha, String nome) {
		FUNCIONARIOS.add(new Funcionario(login, senha, nome, "Secretaria"));

	}

	public void cadastrarMedico(String login, String senha, String nome) {
		FUNCIONARIOS.add(new Funcionario(login, senha, nome, "Medico"));

	}

	public void cadastrarPaciente(String nome, String sintomas) {
		PACIENTES.add(new Paciente(nome, sintomas));

	}

	public void alterarProntuario(String prontuario) {

	}

	public void agendarConsulta(String medico, Date horario) {

	}

	public Agenda consultarAgenda(String nomeMedico) {

		Agenda agenda = null;

		for (Funcionario f : FUNCIONARIOS)
			if (f.getNome() == nomeMedico) {
				return agenda = f.getAgenda();
			}
		return agenda;
	}

	public Funcionario verificarLogin(String login, String senha) {
		Funcionario funcionario = new Funcionario("", "", "", "", new Agenda(""));

		for (Funcionario f : FUNCIONARIOS) {
			if (f.getLogin().equals(login) && f.getSenha().equals(senha)) {
				funcionario = f;
			}
		}
		return funcionario;
	}

}
