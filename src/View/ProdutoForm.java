/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Validation.campoNumero;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class ProdutoForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form produtoPrototipo
     */
    public ProdutoForm() {
        initComponents();
        // O campo só vai aceitar números!
         txtUnidade.setDocument(new campoNumero());
         txtPreco.setDocument(new campoNumero());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnCancelar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        panelProduto = new javax.swing.JPanel();
        txtNomeProduto = new javax.swing.JTextField();
        lblUnidade = new javax.swing.JLabel();
        lblValidade = new javax.swing.JLabel();
        lblNomeProduto = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        txtUnidade = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        txtValidade = new javax.swing.JFormattedTextField();
        txtPreco = new javax.swing.JFormattedTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximizable(true);
        setResizable(true);

        btnCancelar.setText("Cancelar");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        panelProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Produto", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        lblUnidade.setText("Unidade");

        lblValidade.setText("Validade");

        lblNomeProduto.setText("Nome ");

        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });

        txtUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadeActionPerformed(evt);
            }
        });

        lblCategoria.setText("Categoria");

        lblPreco.setText("Preço  ");

        try {
            txtValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProdutoLayout = new javax.swing.GroupLayout(panelProduto);
        panelProduto.setLayout(panelProdutoLayout);
        panelProdutoLayout.setHorizontalGroup(
            panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProdutoLayout.createSequentialGroup()
                        .addGroup(panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUnidade)
                            .addComponent(txtUnidade, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(lblValidade)
                            .addComponent(txtValidade))
                        .addGap(36, 36, 36)
                        .addGroup(panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCategoria)
                            .addGroup(panelProdutoLayout.createSequentialGroup()
                                .addGroup(panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPreco)
                                    .addComponent(lblCategoria))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtPreco)))
                    .addComponent(lblNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        panelProdutoLayout.setVerticalGroup(
            panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnidade)
                    .addComponent(lblPreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValidade)
                    .addComponent(lblCategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(panelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnAdicionar))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void txtUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadeActionPerformed

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
      
        
         
       if (   !txtNomeProduto.getText().trim().equals("") 
            & !txtUnidade.getText().trim().equals("")
            & !txtCategoria.getText().trim().equals("")
            & !txtPreco.getText().trim().equals("")   
            & !txtValidade.getText().equals("  /  /    ")){  
            		
            JOptionPane.showMessageDialog(rootPane, "Os dados foram salvo com sucesso!");   
           
            } 
        
        
        if (txtNomeProduto.getText().trim().equals("")) {
            
            JOptionPane.showMessageDialog(null, " O campo Nome é obrigatório, por favor preencha-o! ", " AVISO ",JOptionPane.WARNING_MESSAGE);
            
        }  
         if (txtUnidade.getText().trim().equals("")) {
            
            JOptionPane.showMessageDialog(null, " O campo Unidade é obrigatório, por favor preencha-o! ", " AVISO ",JOptionPane.WARNING_MESSAGE);
            
        }  
        if (txtCategoria.getText().trim().equals("")) {
            
            JOptionPane.showMessageDialog(null, " O campo Categoria é obrigatório, por favor preencha-o! ", " AVISO ",JOptionPane.WARNING_MESSAGE);
            
        }
         if (txtPreco.getText().trim().equals("")) {
            
            JOptionPane.showMessageDialog(null, " O campo Preço é obrigatório, por favor preencha-o! ", " AVISO ",JOptionPane.WARNING_MESSAGE);
            
        }
         if (txtValidade.getText().equals("  /  /    ")) {
            
            JOptionPane.showMessageDialog(null, " O campo Validade é obrigatório, por favor preencha-o! ", " AVISO ",JOptionPane.WARNING_MESSAGE);
            
        }
        
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed
    
    
    
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
            java.util.logging.Logger.getLogger(ProdutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblUnidade;
    private javax.swing.JLabel lblValidade;
    private javax.swing.JPanel panelProduto;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JFormattedTextField txtPreco;
    private javax.swing.JTextField txtUnidade;
    private javax.swing.JFormattedTextField txtValidade;
    // End of variables declaration//GEN-END:variables
}
