package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Agenda {

	private String[] paciente;
	private Date[] horario;

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	public Agenda(String nome, Date data) {

		for (String s : paciente) {
			if (s == null) {
				paciente[0] = nome;
			}
		}
		for (Date hora: horario) {
			if (hora == null) {
				horario[0] = data;
			}
		}
	}
	
	public Agenda(String nome) {
	this.paciente[0] = nome;
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
