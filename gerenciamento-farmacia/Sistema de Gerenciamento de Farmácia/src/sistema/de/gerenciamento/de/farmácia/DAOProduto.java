/*
 * Classes para troca de dados e conexão com banco de dados ( Produto )
 */
package sistema.de.gerenciamento.de.farmácia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Pedro e Matheus
 */
public class DAOProduto {

    private Connection con = null;
    private static final String NOME = "root",
            SENHA = "";

    public void apagar(int id) throws Exception {
        try {
            conectar();
            try (PreparedStatement stmt = con.prepareStatement("DELETE FROM produto WHERE id = ?")) {
                stmt.setInt(1, id);
                stmt.execute();
                stmt.close();
            }
        } catch (Exception e) {
            throw new Exception("Erro ao apagar Produto");
        } finally {
            fechar();
        }
    }

    public ArrayList<Produto> buscarTodos() throws Exception {
        ArrayList<Produto> resultados = new ArrayList<>();
        try {
            conectar();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM produto");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produto temp = new Produto();
                // pega todos os atributos do Produto
                temp.setIdProduto(rs.getInt("id"));
                temp.setPrecoProduto(rs.getInt("preco"));
                temp.setProdutoFabricante(rs.getString("fabricante"));

                resultados.add(temp);
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao buscar Produto 1");
        }
        return resultados;
    }

    public Produto buscar(int id) throws Exception {
        Produto resultados = null;
        try {
            conectar();
            try (PreparedStatement stmt = con.prepareStatement("SELECT * FROM produto WHERE id LIKE ? LIMIT 1")) {
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Produto temp = new Produto();
                    // pega todos os atributos do Produto
                    temp.setIdProduto(rs.getInt("id"));
                    temp.setPrecoProduto(rs.getInt("preco"));
                    temp.setProdutoFabricante(rs.getString("fabricante"));
                    resultados = temp;
                }
            }
        } catch (Exception e) {
            throw new Exception("Erro ao buscar Produto");
        }
        return resultados;
    }

    public boolean insere(Produto novoProduto) throws Exception {
        boolean retorno = false;
        String sql = "INSERT INTO produto ( id, preco, fabricante) + VALUES(?,?,?)";

        try {
            conectar();
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setInt(1, novoProduto.getIdProduto());
                stmt.setInt(2, novoProduto.getPrecoProduto());
                stmt.setString(3, novoProduto.getProdutoFabricante());

                stmt.execute();
                stmt.close();
            }
            retorno = true;
        } catch (Exception e) {
            throw new Exception("Erro ao inserir Produto");
        } finally {
            fechar();
        }
        return retorno;
    }

    public boolean atualizar(Produto atuaProduto) throws Exception {
        boolean retorno = false;
        String sql = "UPDATE produto preco = ?, fabricante = ? WHERE  id = ?";
        try {
            conectar();
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setInt(1, atuaProduto.getIdProduto());
                stmt.setInt(2, atuaProduto.getPrecoProduto());
                stmt.setString(3, atuaProduto.getProdutoFabricante());

                stmt.executeUpdate();
                stmt.close();
            }
            retorno = true;
        } catch (Exception e) {
            throw new Exception("Erro ao Atualizar");
        } finally {
            fechar();
        }
        return retorno;
    }

    private void conectar() throws Exception {
        con = new Dados().conexao(NOME, SENHA);
        System.out.println("Conectado!");
    }

    private void fechar() throws Exception {
        try {
            con.close();
            System.out.println("Conexão Fechada");
        } catch (SQLException e) {
            throw new Exception("Erro ao fechar conexão");
        }
    }
}
