package Model;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

	private static List<Funcionario> FUNCIONARIOS = new ArrayList<Funcionario>();

	private static List<Paciente> PACIENTES = new ArrayList<Paciente>();

	static {
		try {
			// Secretarias
			FUNCIONARIOS.add(new Funcionario("Jose" /* Login */, "123"/* senha */, "Secretaria"/* função */, "", ""));

			FUNCIONARIOS.add(new Funcionario("Carlos", "123", "Secretaria", "", ""));
			FUNCIONARIOS.add(new Funcionario("Maria", "123", "Secretaria", "", ""));

			// Medicos
			FUNCIONARIOS.add(new Funcionario("Beto"/* login */, "123"/* senha */, "Medico"/* função */,
					"Testson"/* paciente */, "30/09/2019 13:20"/* agenda */));

			FUNCIONARIOS.add(new Funcionario("Barbara", "123", "Medico", "Thiago", "30/09/2019 13:20"));
			FUNCIONARIOS.add(new Funcionario("Cleide", "123", "Medico", "Pedro", "29/09/2019 07:20"));

			// Pacientes
			PACIENTES.add(new Paciente("Pedro" /* nome */, "1234-1234"/* telefone */, "Dor de cabeça"/* Sintoma */,
					""/* Prontuario */));

			PACIENTES.add(new Paciente("Testson", "1234-4321", "em teste", ""));
			PACIENTES.add(new Paciente("Thiago", "1234-4321", "Dor no peito, mas bem", "teste"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void cadastrarSecretaria(String login, String senha) {
		FUNCIONARIOS.add(new Funcionario(login, senha, "Secretaria"));

	}

	public void cadastrarMedico(String login, String senha) {
		System.out.println(login + senha);
		FUNCIONARIOS.add(new Funcionario(login, senha, "Medico"));

	}

	public void cadastrarPaciente(String nome, String telefone, String sintomas) {
		System.out.println(nome + telefone + sintomas);
		PACIENTES.add(new Paciente(nome, telefone, sintomas, ""));

	}

	public void removerConsulta(String loginMedico, String paciente) {
		System.out.println("Médico " + loginMedico + "- Paciente " + paciente + "| consulta removida.");

		if (!paciente.equals("Sem")) {
			for (Funcionario f : FUNCIONARIOS)
				if (f.getLogin().equals(loginMedico)) {
					int i = f.paciente.indexOf(paciente);
					f.paciente.remove(i);
					f.horario.remove(i);
				}
		}

	}

	public void agendarConsulta(String medico, String paciente, String horario) {

		for (Funcionario f : FUNCIONARIOS)
			if (f.getLogin().equals(medico)) {
				f.setPaciente(paciente);
				f.setHorario(horario);
			}
	}

	public ArrayList<String> consultarPacientes(String nomeMedico) {

		ArrayList<String> agendamento = new ArrayList<String>();

		for (Funcionario f : FUNCIONARIOS)
			if (f.getLogin().equals(nomeMedico)) {
				if (f.paciente != null && f.paciente.size() > 0) {
					agendamento = f.paciente;
				} else {
					agendamento.add("Sem pacientes.");
				}
			}
		return agendamento;
	}

	public Paciente consultarPaciente(String nomePaciente) {
		for (Paciente p : PACIENTES) {
			if (p.getNome().equals(nomePaciente)) {
				return p;
			}
		}
		return null;
	}

	public ArrayList<String> consultarHorarios(String nomeMedico) {

		ArrayList<String> agendamento = new ArrayList<String>();

		for (Funcionario f : FUNCIONARIOS)
			if (f.getLogin().equals(nomeMedico)) {
				if (f.horario != null && f.horario.size() > 0) {
					for (int i = 0; i < f.paciente.size(); i++) {
						agendamento.add(f.paciente.get(i) + " - " + f.horario.get(i));
					}
				} else {
					agendamento.add("Sem consultas.");
				}
			}
		return agendamento;
	}

	public Funcionario verificarLogin(String login, String senha) {
		Funcionario funcionario = null;
		for (Funcionario f : FUNCIONARIOS) {
			String logins = f.getLogin();
			String senhas = f.getSenha();

			if (logins.equals(login) && senhas.equals(senha)) {
				funcionario = f;
			}
		}
		if (funcionario == null) {
			funcionario = new Funcionario("1", "1", "1", "1", "1");
		}
		return funcionario;
	}

}
