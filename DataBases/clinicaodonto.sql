CREATE TABLE DADOSPACIENTE (
	MATRICULA INT NOT NULL AUTO_INCREMENT,
	NOME VARCHAR(80) NOT NULL,
    NASCIMENTO VARCHAR(15),
    SEXO VARCHAR(10),
    CONVENIO VARCHAR(10),
    RG VARCHAR(15) NOT NULL,
	CPF VARCHAR(15) NOT NULL,
    EMAIL VARCHAR(80),
    ENDERECO VARCHAR(50),
    BAIRRO VARCHAR(50),
    MUNICIPIO VARCHAR(40),
    UF CHAR(2)NULL,
    CEP VARCHAR(10)NULL,
    CELULAR VARCHAR(20)NULL,
CONSTRAINT PK_MATRICULA PRIMARY KEY (MATRICULA),
CONSTRAINT UQ_DADOSPACIENTE_CPF UNIQUE (CPF),
CONSTRAINT UQ_DADOSPACIENTE_RG UNIQUE (RG)
);

CREATE TABLE DADOSFUNCIONARIO (
	IDFUNCIONARIO INT NOT NULL AUTO_INCREMENT,
    CRO INT ,
    CATEGORIA VARCHAR(20) NULL,
	NOME VARCHAR(80) NOT NULL,
    NASCIMENTO VARCHAR(15) NULL,
    SEXO VARCHAR(10) NULL,    
    RG VARCHAR(15) NOT NULL,
	CPF VARCHAR(15) NOT NULL,
    EMAIL VARCHAR(80) NULL,
    ENDERECO VARCHAR(50) NULL,
    BAIRRO VARCHAR(50) NULL,
    MUNICIPIO VARCHAR(40) NULL,
    UF CHAR(2) NOT NULL,
    CEP VARCHAR(10) NOT NULL,
    CELULAR VARCHAR(20) NOT NULL,
CONSTRAINT PK_IDFUNCIONARIO PRIMARY KEY (IDFUNCIONARIO),
CONSTRAINT UQ_DADOSFUNCIONARIO_CRO UNIQUE (CRO),
CONSTRAINT UQ_DADOSFUNCIONARIO_RG UNIQUE (RG),
CONSTRAINT UQ_DADOSFUNCIONARIO_CPF UNIQUE (CPF)
);

CREATE TABLE AGENDA (	
	IDAGENDA INT NOT NULL AUTO_INCREMENT,
    MATRICULA INT NOT NULL,
    NOME INT NOT NULL,
    SERVICO VARCHAR(20) NULL,
	DATAAGENDA DATE NULL,
	HORAAGENDA INT NULL,
CONSTRAINT PK_IDAGENDA PRIMARY KEY (IDAGENDA),
CONSTRAINT FK_RECEITA_DADOSPACIENTE FOREIGN KEY (MATRICULA) REFERENCES DADOSPACIENTE (MATRICULA)
);

CREATE TABLE RECEITA(
	MATRICULA INT,
	NOME VARCHER(80),
	MEDICAMENTO VARCHAR(15),
    QUANTIDADE VARCHAR(20),
    PRESCRICAO VARCHAR(10),
CONSTRAINT FK_RECEITA_DADOSPACIENTE FOREIGN KEY (MATRICULA) REFERENCES DADOSPACIENTE (MATRICULA)
);