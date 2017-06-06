/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistema.de.gerenciamento.de.farmácia.Cliente;
import sistema.de.gerenciamento.de.farmácia.DAOCliente;

/**
 *
 * @author mathe_56ugtvf
 */
public final class formCliente extends javax.swing.JFrame {
    /**
     * Creates new form formCliente
     */
    public formCliente() {
        initComponents();
        resetText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomeCliente = new javax.swing.JTextField();
        logradouroCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        numeroCliente = new javax.swing.JTextField();
        complementoCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bairroCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cidadeCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        estadoCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dataNascCliente = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        cepCliente = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        telefoneCliente = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        cpfCliente = new javax.swing.JFormattedTextField();
        tituloCliente = new javax.swing.JLabel();
        salvarCliente = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        atualizarCliente = new javax.swing.JButton();
        excluirCliente = new javax.swing.JButton();
        buscarCliente = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        codigoCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DO CLIENTE");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setLabelFor(nomeCliente);
        jLabel1.setText("Nome");

        jLabel2.setLabelFor(logradouroCliente);
        jLabel2.setText("Logradouro");

        numeroCliente.setText("jTextField1");

        complementoCliente.setText("jTextField1");

        jLabel4.setLabelFor(complementoCliente);
        jLabel4.setText("Complemento");

        bairroCliente.setText("jTextField1");

        jLabel5.setLabelFor(bairroCliente);
        jLabel5.setText("Bairro");

        cidadeCliente.setText("jTextField1");

        jLabel6.setLabelFor(cidadeCliente);
        jLabel6.setText("Cidade");

        estadoCliente.setText("jTextField1");

        jLabel7.setLabelFor(estadoCliente);
        jLabel7.setText("Estado");

        jLabel9.setLabelFor(dataNascCliente);
        jLabel9.setText("Data Nasc.");

        try {
            dataNascCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel10.setLabelFor(cepCliente);
        jLabel10.setText("CEP");

        try {
            cepCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cepCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepClienteActionPerformed(evt);
            }
        });

        jLabel11.setLabelFor(telefoneCliente);
        jLabel11.setText("Telefone");

