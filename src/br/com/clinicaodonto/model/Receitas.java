package br.com.clinicaodonto.model;

public class Receitas {
	//private int idreceita;
	private String cpf;
	private String nome;
	private String medicamento;
	private String quantidade;
	//private String prescricao;
	
	public Receitas() {
		// TODO Auto-generated constructor stub
	}

	public Receitas(String cpf,String nome, String medicamento, String quantidade) {
		super();
		//this.idreceita = idreceita;
		this.cpf = cpf;
		this.nome = nome;
		this.medicamento = medicamento;
		this.quantidade = quantidade;
		//this.prescricao = prescricao;
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

	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	/*public String getPrescricao() {
		return prescricao;
	}

	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}*/
	
}
