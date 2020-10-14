package br.com.clinicaodonto.model;

import java.awt.event.MouseAdapter;

public class Dentistas {
	private int idFuncionario;
	private String cro;
	private String categoria;
	private String nome;
	private String nascimento;
	private String sexo;
	private String rg;
	private String cpf;
	private String email;
	private String endereco;
	private String bairro;
	private String municipio;
	private String uf;
	private String cep;
	private String celular;
	
	public Dentistas() {
	}

	

	public Dentistas(int idFuncionario, String cro, String categoria, String nome, String nascimento, String sexo,
			String rg, String cpf, String email, String endereco, String bairro, String municipio, String uf,
			String cep, String celular) {
		super();
		this.idFuncionario = idFuncionario;
		this.cro = cro;
		this.categoria = categoria;
		this.nome = nome;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.rg = rg;
		this.cpf = cpf;
		this.email = email;
		this.endereco = endereco;
		this.bairro = bairro;
		this.municipio = municipio;
		this.uf = uf;
		this.cep = cep;
		this.celular = celular;
	}



	public int getIdfuncionario() {
		return idFuncionario;
	}
	
	public void setIdfuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getCro() {
		return cro;
	}

	public void setCro(String cro) {
		this.cro = cro;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

			
}
