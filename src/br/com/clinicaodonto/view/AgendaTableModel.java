package br.com.clinicaodonto.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.clinicaodonto.util.ConnectionFactory;

import br.com.clinicaodonto.model.Agendas;
import br.com.clinicaodonto.dao.AgendasDAO;

public class AgendaTableModel extends AbstractTableModel {

	private List<Agendas> dados = new ArrayList<>();
	private String[] colunas = {"CPF","Nome","Serviço","Observaçoes","Data","Hora"};
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return colunas [column];
	}
	
	@Override
	public int getRowCount() {
		return dados.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0: 
			return dados.get(rowIndex).getCpf();
		case 1: 
			return dados.get(rowIndex).getNome();
		case 2: 
			return dados.get(rowIndex).getServico();
		case 3: 
			return dados.get(rowIndex).getObservacoes();
		case 4: 
			return dados.get(rowIndex).getDataAgenda();
		case 5: 
			return dados.get(rowIndex).getHoraAgenda();

		}
		return null;
	}
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0: 
			 dados.get(rowIndex).setCpf((String) aValue);
			 break;
		case 1: 
			 dados.get(rowIndex).setNome((String) aValue);
			 break;
		case 2: 
			 dados.get(rowIndex).setServico((String) aValue);
			 break;
		case 3: 
			 dados.get(rowIndex).setObservacoes((String) aValue);
			 break;
		case 4: 
			 dados.get(rowIndex).setDataAgenda((String) aValue);
			 break;
		case 5: 
			 dados.get(rowIndex).setHoraAgenda((String) aValue);

		}
		this.fireTableRowsUpdated(rowIndex, rowIndex);
	}
	
	public void addLinha(Agendas agendas) {
		this.dados.add(agendas);
		this.fireTableDataChanged();
	}
	public void removeLinha(int rowIndex) {
		this.dados.remove(rowIndex);
		this.fireTableRowsDeleted(rowIndex, rowIndex);
	}
	

}
