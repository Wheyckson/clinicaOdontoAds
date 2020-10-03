package br.com.clinicaodonto.model;

public class Paciente {
	private int matricula;
	private String nome;
	private String nascimento;
	private String sexo;
	private String convenio;
	private String rg;
	private String cpf;
	private String email;
	private String endereco;
	private String bairro;
	private String municipio;
	private String uf;
	private String cep;
	private String celular;
	
	public Paciente() {
	
	}

	public Paciente(int matricula, String nome, String nascimento, String sexo, String convenio, String rg, String cpf,
			String email, String endereco, String bairro, String municipio, String uf, String cep, String celular) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.convenio = convenio;
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

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
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

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
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
