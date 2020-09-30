package br.com.clinicaodonto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.clinicaodonto.model.Dentistas;
import br.com.clinicaodonto.util.ConnectionFactory;

public class DentistasDAO {

	private Dentistas dentistas;
	private Connection conn;
	private PreparedStatement ps;
	
	public DentistasDAO()  throws Exception{
		// TODO Auto-generated constructor stub
		try {
			conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Erro"+e.getMessage());
		}
	}
	
	public void salvar(Dentistas dentistas) throws Exception {
		try {
			String sql="INSERT INTO dadosfuncionario(idfuncionario,cro,cpf,nome,sobrenome,email,celular,endereco,cep)"
					+ "values (?,?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dentistas.getIdfuncionario());
			ps.setInt(2, dentistas.getCro());
			ps.setString(3, dentistas.getCpf());
			ps.setString(4, dentistas.getNome());
			ps.setString(5, dentistas.getSobrenome());
			ps.setString(6, dentistas.getEmail());
			ps.setString(7, dentistas.getCelular());
			ps.setString(8, dentistas.getEndereco());
			ps.setString(9, dentistas.getCep());
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Erro ao Salvar"+e.getMessage());
		
		}
	}
}
	//cro txtCroDentista
	//cpf txtCpfDentista
	//nome txtNomeDentista
	//sobrenome txtSobrenomeDentista
	//email	txtEmailDentista
	//telefone txtTelDentista
	//endereco txtEnderecoDentista
	//cep txtCepDentista
