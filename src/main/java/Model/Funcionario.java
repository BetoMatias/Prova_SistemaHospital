package Model;

public class Funcionario {
	
	private String login;
	private String senha;
	private String nome;
	private String tipoFunc;
	public String[] paciente;
	public String[] horario;
	
	public Funcionario(String nome, String login, String senha, String tipo) {
		this.login = login;
		this.nome = nome;
		this.senha = senha;
		this.tipoFunc = tipo;
	}
	
	public Funcionario(String nome, String login, String senha, String tipo, String paciente, String horario ) {
		this.login = login;
		this.nome = nome;
		this.senha = senha;
		this.tipoFunc = tipo;

		
	}
	
	public Funcionario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public void setPaciente(String nome) {
		for(int i=0; i<paciente.length-1; i++) {
			this.paciente[i] = nome;
		}
	}
	
	public void setHorario(String hora) {
		for(int i=0; i<horario.length-1; i++) {
			this.horario[i] = hora;
		}
		
	}
	
	public String getPaciente(int index) {
		return this.paciente[index];
	}
	
	public String getHorario(int index) {
		return this.horario[index];
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipoFunc() {
		return tipoFunc;
	}
	
	public void setTipoFunc(String tipoFunc) {
		this.tipoFunc = tipoFunc;
	}
		
}

