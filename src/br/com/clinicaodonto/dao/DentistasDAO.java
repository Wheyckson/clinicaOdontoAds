package br.com.clinicaodonto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.clinicaodonto.model.Agendas;
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
			String sql="INSERT INTO dadosfuncionario(cro,nome,nascimento,sexo,rg,cpf,email,endereco,municipio,cep,celular)"
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			//ps.setInt(1, dentista.getIdfuncionario());
			ps.setString(1, dentista.getCro());
			//ps.setString(3, dentista.getCategoria());
			ps.setString(2, dentista.getNome());
			ps.setString(3, dentista.getNascimento());
			ps.setString(4, dentista.getSexo());
			ps.setString(5, dentista.getRg());	
			ps.setString(6, dentista.getCpf());
			ps.setString(7, dentista.getEmail());
			ps.setString(8, dentista.getEndereco());
			//ps.setString(11, dentista.getBairro());
			ps.setString(9, dentista.getMunicipio());
			//ps.setString(13, dentista.getUf());
			ps.setString(10, dentista.getCep());
			ps.setString(11, dentista.getCelular());
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
			ps.setString(12, dentistas.getIdfuncionario());
			ps.executeUpdate();
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
		public Dentistas consultar(String cpf) throws Exception {
			String sql="SELECT * FROM dadosfuncionario WHERE cpf=?";
						
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, cpf);
				rs = ps.executeQuery();
				if(rs.next()) {
					String idFuncionario = rs.getString("idFuncionario");
					String cro = rs.getString("cro");
					//String categoria = rs.getString("categoria");
					String nome = rs.getString("nome");
					String nascimento = rs.getString("nascimento");
					String sexo = rs.getString("sexo");
					String rg = rs.getString("rg");
					String cpf1 = rs.getString("cpf");
					String email = rs.getString("email");
					String endereco = rs.getString("endereco");
					//String bairro = rs.getString("bairro");
					String municipio = rs.getString("municipio");
					//String uf = rs.getString("uf");
					String cep = rs.getString("cep");
					String celular = rs.getString("celular");
					dentista = new Dentistas(idFuncionario,cro,nome,nascimento,sexo,rg,cpf1,email,endereco,municipio,cep,celular);

			}
			return dentista;
			}catch (Exception e) {
				
				throw new Exception("Erro ao Consultar"+e.getMessage());
			}
			
		}
public List<Dentistas> Listar() throws Exception {
				
			List<Dentistas> lista = new ArrayList<Dentistas>();
			
			try {
			ps = conn.prepareStatement("SELECT * FROM dadosfuncionario");
			rs = ps.executeQuery();
			
			while (rs.next()) {
				dentista = new Dentistas();
				
				dentista.setIdfuncionario(rs.getString("idfuncionario"));
				dentista.setCro(rs.getString("cro"));
				dentista.setNome(rs.getString("nome"));
				dentista.setNascimento(rs.getString("nascimento"));
				dentista.setSexo(rs.getString("sexo"));
				dentista.setRg(rs.getString("rg"));
				dentista.setCpf((rs.getString("cpf")));
				dentista.setEmail(rs.getString("email"));
				dentista.setEndereco(rs.getString("endereco"));
				dentista.setMunicipio(rs.getString("municipio"));
				dentista.setCep(rs.getString("cep"));
				dentista.setCelular(rs.getString("celular"));
				
				lista.add(dentista);
				
			}
			
		} catch (Exception e) {
			throw new Exception("Erro ao Listar"+e.getMessage());
			
		}/*finally {
			ConnectionFactory.closeConnection(conn,ps);
		}*/
			return lista;
	}	
}	
