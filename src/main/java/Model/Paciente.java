package Model;

public class Paciente {

	private String nome;
	private String sintomas;
	private String prontuario;
	
	public Paciente(String nome, String sintomas) {
		this.nome = nome;
		this.sintomas = sintomas;
		
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
	
}
