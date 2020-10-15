package br.com.clinicaodonto.model;

public class Receitas {
	private int matricula;
	private String medicamento;
	private String quantidade;
	private String prescricao;
	
	public Receitas() {
		// TODO Auto-generated constructor stub
	}

	public Receitas(int matricula, String medicamento, String quantidade, String prescricao) {
		super();
		this.matricula = matricula;
		this.medicamento = medicamento;
		this.quantidade = quantidade;
		this.prescricao = prescricao;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
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

	public String getPrescricao() {
		return prescricao;
	}

	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
	}
	
}
