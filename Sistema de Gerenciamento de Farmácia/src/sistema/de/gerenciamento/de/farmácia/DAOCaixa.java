/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.gerenciamento.de.farmácia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author pedro canassa
 */
public class DAOCaixa {

    private Connection con = null;
    private static final String NOME = "root",
            SENHA = "";

    public void apagar(int id) throws Exception {
        try {
            conectar();
            try (PreparedStatement stmt = con.prepareStatement("DELETE FROM caixa WHERE id = ?")) {
                stmt.setInt(1, id);
                stmt.executeUpdate();
                stmt.close();
            }
        } catch (Exception e) {
            throw new Exception("Erro ao apagar caixa");
        } finally {
            fechar();
        }
    }

    public ArrayList<Caixa> buscarTodos() throws Exception {
        ArrayList<Caixa> resultados = new ArrayList<>();
        try {
            conectar();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM caixa");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Caixa temp = new Caixa();
                // pega todos os atributos do Cliente
                temp.setIdCaixa(rs.getInt("id"));
                temp.setDataCaixa(new Date(rs.getDate("data").getTime()));
                temp.setValorCaixa(rs.getInt("valor"));

                resultados.add(temp);
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao buscar Caixa 1");
        }
        return resultados;
    }

    public Caixa buscar(int id) throws Exception {
        Caixa resultados = null;
        try {
            conectar();
            try (PreparedStatement stmt = con.prepareStatement("SELECT * FROM caixa WHERE id LIKE ? LIMIT 1")) {
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    Caixa temp = new Caixa();
                    // pega todos os atributos do Cliente
                    temp.setIdCaixa(rs.getInt("id"));
                    temp.setDataCaixa(new Date(rs.getDate("data").getTime()));
                    temp.setValorCaixa(rs.getInt("valor"));
                    resultados = temp;
                }
            }
        } catch (Exception e) {
            throw new Exception("Erro ao buscar Caixa");
        }
        return resultados;
    }

    public boolean insere(Caixa pessoaCaixa) throws Exception {
        boolean retorno = false;
        String sql = "INSERT INTO caixa ( id, data, valor)" + "VALUES(?,?,?)";

        try {
            conectar();
            try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setInt(0, pessoaCaixa.getIdCaixa());
                stmt.setDate(1, (Date) pessoaCaixa.getDataCaixa());
                stmt.setInt(2, pessoaCaixa.getValorCaixa());
                stmt.executeUpdate();
                stmt.close();
            }
            retorno = true;
        } catch (Exception e) {
            throw new Exception("Erro ao inserir Caixa");
        } finally {
            fechar();
        }
        return retorno;
    }

    public boolean atualizar(Caixa pessoaCaixa) throws Exception {
        boolean retorno = false;
        String sql = "UPDATE caixa SET valor = ?, data = ? WHERE  id = ?";
        try {
            conectar();
            try (PreparedStatement stmt = con.prepareStatement(sql)) {

                stmt.setDate(0, (Date) pessoaCaixa.getDataCaixa());
                stmt.setInt(1, pessoaCaixa.getValorCaixa());
                stmt.setInt(2, pessoaCaixa.getIdCaixa());
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
