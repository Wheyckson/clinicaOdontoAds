package br.com.clinicaodonto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.clinicaodonto.model.Dentistas;
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
			String sql="INSERT INTO dadospaciente(nome,nascimento,sexo,convenio,rg,cpf,email,endereco,municipio,cep,celular)"
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			//ps.setInt(1, paciente.getMatricula());
			ps.setString(1, paciente.getNome());
			ps.setString(2, paciente.getNascimento());
			ps.setString(3, paciente.getSexo());
			ps.setString(4, paciente.getConvenio());
			ps.setString(5, paciente.getRg());	
			ps.setString(6, paciente.getCpf());
			ps.setString(7, paciente.getEmail());
			ps.setString(8, paciente.getEndereco());
			//ps.setString(10, paciente.getBairro());
			ps.setString(9, paciente.getMunicipio());
			//ps.setString(12, paciente.getUf());
			ps.setString(10, paciente.getCep());
			ps.setString(11, paciente.getCelular());
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
			ps.setString(12, pacientes.getMatricula());
			ps.executeUpdate();	
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
		public Pacientes consultar(String cpf) throws Exception {
			String sql="SELECT * FROM dadospaciente WHERE cpf=?";
			
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, cpf);
				rs = ps.executeQuery();
				if(rs.next()) {
					String matricula = rs.getString("matricula");
					String nome = rs.getString("nome");
					String nascimento = rs.getString("nascimento");
					String sexo = rs.getString("sexo");
					String convenio = rs.getString("convenio");
					String rg = rs.getString("rg");
					String cpf1 = rs.getString("cpf");
					String email = rs.getString("email");
					String endereco = rs.getString("endereco");
					//String bairro = rs.getString("bairro");
					String municipio = rs.getString("municipio");
					//String uf = rs.getString("uf");
					String cep = rs.getString("cep");
					String celular = rs.getString("celular");
					paciente = new Pacientes(matricula, nome,nascimento,sexo,convenio,rg,cpf1,email,endereco,municipio,cep,celular);
			}
			return paciente;
			}catch (Exception e) {
				// TODO: handle exception
				throw new Exception("Erro ao Consultar"+e.getMessage());
			}
			
		}
public List<Pacientes> Listar() throws Exception {
			
			conn = ConnectionFactory.getConnection();
			ps = null;
			rs = null;
		
			List<Pacientes> lista = new ArrayList<Pacientes>();
			
			try {
			ps = conn.prepareStatement("SELECT * FROM dadospaciente");
			rs = ps.executeQuery();
			
			while (rs.next()) {
				paciente = new Pacientes();
				
				paciente.setMatricula(rs.getString("matricula"));
				paciente.setConvenio(rs.getString("convenio"));
				paciente.setNome(rs.getString("nome"));
				paciente.setNascimento(rs.getString("nascimento"));
				paciente.setSexo(rs.getString("sexo"));
				paciente.setRg(rs.getString("rg"));
				paciente.setCpf((rs.getString("cpf")));
				paciente.setEmail(rs.getString("email"));
				paciente.setEndereco(rs.getString("endereco"));
				paciente.setMunicipio(rs.getString("municipio"));
				paciente.setCep(rs.getString("cep"));
				paciente.setCelular(rs.getString("celular"));
				
				lista.add(paciente);
				
			}
			
		} catch (Exception e) {
			throw new Exception("Erro ao Listar"+e.getMessage());
			
		}/*finally {
			ConnectionFactory.closeConnection(conn,ps);
		}*/
			return lista;
	}	
}
