package Model;

public class Paciente {

	private String nome;
	private String sintomas;
	private String prontuario;
	private String telefone;
	private String nomeMedico;
	
	public Paciente(String nome, String telefone, String sintomas, String prontuario) {
		this.nome = nome;
		this.sintomas = sintomas;
		this.prontuario = prontuario;
		this.telefone = telefone;
		
	}
	
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSintomas() {
		return sintomas;
	}
	
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	
	public String getProntuario() {
		return prontuario;
	}
	
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}



	public String getNomeMedico() {
		return nomeMedico;
	}



	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
