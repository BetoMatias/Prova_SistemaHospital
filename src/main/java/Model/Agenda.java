package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Agenda {
	
	private String[] paciente;
	private Date[] horario;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	public Agenda(String nome, Date data) {

		for(int i = 0; i<paciente.length; i++) {
			if(paciente[i] == null) {
				this.paciente[i] = nome;
			}
		}
		for(int i1 = 0; i1<horario.length; i1++) { 
			if(horario[i1] == null) {
				this.horario[i1] = data;
			}			
		}	
	}

	
	public Date[] getHorario() {
		return horario;
	}


	public void setHorario(Date[] horario) {
		this.horario = horario;
	}
	
	public String getHorarioTexto() {
		return sdf.format(horario);
	}


	public String[] getPaciente() {
		return paciente;
	}


	public void setPaciente(String[] paciente) {
		this.paciente = paciente;
	}
	
}
