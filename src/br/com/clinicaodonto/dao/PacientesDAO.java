package br.com.clinicaodonto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.clinicaodonto.model.Pacientes;
import br.com.clinicaodonto.util.ConnectionFactory;


public class PacientesDAO {
		
	public Pacientes paciente;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public PacientesDAO() throws Exception {
		
		try {
			conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			throw new Exception("Erro"+e.getMessage());
		}
	}
	
	public void salvar(Pacientes paciente) throws Exception {
		try {
			String sql="INSERT INTO dadospaciente(matricula,nome,nascimento,sexo,convenio,rg,cpf,email,endereco,municipio,cep,celular)"
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
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
			//ps.setString(10, paciente.getBairro());
			ps.setString(10, paciente.getMunicipio());
			//ps.setString(12, paciente.getUf());
			ps.setString(11, paciente.getCep());
			ps.setString(12, paciente.getCelular());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Erro ao Salvar"+e.getMessage());
		}
	}
	public void alterar(Pacientes pacientes) throws Exception {
		try {
			String sql="UPDATE dadospaciente SET nome=?,nascimento=?,sexo=?,convenio=?,rg=?,cpf=?,email=?,endereco=?,municipio=?,cep=?,celular=?"
					+ "WHERE matricula=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, pacientes.getNome());
			ps.setString(2, pacientes.getNascimento());
			ps.setString(3, pacientes.getSexo());
			ps.setString(4, pacientes.getConvenio());
			ps.setString(5, pacientes.getRg());	
			ps.setString(6, pacientes.getCpf());
			ps.setString(7, pacientes.getEmail());
			ps.setString(8, pacientes.getEndereco());
			//ps.setString(9, pacientes.getBairro());
			ps.setString(9, pacientes.getMunicipio());
			//ps.setString(11, pacientes.getUf());
			ps.setString(10, pacientes.getCep());
			ps.setString(11, pacientes.getCelular());
			ps.setInt(12, pacientes.getMatricula());
				
		} catch (Exception e) {
			throw new Exception("Erro ao Alterar"+e.getMessage());
		}
	}	
		public void excluir(int matricula) throws Exception {
			try {
				String sql="DELETE FROM dadospaciente WHERE matricula";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, matricula);
			} catch (Exception e) {
				// TODO: handle exception
				throw new Exception("Erro ao excluir"+e.getMessage());
			}
	}
		public Pacientes consultar(String matricula) throws Exception {
			String sql="SELECT * FROM `dadospaciente` WHERE matricula=?";
			
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, matricula);
				rs = ps.executeQuery();
				if(rs.next()) {
					int matricula1 = rs.getInt("matricula");
					String nome = rs.getString("nome");
					String nascimento = rs.getString("nascimento");
					String sexo = rs.getString("sexo");
					String convenio = rs.getString("convenio");
					String rg = rs.getString("rg");
					String cpf = rs.getString("cpf");
					String email = rs.getString("email");
					String endereco = rs.getString("endereco");
					//String bairro = rs.getString("bairro");
					String municipio = rs.getString("municipio");
					//String uf = rs.getString("uf");
					String cep = rs.getString("cep");
					String celular = rs.getString("celular");
					paciente = new Pacientes(matricula1, nome,nascimento,sexo,convenio,rg,cpf,email,endereco,municipio,cep,celular);
			}
			return paciente;
			}catch (Exception e) {
				// TODO: handle exception
				throw new Exception("Erro ao Consultar"+e.getMessage());
			}
			
		}
}
