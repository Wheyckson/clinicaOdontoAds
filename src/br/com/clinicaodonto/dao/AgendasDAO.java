package br.com.clinicaodonto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sun.jdi.connect.spi.ClosedConnectionException;

import br.com.clinicaodonto.model.Agendas;
import br.com.clinicaodonto.model.Receitas;
import br.com.clinicaodonto.util.ConnectionFactory;

public class AgendasDAO {
	public Agendas agenda;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public AgendasDAO() throws Exception {
		try {
			conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			throw new Exception("Erro"+e.getMessage());
		}
	}
	
	public void salvar(Agendas agenda) throws Exception {
		try {
			String sql="INSERT INTO agenda(cpf,nome,servico,observacoes,dataagenda,horaagenda)"
					+ "VALUES (?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, agenda.getCpf());
			ps.setString(2, agenda.getNome());
			ps.setString(3, agenda.getServico());
			ps.setString(4, agenda.getObservacoes());
			ps.setString(5, agenda.getDataAgenda());
			ps.setString(6, agenda.getHoraAgenda());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao Salvar"+e.getMessage());
		}
	}
		
	public void alterar(Agendas agenda) throws Exception {
		try {
			String sql="UPDATE agenda SET nome=?,servico=?,observacoes=?,dataagenda=?,horaagenda=?"
					+ "WHERE cpf=?";
			ps = conn.prepareStatement(sql);
			//.setString(1, agenda.getIdAgenda());
			ps.setString(1, agenda.getNome());
			ps.setString(2, agenda.getServico());
			ps.setString(3, agenda.getObservacoes());
			ps.setString(4, agenda.getDataAgenda());
			ps.setString(5, agenda.getHoraAgenda());
			ps.setString(6, agenda.getCpf());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao Alterar"+e.getMessage());
		}/*finally {
			ConnectionFactory.closeConnection(conn, ps);
		}*/
	}
	
	
	
		public List<Agendas> Listar() throws Exception {
			
			conn = ConnectionFactory.getConnection();
			ps = null;
			rs = null;
		
			List<Agendas> lista = new ArrayList<Agendas>();
			
			try {
			ps = conn.prepareStatement("SELECT * FROM agenda");
			rs = ps.executeQuery();
			
			while (rs.next()) {
				agenda = new Agendas();
				
				agenda.getIdAgenda();
				agenda.setCpf(rs.getString("cpf"));
				agenda.setNome(rs.getString("nome"));
				agenda.setServico(rs.getString("servico"));
				agenda.setObservacoes(rs.getString("observacoes"));
				agenda.setDataAgenda(rs.getString("dataagenda"));
				agenda.setHoraAgenda(rs.getString("horaagenda"));
				lista.add(agenda);
				
			}
			
		} catch (Exception e) {
			throw new Exception("Erro ao Listar"+e.getMessage());
			
		}/*finally {
			ConnectionFactory.closeConnection(conn,ps);
		}*/
			return lista;
	}	

	
	public Agendas consultar(String cpf) throws Exception {
		String sql="SELECT * FROM agenda WHERE cpf=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cpf);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				int idagenda = rs.getInt("idagenda");
				String cpf1 = rs.getString("cpf");
				String nome = rs.getString("nome");
				String servico = rs.getString("servico");
				String observacoes = rs.getString("observacoes");
				String dataagenda = rs.getString("dataagenda");
				String horaagenda = rs.getString("horaagenda");
				agenda = new Agendas(idagenda,cpf1,nome,servico,observacoes,dataagenda,horaagenda);
		}
		return agenda;
		}catch (Exception e) {
			throw new Exception("Erro ao Consultar"+e.getMessage());
		}
	}
	
	public void excluir(Agendas agenda) throws Exception {
		try {
			String sql = "DELETE FROM agenda WHERE cpf=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, agenda.getCpf());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao excluir" + e.getMessage());
		}
	}
}
