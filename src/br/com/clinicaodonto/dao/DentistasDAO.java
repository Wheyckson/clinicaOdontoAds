package br.com.clinicaodonto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.clinicaodonto.model.Dentistas;
import br.com.clinicaodonto.util.ConnectionFactory;

public class DentistasDAO {

<<<<<<< Updated upstream
	private Dentistas dentistas;
=======
	public Dentistas dentista;
>>>>>>> Stashed changes
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
			String sql="INSERT INTO dadosfuncionario(idFuncionario,cro,categoria,nome,nascimento,sexo,rg,cpf,email,endereco,bairro,municipio,uf,cep,celular)"
					+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
<<<<<<< Updated upstream
			ps.setInt(1, dentistas.getIdfuncionario());
			ps.setInt(2, dentistas.getCro());
			ps.setString(3, dentistas.getCategoria());
			ps.setString(4, dentistas.getNome());
			ps.setString(5, dentistas.getNascimento());
			ps.setString(6, dentistas.getSexo());
			ps.setString(7, dentistas.getRg());	
			ps.setString(8, dentistas.getCpf());
			ps.setString(9, dentistas.getEmail());
			ps.setString(10, dentistas.getEndereco());
			ps.setString(11, dentistas.getBairro());
			ps.setString(12, dentistas.getMunicipio());
			ps.setString(13, dentistas.getUf());
			ps.setString(14, dentistas.getCep());
			ps.setString(15, dentistas.getCelular());
=======
			ps.setInt(1, dentista.getIdfuncionario());
			ps.setString(2, dentista.getCro());
			ps.setString(3, dentista.getCategoria());
			ps.setString(4, dentista.getNome());
			ps.setString(5, dentista.getNascimento());
			ps.setString(6, dentista.getSexo());
			ps.setString(7, dentista.getRg());	
			ps.setString(8, dentista.getCpf());
			ps.setString(9, dentista.getEmail());
			ps.setString(10, dentista.getEndereco());
			ps.setString(11, dentista.getBairro());
			ps.setString(12, dentista.getMunicipio());
			ps.setString(13, dentista.getUf());
			ps.setString(14, dentista.getCep());
			ps.setString(15, dentista.getCelular());
>>>>>>> Stashed changes
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Erro ao Salvar"+e.getMessage());
		}
	}
	public void alterar(Dentistas dentista) throws Exception {
		try {
			String sql="UPDATE dadosfuncionario SET cro=?,categoria=?,nome=?,nascimento=?,sexo=?,rg=?,cpf=?,email=?,endereco=?,bairro=?,municipio=?,uf=?,cep=?,celular=?"
					+ "WHERE idFuncionario";
			ps = conn.prepareStatement(sql);
<<<<<<< Updated upstream
			ps.setInt(1, dentistas.getCro());
			ps.setString(2, dentistas.getCategoria());
			ps.setString(3, dentistas.getNome());
			ps.setString(4, dentistas.getNascimento());
			ps.setString(5, dentistas.getSexo());
			ps.setString(6, dentistas.getRg());	
			ps.setString(7, dentistas.getCpf());
			ps.setString(8, dentistas.getEmail());
			ps.setString(9, dentistas.getEndereco());
			ps.setString(10, dentistas.getBairro());
			ps.setString(11, dentistas.getMunicipio());
			ps.setString(12, dentistas.getUf());
			ps.setString(13, dentistas.getCep());
			ps.setString(14, dentistas.getCelular());
			ps.setInt(15, dentistas.getIdfuncionario());
=======
			ps.setString(1, dentista.getCro());
			ps.setString(2, dentista.getCategoria());
			ps.setString(3, dentista.getNome());
			ps.setString(4, dentista.getNascimento());
			ps.setString(5, dentista.getSexo());
			ps.setString(6, dentista.getRg());	
			ps.setString(7, dentista.getCpf());
			ps.setString(8, dentista.getEmail());
			ps.setString(9, dentista.getEndereco());
			ps.setString(10, dentista.getBairro());
			ps.setString(11, dentista.getMunicipio());
			ps.setString(12, dentista.getUf());
			ps.setString(13, dentista.getCep());
			ps.setString(14, dentista.getCelular());
			ps.setInt(15, dentista.getIdfuncionario());
>>>>>>> Stashed changes
		} catch (Exception e) {
			// TODO: handle exception
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
		public Dentistas consultar(int idFuncionario) throws Exception {
			try {
				String sql="SELECT * FROM dadosfuncionario WHERE idFuncionario";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, idFuncionario);
				rs = ps.executeQuery();
				if(rs.next()) {
					int cro = rs.getInt("cro");
					String categoria = rs.getString("categoria");
					String nome = rs.getString("nome");
					String nascimento = rs.getString("nascimento");
					String sexo = rs.getString("sexo");
					String rg = rs.getString("rg");
					String cpf = rs.getString("cpf");
					String email = rs.getString("email");
					String endereco = rs.getString("endereco");
					String bairro = rs.getString("bairro");
					String municipio = rs.getString("municipio");
					String uf = rs.getString("uf");
					String cep = rs.getString("cep");
					String celular = rs.getString("celular");
<<<<<<< Updated upstream
					dentistas = new Dentistas(idFuncionario,cro,categoria,nome,nascimento,sexo,rg,cpf,email,endereco,bairro,municipio,uf,cep,celular);
=======
					dentista = new Dentistas(idFuncionario1,cro,categoria,nome,nascimento,sexo,rg,cpf,email,endereco,bairro,municipio,uf,cep,celular);
>>>>>>> Stashed changes
			}
			return dentista;
			}catch (Exception e) {
				// TODO: handle exception
				throw new Exception("Erro ao Consultar"+e.getMessage());
			}
			
		}
}	
