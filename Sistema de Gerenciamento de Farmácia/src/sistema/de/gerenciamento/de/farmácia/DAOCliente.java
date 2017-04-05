/*
 * Classes para troca de dados e conexão com banco de dados ( Cliente )
 */
package sistema.de.gerenciamento.de.farmácia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro e Matheus
 */

/*
    String nomeCliente;
    int idCliente;
    String cpfCliente;
    String dataNascCliente;
    String cepCLiente;
    String logradouroCLiente;
    int numeroCliente;
    String bairroCliente;
    String cidadeCliente;
    String complementoCliente;
    String estadoCliente;
    String telefoneCliente;
*/

public class DAOCliente {
  
   private Connection con = null;
   private static final String NOME = "u597091211_eng ", 
                               SENHA = "Engenharia1"; 
  
   public void apagar(int id) {  
      try { 
        conectar();  
          try (PreparedStatement stmt = con.prepareStatement("DELETE FROM cliente WHERE id = ?")) {
              stmt.setInt(1, id);
              stmt.execute();
              stmt.close();
          }
      } catch (Exception e) {  
        imprimeErro("Erro ao apagar pessoas", e.getMessage());  
      } finally {  
         fechar();  
      }  
   }  
  
   public ArrayList<Cliente> buscarTodos() throws Exception {  
      ArrayList<Cliente> resultados = new ArrayList<>();  
      try {
         conectar();  
          try (PreparedStatement stmt = con.prepareStatement("SELECT * FROM cliente")) {
              ResultSet rs = stmt.executeQuery();
              while (rs.next()) {
                  Cliente temp = new Cliente();
                  // pega todos os atributos do Cliente
                  temp.setIdCliente(rs.getInt("id"));
                  temp.setNomeCliente(rs.getString("nome"));
                  temp.setDataNascCliente(rs.getDate("datanasc"));
                  temp.setCpfCliente(rs.getString("cpf"));
                  temp.setCidadeCliente(rs.getString("cidade"));
                  temp.setEstadoCliente(rs.getString("estado"));
                  temp.setCepCliente(rs.getString("cep"));
                  temp.setBairroCliente(rs.getString("bairro"));
                  temp.setLogradouroCliente(rs.getString("logradouro"));
                  temp.setTelefoneCliente(rs.getString("telefone"));
                  temp.setComplementoCliente(rs.getString("complemento"));
                  temp.setNumeroCliente(rs.getInt("numero"));
                  
                  resultados.add(temp);
              }}
         return resultados;  
      } catch (Exception e) {  
         imprimeErro("Erro ao buscar pessoas", e.getMessage());  
         return null;  
      }  
   }  
  
   public ArrayList<Cliente> buscar(String id) throws Exception {  
        ArrayList<Cliente> resultados = new ArrayList<>();  
        try {  
            conectar();  
            try (PreparedStatement stmt = con.prepareStatement("SELECT * FROM cliente WHERE id LIKE ?")) {
                stmt.setString(1, id);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Cliente temp = new Cliente();
                    // pega todos os atributos do Cliente
                    temp.setIdCliente(rs.getInt("id"));
                    temp.setNomeCliente(rs.getString("nome"));
                    temp.setDataNascCliente(rs.getDate("datanasc"));
                    temp.setCpfCliente(rs.getString("cpf"));
                    temp.setCidadeCliente(rs.getString("cidade"));
                    temp.setEstadoCliente(rs.getString("estado"));
                    temp.setCepCliente(rs.getString("cep"));
                    temp.setBairroCliente(rs.getString("bairro"));
                    temp.setLogradouroCliente(rs.getString("logradouro"));
                    temp.setTelefoneCliente(rs.getString("telefone"));
                    temp.setComplementoCliente(rs.getString("complemento"));
                    temp.setNumeroCliente(rs.getInt("numero"));
                    resultados.add(temp);  
                }
            }
            return resultados;  
        } catch (Exception e) {  
           imprimeErro("Erro ao buscar pessoa", e.getMessage());  
           return null;  
        }
   }  
  
    public void insere(Cliente pessoaCliente){  
        String sql = "INSERT INTO  Cliente ( nome, datanasc, cpf, cidade, estado, cep, bairro, logradouro, telefone, complemento, numero, id) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

        try {  
            conectar();
            try (PreparedStatement stmt = con.prepareStatement(sql)){
                stmt.setString(1,pessoaCliente.getNomeCliente()); 
                stmt.setString(2,pessoaCliente.getCpfCliente());
                stmt.setDate(3, (Date) pessoaCliente.getDataNascCliente()); 
                stmt.setString(4,pessoaCliente.getCidadeCliente());
                stmt.setString(5,pessoaCliente.getEstadoCliente());
                stmt.setString(6,pessoaCliente.getCepCliente());
                stmt.setString(7,pessoaCliente.getBairroCliente());
                stmt.setString(8,pessoaCliente.getLogradouroCliente());
                stmt.setString(9,pessoaCliente.getTelefoneCliente());
                stmt.setString(10,pessoaCliente.getComplementoCliente());
                stmt.setInt(11,pessoaCliente.getNumeroCliente());
                stmt.setInt(12,pessoaCliente.getIdCliente());
                stmt.execute();
                stmt.close();
            }
           System.out.println("Inserida!");  
        } catch (Exception e) {  
           imprimeErro("Erro ao inserir Cliente", e.getMessage());  
        } finally {  
           fechar();  
        }  
    }
   
    public void atualizar(Cliente pessoaCliente) {  
       String sql = "UPDATE fornecedor SET nome = ?, cpf = ?, datanasc = ? cidade = ?, estado = ?, cep = ?, "
                + "bairro =?, logradouro = ?, telefone = ?, complemento = ?, numero =? WHERE  id = ?";
        try { 
            conectar();
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setString(1,pessoaCliente.getNomeCliente()); 
                stmt.setString(2,pessoaCliente.getCpfCliente());
                stmt.setDate(3, (Date) pessoaCliente.getDataNascCliente()); 
                stmt.setString(4,pessoaCliente.getCidadeCliente());
                stmt.setString(5,pessoaCliente.getEstadoCliente());
                stmt.setString(6,pessoaCliente.getCepCliente());
                stmt.setString(7,pessoaCliente.getBairroCliente());
                stmt.setString(8,pessoaCliente.getLogradouroCliente());
                stmt.setString(9,pessoaCliente.getTelefoneCliente());
                stmt.setString(10,pessoaCliente.getComplementoCliente());
                stmt.setInt(11,pessoaCliente.getNumeroCliente());
                stmt.setInt(12,pessoaCliente.getIdCliente());
                stmt.execute();
                stmt.close();
            }
            System.out.println("Atualizada!");
        } catch (Exception e) { 
          imprimeErro("Erro ao fechar conexão", e.getMessage());  
        } finally {  
          fechar();  
        }  
    }  
     
    private void conectar() throws Exception {  
           con = new Dados().conexao(NOME,SENHA);   
           System.out.println("Conectado!");   
    }  
  
    private void fechar() {  
        try { 
           con.close();  
           System.out.println("Conexão Fechada");  
        } catch (SQLException e) {  
           imprimeErro("Erro ao fechar conexão", e.getMessage());  
        }  
    }  

    private void imprimeErro(String msg, String msgErro) {  
        JOptionPane.showMessageDialog(null, msg, "Erro crítico", 0);  
        System.err.println(msg);  
        System.out.println(msgErro);  
        System.exit(0);  
    }  
}
