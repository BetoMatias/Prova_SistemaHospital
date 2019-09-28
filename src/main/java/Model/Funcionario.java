package Model;

public class Funcionario {
	
	private String login;
	private String senha;
	private String nome;
	private String tipoFunc;
	private Agenda agenda;
	
	public Funcionario(String nome, String login, String senha, String tipo) {
		this.login = login;
		this.nome = nome;
		this.senha = senha;
		this.tipoFunc = tipo;
	}
	
	public Funcionario(String nome, String login, String senha, String tipo, Agenda agenda) {
		this.login = login;
		this.nome = nome;
		this.senha = senha;
		this.tipoFunc = tipo;
		this.agenda = agenda;
	}
	
	public Funcionario(String login, String senha) {
		this.login = login;
		this.senha = senha;
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

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
		
}

