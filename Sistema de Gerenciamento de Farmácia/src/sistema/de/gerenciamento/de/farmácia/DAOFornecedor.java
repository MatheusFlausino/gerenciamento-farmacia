/*
 * Classes para troca de dados e conexão com banco de dados ( Fornecedor )
 */
package sistema.de.gerenciamento.de.farmácia;

import java.sql.Connection;  
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
    String nomeFornecedor;
    int idFornecedor;
    String cnpjFornecedor;
    tring cepFornecedor;
    String logradouroFornecedor;
    String cidadeFornecedor;
    String complementoFornecedor;
    int numeroFornecedor;
    String bairroFornecedor;
    String telefoneFornecedor;
*/
  
public class DAOFornecedor {  
   // Configura essas variáveis de acordo com o seu banco  
   private Connection con = null;
   private static final String NOME = "u597091211_eng ", 
                               SENHA = "Engenharia1"; 
  
   public void apagar(int id) {  
      try {  
        conectar();  
          try (PreparedStatement stmt = con.prepareStatement("DELETE FROM fornecedor WHERE id = ?")) {
              stmt.setInt(1, id);
              stmt.execute();
          }
      } catch (Exception e) {  
        imprimeErro("Erro ao apagar Fornecedor", e.getMessage());  
      } finally {  
        fechar();  
      }  
   }  
  
   public ArrayList<Fornecedor> buscarTodos() throws Exception {   
      ArrayList<Fornecedor> resultados = new ArrayList<>();  
      try {
         conectar(); 
         PreparedStatement stmt = con.prepareStatement("SELECT * FROM fornecedor");
         ResultSet rs = stmt.executeQuery();
         
         while (rs.next()) {  
            Fornecedor temp = new Fornecedor();  
            // pega todos os atributos do Fornecedor 
            temp.setIdFornecedor(rs.getInt("id"));  
            temp.setNomeFornecedor(rs.getString("nome"));  
            temp.setCnpjFornecedor(rs.getString("cnpj"));  
            temp.setCidadeFornecedor(rs.getString("cidade"));  
            temp.setEstadoFornecedor(rs.getString("estado"));
            temp.setCepFornecedor(rs.getString("cep"));
            temp.setBairroFornecedor(rs.getString("bairro"));
            temp.setLogradouroFornecedor(rs.getString("logradouro"));
            temp.setTelefoneFornecedor(rs.getString("telefone"));
            temp.setComplementoFornecedor(rs.getString("complemento"));
            temp.setNumeroFornecedor(rs.getInt("numero"));
            
            resultados.add(temp);  
         }  
         return resultados;  
      } catch (SQLException e) {  
         imprimeErro("Erro ao buscar pessoas", e.getMessage());  
         return null;  
      }  
   }  
  
   public ArrayList<Fornecedor> buscar(String id) throws Exception {    
      ArrayList<Fornecedor> resultados = new ArrayList<>();   
      try {
         conectar();
         PreparedStatement stmt = con.prepareStatement("SELECT * FROM pessoa WHERE id LIKE ?");
         stmt.setString(1, id);
         ResultSet rs = stmt.executeQuery();
         while (rs.next()) {  
            Fornecedor temp = new Fornecedor();  
            // pega todos os atributos do Fornecedor
            temp.setIdFornecedor(rs.getInt("id"));  
            temp.setNomeFornecedor(rs.getString("nome"));  
            temp.setCnpjFornecedor(rs.getString("cnpj"));  
            temp.setCidadeFornecedor(rs.getString("cidade"));  
            temp.setEstadoFornecedor(rs.getString("estado"));
            temp.setCepFornecedor(rs.getString("cep"));
            temp.setBairroFornecedor(rs.getString("bairro"));
            temp.setLogradouroFornecedor(rs.getString("logradouro"));
            temp.setTelefoneFornecedor(rs.getString("telefone"));
            temp.setComplementoFornecedor(rs.getString("complemento"));
            temp.setNumeroFornecedor(rs.getInt("numero"));  
            resultados.add(temp);  
         }  
         return resultados;  
      } catch (SQLException e) {  
         imprimeErro("Erro ao buscar Fornecedor", e.getMessage());  
         return null;  
      }  
  
   }  
  
   public void insere(Fornecedor pessoaFornecedor){    
      try {
        conectar();
        String sql = "INSERT INTO fornecedores"+
                 "(id, nome, cnpj, cidade, estado, cep, bairro, logradouro, telefone, complemento, numero)"+
                 "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
          try (PreparedStatement stmt = con.prepareStatement(sql)) {
              stmt.setInt(1, pessoaFornecedor.getIdFornecedor() );
              stmt.setString(2, pessoaFornecedor.getNomeFornecedor() );
              stmt.setString(3, pessoaFornecedor.getCnpjFornecedor() );
              stmt.setString(4, pessoaFornecedor.getCidadeFornecedor()) ;
              stmt.setString(5, pessoaFornecedor.getEstadoFornecedor() );
              stmt.setString(6, pessoaFornecedor.getCepFornecedor() );
              stmt.setString(7, pessoaFornecedor.getBairroFornecedor()) ;
              stmt.setString(8, pessoaFornecedor.getLogradouroFornecedor()) ;
              stmt.setString(9, pessoaFornecedor.getTelefoneFornecedor() );
              stmt.setString(10, pessoaFornecedor.getComplementoFornecedor()) ;
              stmt.setInt(11, pessoaFornecedor.getNumeroFornecedor() );
              stmt.execute();
              stmt.close();
          }
        System.out.println("Inserida!");  
      } catch (Exception e) {  
         imprimeErro("Erro ao inserir Fornecedor", e.getMessage());  
      } finally {  
         fechar();  
      }  
   }
   
    public void atualizar(Fornecedor pessoaFornecedor) {   
        String sql = "UPDATE fornecedor SET nome = ?, cnpj = ?, cidade = ?, estado = ?, cep = ?, "
                + "bairro =?, logradouro = ?, telefone = ?, complemento = ?, numero =? WHERE  id = ?";
        try {          
            conectar(); 
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setString(1, pessoaFornecedor.getNomeFornecedor() );
                stmt.setString(2, pessoaFornecedor.getCnpjFornecedor() );
                stmt.setString(3, pessoaFornecedor.getCidadeFornecedor()) ;
                stmt.setString(4, pessoaFornecedor.getEstadoFornecedor() );
                stmt.setString(5, pessoaFornecedor.getCepFornecedor() );
                stmt.setString(6, pessoaFornecedor.getBairroFornecedor()) ;
                stmt.setString(7, pessoaFornecedor.getLogradouroFornecedor()) ;
                stmt.setString(8, pessoaFornecedor.getTelefoneFornecedor() );
                stmt.setString(9, pessoaFornecedor.getComplementoFornecedor()) ;
                stmt.setInt(10, pessoaFornecedor.getNumeroFornecedor() );
                stmt.setInt(11, pessoaFornecedor.getIdFornecedor() );
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
         this.con = new Dados().conexao(NOME, SENHA);  
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