package br.com.clinicaodonto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.clinicaodonto.model.Receitas;
import br.com.clinicaodonto.util.ConnectionFactory;

public class ReceitasDAO {
	
	public Receitas receita;
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public ReceitasDAO() throws Exception {
		try {
			conn = ConnectionFactory.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Erro"+e.getMessage());
		}
	}
	
	public void salvar(Receitas receita) throws Exception {
		try {
			String sql="INSERT INTO receita(cpf,nome,medicamento,quantidade)"
					+ "VALUES (?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, receita.getCpf());
			ps.setString(2, receita.getNome());
			ps.setString(3, receita.getMedicamento());
			ps.setString(4, receita.getQuantidade());
			//ps.setString(5, receita.getPrescricao());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao Salvar"+e.getMessage());
		}
	}
	public void alterar(Receitas receita) throws Exception {
		try {
			String sql="UPDATE receita SET nome=?, medicamento=?, quantidade=?"
					+ "WHERE cpf=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, receita.getNome());
			ps.setString(2, receita.getMedicamento());
			ps.setString(3, receita.getQuantidade());
			//ps.setString(3, receita.getPrescricao());
			ps.setString(4, receita.getCpf());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new Exception("Erro ao Alterar"+e.getMessage());
		}
	}
	
	
	
	public List listarTodos(String cpf) throws Exception {
		List<Receitas> lista = new ArrayList<Receitas>();
		try {
			ps = conn.prepareStatement("SELECT * FROM receita WHERE cpf=?");
			ps.setString(1, cpf);
			rs = ps.executeQuery();
			while (rs.next()) {
				String cpf1 = rs.getString("cpf");
				String nome = rs.getString("nome");
				String medicamento = rs.getString("medicamento");
				String quantidade = rs.getString("quantidade");

				receita = new Receitas(cpf1,nome,medicamento,quantidade);
				lista.add(receita);
			}
			return lista;

		} catch (Exception e) {
			throw new Exception("Erro ao Listar" + e.getMessage());
		}
	}
	
	public Receitas consultar(String cpf) throws Exception {
		String sql="SELECT * FROM receita WHERE cpf=?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cpf);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				String cpf1 = rs.getString("cpf");
				String nome = rs.getString("nome");
				String medicamento = rs.getString("medicamento");
				String quantidade = rs.getString("quantidade");
				receita = new Receitas(cpf1,nome,medicamento,quantidade);
		}
		return receita;
		}catch (Exception e) {
			throw new Exception("Erro ao Consultar"+e.getMessage());
		}
	}
}