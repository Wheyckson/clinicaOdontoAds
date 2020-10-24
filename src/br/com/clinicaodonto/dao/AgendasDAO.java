package br.com.clinicaodonto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.clinicaodonto.model.Agenda;
import br.com.clinicaodonto.model.Receitas;

public class AgendasDAO {
	public Agenda agenda;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public AgendasDAO() {
		
	}
	
	public void salvar(Agenda agenda) throws Exception {
		try {
			String sql="INSERT INTO receita(idagenda,matricula,nome,servico,dataagenda,horaagenda)"
					+ "VALUES (?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, agenda.getIdAgenda());
			ps.setString(2, agenda.getMatricula());
			ps.setString(3, agenda.getNome());
			ps.setString(4, agenda.getServico());
			ps.setString(5, agenda.getDataAgenda());
			ps.setString(6, agenda.getHoraAgenda());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Erro ao Salvar"+e.getMessage());
		}
	}
	public void alterar(Receitas receita) throws Exception {
		try {
			String sql="UPDATE receita SET idagenda=?,idfuncionario=?,dataagenda=?,horaagenda=?"
					+ "WHERE matricula=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, agenda.getIdAgenda());
			ps.setString(2, agenda.getNome());
			ps.setString(3, agenda.getServico());
			ps.setString(4, agenda.getDataAgenda());
			ps.setString(6, agenda.getHoraAgenda());
			ps.setString(6, agenda.getMatricula());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao Alterar"+e.getMessage());
		}
	}
	
	
	
	/*public List listarTodos() throws Exception {
		List<Agenda> lista = new ArrayList<Agenda>();
		try {
			ps = conn.prepareStatement("SELECT * FROM agenda");
			rs = ps.executeQuery();
			while (rs.next()) {
				String matricula = rs.getString("matricula");
				String nome = rs.getString("nome");
				String servico = rs.getString("quantidade");
				String dataagenda = rs.getString("servico");
				String horaagenda = rs.getString("horaagenda");
				agenda = new Agenda(matricula,nome,servico,dataagenda,horaagenda);
				lista.add(agenda);
			}
			return lista;

		} catch (Exception e) {
			throw new Exception("Erro ao Listar" + e.getMessage());
		}
	}*/
	
	public Agenda consultar(String matricula) throws Exception {
		String sql="SELECT * FROM agenda WHERE matricula=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, matricula);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				String idagenda = rs.getString("idagenda");
				String matricula1 = rs.getString("matricula");
				String nome = rs.getString("nome");
				String servico = rs.getString("servico");
				String dataagenda = rs.getString("dataagenda");
				String horaagenda = rs.getString("horaagenda");
				agenda = new Agenda(idagenda,matricula1,nome,servico,dataagenda,horaagenda);
		}
		return agenda;
		}catch (Exception e) {
			throw new Exception("Erro ao Consultar"+e.getMessage());
		}
	}
	
}
