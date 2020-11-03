package br.com.clinicaodonto.model;

public class Agendas {
	private int idAgenda;
	private String cpf;
	private String nome;
	private String servico;
	private String observacoes;
	private String dataAgenda;
	private String horaAgenda;
	
	public Agendas() {
		// TODO Auto-generated constructor stub
	}

	public Agendas(int idAgenda, String cpf, String nome, String servico, String observacoes, String dataAgenda,
			String horaAgenda) {
		super();
		this.idAgenda = idAgenda;
		this.cpf = cpf;
		this.nome = nome;
		this.servico = servico;
		this.observacoes = observacoes;
		this.dataAgenda = dataAgenda;
		this.horaAgenda = horaAgenda;
	}

	public int getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
	
	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
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

