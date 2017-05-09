/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
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

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        novo = new javax.swing.JMenu();
        novoCliente = new javax.swing.JMenuItem();
        novoFornecedor = new javax.swing.JMenuItem();
        novoProduto = new javax.swing.JMenuItem();
        gerenciar = new javax.swing.JMenu();
        gerenciarCliente = new javax.swing.JMenuItem();
        gerenciarFornecedor = new javax.swing.JMenuItem();
        gerenciarProduto = new javax.swing.JMenuItem();
        estoque = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();
        sairSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Farmácia");

        jPanel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        novo.setText("Novo");

        novoCliente.setText("Cliente");
        novoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoClienteActionPerformed(evt);
            }
        });
        novo.add(novoCliente);

        novoFornecedor.setText("Fornecedor");
        novoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoFornecedorActionPerformed(evt);
            }
        });
        novo.add(novoFornecedor);

        novoProduto.setText("Produto");
        novoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoProdutoActionPerformed(evt);
            }
        });
        novo.add(novoProduto);

        jMenuBar1.add(novo);

        gerenciar.setText("Gerenciar");

        gerenciarCliente.setText("Cliente");
        gerenciarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarClienteActionPerformed(evt);
            }
        });
        gerenciar.add(gerenciarCliente);

        gerenciarFornecedor.setText("Fornecedor");
        gerenciarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarFornecedorActionPerformed(evt);
            }
        });
        gerenciar.add(gerenciarFornecedor);

        gerenciarProduto.setText("Produto");
        gerenciarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenciarProdutoActionPerformed(evt);
            }
        });
        gerenciar.add(gerenciarProduto);

        jMenuBar1.add(gerenciar);

        estoque.setText("Estoque");
        estoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estoqueMouseClicked(evt);
            }
        });
        jMenuBar1.add(estoque);

        exit.setText("Sair");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        sairSistema.setText("Sair do Sistema");
        sairSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairSistemaActionPerformed(evt);
            }
        });
        exit.add(sairSistema);

        jMenuBar1.add(exit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gerenciarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarClienteActionPerformed
        // TODO add your handling code here:
        formCliente form;
        try {
            form = new formCliente();
            form.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gerenciarClienteActionPerformed

    private void novoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoClienteActionPerformed
        // TODO add your handling code here:
        formCliente form;
        try {
            form = new formCliente();
            form.setCodigo(true);
            form.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_novoClienteActionPerformed

    private void gerenciarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarFornecedorActionPerformed
        // TODO add your handling code here:
        formFornecedor form;
        try {
            form = new formFornecedor();
            form.setVisible(true);
            form.setCodigo(false);
        } catch (Exception ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gerenciarFornecedorActionPerformed

    private void novoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoFornecedorActionPerformed
        // TODO add your handling code here:
        formFornecedor form;
        try {
            form = new formFornecedor();
            form.setCodigo(true);
            form.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_novoFornecedorActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void novoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoProdutoActionPerformed
        // TODO add your handling code here:
        formProduto form;
        try {
            form = new formProduto();
            form.setCodigo(true);
            form.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_novoProdutoActionPerformed

    private void sairSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairSistemaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairSistemaActionPerformed

    private void gerenciarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarProdutoActionPerformed
        formProduto form;
        try {
            form = new formProduto();
            form.setVisible(true);
            form.setCodigo(false);
        } catch (Exception ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gerenciarProdutoActionPerformed

    private void estoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estoqueMouseClicked
        // TODO add your handling code here:
        formEstoque form;
        try {
            form = new formEstoque();
            form.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_estoqueMouseClicked

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu estoque;
    private javax.swing.JMenu exit;
    private javax.swing.JMenu gerenciar;
    private javax.swing.JMenuItem gerenciarCliente;
    private javax.swing.JMenuItem gerenciarFornecedor;
    private javax.swing.JMenuItem gerenciarProduto;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu novo;
    private javax.swing.JMenuItem novoCliente;
    private javax.swing.JMenuItem novoFornecedor;
    private javax.swing.JMenuItem novoProduto;
    private javax.swing.JMenuItem sairSistema;
    // End of variables declaration//GEN-END:variables
}
