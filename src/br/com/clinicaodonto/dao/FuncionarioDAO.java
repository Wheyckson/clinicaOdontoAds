package br.com.clinicaodonto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import com.sun.jdi.connect.spi.Connection;

import br.com.clinicaodonto.model.Funcionario;
import br.com.clinicaodonto.util.ConnectionFactory;

public class FuncionarioDAO {
	public Funcionario funcionario;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public FuncionarioDAO() throws Exception {
		try {
			conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			throw new Exception("Erro"+ e.getMessage());
		}
	}
	
	public void salvar( Funcionario funcionario) throws Exception {
		try {
			String sql="INSER INTO dadosfuncionario(idFuncionario,cro,categoria,nome,nascimento,sexo,rg,cpf,email,endereco,bairro,municipio,uf,cep,celular)"
					+"values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, funcionario.getIdFuncionario());
				ps.setString(2, funcionario.getCro());
				ps.setString(3, funcionario.getCategoria());
				ps.setString(4, funcionario.getNome());
				ps.setString(5, funcionario.getNascimento());
				ps.setString(6, funcionario.getSexo());
				ps.setString(7, funcionario.getRg());
				ps.setString(8, funcionario.getCpf());
				ps.setString(9, funcionario.getEmail());
				ps.setString(10, funcionario.getEndereco());
				ps.setString(11, funcionario.getBairro());
				ps.setString(12, funcionario.getMunicipio());
				ps.setString(13, funcionario.getUf());
				ps.setString(14, funcionario.getCep());
				ps.setString(15, funcionario.getCelular());
				ps.executeUpdate();
		} catch (Exception e1) {
			throw new Exception("Erro ao salvar"+ e1.getMessage());
		}
		
		public void alterar( Funcionario funcionario) throws Exception {
			try {
				String sql="UPDATE dadosfuncionario SET cro=?,categoria=?,nome=?,nascimento=?,sexo=?,rg=?,cpf=?,email=?,endereco=?,bairro=?,municipio=?,uf=?,cep=?,celular=?"
						+"WHERE idFuncionario=?";
					ps = conn.prepareStatement(sql);
					
					ps.setString(1, funcionario.getCro());
					ps.setString(2, funcionario.getCategoria());
					ps.setString(3, funcionario.getNome());
					ps.setString(4, funcionario.getNascimento());
					ps.setString(5, funcionario.getSexo());
					ps.setString(6, funcionario.getRg());
					ps.setString(7, funcionario.getCpf());
					ps.setString(8, funcionario.getEmail());
					ps.setString(9, funcionario.getEndereco());
					ps.setString(10, funcionario.getBairro());
					ps.setString(11, funcionario.getMunicipio());
					ps.setString(12, funcionario.getUf());
					ps.setString(13, funcionario.getCep());
					ps.setString(14, funcionario.getCelular());
					ps.setInt(15, funcionario.getIdFuncionario());
					ps.executeUpdate();
			} catch (Exception e2) {
				throw new Exception("Erro ao alterar"+ e2.getMessage());
			}
	}
}
	
//idfuncionario,cro,categoria,nome,nascimento,sexo,rg,cpf,email,endereco,bairro,municipio,uf,cep,celular