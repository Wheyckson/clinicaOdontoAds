/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinicaodonto.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;

import br.com.clinicaodonto.dao.AgendasDAO;
import br.com.clinicaodonto.dao.DentistasDAO;
import br.com.clinicaodonto.dao.PacientesDAO;
import br.com.clinicaodonto.dao.ReceitasDAO;
import br.com.clinicaodonto.model.Agendas;
import br.com.clinicaodonto.model.Dentistas;
import br.com.clinicaodonto.model.Pacientes;
import br.com.clinicaodonto.model.Receitas;

/**
 *
 * @author whey
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
	//AgendaTableModel tableModel = new AgendaTableModel();
    
    public Menu() {
        initComponents(); 
        
        viewInicial.setEnabled(true);
        viewInicial.setVisible(true);
        jPanel1.setEnabled(true);
        jPanel1.setVisible(true);
        
        viewAdm.setEnabled(false);
        viewAdm.setVisible(false);
        admTela.setEnabled(false);
        admTela.setVisible(false);
        
        viewAgenda.setEnabled(false);
        viewAgenda.setVisible(false);
        agendamento.setEnabled(false);
        agendamento.setVisible(false);

        viewDentist.setEnabled(false);
        viewDentist.setVisible(false);
        cadDentista.setEnabled(false);
        cadDentista.setVisible(false);
        
        viewFuncionario.setEnabled(false);
        viewFuncionario.setVisible(false);
        cadFuncionario.setEnabled(false);
        cadFuncionario.setVisible(false);       
        
        viewPaciente.setEnabled(false);
        viewPaciente.setVisible(false);
        cadPaciente.setEnabled(false);
        cadPaciente.setVisible(false);
        
        viewReceita.setEnabled(false);
        viewReceita.setVisible(false);
        receituario.setEnabled(false);
        receituario.setVisible(false);
        
        
        //**************TableModel - Agenda ***************
        DefaultTableModel modelo = (DefaultTableModel) jTableAgenda.getModel();
        jTableAgenda.setRowSorter(new TableRowSorter(modelo));
        try {
			listarJTable();
		} catch (Exception e) {
			
		}

        //**************TableModel - Admin ***************
        DefaultTableModel dent = (DefaultTableModel) jTableAdmin.getModel();
        jTableAdmin.setRowSorter(new TableRowSorter(dent));
        try {
        	listarJTableFunc();
		} catch (Exception e) {
			
		}
    
    }
    
    public void listarJTable() throws Exception {
    	DefaultTableModel modelo = (DefaultTableModel) jTableAgenda.getModel();
    	modelo.setColumnIdentifiers(new Object[] {"CPF","Nome","Serviço","Data","Hora"});

    	modelo.setNumRows(0);
    	agendasdao = new AgendasDAO();
    	
    	for (Agendas agenda: agendasdao.Listar()) {
    		modelo.addRow(new Object[] {
    				
    			agenda.getCpf(),
    			agenda.getNome(),
    			agenda.getServico(),
    			agenda.getDataAgenda(),
    			agenda.getHoraAgenda(),
    			agenda.getObservacoes(),
    		});
    	}
    }
    public void listarJTableFunc() throws Exception {
    	DefaultTableModel dent = (DefaultTableModel) jTableAdmin.getModel();
 		
    	if (cmbAdm.getSelectedItem().equals("Funcionarios")) {
        	dent.setColumnIdentifiers(new Object[] {"ID","CRO","Nome","Nascimento","Sexo","RG","CPF","E-mail","Endereço","Municipio","CEP","Telefone"});
		}else if (cmbAdm.getSelectedItem().equals("Pacientes")) {
	    	dent.setColumnIdentifiers(new Object[] {"ID","Convenio","Nome","Nascimento","Sexo","RG","CPF","E-mail","Endereço","Municipio","CEP","Telefone"});

		}else {
	    	dent.setColumnIdentifiers(new Object[] {"ID","CRO","Nome","Nascimento","Sexo","RG","CPF","E-mail","Endereço","Municipio","CEP","Telefone"});

		}
    	dent.setNumRows(0);
    	dentistasdao = new DentistasDAO();
    	dao = new PacientesDAO();
    	
    	//cmbAdm.getSelectedItem().equals("Funcionarios")
    	if (cmbAdm.getSelectedItem().equals("Funcionarios")) {
    		for (Dentistas dentista: dentistasdao.Listar()) {
        		dent.addRow(new Object[] {
        				dentista.getIdfuncionario(),
        				dentista.getCro(),
        				dentista.getNome(),
        				dentista.getNascimento(),
        				dentista.getSexo(),
        				dentista.getRg(),
        				dentista.getCpf(),
        				dentista.getEmail(),
        				dentista.getEndereco(),
        				dentista.getMunicipio(),
        				dentista.getCep(),
        				dentista.getCelular(),
        			
        		});
        	}
		} else if (cmbAdm.getSelectedItem().equals("Pacientes")){
			for (Pacientes paciente: dao.Listar()) {
	    		dent.addRow(new Object[] {
	    				paciente.getMatricula(),
	    				paciente.getConvenio(),
	    				paciente.getNome(),
	    				paciente.getNascimento(),
	    				paciente.getSexo(),
	    				paciente.getRg(),
	    				paciente.getCpf(),
	    				paciente.getEmail(),
	    				paciente.getEndereco(),
	    				paciente.getMunicipio(),
	    				paciente.getCep(),
	    				paciente.getCelular(),
	    				
	    			
	    		});
	    	}
		}
    		
		
			
		}
    	
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        adm = new javax.swing.JLabel();
        agenda = new javax.swing.JLabel();
        dentista = new javax.swing.JLabel();
        funcionario = new javax.swing.JLabel();
        paciente = new javax.swing.JLabel();
        receita = new javax.swing.JLabel();
        viewInicial = new javax.swing.JLabel();
        cadDentista = new javax.swing.JPanel();
        
        txtMunicipioDentista = new javax.swing.JTextField();
        txtEnderecoDentista = new javax.swing.JTextField();
        
        try {
        	txtCepDentista = new javax.swing.JFormattedTextField(new MaskFormatter("#####-###"));
			txtTelDentista = new javax.swing.JFormattedTextField(new MaskFormatter("(##) #####-####"));
			txtRgDentista = new javax.swing.JFormattedTextField(new MaskFormatter("##.###.###-#"));
			txtNascimentoDentista = new javax.swing.JFormattedTextField(new MaskFormatter("##/##/####"));
			txtCpfDentista = new javax.swing.JFormattedTextField(new MaskFormatter("###.###.###/##"));
		} catch (ParseException e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		}
        txtCroDentista = new javax.swing.JTextField();
        
        
        cmbSexoDentista = new javax.swing.JComboBox<>();
        txtEmailDentista = new javax.swing.JTextField();
        txtNomeDentista = new javax.swing.JTextField();
        
        txtMatriculaDentista = new javax.swing.JTextField();
        txtMatriculaDentista.setEditable(false);
       
        btnSalvarDentista = new javax.swing.JButton();
        btnSalvarDentista.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		//******************************************************
        		try {
        		dentistas = new Dentistas();
        		dentistas.setCro(txtCroDentista.getText());
        		dentistas.setNome(txtNomeDentista.getText());
        		dentistas.setNascimento(txtNascimentoDentista.getText());
        		dentistas.setSexo((String)cmbSexoDentista.getSelectedItem());
        		dentistas.setRg(txtRgDentista.getText());
        		dentistas.setCpf(txtCpfDentista.getText());
        		dentistas.setEmail(txtEmailDentista.getText());
        		dentistas.setEndereco(txtEnderecoDentista.getText());
        		dentistas.setMunicipio(txtMunicipioDentista.getText());
        		dentistas.setCep(txtCepDentista.getText());
        		dentistas.setCelular(txtTelDentista.getText());
        		
        		dentistasdao = new DentistasDAO();
        		
        		dentistasdao.salvar(dentistas);
        			JOptionPane.showMessageDialog(null, "Salvo com Sucesso!!");
        		}catch (Exception e1) {
        			JOptionPane.showMessageDialog(null, "Erro ao Salvar!!"+ e1.getMessage());
				}
        		//*****************************************************
        	}
        });
        
        
        
        
        btnAtualizarDentista = new javax.swing.JButton();
        btnAtualizarDentista.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		//******************************************************
        	try {
        		Dentistas dentistas = new Dentistas();	
        		
        		dentistas.setNome(txtNomeDentista.getText());
        		dentistas.setCro(txtCroDentista.getText());
        		dentistas.setSexo((String)cmbSexoDentista.getSelectedItem());
        		dentistas.setRg(txtRgDentista.getText());
        		dentistas.setCelular(txtTelDentista.getText());
        		dentistas.setMunicipio(txtMunicipioDentista.getText());
        		dentistas.setEmail(txtEmailDentista.getText());
        		dentistas.setNascimento(txtNascimentoDentista.getText());
        		dentistas.setCpf(txtCpfDentista.getText());
        		dentistas.setEndereco(txtEnderecoDentista.getText());
        		dentistas.setCep(txtCepDentista.getText());
        		dentistas.setIdfuncionario(txtMatriculaDentista.getText());
        		
        		dentistasdao = new DentistasDAO();
        		
        		dentistasdao.alterar(dentistas);
        			JOptionPane.showMessageDialog(null, "Alterado com Sucesso!!");
        		}catch (Exception e) {
        			JOptionPane.showMessageDialog(null, "Erro ao Alterar!!" + e.getMessage());
				}
        		//*****************************************************
        	
        	}
        });
        
        
        
        
        btnMostrarDentista = new javax.swing.JButton();
        btnMostrarDentista.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		//******************************************************
            	try {
            		dentistasdao = new DentistasDAO();
            		
            		DentistasDAO mostrar = new DentistasDAO();
            		mostrar.consultar(txtCpfDentista.getText());
            		txtCroDentista.setText(mostrar.dentista.getCro());
            		txtNomeDentista.setText(mostrar.dentista.getNome());
            		txtNascimentoDentista.setText(mostrar.dentista.getNascimento());
            		cmbSexoDentista.setSelectedItem(mostrar.dentista.getSexo());
                	txtRgDentista.setText(mostrar.dentista.getRg());
            		txtMatriculaDentista.setText(mostrar.dentista.getIdfuncionario());
            		txtEmailDentista.setText(mostrar.dentista.getEmail());
            		txtEnderecoDentista.setText(mostrar.dentista.getEndereco());
            		txtMunicipioDentista.setText(mostrar.dentista.getMunicipio());
            		txtCepDentista.setText(mostrar.dentista.getCep());
            		txtTelDentista.setText(mostrar.dentista.getCelular());
            		

            			JOptionPane.showMessageDialog(null, "Dentista localizado!");
            		}catch (Exception e1) {
            			JOptionPane.showMessageDialog(null, "Nenhum dentista encontrado!" + e1.getMessage());
    				}
            		//*****************************************************
            		
        	}
        });
        
        
        btnDeletarDentista = new javax.swing.JButton();
        btnDeletarDentista.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//******************************************************
        		txtMatriculaDentista.setText(null);
        		txtCpfDentista.setText(null);
        		//txtCategoriaPaciente.setText(null);
        		txtNomeDentista.setText(null);
        		txtNascimentoDentista.setText(null);
        		cmbSexoDentista.setSelectedIndex(0);
        		txtRgDentista.setText(null);
        		txtCroDentista.setText(null);
        		txtEmailDentista.setText(null);
          		txtEnderecoDentista.setText(null);
          		//txtBairroDentista.setText(null);
          		txtMunicipioDentista.setText(null);
          		//txtUfDentista.setText(null);
        		txtCepDentista.setText(null);
        		txtTelDentista.setText(null);
        	
        		//******************************************************
        	}
        });
        viewDentist = new javax.swing.JLabel();
        cadFuncionario = new javax.swing.JPanel();
        try {
			txtCpfFuncionario = new javax.swing.JFormattedTextField(new MaskFormatter("###.###.###/##"));
			txtCepFuncionario = new javax.swing.JFormattedTextField(new MaskFormatter("#####-###"));
			txtTelFuncionario = new javax.swing.JFormattedTextField(new MaskFormatter("(##) #####-####"));
	        txtRgFuncionario = new javax.swing.JFormattedTextField(new MaskFormatter("##.###.###-#"));
	        txtNascimentoFuncionario = new javax.swing.JFormattedTextField(new MaskFormatter("##/##/####"));
	        
			
		} catch (ParseException e5) {
			e5.printStackTrace();
		}
        
        txtMunicipioFuncionario = new javax.swing.JTextField();
        txtEnderecoFuncionario = new javax.swing.JTextField();
        cmbSexoFuncionario = new javax.swing.JComboBox<>();
        txtEmailFuncionario = new javax.swing.JTextField();
        txtNomeFuncionario = new javax.swing.JTextField();
        txtMatriculaFuncionario = new javax.swing.JTextField();
        txtMatriculaFuncionario.setEditable(false);
       
        
        btnSalvarFuncionario = new javax.swing.JButton();
        btnSalvarFuncionario.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//******************************************************
        		try {
        		dentistas = new Dentistas();
        		//dentistas.setIdfuncionario(Integer.parseInt(txtMatriculaFuncionario.getText()));
        		//dentistas.setCro(txtCroDentista.getText());
        		//dentistas.setCategoria(txtCategoriaPaciente.getText());
        		dentistas.setNome(txtNomeFuncionario.getText());
        		dentistas.setNascimento(txtNascimentoFuncionario.getText());
        		dentistas.setSexo((String)cmbSexoFuncionario.getSelectedItem());
        		dentistas.setRg(txtRgFuncionario.getText());
        		dentistas.setCpf(txtCpfFuncionario.getText());
        		dentistas.setEmail(txtEmailFuncionario.getText());
        		dentistas.setEndereco(txtEnderecoFuncionario.getText());
        		//dentistas.setBairro(txtMunicipioFuncionario.getText());
        		dentistas.setMunicipio(txtMunicipioFuncionario.getText());
        		//dentistas.setUf(txtCepFuncionario.getText());
        		dentistas.setCep(txtCepFuncionario.getText());
        		dentistas.setCelular(txtTelFuncionario.getText());
        		
        		dentistasdao = new DentistasDAO();
        		
        		dentistasdao.salvar(dentistas);
        			JOptionPane.showMessageDialog(null, "Salvo com Sucesso!!");
        		}catch (Exception e1) {
        			JOptionPane.showMessageDialog(null, "Erro ao Salvar!!"+ e1.getMessage());
				}
        		//*****************************************************
        	}
        });
        
        
        btnAtualizarFuncionario = new javax.swing.JButton();
        btnAtualizarFuncionario.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//******************************************************
        		try {
            		Dentistas dentistas = new Dentistas();	
            		
            		dentistas.setNome(txtNomeFuncionario.getText());
            		//dentistas.setCro(txtCroDentista.getText());
            		dentistas.setSexo((String)cmbSexoFuncionario.getSelectedItem());
            		dentistas.setRg(txtRgFuncionario.getText());
            		dentistas.setCelular(txtTelFuncionario.getText());
            		dentistas.setMunicipio(txtMunicipioFuncionario.getText());
            		dentistas.setEmail(txtEmailFuncionario.getText());
            		dentistas.setNascimento(txtNascimentoFuncionario.getText());
            		dentistas.setCpf(txtCpfFuncionario.getText());
            		dentistas.setEndereco(txtEnderecoFuncionario.getText());
            		dentistas.setCep(txtCepFuncionario.getText());
            		dentistas.setIdfuncionario(txtMatriculaFuncionario.getText());
            		
            		dentistasdao = new DentistasDAO();
            		
            		dentistasdao.alterar(dentistas);
            			JOptionPane.showMessageDialog(null, "Alterado com Sucesso!!");
            		}catch (Exception e1) {
            			JOptionPane.showMessageDialog(null, "Erro ao Alterar!!" + e1.getMessage());
    				}
            		//*****************************************************
        	}
        });
        
        
        btnMostrarFuncionario = new javax.swing.JButton();
        btnMostrarFuncionario.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//******************************************************
            	try {
            		dentistasdao = new DentistasDAO();
            		
            		DentistasDAO mostrar = new DentistasDAO();
            		mostrar.consultar(txtCpfFuncionario.getText());
            		//txtCategoriaDentista.setText(mostrar.dentistas.getCro());
            		txtMatriculaFuncionario.setText(mostrar.dentista.getIdfuncionario());
            		txtNomeFuncionario.setText(mostrar.dentista.getNome());
            		txtNascimentoFuncionario.setText(mostrar.dentista.getNascimento());
            		cmbSexoFuncionario.setSelectedItem(mostrar.dentista.getSexo());
                	txtRgFuncionario.setText(mostrar.dentista.getRg());
            		txtEmailFuncionario.setText(mostrar.dentista.getEmail());
            		txtEnderecoFuncionario.setText(mostrar.dentista.getEndereco());
            		txtMunicipioFuncionario.setText(mostrar.dentista.getMunicipio());
            		txtCepFuncionario.setText(mostrar.dentista.getCep());
            		txtTelFuncionario.setText(mostrar.dentista.getCelular());
            		

            			JOptionPane.showMessageDialog(null, "Funcionario localizado!");
            		}catch (Exception e1) {
            			JOptionPane.showMessageDialog(null, "Nenhum Funcionario encontrado!" + e1.getMessage());
    				}
            		//*****************************************************
	
        	}
        });
        
        
        
        
        btnDeletarFuncionario = new javax.swing.JButton();
        btnDeletarFuncionario.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//******************************************************
        		txtMatriculaFuncionario.setText(null);
        		//txtCategoriaPaciente.setText(null);
        		txtNomeFuncionario.setText(null);
        		txtNascimentoFuncionario.setText(null);
        		cmbSexoFuncionario.setSelectedIndex(0);
        		txtRgFuncionario.setText(null);
        		txtCpfFuncionario.setText(null);
        		txtEmailFuncionario.setText(null);
          		txtEnderecoFuncionario.setText(null);
          		//txtBairroDentista.setText(null);
          		txtMunicipioFuncionario.setText(null);
          		//txtUfDentista.setText(null);
        		txtCepFuncionario.setText(null);
        		txtTelFuncionario.setText(null);
        	
        		//******************************************************
        	}
        });
        
        
        
        
        
        
        
        
        
        
        viewFuncionario = new javax.swing.JLabel();
        agendamento = new javax.swing.JPanel();
        try {
			txtCpfAgenda = new javax.swing.JFormattedTextField(new MaskFormatter("###.###.###/##"));
			txtDataAgenda = new javax.swing.JFormattedTextField(new MaskFormatter("##/##/####"));
			txtHoraAgenda = new javax.swing.JFormattedTextField(new MaskFormatter("##:##"));
		} catch (ParseException e4) {
			e4.printStackTrace();
		}
        txtNomeAgenda = new javax.swing.JTextField();
        cmbServicoAgenda = new javax.swing.JComboBox<>();
        txtObsAgenda = new javax.swing.JTextField();
        
        
       //JFormatterTextField(new MaskFormatter("##:##:##"));
       
        
        btnAtualizarAgendar = new javax.swing.JButton();
        btnAtualizarAgendar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		//******************************************************
        		if (jTableAgenda.getSelectedRow() != -1) {
					
            		try {
            			Agendas agendas = new Agendas();
            			
            			agendas.setCpf(txtCpfAgenda.getText());
            			agendas.setNome(txtNomeAgenda.getText());
            			agendas.setServico((String)cmbServicoAgenda.getSelectedItem());
            			agendas.setObservacoes(txtObsAgenda.getText());
            			agendas.setDataAgenda(txtDataAgenda.getText());
            			agendas.setHoraAgenda(txtHoraAgenda.getText());
            			
            			agendasdao = new AgendasDAO();
            			
            			agendasdao.alterar(agendas);
            			
            			
            	        listarJTable();

            			//JOptionPane.showMessageDialog(null, "Exito ao salvar!");
    				} catch (Exception e2) {
            			//JOptionPane.showMessageDialog(null, "Erro ao salvar!" + e2.getMessage());
    				}
            		
        		}else {
					JOptionPane.showInternalMessageDialog(null, "Nenhum agendamento selecionado!");
				}
        		//******************************************************
        	}
        });
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAgenda = new javax.swing.JTable();
        jTableAgenda.setUpdateSelectionOnSort(false);
        
        
        
        
        
        btnLimparAgenda = new javax.swing.JButton();
        btnLimparAgenda.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//******************************************************
        		if (jTableAgenda.getSelectedRow() != -1) {
					try {
						agendas = new Agendas();
            			agendasdao = new AgendasDAO();
            			
            			agendas.setCpf((String) jTableAgenda.getValueAt(jTableAgenda.getSelectedRow(), 0));
           			
            			agendasdao.excluir(agendas);
            			
            			listarJTable();

            			//JOptionPane.showMessageDialog(null, "Exito ao Excluir!");
    				} catch (Exception e2) {
            			JOptionPane.showMessageDialog(null, "Erro ao Excluir!" + e2.getMessage());
    				}
					}else {
					JOptionPane.showInternalMessageDialog(null, "Nenhum agendamento selecionado!");
				}
        		try {
        			txtCpfAgenda.setText(null);
	        		txtNomeAgenda.setText(null);
	        		cmbServicoAgenda.setSelectedIndex(0);
	        		txtObsAgenda.setText(null);
	        		txtDataAgenda.setText(null);
	        		txtHoraAgenda.setText(null);
        		
        		
			} catch (Exception e2) {
    			//JOptionPane.showMessageDialog(null, "Nenhum paciente encontrado!" + e1.getMessage());

			}
        		//******************************************************
        	}
        });
        
        btnSalvarAgenda = new javax.swing.JButton();
        btnSalvarAgenda.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//******************************************************
        		
        		try {
        			agendas = new Agendas();
        			
        			agendas.setCpf(txtCpfAgenda.getText());
        			agendas.setNome(txtNomeAgenda.getText());
        			agendas.setServico((String)cmbServicoAgenda.getSelectedItem());
        			agendas.setObservacoes(txtObsAgenda.getText());
        			agendas.setDataAgenda(txtDataAgenda.getText());
        			agendas.setHoraAgenda(txtHoraAgenda.getText());
        			
        			agendasdao = new AgendasDAO();
        			
        			agendasdao.salvar(agendas);
        			
        	        listarJTable();

        			//JOptionPane.showMessageDialog(null, "Exito ao salvar!");
				} catch (Exception e2) {
        			JOptionPane.showMessageDialog(null, "Erro ao salvar!" + e2.getMessage());
				}
        		
        		try {
        			txtCpfAgenda.setText(null);
	        		txtNomeAgenda.setText(null);
	        		cmbServicoAgenda.setSelectedIndex(0);
	        		txtObsAgenda.setText(null);
	        		txtDataAgenda.setText(null);
	        		txtHoraAgenda.setText(null);
	        		
	        		
				} catch (Exception e2) {
        			//JOptionPane.showMessageDialog(null, "Nenhum paciente encontrado!" + e1.getMessage());

				}
        		
           		//*****************************************************
        	}
        });
        
        
        
        btnMostrarAgenda = new javax.swing.JButton();
        btnMostrarAgenda.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//******************************************************
        		try {
            		dao = new PacientesDAO();
            		
            		PacientesDAO mostrar = new PacientesDAO();
            		mostrar.consultar(txtCpfAgenda.getText());
               		txtNomeAgenda.setText(mostrar.paciente.getNome());
            	
            			//JOptionPane.showMessageDialog(null, "Paciente localizado!");
            		}catch (Exception e1) {
            			//JOptionPane.showMessageDialog(null, "Paciente não encontrado!" + e1.getMessage());
    				}
        			
        	try {
            		agendasdao = new AgendasDAO();
            		
            		AgendasDAO mostrar = new AgendasDAO();
            		mostrar.consultar(txtCpfAgenda.getText());
               		//txtCpfAgenda.setText(mostrar.agenda.getCpf());
               		txtNomeAgenda.setText(mostrar.agenda.getNome());
               		cmbServicoAgenda.setSelectedItem(mostrar.agenda.getServico());
               		txtObsAgenda.setText(mostrar.agenda.getObservacoes());
               		txtDataAgenda.setText(mostrar.agenda.getDataAgenda());
               		txtHoraAgenda.setText(mostrar.agenda.getHoraAgenda());
               		
            			//JOptionPane.showMessageDialog(null, "Paciente localizado!");
            		}catch (Exception e1) {
            			//JOptionPane.showMessageDialog(null, "Nenhum paciente encontrado!" + e1.getMessage());
    				}
        		
        		
            		//*****************************************************
        	}
        });
        
        viewAgenda = new javax.swing.JLabel();
        cadPaciente = new javax.swing.JPanel();
        try {
			txtCepPaciente = new javax.swing.JFormattedTextField(new MaskFormatter("#####-###"));
			txtTelPaciente = new javax.swing.JFormattedTextField(new MaskFormatter("(##) #####-####"));
			txtRgPaciente = new javax.swing.JFormattedTextField(new MaskFormatter("##.###.###-#"));
	        txtNascimentoPaciente = new javax.swing.JFormattedTextField(new MaskFormatter("##/##/####"));
	        txtCpfPaciente = new javax.swing.JFormattedTextField(new MaskFormatter("###.###.###/##"));
		} catch (ParseException e2) {
			e2.printStackTrace();
		}
        txtMunicipioPaciente = new javax.swing.JTextField();
        txtEnderecoPaciente = new javax.swing.JTextField();
        
        txtConvenioPaciente = new javax.swing.JTextField();
        
        cmbSexoPaciente = new javax.swing.JComboBox<>();
        txtEmailPaciente = new javax.swing.JTextField();
        txtNomePaciente = new javax.swing.JTextField();
        
        txtMatriculaPaciente = new javax.swing.JTextField();
        txtMatriculaPaciente.setEditable(false);
        
        btnSalvarPaciente = new javax.swing.JButton();
        btnSalvarPaciente.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		//******************************************************
        		try {
        		pacientes = new Pacientes();
        		//pacientes.setMatricula(Integer.parseInt(txtMatriculaPaciente.getText()));
        		pacientes.setNome(txtNomePaciente.getText());
        		pacientes.setNascimento(txtNascimentoPaciente.getText());
        		pacientes.setSexo((String)cmbSexoPaciente.getSelectedItem());
        		pacientes.setConvenio(txtConvenioPaciente.getText());
        		pacientes.setRg(txtRgPaciente.getText());
        		pacientes.setCpf(txtCpfPaciente.getText());
        		pacientes.setEmail(txtEmailPaciente.getText());
        		pacientes.setEndereco(txtEnderecoPaciente.getText());
        		pacientes.setMunicipio(txtMunicipioPaciente.getText());
        		pacientes.setCep(txtCepPaciente.getText());
        		pacientes.setCelular(txtTelPaciente.getText());
        		
        		dao = new PacientesDAO();
        		
        		dao.salvar(pacientes);
        			JOptionPane.showMessageDialog(null, "Salvo com Sucesso!!");
        		}catch (Exception e) {
        			JOptionPane.showMessageDialog(null, "Erro ao Salvar!!"+ e.getMessage());
				}
        		//*****************************************************
        	}
        });
        btnAtualizarPaciente = new javax.swing.JButton();
        btnAtualizarPaciente.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		//******************************************************
        		try {
        		Pacientes pacientes = new Pacientes();	
        		
        		pacientes.setNome(txtNomePaciente.getText());
        		pacientes.setSexo((String)cmbSexoPaciente.getSelectedItem());
        		pacientes.setRg(txtRgPaciente.getText());
        		pacientes.setCelular(txtTelPaciente.getText());
        		pacientes.setMunicipio(txtMunicipioPaciente.getText());
        		pacientes.setConvenio(txtConvenioPaciente.getText());
        		pacientes.setEmail(txtEmailPaciente.getText());
        		pacientes.setNascimento(txtNascimentoPaciente.getText());
        		pacientes.setCpf(txtCpfPaciente.getText());
        		pacientes.setEndereco(txtEnderecoPaciente.getText());
        		pacientes.setCep(txtCepPaciente.getText());
        		pacientes.setMatricula(txtMatriculaPaciente.getText());
        		
        		dao = new PacientesDAO();
        		
        		dao.alterar(pacientes);
        			JOptionPane.showMessageDialog(null, "Alterado com Sucesso!!");
        		}catch (Exception e) {
        			JOptionPane.showMessageDialog(null, "Erro ao Alterar!!" + e.getMessage());
				}
        		//*****************************************************
        	}
        });
        btnMostrarPaciente = new javax.swing.JButton();
        btnMostrarPaciente.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		//******************************************************
        	try {
        		dao = new PacientesDAO();
        		
        		PacientesDAO mostrar = new PacientesDAO();
        		mostrar.consultar(txtCpfPaciente.getText());
        		
        		txtMatriculaPaciente.setText(mostrar.paciente.getMatricula());
           		txtNomePaciente.setText(mostrar.paciente.getNome());
        		txtNascimentoPaciente.setText(mostrar.paciente.getNascimento());
        		cmbSexoPaciente.setSelectedItem(mostrar.paciente.getSexo());
        		txtConvenioPaciente.setText(mostrar.paciente.getConvenio());
        		txtRgPaciente.setText(mostrar.paciente.getRg());
        		txtEmailPaciente.setText(mostrar.paciente.getEmail());
        		txtEnderecoPaciente.setText(mostrar.paciente.getEndereco());
        		txtMunicipioPaciente.setText(mostrar.paciente.getMunicipio());
        		txtCepPaciente.setText(mostrar.paciente.getCep());
        		txtTelPaciente.setText(mostrar.paciente.getCelular());
        		

        			//JOptionPane.showMessageDialog(null, "Paciente localizado!");
        		}catch (Exception e1) {
        			//JOptionPane.showMessageDialog(null, "Paciente não cadastrado!" + e1.getMessage());
				}
        		//*****************************************************
        		
        	}
        });
        btnDeletarPaciente = new javax.swing.JButton();
        btnDeletarPaciente.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		//******************************************************
        		txtMatriculaPaciente.setText(null);
        		txtNomePaciente.setText(null);
        		cmbSexoPaciente.setSelectedIndex(0);
        		txtRgPaciente.setText(null);
        		txtTelPaciente.setText(null);
        		txtMunicipioPaciente.setText(null);
        		txtConvenioPaciente.setText(null);
        		txtEmailPaciente.setText(null);
        		txtNascimentoPaciente.setText(null);
        		txtCpfPaciente.setText(null);
        		txtEnderecoPaciente.setText(null);
        		txtCepPaciente.setText(null);
        		//******************************************************
        	}
        });
        
        viewPaciente = new javax.swing.JLabel();
        receituario = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtListaReceita = new javax.swing.JTextArea();
        txtQuantidadeReceita = new javax.swing.JTextField();
        txtMedicamentoReceita = new javax.swing.JTextField();
        txtNomeReceita = new javax.swing.JTextField();
        try {
			txtCpfReceita = new javax.swing.JFormattedTextField(new MaskFormatter("###.###.###/##"));
		} catch (ParseException e2) {
			e2.printStackTrace();
		}
       
        
        
        btnSalvarReceita = new javax.swing.JButton();
        btnSalvarReceita.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		//******************************************************
        		try {

					receitas = new Receitas();
					receitas.setCpf(txtCpfReceita.getText());
					receitas.setNome(txtNomeReceita.getText());
					receitas.setMedicamento(txtMedicamentoReceita.getText());
					receitas.setQuantidade(txtQuantidadeReceita.getText());
					
					receitasdao = new ReceitasDAO();
					receitasdao.salvar(receitas);
					JOptionPane.showMessageDialog(null, "Salvo com sucesso !");
				} catch (Exception i) {
					JOptionPane.showMessageDialog(null, "Erro ao salvar" + i.getMessage());

				}
        		try {
					List<Receitas> lista = new ArrayList<Receitas>();
					receitasdao = new ReceitasDAO();

					lista = receitasdao.listarTodos(txtCpfReceita.getText());
					for(Receitas receita : lista) {
						txtListaReceita.append("\n" + "CPF........." + receita.getCpf() + "\n");
						txtListaReceita.append("Noma do paciente......." + receita.getNome() + "\n");
						txtListaReceita.append("Medicamento....." + receita.getMedicamento() + "\n");
						txtListaReceita.append("Quantidade do medicamento..........." + receita.getQuantidade() + "\n");
						
					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Sem prescrições para esse paciente!" + e1.getMessage());
				}
			
            	//******************************************************
        		
        	}
        });
        btnAtualizarReceita = new javax.swing.JButton();
        btnAtualizarReceita.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//******************************************************
        		try {
            		Receitas receitas = new Receitas();	
            		
            		receitas.setCpf(txtCpfReceita.getText());
            		receitas.setNome(txtNomeReceita.getText());
            		receitas.setMedicamento(txtMedicamentoReceita.getText());
            		receitas.setQuantidade(txtQuantidadeReceita.getText());
            		
            		receitasdao = new ReceitasDAO();
            		
            		receitasdao.alterar(receitas);
            			JOptionPane.showMessageDialog(null, "Alterado com Sucesso!!");
            		}catch (Exception e1) {
            			JOptionPane.showMessageDialog(null, "Erro ao Alterar!!" + e1.getMessage());
    				}
            	//******************************************************
        		
        	}
        });
       
        
        
        btnMostrarReceita = new javax.swing.JButton();
        btnMostrarReceita.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		//******************************************************
        		try {
            		dao = new PacientesDAO();
            		
            		PacientesDAO mostrar = new PacientesDAO();
            		mostrar.consultar(txtCpfReceita.getText());
               		txtNomeReceita.setText(mostrar.paciente.getNome());
               		           	
            			//JOptionPane.showMessageDialog(null, "Paciente localizado!");
            		}catch (Exception e1) {
            			JOptionPane.showMessageDialog(null, "Nenhum paciente encontrado!" + e1.getMessage());
    				}
        		
        		try {
        			receitasdao = new ReceitasDAO();
            		
        			ReceitasDAO mostrar = new ReceitasDAO();
            		mostrar.consultar(txtCpfReceita.getText());
            		txtMedicamentoReceita.setText(mostrar.receita.getMedicamento());
               		txtQuantidadeReceita.setText(mostrar.receita.getQuantidade());
				} catch (Exception e3) {
        			//JOptionPane.showMessageDialog(null, "Nenhum paciente encontrado!" + e3.getMessage());
				}
        		
        		        		
        		try {
					List<Receitas> lista = new ArrayList<Receitas>();
					receitasdao = new ReceitasDAO();

					lista = receitasdao.listarTodos(txtCpfReceita.getText());
					for(Receitas receita : lista) {
						txtListaReceita.append("\n" + "CPF........." + receita.getCpf() + "\n");
						txtListaReceita.append("Noma do paciente......." + receita.getNome() + "\n");
						txtListaReceita.append("Medicamento....." + receita.getMedicamento() + "\n");
						txtListaReceita.append("Quantidade do medicamento..........." + receita.getQuantidade() + "\n");
						
					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Sem prescrições para esse paciente!" + e1.getMessage());
				}

        		
            		
            	//*****************************************************
        	}
        });
        btnDeletarReceita = new javax.swing.JButton();
        btnDeletarReceita.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//******************************************************
        		txtCpfReceita.setText(null);
        		txtNomeReceita.setText(null);
        		txtMedicamentoReceita.setText(null);
        		txtQuantidadeReceita.setText(null);
        		txtRgFuncionario.setText(null);
        		txtListaReceita.setText(null);
        	
        		//******************************************************
        	}
        });
        
        viewReceita = new javax.swing.JLabel();
        admTela = new javax.swing.JPanel();
        cmbAdm = new javax.swing.JComboBox<>();
        cmbAdm.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAdmin = new javax.swing.JTable();
        
        
        btnConsultarAdm = new javax.swing.JButton();
        btnConsultarAdm.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//******************************************************
        		
        		try {
        			dentistasdao = new DentistasDAO();
        			dao = new PacientesDAO();
        			
        			if (cmbAdm.getSelectedItem().equals("Funcionarios")) {
        				listarJTableFunc();
					}if (cmbAdm.getSelectedItem().equals("Pacientes")) {
						listarJTableFunc();					
						} else {

					}
        			
				} catch (Exception e1) {
        			JOptionPane.showMessageDialog(null, "Nenhum dado encontrado!" + e1.getMessage());
				}
        		
            		//*****************************************************
        	}
        });
        
        viewAdm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        setOpacity(0.0F);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 250, 110));

        adm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admMouseClicked(evt);
            }
        });
        jPanel1.add(adm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 300, 60));

        agenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agendaMouseClicked(evt);
            }
        });
        jPanel1.add(agenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 285, 300, 50));

        dentista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dentistaMouseClicked(evt);
            }
        });
        jPanel1.add(dentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 300, 50));

        funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                funcionarioMouseClicked(evt);
            }
        });
        jPanel1.add(funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 300, 50));

        paciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pacienteMouseClicked(evt);
            }
        });
        jPanel1.add(paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 300, 50));

        receita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receitaMouseClicked(evt);
            }
        });
        jPanel1.add(receita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 533, 300, 50));

        viewInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telaInicial.png"))); // NOI18N
        jPanel1.add(viewInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 768));

        cadDentista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCepDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepDentistaActionPerformed(evt);
            }
        });
        cadDentista.add(txtCepDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 623, 222, 30));
        cadDentista.add(txtMunicipioDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 623, 222, 30));

        txtEnderecoDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoDentistaActionPerformed(evt);
            }
        });
        cadDentista.add(txtEnderecoDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 551, 222, 30));
        cadDentista.add(txtTelDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 551, 222, 30));

        txtCroDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfDentistaActionPerformed(evt);
            }
        });
        cadDentista.add(txtCroDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 481, 222, 30));
        cadDentista.add(txtRgDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 479, 222, 30));

        txtNascimentoDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNascimentoDentistaActionPerformed(evt);
            }
        });
        cadDentista.add(txtNascimentoDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 407, 222, 30));

        cmbSexoDentista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Masculino", "Feminino", "Outro", " " }));
        cadDentista.add(cmbSexoDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 407, 222, 30));
        cadDentista.add(txtEmailDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 335, 222, 30));
        cadDentista.add(txtNomeDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 335, 222, 30));
        cadDentista.add(txtCpfDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 260, 222, 30));
        cadDentista.add(txtMatriculaDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 222, 30));

        btnSalvarDentista.setBackground(new java.awt.Color(0, 135, 208));
        btnSalvarDentista.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnSalvarDentista.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarDentista.setText("Salvar");
        cadDentista.add(btnSalvarDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 700, 108, 39));

        btnAtualizarDentista.setBackground(new java.awt.Color(0, 135, 208));
        btnAtualizarDentista.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnAtualizarDentista.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarDentista.setText("Atualizar");
        btnAtualizarDentista.setToolTipText("");
        cadDentista.add(btnAtualizarDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 700, 108, 39));

        btnMostrarDentista.setBackground(new java.awt.Color(0, 135, 208));
        btnMostrarDentista.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnMostrarDentista.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarDentista.setText("Mostrar");
        btnMostrarDentista.setToolTipText("");
        cadDentista.add(btnMostrarDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 700, 108, 39));

        btnDeletarDentista.setBackground(new java.awt.Color(0, 135, 208));
        btnDeletarDentista.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnDeletarDentista.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletarDentista.setText("Limpar");
        btnDeletarDentista.setToolTipText("");
        cadDentista.add(btnDeletarDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 700, 108, 39));

        viewDentist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telaDentista.png"))); // NOI18N
        cadDentista.add(viewDentist, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 768));

        jPanel1.add(cadDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1020, 760));

        cadFuncionario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCpfFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfFuncionarioActionPerformed(evt);
            }
        });
        cadFuncionario.add(txtCpfFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 260, 222, 30));
        cadFuncionario.add(txtCepFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 615, 222, 30));

        txtMunicipioFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMunicipioFuncionarioActionPerformed(evt);
            }
        });
        cadFuncionario.add(txtMunicipioFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 540, 222, 30));
        cadFuncionario.add(txtEnderecoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 222, 30));

        txtTelFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneFuncionarioActionPerformed(evt);
            }
        });
        cadFuncionario.add(txtTelFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 475, 222, 30));
        cadFuncionario.add(txtRgFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 475, 222, 30));

        txtNascimentoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNascimentoFuncionarioActionPerformed(evt);
            }
        });
        cadFuncionario.add(txtNascimentoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 407, 222, 30));

        cmbSexoFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Masculino", "Feminino", "Outro", " " }));
        cadFuncionario.add(cmbSexoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 407, 222, 30));
        cadFuncionario.add(txtEmailFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 335, 222, 30));
        cadFuncionario.add(txtNomeFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 335, 222, 30));
        cadFuncionario.add(txtMatriculaFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 222, 30));

        btnSalvarFuncionario.setBackground(new java.awt.Color(0, 135, 208));
        btnSalvarFuncionario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnSalvarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarFuncionario.setText("Salvar");
        cadFuncionario.add(btnSalvarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 700, 108, 39));

        btnAtualizarFuncionario.setBackground(new java.awt.Color(0, 135, 208));
        btnAtualizarFuncionario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnAtualizarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarFuncionario.setText("Atualizar");
        btnAtualizarFuncionario.setToolTipText("");
        cadFuncionario.add(btnAtualizarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 700, 108, 39));

        btnMostrarFuncionario.setBackground(new java.awt.Color(0, 135, 208));
        btnMostrarFuncionario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnMostrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarFuncionario.setText("Mostrar");
        btnMostrarFuncionario.setToolTipText("");
        cadFuncionario.add(btnMostrarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 700, 108, 39));

        btnDeletarFuncionario.setBackground(new java.awt.Color(0, 135, 208));
        btnDeletarFuncionario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnDeletarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletarFuncionario.setText("Limpar");
        btnDeletarFuncionario.setToolTipText("");
        cadFuncionario.add(btnDeletarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 700, 108, 39));

        viewFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telaFuncionario.png"))); // NOI18N
        cadFuncionario.add(viewFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 768));

        jPanel1.add(cadFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1020, 760));

        agendamento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        agendamento.add(txtCpfAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 244, 222, 30));

        txtNomeAgenda.setEditable(false);
        agendamento.add(txtNomeAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 244, 222, 30));

        cmbServicoAgenda.setModel(new DefaultComboBoxModel(new String[] {"...", "Avaliação", "Extração dental", "Implante dental", "Manutenção de aparelho", "Profilaxía", " "}));
        agendamento.add(cmbServicoAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 309, 222, 30));
        agendamento.add(txtObsAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 309, 222, 30));
        agendamento.add(txtDataAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 375, 222, 30));
        agendamento.add(txtHoraAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 375, 220, 30));

        btnAtualizarAgendar.setBackground(new java.awt.Color(0, 135, 208));
        btnAtualizarAgendar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnAtualizarAgendar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarAgendar.setText("Atualizar");
        btnAtualizarAgendar.setActionCommand("Agendar");
        btnAtualizarAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });
        agendamento.add(btnAtualizarAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 108, 39));

        jTableAgenda.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"CPF", "Paciente", "Servi\u00C3\u00A7o", "Data", "Hora", "Obs"
        	}
        ));
        jScrollPane1.setViewportView(jTableAgenda);

        agendamento.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 472, 614, 268));

        btnLimparAgenda.setBackground(new java.awt.Color(0, 135, 208));
        btnLimparAgenda.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnLimparAgenda.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparAgenda.setText("Excluir");
        btnLimparAgenda.setActionCommand("Agendar");
        btnLimparAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendar1ActionPerformed(evt);
            }
        });
        agendamento.add(btnLimparAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, 108, 39));

        btnSalvarAgenda.setBackground(new java.awt.Color(0, 135, 208));
        btnSalvarAgenda.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnSalvarAgenda.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarAgenda.setText("Salvar");
        btnSalvarAgenda.setActionCommand("Agendar");
        agendamento.add(btnSalvarAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 108, 39));

        btnMostrarAgenda.setBackground(new java.awt.Color(0, 135, 208));
        btnMostrarAgenda.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnMostrarAgenda.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarAgenda.setText("Mostrar");
        btnMostrarAgenda.setActionCommand("Agendar");
        btnMostrarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendar3ActionPerformed(evt);
            }
        });
        agendamento.add(btnMostrarAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 108, 39));

        viewAgenda.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        viewAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telaAgenda.png"))); // NOI18N
        agendamento.add(viewAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 760));

        jPanel1.add(agendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 760));

        cadPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCepPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepPacienteActionPerformed(evt);
            }
        });
        cadPaciente.add(txtCepPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 623, 222, 30));
        cadPaciente.add(txtMunicipioPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 623, 222, 30));

        txtEnderecoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoPacienteActionPerformed(evt);
            }
        });
        cadPaciente.add(txtEnderecoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 551, 222, 30));
        cadPaciente.add(txtTelPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 551, 222, 30));

        txtConvenioPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConvenioPacienteActionPerformed(evt);
            }
        });
        cadPaciente.add(txtConvenioPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 481, 222, 30));
        cadPaciente.add(txtRgPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 479, 222, 30));

        txtNascimentoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNascimentoPacienteActionPerformed(evt);
            }
        });
        cadPaciente.add(txtNascimentoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 407, 222, 30));

        cmbSexoPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Masculino", "Feminino", "Outro", " " }));
        cadPaciente.add(cmbSexoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 407, 222, 30));
        cadPaciente.add(txtEmailPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 335, 222, 30));
        cadPaciente.add(txtNomePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 335, 222, 30));
        cadPaciente.add(txtCpfPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 260, 222, 30));
        cadPaciente.add(txtMatriculaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 222, 30));

        btnSalvarPaciente.setBackground(new java.awt.Color(0, 135, 208));
        btnSalvarPaciente.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnSalvarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarPaciente.setText("Salvar");
        cadPaciente.add(btnSalvarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 700, 108, 39));

        btnAtualizarPaciente.setBackground(new java.awt.Color(0, 135, 208));
        btnAtualizarPaciente.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnAtualizarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarPaciente.setText("Atualizar");
        btnAtualizarPaciente.setToolTipText("");
        cadPaciente.add(btnAtualizarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 700, 108, 39));

        btnMostrarPaciente.setBackground(new java.awt.Color(0, 135, 208));
        btnMostrarPaciente.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnMostrarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarPaciente.setText("Mostrar");
        btnMostrarPaciente.setToolTipText("");
        cadPaciente.add(btnMostrarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 700, 108, 39));

        btnDeletarPaciente.setBackground(new java.awt.Color(0, 135, 208));
        btnDeletarPaciente.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnDeletarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletarPaciente.setText("Limpar");
        btnDeletarPaciente.setToolTipText("");
        cadPaciente.add(btnDeletarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 700, 108, 39));

        viewPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telaPaciente.png"))); // NOI18N
        viewPaciente.setText("jLabel1");
        cadPaciente.add(viewPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 760));

        jPanel1.add(cadPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 760));

        receituario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtListaReceita.setColumns(20);
        txtListaReceita.setRows(5);
        jScrollPane3.setViewportView(txtListaReceita);

        receituario.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 463, 585, 190));
        receituario.add(txtQuantidadeReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 366, 222, 30));
        receituario.add(txtMedicamentoReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 366, 222, 30));

        txtNomeReceita.setEditable(false);
        receituario.add(txtNomeReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 261, 222, 30));
        receituario.add(txtCpfReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 261, 222, 30));

        btnSalvarReceita.setBackground(new java.awt.Color(0, 135, 208));
        btnSalvarReceita.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnSalvarReceita.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarReceita.setText("Salvar");
        receituario.add(btnSalvarReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 680, 108, 39));

        btnAtualizarReceita.setBackground(new java.awt.Color(0, 135, 208));
        btnAtualizarReceita.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnAtualizarReceita.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarReceita.setText("Atualizar");
        btnAtualizarReceita.setToolTipText("");
        receituario.add(btnAtualizarReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 680, 108, 39));

        btnMostrarReceita.setBackground(new java.awt.Color(0, 135, 208));
        btnMostrarReceita.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnMostrarReceita.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarReceita.setText("Mostrar");
        btnMostrarReceita.setToolTipText("");
        receituario.add(btnMostrarReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 680, 108, 39));

        btnDeletarReceita.setBackground(new java.awt.Color(0, 135, 208));
        btnDeletarReceita.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnDeletarReceita.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletarReceita.setText("Limpar");
        btnDeletarReceita.setToolTipText("");
        receituario.add(btnDeletarReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 680, 108, 39));

        viewReceita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telaReceita.png"))); // NOI18N
        viewReceita.setText("jLabel1");
        receituario.add(viewReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 760));

        jPanel1.add(receituario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 760));

        admTela.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbAdm.setModel(new DefaultComboBoxModel(new String[] {"...", "Funcionarios", "Pacientes"}));
        admTela.add(cmbAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 222, 30));

        jTableAdmin.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Matricula", "Paciente", "Servi\u00C3\u00A7o", "Data", "Hora", "Obs", "New column", "New column", "New column", "New column", "New column", "New column"
        	}
        ));
        jScrollPane2.setViewportView(jTableAdmin);

        admTela.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 472, 614, 268));

        btnConsultarAdm.setBackground(new java.awt.Color(0, 135, 208));
        btnConsultarAdm.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnConsultarAdm.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarAdm.setText("Consultar");
        admTela.add(btnConsultarAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 400, 108, 39));

        viewAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telaAdm.png"))); // NOI18N
        viewAdm.setText("jLabel1");
        admTela.add(viewAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 760));

        jPanel1.add(admTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1020, 755));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void dentistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dentistaMouseClicked
        // TODO add your handling code here:
        viewDentist.setEnabled(true);
        viewDentist.setVisible(true);        
        cadDentista.setEnabled(true);
        cadDentista.setVisible(true);
        
        viewInicial.setEnabled(false);
        viewInicial.setVisible(false);  
        
        viewFuncionario.setEnabled(false);
        viewFuncionario.setVisible(false);
        cadFuncionario.setEnabled(false);
        cadFuncionario.setVisible(false);
        
        viewAgenda.setEnabled(false);
        viewAgenda.setVisible(false);
        agendamento.setEnabled(false);
        agendamento.setVisible(false);     
        
        viewPaciente.setEnabled(false);
        viewPaciente.setVisible(false);
        cadPaciente.setEnabled(false);
        cadPaciente.setVisible(false);
        
        viewAdm.setEnabled(false);
        viewAdm.setVisible(false);
        admTela.setEnabled(false);
        admTela.setVisible(false);
        
        viewReceita.setEnabled(false);
        viewReceita.setVisible(false);
        receituario.setEnabled(false);
        receituario.setVisible(false);
    }//GEN-LAST:event_dentistaMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        viewInicial.setEnabled(true);
        viewInicial.setVisible(true);
        
        viewDentist.setEnabled(false);
        viewDentist.setVisible(false);
        cadDentista.setEnabled(false);
        cadDentista.setVisible(false);
        
        viewFuncionario.setEnabled(false);
        viewFuncionario.setVisible(false);
        cadFuncionario.setEnabled(false);
        cadFuncionario.setVisible(false);
        
        viewAgenda.setEnabled(false);
        viewAgenda.setVisible(false);
        agendamento.setEnabled(false);
        agendamento.setVisible(false);     
        
        viewPaciente.setEnabled(false);
        viewPaciente.setVisible(false);
        cadPaciente.setEnabled(false);
        cadPaciente.setVisible(false);
        
        viewAdm.setEnabled(false);
        viewAdm.setVisible(false);
        admTela.setEnabled(false);
        admTela.setVisible(false);
        
        viewReceita.setEnabled(false);
        viewReceita.setVisible(false);
        receituario.setEnabled(false);
        receituario.setVisible(false);
        
    }//GEN-LAST:event_homeMouseClicked

    private void funcionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funcionarioMouseClicked
        // TODO add your handling code here:
        viewFuncionario.setEnabled(true);
        viewFuncionario.setVisible(true);
        cadFuncionario.setEnabled(true);
        cadFuncionario.setVisible(true);
        
        viewDentist.setEnabled(false);
        viewDentist.setVisible(false);
        cadDentista.setEnabled(false);
        cadDentista.setVisible(false);       
        
        viewAgenda.setEnabled(false);
        viewAgenda.setVisible(false);
        agendamento.setEnabled(false);
        agendamento.setVisible(false);     
        
        viewPaciente.setEnabled(false);
        viewPaciente.setVisible(false);
        cadPaciente.setEnabled(false);
        cadPaciente.setVisible(false);
        
        viewReceita.setEnabled(false);
        viewReceita.setVisible(false);
        receituario.setEnabled(false);
        receituario.setVisible(false);
        
        viewAdm.setEnabled(false);
        viewAdm.setVisible(false);
        admTela.setEnabled(false);
        admTela.setVisible(false);
        
        viewInicial.setEnabled(false);
        viewInicial.setVisible(false); 
    }//GEN-LAST:event_funcionarioMouseClicked

    private void txtCpfDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfDentistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfDentistaActionPerformed

    private void txtNascimentoDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNascimentoDentistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNascimentoDentistaActionPerformed

    private void agendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendaMouseClicked
        // TODO add your handling code here:
        viewDentist.setEnabled(false);
        viewDentist.setVisible(false);
        cadDentista.setEnabled(false);
        cadDentista.setVisible(false);
        
        viewFuncionario.setEnabled(false);
        viewFuncionario.setVisible(false);
        cadFuncionario.setEnabled(false);
        cadFuncionario.setVisible(false);
        
        viewAgenda.setEnabled(true);
        viewAgenda.setVisible(true);
        agendamento.setEnabled(true);
        agendamento.setVisible(true);     
        
        viewPaciente.setEnabled(false);
        viewPaciente.setVisible(false);
        cadPaciente.setEnabled(false);
        cadPaciente.setVisible(false);
        
        viewAdm.setEnabled(false);
        viewAdm.setVisible(false);
        adm.setEnabled(false);
        adm.setVisible(false);
        
        viewReceita.setEnabled(false);
        viewReceita.setVisible(false);
        receituario.setEnabled(false);
        receituario.setVisible(false);
        
        viewInicial.setEnabled(false);
        viewInicial.setVisible(false); 
    }//GEN-LAST:event_agendaMouseClicked

    private void pacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pacienteMouseClicked
        // TODO add your handling code here:
        viewDentist.setEnabled(false);
        viewDentist.setVisible(false);
        cadDentista.setEnabled(false);
        cadDentista.setVisible(false);
        
        viewFuncionario.setEnabled(false);
        viewFuncionario.setVisible(false);
        cadFuncionario.setEnabled(false);
        cadFuncionario.setVisible(false);
        
        viewAgenda.setEnabled(false);
        viewAgenda.setVisible(false);
        agendamento.setEnabled(false);
        agendamento.setVisible(false);     
        
        viewPaciente.setEnabled(true);
        viewPaciente.setVisible(true);
        cadPaciente.setEnabled(true);
        cadPaciente.setVisible(true);
        
        viewReceita.setEnabled(false);
        viewReceita.setVisible(false);
        receituario.setEnabled(false);
        receituario.setVisible(false);
        
        viewAdm.setEnabled(false);
        viewAdm.setVisible(false);
        admTela.setEnabled(false);
        admTela.setVisible(false);
        
        viewInicial.setEnabled(false);
        viewInicial.setVisible(false); 
    }//GEN-LAST:event_pacienteMouseClicked

    private void receitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receitaMouseClicked
        // TODO add your handling code here:
        
        viewDentist.setEnabled(false);
        viewDentist.setVisible(false);
        cadDentista.setEnabled(false);
        cadDentista.setVisible(false);
        
        viewFuncionario.setEnabled(false);
        viewFuncionario.setVisible(false);
        cadFuncionario.setEnabled(false);
        cadFuncionario.setVisible(false);
        
        viewAgenda.setEnabled(false);
        viewAgenda.setVisible(false);
        agendamento.setEnabled(false);
        agendamento.setVisible(false);     
        
        viewPaciente.setEnabled(false);
        viewPaciente.setVisible(false);
        cadPaciente.setEnabled(false);
        cadPaciente.setVisible(false);
        
        viewReceita.setEnabled(true);
        viewReceita.setVisible(true);
        receituario.setEnabled(true);
        receituario.setVisible(true);
        
        viewAdm.setEnabled(false);
        viewAdm.setVisible(false);
        admTela.setEnabled(false);
        admTela.setVisible(false);
        
        viewInicial.setEnabled(false);
        viewInicial.setVisible(false); 
    }//GEN-LAST:event_receitaMouseClicked

    private void txtEnderecoDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoDentistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoDentistaActionPerformed

    private void txtCepDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepDentistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepDentistaActionPerformed

    private void txtCpfFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfFuncionarioActionPerformed

    private void txtMunicipioFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMunicipioFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMunicipioFuncionarioActionPerformed

    private void txtTelefoneFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneFuncionarioActionPerformed

    private void txtNascimentoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNascimentoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNascimentoFuncionarioActionPerformed

    private void txtCepPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepPacienteActionPerformed

    private void txtEnderecoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoPacienteActionPerformed

    private void txtConvenioPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConvenioPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConvenioPacienteActionPerformed

    private void txtNascimentoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNascimentoPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNascimentoPacienteActionPerformed

    private void btnAgendar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgendar1ActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void btnAgendar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgendar3ActionPerformed

    private void admMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admMouseClicked
        // TODO add your handling code here: 
        
        viewAdm.setEnabled(true);
        viewAdm.setVisible(true);
        admTela.setEnabled(true);
        admTela.setVisible(true);
        
        viewDentist.setEnabled(false);
        viewDentist.setVisible(false);
        cadDentista.setEnabled(false);
        cadDentista.setVisible(false);
        
        viewFuncionario.setEnabled(false);
        viewFuncionario.setVisible(false);
        cadFuncionario.setEnabled(false);
        cadFuncionario.setVisible(false);
        
        viewAgenda.setEnabled(false);
        viewAgenda.setVisible(false);
        agendamento.setEnabled(false);
        agendamento.setVisible(false);     
        
        viewPaciente.setEnabled(false);
        viewPaciente.setVisible(false);
        cadPaciente.setEnabled(false);
        cadPaciente.setVisible(false);
        
        viewReceita.setEnabled(false);
        viewReceita.setVisible(false);
        receituario.setEnabled(false);
        receituario.setVisible(false);
        
        viewInicial.setEnabled(false);
        viewInicial.setVisible(false); 
        
    }//GEN-LAST:event_admMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    
    private Pacientes pacientes;
    private PacientesDAO dao;
    private Dentistas dentistas;
    private DentistasDAO dentistasdao;
    private Receitas receitas;
    private ReceitasDAO receitasdao;
    private Agendas agendas;
    private AgendasDAO agendasdao;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adm;
    private javax.swing.JPanel admTela;
    private javax.swing.JLabel agenda;
    private javax.swing.JPanel agendamento;
    private javax.swing.JButton btnAtualizarAgendar;
    private javax.swing.JButton btnLimparAgenda;
    private javax.swing.JButton btnSalvarAgenda;
    private javax.swing.JButton btnMostrarAgenda;
    private javax.swing.JButton btnAtualizarDentista;
    private javax.swing.JButton btnAtualizarFuncionario;
    private javax.swing.JButton btnAtualizarPaciente;
    private javax.swing.JButton btnAtualizarReceita;
    private javax.swing.JButton btnConsultarAdm;
    private javax.swing.JButton btnDeletarDentista;
    private javax.swing.JButton btnDeletarFuncionario;
    private javax.swing.JButton btnDeletarPaciente;
    private javax.swing.JButton btnDeletarReceita;
    private javax.swing.JButton btnMostrarDentista;
    private javax.swing.JButton btnMostrarFuncionario;
    private javax.swing.JButton btnMostrarPaciente;
    private javax.swing.JButton btnMostrarReceita;
    private javax.swing.JButton btnSalvarDentista;
    private javax.swing.JButton btnSalvarFuncionario;
    private javax.swing.JButton btnSalvarPaciente;
    private javax.swing.JButton btnSalvarReceita;
    private javax.swing.JPanel cadDentista;
    private javax.swing.JPanel cadFuncionario;
    private javax.swing.JPanel cadPaciente;
    private javax.swing.JComboBox<String> cmbAdm;
    private javax.swing.JComboBox<String> cmbServicoAgenda;
    private javax.swing.JComboBox<String> cmbSexoDentista;
    private javax.swing.JComboBox<String> cmbSexoFuncionario;
    private javax.swing.JComboBox<String> cmbSexoPaciente;
    private javax.swing.JLabel dentista;
    private javax.swing.JLabel funcionario;
    private javax.swing.JLabel home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableAgenda;
    private javax.swing.JTable jTableAdmin;
    private javax.swing.JTextArea txtListaReceita;
    private javax.swing.JLabel paciente;
    private javax.swing.JLabel receita;
    private javax.swing.JPanel receituario;
    private javax.swing.JTextField txtCepDentista;
    private javax.swing.JTextField txtCepFuncionario;
    private javax.swing.JTextField txtCepPaciente;
    private javax.swing.JTextField txtConvenioPaciente;
    private javax.swing.JTextField txtCroDentista;
    private javax.swing.JTextField txtCpfFuncionario;
    private javax.swing.JTextField txtCpfPaciente;
    private javax.swing.JTextField txtCpfDentista;
    private javax.swing.JTextField txtDataAgenda;
    private javax.swing.JTextField txtEmailDentista;
    private javax.swing.JTextField txtEmailFuncionario;
    private javax.swing.JTextField txtEmailPaciente;
    private javax.swing.JTextField txtEnderecoDentista;
    private javax.swing.JTextField txtEnderecoFuncionario;
    private javax.swing.JTextField txtEnderecoPaciente;
    private javax.swing.JTextField txtHoraAgenda;
    private javax.swing.JTextField txtCpfAgenda;
    private javax.swing.JTextField txtMatriculaDentista;
    private javax.swing.JTextField txtMatriculaFuncionario;
    private javax.swing.JTextField txtMatriculaPaciente;
    private javax.swing.JTextField txtCpfReceita;
    private javax.swing.JTextField txtMedicamentoReceita;
    private javax.swing.JTextField txtMunicipioDentista;
    private javax.swing.JTextField txtMunicipioFuncionario;
    private javax.swing.JTextField txtMunicipioPaciente;
    private javax.swing.JTextField txtNascimentoDentista;
    private javax.swing.JTextField txtNascimentoFuncionario;
    private javax.swing.JTextField txtNascimentoPaciente;
    private javax.swing.JTextField txtNomeAgenda;
    private javax.swing.JTextField txtNomeDentista;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtNomePaciente;
    private javax.swing.JTextField txtNomeReceita;
    private javax.swing.JTextField txtObsAgenda;
    private javax.swing.JTextField txtQuantidadeReceita;
    private javax.swing.JTextField txtRgDentista;
    private javax.swing.JTextField txtRgFuncionario;
    private javax.swing.JTextField txtRgPaciente;
    private javax.swing.JTextField txtTelDentista;
    private javax.swing.JTextField txtTelPaciente;
    private javax.swing.JTextField txtTelFuncionario;
    private javax.swing.JLabel viewAdm;
    private javax.swing.JLabel viewAgenda;
    private javax.swing.JLabel viewDentist;
    private javax.swing.JLabel viewFuncionario;
    private javax.swing.JLabel viewInicial;
    private javax.swing.JLabel viewPaciente;
    private javax.swing.JLabel viewReceita;
    // End of variables declaration//GEN-END:variables

    
}
