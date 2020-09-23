package br.com.clinicaodonto.model;

public class Agenda {
	private int idAgenda;
	private String matricula;
	private String idFuncionario;
	private String dataAgenda;
	private String horaAgeda;
	
	public Agenda() {
		// TODO Auto-generated constructor stub
	}

	public Agenda(int idAgenda, String matricula, String idFuncionario, String dataAgenda, String horaAgeda) {
		super();
		this.idAgenda = idAgenda;
		this.matricula = matricula;
		this.idFuncionario = idFuncionario;
		this.dataAgenda = dataAgenda;
		this.horaAgeda = horaAgeda;
	}

	public int getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(String idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getDataAgenda() {
		return dataAgenda;
	}

	public void setDataAgenda(String dataAgenda) {
		this.dataAgenda = dataAgenda;
	}

	public String getHoraAgeda() {
		return horaAgeda;
	}

	public void setHoraAgeda(String horaAgeda) {
		this.horaAgeda = horaAgeda;
	}
	
}
