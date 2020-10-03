/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinicaodonto.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import br.com.clinicaodonto.model.Dentistas;

/**
 *
 * @author whey
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();        

        viewDentist.setEnabled(false);
        viewDentist.setVisible(false);
        jPanel2.setEnabled(false);
        jPanel2.setVisible(false);
        viewFuncionario.setEnabled(false);
        viewFuncionario.setVisible(false);
        jPanel3.setEnabled(false);
        jPanel3.setVisible(false);

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
        JLabel dentista = new javax.swing.JLabel();
        funcionario = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        viewInicial = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtCepDentista = new javax.swing.JTextField();
        txtEnderecoDentista = new javax.swing.JTextField();
        txtTelDentista = new javax.swing.JTextField();
        txtEmailDentista = new javax.swing.JTextField();
        txtSobrenomeDentista = new javax.swing.JTextField();
        txtNomeDentista = new javax.swing.JTextField();
        txtCpfDentista = new javax.swing.JTextField();
        txtCroDentista = new javax.swing.JTextField();
        
        btnSalvarDentista = new javax.swing.JButton();
        btnSalvarDentista.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	//*************************************************
	            try {
	            Dentistas dentistas = new Dentistas();
	            //dentistas.setIdfuncionario(Integer.parseInt(txtCroDentista.getText()));
	            dentistas.setCro(Integer.parseInt(txtCroDentista.getText()));
	            dentistas.setCpf(txtCpfDentista.getText());
	            dentistas.setNome(txtCpfDentista.getText());
	            dentistas.setEmail(txtEmailDentista.getText());
	            dentistas.setCelular(txtTelDentista.getText());
	            dentistas.setEndereco(txtEnderecoDentista.getText());
	            dentistas.setCep(txtCepDentista.getText());
	            }catch (Exception e) {
	            	JOptionPane.showMessageDialog(null, "Erro ao Salvar"+e.getMessage());
	            }
        	}
        });
        btnAtualizarDentista = new javax.swing.JButton();
        btnMostrarDentista = new javax.swing.JButton();
        btnDeletarDentista = new javax.swing.JButton();
        viewDentist = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtCepFuncionario = new javax.swing.JTextField();
        txtEnderecoFuncionario = new javax.swing.JTextField();
        txtTelFuncionario = new javax.swing.JTextField();
        txtEmailFuncionario = new javax.swing.JTextField();
        txtSobrenomeFuncionario = new javax.swing.JTextField();
        txtNomeFuncionario = new javax.swing.JTextField();
        txtCpfFuncionario = new javax.swing.JTextField();
        txtCroFuncionario = new javax.swing.JTextField();
        btnSalvarFuncionario = new javax.swing.JButton();
        btnAtualizarFuncionario = new javax.swing.JButton();
        btnMostrarFuncionario = new javax.swing.JButton();
        btnDeletarFuncionario = new javax.swing.JButton();
        viewFuncionario = new javax.swing.JLabel();

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

        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 250, 110));

        viewInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telaInicial.png"))); // NOI18N
        jPanel1.add(viewInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 768));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCepDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepDentistaActionPerformed(evt);
            }
        });
        jPanel2.add(txtCepDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 579, 222, 46));
        jPanel2.add(txtEnderecoDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 579, 222, 46));

        txtTelDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelDentistaActionPerformed(evt);
            }
        });
        jPanel2.add(txtTelDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 473, 222, 46));
        jPanel2.add(txtEmailDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 473, 222, 46));
        jPanel2.add(txtSobrenomeDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 367, 222, 46));
        jPanel2.add(txtNomeDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 367, 222, 46));
        jPanel2.add(txtCpfDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 261, 222, 46));
        jPanel2.add(txtCroDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 261, 222, 46));

        btnSalvarDentista.setBackground(new java.awt.Color(0, 135, 208));
        btnSalvarDentista.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnSalvarDentista.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarDentista.setText("Salvar");
        jPanel2.add(btnSalvarDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 670, 112, 44));

        btnAtualizarDentista.setBackground(new java.awt.Color(0, 135, 208));
        btnAtualizarDentista.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnAtualizarDentista.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarDentista.setText("Atualizar");
        btnAtualizarDentista.setToolTipText("");
        jPanel2.add(btnAtualizarDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 670, 112, 44));

        btnMostrarDentista.setBackground(new java.awt.Color(0, 135, 208));
        btnMostrarDentista.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnMostrarDentista.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarDentista.setText("Mostrar");
        btnMostrarDentista.setToolTipText("");
        jPanel2.add(btnMostrarDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 670, 112, 44));

        btnDeletarDentista.setBackground(new java.awt.Color(0, 135, 208));
        btnDeletarDentista.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnDeletarDentista.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletarDentista.setText("Deletar");
        btnDeletarDentista.setToolTipText("");
        jPanel2.add(btnDeletarDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 670, 112, 44));

        viewDentist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telaDentista.png"))); // NOI18N
        jPanel2.add(viewDentist, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 768));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1020, 760));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCepFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepFuncionarioActionPerformed(evt);
            }
        });
        jPanel3.add(txtCepFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 579, 222, 46));
        jPanel3.add(txtEnderecoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 579, 222, 46));

        txtTelFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelFuncionarioActionPerformed(evt);
            }
        });
        jPanel3.add(txtTelFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 473, 222, 46));
        jPanel3.add(txtEmailFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 473, 222, 46));
        jPanel3.add(txtSobrenomeFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 367, 222, 46));
        jPanel3.add(txtNomeFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 367, 222, 46));
        jPanel3.add(txtCpfFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 261, 222, 46));
        jPanel3.add(txtCroFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 261, 222, 46));

        btnSalvarFuncionario.setBackground(new java.awt.Color(0, 135, 208));
        btnSalvarFuncionario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnSalvarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarFuncionario.setText("Salvar");
        jPanel3.add(btnSalvarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 670, 112, 44));

        btnAtualizarFuncionario.setBackground(new java.awt.Color(0, 135, 208));
        btnAtualizarFuncionario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnAtualizarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarFuncionario.setText("Atualizar");
        btnAtualizarFuncionario.setToolTipText("");
        jPanel3.add(btnAtualizarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 670, 112, 44));

        btnMostrarFuncionario.setBackground(new java.awt.Color(0, 135, 208));
        btnMostrarFuncionario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnMostrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarFuncionario.setText("Mostrar");
        btnMostrarFuncionario.setToolTipText("");
        jPanel3.add(btnMostrarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 670, 112, 44));

        btnDeletarFuncionario.setBackground(new java.awt.Color(0, 135, 208));
        btnDeletarFuncionario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        btnDeletarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletarFuncionario.setText("Deletar");
        btnDeletarFuncionario.setToolTipText("");
        jPanel3.add(btnDeletarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 670, 112, 44));

        viewFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/telaFuncionario.png"))); // NOI18N
        jPanel3.add(viewFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 768));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 1020, 760));

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
        jPanel2.setEnabled(true);
        jPanel2.setVisible(true);
        
        viewInicial.setEnabled(false);
        viewInicial.setVisible(false);  
        
        viewFuncionario.setEnabled(false);
        viewFuncionario.setVisible(false);
        jPanel3.setEnabled(false);
        jPanel3.setVisible(false);
    }//GEN-LAST:event_dentistaMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        viewInicial.setEnabled(true);
        viewInicial.setVisible(true);
        
        viewDentist.setEnabled(false);
        viewDentist.setVisible(false);
        jPanel2.setEnabled(false);
        jPanel2.setVisible(false);
        
        viewFuncionario.setEnabled(false);
        viewFuncionario.setVisible(false);
        jPanel3.setEnabled(false);
        jPanel3.setVisible(false);
        
    }//GEN-LAST:event_homeMouseClicked

    private void funcionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funcionarioMouseClicked
        // TODO add your handling code here:
        viewFuncionario.setEnabled(true);
        viewFuncionario.setVisible(true);
        jPanel3.setEnabled(true);
        jPanel3.setVisible(true);
        
        viewDentist.setEnabled(false);
        viewDentist.setVisible(false);
        jPanel2.setEnabled(false);
        jPanel2.setVisible(false);
        
        viewInicial.setEnabled(false);
        viewInicial.setVisible(false); 
    }//GEN-LAST:event_funcionarioMouseClicked

    private void txtCepDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepDentistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepDentistaActionPerformed

    private void txtTelDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelDentistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelDentistaActionPerformed

    private void txtCepFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepFuncionarioActionPerformed

    private void txtTelFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelFuncionarioActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarDentista;
    private javax.swing.JButton btnAtualizarFuncionario;
    private javax.swing.JButton btnDeletarDentista;
    private javax.swing.JButton btnDeletarFuncionario;
    private javax.swing.JButton btnMostrarDentista;
    private javax.swing.JButton btnMostrarFuncionario;
    private javax.swing.JButton btnSalvarDentista;
    private javax.swing.JButton btnSalvarFuncionario;
    private javax.swing.JLabel funcionario;
    private javax.swing.JLabel home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCepDentista;
    private javax.swing.JTextField txtCepFuncionario;
    private javax.swing.JTextField txtCpfDentista;
    private javax.swing.JTextField txtCpfFuncionario;
    private javax.swing.JTextField txtCroDentista;
    private javax.swing.JTextField txtCroFuncionario;
    private javax.swing.JTextField txtEmailDentista;
    private javax.swing.JTextField txtEmailFuncionario;
    private javax.swing.JTextField txtEnderecoDentista;
    private javax.swing.JTextField txtEnderecoFuncionario;
    private javax.swing.JTextField txtNomeDentista;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtSobrenomeDentista;
    private javax.swing.JTextField txtSobrenomeFuncionario;
    private javax.swing.JTextField txtTelDentista;
    private javax.swing.JTextField txtTelFuncionario;
    private javax.swing.JLabel viewDentist;
    private javax.swing.JLabel viewFuncionario;
    private javax.swing.JLabel viewInicial;
    // End of variables declaration//GEN-END:variables

    
}
