package br.com.clinicaodonto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.clinicaodonto.model.Pacientes;
import br.com.clinicaodonto.model.Receitas;

public class ReceitasDAO {
	
	public Receitas receita;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public ReceitasDAO() {
		
	}
	
	public void salvar(Pacientes paciente) throws Exception {
		try {
			String sql="INSERT INTO receita(matricula,medicamento,quantidade,prescricao)"
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, receita.getMatricula());
			//ps.setString(2, receitas.getNome());
			ps.setString(2, receita.getMedicamento());
			ps.setString(3, receita.getQuantidade());
			ps.setString(4, receita.getPrescricao());
			
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Erro ao Salvar"+e.getMessage());
		}
	}
	public void alterar(Pacientes pacientes) throws Exception {
		try {
			String sql="UPDATE receita SET medicamento=?, quantidade=?, prescricao=?"
					+ "WHERE matricula=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, receita.getMedicamento());
			ps.setString(2, receita.getQuantidade());
			ps.setString(3, receita.getPrescricao());
			ps.setInt(4, receita.getMatricula());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao Alterar"+e.getMessage());
		}
	}
	public Receitas consultar(String matricula) throws Exception {
		String sql="SELECT * FROM `receita` WHERE matricula=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, matricula);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				int matricula1 = rs.getInt("matricula");
				String medicamento = rs.getString("medicamento");
				String quantidade = rs.getString("quantidade");
				String prescricao = rs.getString("prescricao");
				receita = new Receitas(matricula1,medicamento,quantidade,prescricao);
		}
		return receita;
		}catch (Exception e) {
			throw new Exception("Erro ao Consultar"+e.getMessage());
		}
	}
}