package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FuncionarioDAO {
	
	private static List<Funcionario> FUNCIONARIOS = new ArrayList<>();
	private Funcionario funcionario;
	
	private static List<Paciente> PACIENTES = new ArrayList<>();
	private Paciente paciente;
	
	static {
		try {
			//Enfermeiras
			FUNCIONARIOS.add(new Funcionario("JoseLogin", "123abc", "Jose", "Secretaria"));
			FUNCIONARIOS.add(new Funcionario("MartaLogin", "123abc", "Marta", "Secretaria"));
			
			
			//Medicos
			FUNCIONARIOS.add(new Funcionario("MariaLogin", "123abc", "Maria", "Medico", 
					new Agenda("Pedrinho", new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("30/09/2019 10:20"))));			
			FUNCIONARIOS.add(new Funcionario("PauloLogin", "123abc", "Paulo", "Medico", 
					new Agenda("Mariazinha", new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("29/09/2019 07:20"))));		
			
			//Pacientes
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
		
		for(Funcionario f : FUNCIONARIOS)
			if(f.getNome()== nomeMedico){	
		return agenda = f.getAgenda();
			}
		return agenda;
	}
	
	public Funcionario verificarLogin(String login, String senha) {
		Funcionario funcionario = new Funcionario("","","","");
		
		for(Funcionario f: FUNCIONARIOS) {
			if(f.getLogin()==login && f.getSenha()==senha) {
				funcionario = f;}	
			}		
				return funcionario;
	}
		
	
}


