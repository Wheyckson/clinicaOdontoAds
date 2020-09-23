package br.com.clinicaodonto.model;

public class Receita {
	private int matricila;
	private String medicamento;
	private String quantidade;
	private String prescricao;
	
	public Receita() {
		// TODO Auto-generated constructor stub
	}

	public Receita(int matricila, String medicamento, String quantidade, String prescricao) {
		super();
		this.matricila = matricila;
		this.medicamento = medicamento;
		this.quantidade = quantidade;
		this.prescricao = prescricao;
	}

	public int getMatricila() {
		return matricila;
	}

	public void setMatricila(int matricila) {
		this.matricila = matricila;
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
