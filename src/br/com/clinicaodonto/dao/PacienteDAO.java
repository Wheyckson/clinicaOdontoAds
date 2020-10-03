package br.com.clinicaodonto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.clinicaodonto.model.Dentistas;
import br.com.clinicaodonto.model.Paciente;
import br.com.clinicaodonto.util.ConnectionFactory;


public class PacienteDAO {
		
	private Paciente paciente;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public PacienteDAO() throws Exception {
		
		try {
			conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			throw new Exception("Erro"+e.getMessage());
		}
	}
	
	public void salvar(Paciente paciente) throws Exception {
		try {
			String sql="INSERT INTO dadospaciente(matricula,nome,nascimento,sexo,convenio,rg,cpf,email,endereco,bairro,municipio,uf,cep,celular)"
					+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, paciente.getMatricula());
			ps.setString(2, paciente.getNome());
			ps.setString(3, paciente.getNascimento());
			ps.setString(4, paciente.getSexo());
			ps.setString(5, paciente.getConvenio());
			ps.setString(6, paciente.getRg());	
			ps.setString(7, paciente.getCpf());
			ps.setString(8, paciente.getEmail());
			ps.setString(9, paciente.getEndereco());
			ps.setString(10, paciente.getBairro());
			ps.setString(11, paciente.getMunicipio());
			ps.setString(12, paciente.getUf());
			ps.setString(13, paciente.getCep());
			ps.setString(14, paciente.getCelular());
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Erro ao Salvar"+e.getMessage());
		}
	}
	public void alterar(Dentistas dentistas) throws Exception {
		try {
			String sql="UPDATE dadospaciente SET cro=?,categoria=?,nome=?,nascimento=?,sexo=?,rg=?,cpf=?,email=?,endereco=?,bairro=?,municipio=?,uf=?,cep=?,celular=?"
					+ "WHERE idFuncionario";
			ps = conn.prepareStatement(sql);
			ps.setString(3, paciente.getNome());
			ps.setString(4, paciente.getNascimento());
			ps.setString(5, paciente.getSexo());
			ps.setString(2, paciente.getConvenio());
			ps.setString(6, paciente.getRg());	
			ps.setString(7, paciente.getCpf());
			ps.setString(8, paciente.getEmail());
			ps.setString(9, paciente.getEndereco());
			ps.setString(10, paciente.getBairro());
			ps.setString(11, paciente.getMunicipio());
			ps.setString(12, paciente.getUf());
			ps.setString(13, paciente.getCep());
			ps.setString(14, paciente.getCelular());
			ps.setInt(15, paciente.getMatricula());
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Erro ao Alterar"+e.getMessage());
		}
	}	
		public void excluir(int matricula) throws Exception {
			try {
				String sql="DELETE FROM dadosfuncionario WHERE idFuncionario";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, matricula);
			} catch (Exception e) {
				// TODO: handle exception
				throw new Exception("Erro ao excluir"+e.getMessage());
			}
	}
		public Paciente consultar(int matricula) throws Exception {
			try {
				String sql="SELECT * FROM dadosfuncionario WHERE idFuncionario";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, matricula);
				rs = ps.executeQuery();
				if(rs.next()) {
					int cro = rs.getInt("cro");
					String nome = rs.getString("nome");
					String nascimento = rs.getString("nascimento");
					String sexo = rs.getString("sexo");
					String convenio = rs.getString("convenio");
					String rg = rs.getString("rg");
					String cpf = rs.getString("cpf");
					String email = rs.getString("email");
					String endereco = rs.getString("endereco");
					String bairro = rs.getString("bairro");
					String municipio = rs.getString("municipio");
					String uf = rs.getString("uf");
					String cep = rs.getString("cep");
					String celular = rs.getString("celular");
					paciente = new Paciente(matricula,nome,nascimento,sexo,convenio,rg,cpf,email,endereco,bairro,municipio,uf,cep,celular);
			}
			return paciente;
			}catch (Exception e) {
				// TODO: handle exception
				throw new Exception("Erro ao Consultar"+e.getMessage());
			}
			
		}
}