        try {
            telefoneCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel12.setLabelFor(cpfCliente);
        jLabel12.setText("CPF");

        try {
            cpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfClienteActionPerformed(evt);
            }
        });

        tituloCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tituloCliente.setText("CADASTRO DO CLIENTE");

        salvarCliente.setText("Salvar");
        salvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarClienteActionPerformed(evt);
            }
        });

        reset.setText("Limpar");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        atualizarCliente.setText("Atualizar");
        atualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarClienteActionPerformed(evt);
            }
        });

        excluirCliente.setText("Excluir");
        excluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirClienteActionPerformed(evt);
            }
        });

        buscarCliente.setText("Buscar");
        buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteActionPerformed(evt);
            }
        });

        exit.setText("Voltar");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel8.setText("Código");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cepCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dataNascCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cpfCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(logradouroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(complementoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(codigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buscarCliente))
                                .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salvarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atualizarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset)
                        .addGap(70, 70, 70)
                        .addComponent(exit))
                    .addComponent(tituloCliente))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {atualizarCliente, buscarCliente, excluirCliente, exit, reset, salvarCliente});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tituloCliente)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(codigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(dataNascCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logradouroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numeroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(complementoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bairroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(estadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(telefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarCliente)
                    .addComponent(atualizarCliente)
                    .addComponent(excluirCliente)
                    .addComponent(exit)
                    .addComponent(reset))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        resetText();
    }//GEN-LAST:event_formWindowOpened

    private void atualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarClienteActionPerformed
        // TODO add your handling code here:        
        try {
            DAOCliente daoCliente = new DAOCliente();
            boolean result = daoCliente.atualizar(getCliente());
        } catch (Exception ex) {
            System.out.println("Erro ao Atualizar: "+ ex.getMessage());
        }
    }//GEN-LAST:event_atualizarClienteActionPerformed

    private void excluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirClienteActionPerformed
        // TODO add your handling code here:
        DAOCliente daoCliente = new DAOCliente();
        try {
            Cliente novoCliente = getCliente();
            daoCliente.apagar(novoCliente.getIdCliente());
            imprimeMsg("Cliente Excluido com Sucesso");
        } catch (Exception ex) {
            System.out.print("Erro ao Atualizar: "+ ex.getMessage());
        }
    }//GEN-LAST:event_excluirClienteActionPerformed

    private void salvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarClienteActionPerformed
        // TODO add your handling code here:
        Cliente novoCliente = null;
        DAOCliente daoCliente = new DAOCliente();
        try {
            novoCliente = getCliente();
            daoCliente.insere(novoCliente);
            imprimeMsg("Cliente Salvo com Sucesso");
        } catch (Exception ex) {
            System.out.print("Erro ao Salvar: "+ ex.getMessage());
        }
        
    }//GEN-LAST:event_salvarClienteActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        resetText();
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_exitActionPerformed

    private void buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteActionPerformed
        try {
            // TODO add your handling code here:
            int id = Integer.parseInt(codigoCliente.getText());
            SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
            Cliente buscar = buscarCliente(id);
            nomeCliente.setText(buscar.getNomeCliente() );
            cpfCliente.setText(buscar.getCpfCliente() );
            dataNascCliente.setText(ft.format(buscar.getDataNascCliente()));
            cepCliente.setText(buscar.getCepCliente() );
            logradouroCliente.setText(buscar.getLogradouroCliente() );
            numeroCliente.setText(String.valueOf(buscar.getNumeroCliente()));
            bairroCliente.setText(buscar.getBairroCliente() );
            cidadeCliente.setText(buscar.getCidadeCliente() );
            complementoCliente.setText(buscar.getComplementoCliente() );
            estadoCliente.setText(buscar.getEstadoCliente() );
            telefoneCliente.setText(buscar.getTelefoneCliente() );
        } catch (Exception ex) {
            imprimeMsg("Erro ao Buscar usuário ");
        }
    }//GEN-LAST:event_buscarClienteActionPerformed

    private void cepClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepClienteActionPerformed

    private void cpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfClienteActionPerformed

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
            java.util.logging.Logger.getLogger(formCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new formCliente().setVisible(true);
        });
    }
    /*
     * Metodos criados 
     */
    private void resetText(){
        nomeCliente.setText("");
        cpfCliente.setText("");
        dataNascCliente.setText("");
        cepCliente.setText("");
        logradouroCliente.setText("");
        numeroCliente.setText("");
        bairroCliente.setText("");
        cidadeCliente.setText("");
        complementoCliente.setText("");
        estadoCliente.setText("");
        telefoneCliente.setText("");
    }
    
    private Cliente getCliente() throws Exception{
        Cliente novoCliente = new Cliente();
        String data = dataNascCliente.getText();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        
        novoCliente.setIdCliente(Integer.parseInt(codigoCliente.getText()));
        novoCliente.setNomeCliente(nomeCliente.getText());
        novoCliente.setCpfCliente(cpfCliente.getText());
        novoCliente.setCepCliente(cepCliente.getText());
        novoCliente.setBairroCliente(bairroCliente.getText());
        novoCliente.setCidadeCliente(cidadeCliente.getText());
        novoCliente.setComplementoCliente(complementoCliente.getText());
        novoCliente.setDataNascCliente(new Date(format.parse(data).getTime()));
        novoCliente.setLogradouroCliente(logradouroCliente.getText());
        novoCliente.setEstadoCliente(estadoCliente.getText());
        novoCliente.setNumeroCliente(Integer.parseInt(numeroCliente.getText()));
        novoCliente.setTelefoneCliente(telefoneCliente.getText());
        
        return novoCliente;
    }
    
    public void setCodigo(boolean id) throws Exception{
        int codigo = 0;
        System.out.print(id);
        if(id){
            DAOCliente daoCliente = new DAOCliente();
            ArrayList<Cliente> lista = daoCliente.buscarTodos();
            Cliente e = lista.get(lista.size() - 1);
            codigo = e.getIdCliente() + 1;

        }
        codigoCliente.setText(String.valueOf(codigo));
    }
    
    private Cliente buscarCliente(int id){        
        try {
            DAOCliente daoCliente = new DAOCliente();
            return daoCliente.buscar(id);
        } catch (Exception ex) {
            System.out.print("Erro ao Buscar Cliente: "+ ex.getMessage());
        }
        return null;
    }
    
    private void imprimeMsg(String msg) {  
        JOptionPane.showMessageDialog(null, msg, "Notificação",  JOptionPane.INFORMATION_MESSAGE);  
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarCliente;
    private javax.swing.JTextField bairroCliente;
    private javax.swing.JButton buscarCliente;
    private javax.swing.JFormattedTextField cepCliente;
    private javax.swing.JTextField cidadeCliente;
    private javax.swing.JTextField codigoCliente;
    private javax.swing.JTextField complementoCliente;
    private javax.swing.JFormattedTextField cpfCliente;
    private javax.swing.JFormattedTextField dataNascCliente;
    private javax.swing.JTextField estadoCliente;
    private javax.swing.JButton excluirCliente;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField logradouroCliente;
    private javax.swing.JTextField nomeCliente;
    private javax.swing.JTextField numeroCliente;
    private javax.swing.JButton reset;
    private javax.swing.JButton salvarCliente;
    private javax.swing.JFormattedTextField telefoneCliente;
    private javax.swing.JLabel tituloCliente;
    // End of variables declaration//GEN-END:variables
}
