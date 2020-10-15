package br.com.clinicaodonto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.clinicaodonto.model.Dentistas;
import br.com.clinicaodonto.util.ConnectionFactory;

public class DentistasDAO {


	public Dentistas dentista;

	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public DentistasDAO()  throws Exception{
		// TODO Auto-generated constructor stub
		try {
			conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Erro"+e.getMessage());
		}
	}
	
	public void salvar(Dentistas dentista) throws Exception {
		try {
			String sql="INSERT INTO dadosfuncionario(idFuncionario,cro,nome,nascimento,sexo,rg,cpf,email,endereco,municipio,cep,celular)"
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dentista.getIdfuncionario());
			ps.setString(2, dentista.getCro());
			//ps.setString(3, dentista.getCategoria());
			ps.setString(3, dentista.getNome());
			ps.setString(4, dentista.getNascimento());
			ps.setString(5, dentista.getSexo());
			ps.setString(6, dentista.getRg());	
			ps.setString(7, dentista.getCpf());
			ps.setString(8, dentista.getEmail());
			ps.setString(9, dentista.getEndereco());
			//ps.setString(11, dentista.getBairro());
			ps.setString(10, dentista.getMunicipio());
			//ps.setString(13, dentista.getUf());
			ps.setString(11, dentista.getCep());
			ps.setString(12, dentista.getCelular());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Erro ao Salvar"+e.getMessage());
		}
	}
	public void alterar(Dentistas dentistas) throws Exception {
		try {
			String sql="UPDATE dadosfuncionario SET cro=?,nome=?,nascimento=?,sexo=?,rg=?,cpf=?,email=?,endereco=?,municipio=?,cep=?,celular=?"
					+ "WHERE idFuncionario=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, dentistas.getCro());
			//ps.setString(2, dentista.getCategoria());
			ps.setString(2, dentistas.getNome());
			ps.setString(3, dentistas.getNascimento());
			ps.setString(4, dentistas.getSexo());
			ps.setString(5, dentistas.getRg());	
			ps.setString(6, dentistas.getCpf());
			ps.setString(7, dentistas.getEmail());
			ps.setString(8, dentistas.getEndereco());
			//ps.setString(10, dentista.getBairro());
			ps.setString(9, dentistas.getMunicipio());
			//ps.setString(12, dentista.getUf());
			ps.setString(10, dentistas.getCep());
			ps.setString(11, dentistas.getCelular());
			ps.setInt(12, dentistas.getIdfuncionario());
			
		} catch (Exception e) {
			throw new Exception("Erro ao Alterar"+e.getMessage());
		}
	}	
		public void excluir(int idfuncionario) throws Exception {
			try {
				String sql="DELETE FROM dadosfuncionario WHERE idFuncionario";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, idfuncionario);
			} catch (Exception e) {
				// TODO: handle exception
				throw new Exception("Erro ao excluir"+e.getMessage());
			}
	}
		public Dentistas consultar(String idFuncionario) throws Exception {
			String sql="SELECT * FROM dadosfuncionario WHERE idFuncionario=?";
						
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, idFuncionario);
				rs = ps.executeQuery();
				if(rs.next()) {
					int idFuncionario1 = rs.getInt("idFuncionario");
					String cro = rs.getString("cro");
					//String categoria = rs.getString("categoria");
					String nome = rs.getString("nome");
					String nascimento = rs.getString("nascimento");
					String sexo = rs.getString("sexo");
					String rg = rs.getString("rg");
					String cpf = rs.getString("cpf");
					String email = rs.getString("email");
					String endereco = rs.getString("endereco");
					//String bairro = rs.getString("bairro");
					String municipio = rs.getString("municipio");
					//String uf = rs.getString("uf");
					String cep = rs.getString("cep");
					String celular = rs.getString("celular");
					dentista = new Dentistas(idFuncionario1,cro,nome,nascimento,sexo,rg,cpf,email,endereco,municipio,cep,celular);

			}
			return dentista;
			}catch (Exception e) {
				
				throw new Exception("Erro ao Consultar"+e.getMessage());
			}
			
		}
}	
