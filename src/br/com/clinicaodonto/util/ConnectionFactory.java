package br.com.clinicaodonto.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class ConnectionFactory {
		
	public static Connection getConnection() throws Exception{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String login = "root";
			String password = "";
			String url = "jdbc:mysql://localhost:3306/clinicaodonto";
			return DriverManager.getConnection(url,login,password);
		}
		catch(Exception e) {
			throw new Exception(e.getMessage()); //Remover depois
		}
	}
	public static void main(String[] args) {
		try {
		Connection conn = ConnectionFactory.getConnection();
		JOptionPane.showMessageDialog(null, "Conectado com sucesso!"); //Remover depois
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void closeConnection(Connection conn) {
		//PreparedStatement ps, ResultSet rs
		//closeConnection(conn, ps, rs);
		
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		/*public static void closeConnection(Connection conn, PreparedStatement ps) {
				closeConnection(conn, ps);
			
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			public static void closeConnection(Connection conn, PreparedStatement ps, ResultSet rs) {
				//PreparedStatement ps, ResultSet rs
				closeConnection(conn, ps);
				
				try {
					if (rs != null) {
						rs.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
	}*/
}
