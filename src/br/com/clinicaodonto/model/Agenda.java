package br.com.clinicaodonto.model;

public class Agenda {
	private String idAgenda;
	private String matricula;
	private String nome;
	private String servico;
	private String dataAgenda;
	private String horaAgenda;
	
	public Agenda() {
		// TODO Auto-generated constructor stub
	}

	public Agenda(String idAgenda, String matricula, String nome, String servico, String dataAgenda,
			String horaAgenda) {
		super();
		this.idAgenda = idAgenda;
		this.matricula = matricula;
		this.nome = nome;
		this.servico = servico;
		this.dataAgenda = dataAgenda;
		this.horaAgenda = horaAgenda;
	}

	public String getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(String idAgenda) {
		this.idAgenda = idAgenda;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getDataAgenda() {
		return dataAgenda;
	}

	public void setDataAgenda(String dataAgenda) {
		this.dataAgenda = dataAgenda;
	}

	public String getHoraAgenda() {
		return horaAgenda;
	}

	public void setHoraAgenda(String horaAgenda) {
		this.horaAgenda = horaAgenda;
	}

	
	
}
