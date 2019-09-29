package Model;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

	private static List<Funcionario> FUNCIONARIOS = new ArrayList<Funcionario>();

	private static List<Paciente> PACIENTES = new ArrayList<Paciente>();

	static {
		try {
			// Secretarias
			FUNCIONARIOS.add(new Funcionario("Jose", "Jose", "123", "Secretaria", "", ""));
			FUNCIONARIOS.add(new Funcionario("Marta", "Marta", "123", "Secretaria", "", ""));

			// Medicos
			FUNCIONARIOS.add(new Funcionario("Beto" /* nome */, "BetoL"/* login */, "123"/* senha */,
					"Medico"/* função */, "Testson"/* paciente */, "30/09/2019 13:20"/* agenda */));
			
			Funcionario barabara = new Funcionario("Barbara", "Barbara", "123", "Medico", "Testson", "30/09/2019 13:20");
			barabara.setPaciente("Thiago");
			barabara.setHorario("30/09/2019 11:20");
			FUNCIONARIOS.add(barabara);
			
			FUNCIONARIOS.add(new Funcionario("Maria", "Maria", "123", "Medico", "Pedrinho", "30/09/2019 10:20"));
			FUNCIONARIOS.add(new Funcionario("Paulo", "Paulo", "123", "Medico", "Mariazinha", "29/09/2019 07:20"));

			// Pacientes
			PACIENTES.add(new Paciente("Pedrinho" /* nome */, "1234-1234"/* telefone */, "Dor de cabeça"/* Sintoma */,
					""/* Prontuario */));
			PACIENTES.add(new Paciente("Mariazinha", "1234-4321", "Braço com formigamento", ""));
			PACIENTES.add(new Paciente("Testson", "1234-4321", "em teste", ""));
			PACIENTES.add(new Paciente("Thiago", "1234-4321", "Dor no peito, mas bem", "teste"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void cadastrarSecretaria(String nome, String login, String senha) {
		System.out.println(login + "Oi eu sou um login \n" + senha + "Oi eu sou uma senha \n" + nome);
		FUNCIONARIOS.add(new Funcionario(nome, login, senha, "Secretaria"));

	}

	public void cadastrarMedico(String nome, String login, String senha) {
		System.out.println(login + senha + nome);
		FUNCIONARIOS.add(new Funcionario(nome, login, senha, "Medico"));

	}

	public void cadastrarPaciente(String nome, String telefone, String sintomas) {
		System.out.println(nome + telefone + sintomas);
		PACIENTES.add(new Paciente(nome, telefone, sintomas, ""));

	}

	public void removerConsulta(String loginMedico, String paciente) {
		System.out.println(paciente);
		for (Funcionario f : FUNCIONARIOS)
			if (f.getLogin().equals(loginMedico)) {
				System.out.println(paciente = "dentro do for");
				int i = f.paciente.indexOf(paciente);				
				if(f.paciente.get(i) != null && f.horario.get(i) != null) {
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
				}else {
					agendamento.add("Sem pacientes.");
				}
			}
		return agendamento;
	}
	
	public Paciente consultarPaciente(String nomePaciente) {
		for(Paciente p : PACIENTES) {
			if(p.getNome().equals(nomePaciente)) {
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
					for(int i = 0; i < f.paciente.size(); i++) {
						  agendamento.add(f.paciente.get(i) + " - " + f.horario.get(i));
						}
				}else {
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
				System.out.println("Login deu certo");

			}
		}
		if (funcionario == null) {
			funcionario = new Funcionario("1", "1", "1", "1", "1", "1");
		}
		return funcionario;
	}

}
