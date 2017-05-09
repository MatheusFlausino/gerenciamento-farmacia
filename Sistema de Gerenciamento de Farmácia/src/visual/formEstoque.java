/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistema.de.gerenciamento.de.farmácia.DAOEstoque;
import sistema.de.gerenciamento.de.farmácia.DAOFornecedor;
import sistema.de.gerenciamento.de.farmácia.DAOProduto;
import sistema.de.gerenciamento.de.farmácia.Estoque;
import sistema.de.gerenciamento.de.farmácia.Fornecedor;
import sistema.de.gerenciamento.de.farmácia.Produto;

/**
 *
 * @author matheusflausino
 */
public class formEstoque extends javax.swing.JFrame {

    /**
     * Creates new form formEstoque
     */
    public formEstoque() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        codigoProduto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        fabricanteProduto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        precoProduto = new javax.swing.JTextField();
        salvarProduto = new javax.swing.JButton();
        tituloProduto = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nomeProduto = new javax.swing.JTextField();
        buscarProduto = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cpfFornecedor = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        nomeFornecedor = new javax.swing.JTextField();
        buscarCliente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        codigoFornecedor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        qtdEstoque = new javax.swing.JTextField();

        jLabel8.setText("Código produto");

        jLabel12.setText("Fabricante Produto");

        fabricanteProduto.setEditable(false);

        jLabel13.setText("Preço Produto");

        precoProduto.setEditable(false);

        salvarProduto.setText("Salvar");
        salvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarProdutoActionPerformed(evt);
            }
        });

        tituloProduto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tituloProduto.setText("CADASTRO DO ESTOQUE");

        reset.setText("Limpar");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome Produto");

        nomeProduto.setEditable(false);

        buscarProduto.setText("Buscar Produto");
        buscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProdutoActionPerformed(evt);
            }
        });

        exit.setText("Voltar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel14.setText("CNPJ Fornecedor");

        cpfFornecedor.setEditable(false);
        try {
            cpfFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("Nome Fornecedor");

        nomeFornecedor.setEditable(false);

        buscarCliente.setText("Buscar Fornecedor");
        buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteActionPerformed(evt);
            }
        });

        jLabel9.setText("Código Fornecedor");

        jLabel15.setText("Quantidado de Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloProduto)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(salvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(codigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buscarCliente))
                                .addComponent(nomeFornecedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                            .addComponent(cpfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(codigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(buscarProduto))
                                    .addComponent(nomeProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                    .addComponent(fabricanteProduto, javax.swing.GroupLayout.Alignment.LEADING))))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tituloProduto)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(codigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(fabricanteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(codigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cpfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarProduto)
                    .addComponent(exit)
                    .addComponent(reset))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarProdutoActionPerformed
        // TODO add your handling code here:
        Estoque novoEstoque = null;

        DAOEstoque daoEstoque = new DAOEstoque();
        try {
            novoEstoque = getEstoque(setCodigo());
            daoEstoque.insere(novoEstoque);
            imprimeMsg("Produto Salvo com Sucesso");
        } catch (Exception ex) {
            System.out.print("Erro ao Salvar: "+ ex.getMessage());
        }
    }//GEN-LAST:event_salvarProdutoActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        resetText();
    }//GEN-LAST:event_resetActionPerformed

    private void buscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProdutoActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(codigoProduto.getText());
        Produto buscar = buscarProduto(id);
        nomeProduto.setText(buscar.getNomeProduto());
        codigoProduto.setText(String.valueOf(buscar.getIdProduto()));
        precoProduto.setText(String.valueOf(buscar.getPrecoProduto()));
        fabricanteProduto.setText(String.valueOf(buscar.getFabricanteProduto()));

    }//GEN-LAST:event_buscarProdutoActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_exitActionPerformed

    private void buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteActionPerformed
        // TODO add your handling code here:
        Fornecedor buscaFornecedor = buscarFornecedor();

        nomeFornecedor.setText(buscaFornecedor.getNomeFornecedor() );
        cpfFornecedor.setText(buscaFornecedor.getCnpjFornecedor() );
    }//GEN-LAST:event_buscarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(formEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formEstoque().setVisible(true);
            }
        });
    }

    /*
     * Metodos criados 
     */
    private void resetText(){
        codigoProduto.setText("");
        nomeProduto.setText("");
        fabricanteProduto.setText("");
        precoProduto.setText("");
        codigoFornecedor.setText("");
        nomeFornecedor.setText("");
        cpfFornecedor.setText("");
        qtdEstoque.setText("");
    }
    
    private Estoque getEstoque(int id) throws Exception{
        Estoque novoEstoque = new Estoque();
        
        novoEstoque.setIdEstoque(id);
        novoEstoque.setQtdEstoque(id);
        novoEstoque.setIdEstoque(Integer.parseInt(codigoFornecedor.getText()));
        novoEstoque.setIdProduto(Integer.parseInt(codigoProduto.getText()));
        
        return novoEstoque;
    }
    private int setCodigo() throws Exception{
        int codigo;
        DAOEstoque daoEstoque = new DAOEstoque();
        ArrayList<Estoque> lista = daoEstoque.buscarTodos();
        Estoque e = lista.get(lista.size() - 1);
        codigo = e.getIdEstoque() + 1;
        System.out.print(codigo);
        return codigo;
    }
    
    private Produto buscarProduto(int id){        
        try {
            DAOProduto daoProduto = new DAOProduto();
            return daoProduto.buscar(id);
        } catch (Exception ex) {
            System.out.print("Erro ao Buscar Produto: "+ ex.getMessage());
        }
        return null;
    }
    
    private Fornecedor buscarFornecedor(){
        DAOFornecedor daoFornecedor = new DAOFornecedor();
        
        try {
            return daoFornecedor.buscar(Integer.parseInt(codigoFornecedor.getText()));
        } catch (Exception ex) {
            System.out.print("Erro ao Buscar Fornecedor: "+ ex.getMessage());
        }
        return null;
    }
    

    private void imprimeMsg(String msg) {  
        JOptionPane.showMessageDialog(null, msg, "Notificação",  JOptionPane.INFORMATION_MESSAGE);  
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarCliente;
    private javax.swing.JButton buscarProduto;
    private javax.swing.JTextField codigoFornecedor;
    private javax.swing.JTextField codigoProduto;
    private javax.swing.JFormattedTextField cpfFornecedor;
    private javax.swing.JButton exit;
    private javax.swing.JTextField fabricanteProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomeFornecedor;
    private javax.swing.JTextField nomeProduto;
    private javax.swing.JTextField precoProduto;
    private javax.swing.JTextField qtdEstoque;
    private javax.swing.JButton reset;
    private javax.swing.JButton salvarProduto;
    private javax.swing.JLabel tituloProduto;
    // End of variables declaration//GEN-END:variables
}
