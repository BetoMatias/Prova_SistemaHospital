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
			FUNCIONARIOS.add(new Funcionario("JoseLogin", "123abc", "Jose", "Secretaria","",""));
			FUNCIONARIOS.add(new Funcionario("MartaLogin", "123abc", "Marta", "Secretaria","",""));

			// Medicos
			FUNCIONARIOS.add(new Funcionario("BetoL" /*login*/, "123"/*senha*/, "Beto"/*nome*/, "Medico"/*função*/,
												"Testson"/*paciente*/,"30/09/2019 13:20"/*agenda*/));
			FUNCIONARIOS.add(new Funcionario("MariaLogin", "123abc", "Maria", "Medico","Pedrinho","30/09/2019 10:20"));
			FUNCIONARIOS.add(new Funcionario("PauloLogin", "123abc", "Paulo", "Medico","Mariazinha","29/09/2019 07:20"));

			// Pacientes
			PACIENTES.add(new Paciente("Pedrinho" /*nome*/,"1234-1234"/*telefone*/,"Dor de cabeça"/*Sintoma*/, ""/*Prontuario*/));
			PACIENTES.add(new Paciente("Mariazinha","1234-4321","Braço com formigamento", ""));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void cadastrarSecretaria(String login, String senha, String nome) {
		FUNCIONARIOS.add(new Funcionario(login, senha, nome, "Secretaria"));

	}

	public void cadastrarMedico(String login, String senha, String nome) {
		FUNCIONARIOS.add(new Funcionario(login, senha, nome, "Medico"));

	}

	public void cadastrarPaciente(String nome,String telefone, String sintomas) {
		PACIENTES.add(new Paciente(nome, telefone, sintomas, ""));

	}

	public void alterarProntuario(String prontuario) {

	}

	public void agendarConsulta(String medico, String paciente, String horario) {
		
		for (Funcionario f : FUNCIONARIOS)
			if (f.getNome() == medico) {
				f.setPaciente(paciente);
				f.setHorario(horario);
				
				
			}

	}

	public String[] consultarPacientes(String nomeMedico) {

		String[] agendamento = new String[100];

		for (Funcionario f : FUNCIONARIOS)
			if (f.getNome() == nomeMedico) {
				
				for(int i = 0; i< f.paciente.length-1;i++) {
					if(f.getPaciente(i)==null) {
						agendamento[i] = "Agenda vazia.";
					} else {
						agendamento[i] = f.getPaciente(i);					
				}
				}	
			}
		return agendamento;
	}
	public String[] consultarHorarios(String nomeMedico) {

		String[] agendamento = new String[100];

		for (Funcionario f : FUNCIONARIOS)
			if (f.getNome() == nomeMedico) {
				
				for(int i = 0; i< f.paciente.length-1;i++) {
					if(f.getPaciente(i)==null) {
						agendamento[i] = "Agenda vazia.";
					} else {
						agendamento[i] = f.getHorario(i);					
				}
				}	
			}
		return agendamento;
	}
	

	public Funcionario verificarLogin(String login, String senha) {
		Funcionario funcionario = null;
		for (Funcionario f : FUNCIONARIOS) {
			if (f.getLogin().equals(login) && f.getSenha().equals(senha)) {
				funcionario = f;
				System.out.println("Login deu certo");
			}
		}
		if (funcionario == null) {
			funcionario = new Funcionario("1", "1", "1", "Secretaria","1","1");
		}
		return funcionario;
	}

}
