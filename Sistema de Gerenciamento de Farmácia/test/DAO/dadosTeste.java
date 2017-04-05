/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;
import sistema.de.gerenciamento.de.farmácia.Dados;


/**
 *
 * @author matheus
 */
public class dadosTeste {
    //Teste Conexao de dados
    @Test
    public void testeConexaoDados() throws Exception {
        String expResult = "Erro de conexão com banco";
        try {
            Connection dados = new Dados().conexao("root", "pass");
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
        
    }
}
