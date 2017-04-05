/*
 * Classe de Conexao com os Dados
 */
package sistema.de.gerenciamento.de.farmácia;

import java.sql.Connection;  
import java.sql.DriverManager;   

/**
 *
 * @author Pedro e Matheus
 */
public class Dados {
   private static final String URL = "jdbc:mysql://mysql.hostinger.com.br";
  
    public Connection conexao(String nome , String senha) throws Exception {
        try{
            return DriverManager.getConnection(URL, nome, senha);
        } catch (Exception e) {
            throw new Exception("Erro de conexão com banco");
        }
    }
}