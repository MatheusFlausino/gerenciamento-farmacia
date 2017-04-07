/*
 * Classe de Conexao com os Dados
 */
package sistema.de.gerenciamento.de.farmácia;

import java.sql.Connection;  
import java.sql.DriverManager;   
import java.sql.SQLException;

/**
 *
 * @author Pedro e Matheus
 */
public class Dados {
   private static final String URL = "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10167525";
  
    public Connection conexao(String nome , String senha) throws Exception {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(URL, nome, senha);
        } catch (ClassNotFoundException | SQLException e) {
            throw new Exception("Erro de conexão com banco");
        }
    }
}