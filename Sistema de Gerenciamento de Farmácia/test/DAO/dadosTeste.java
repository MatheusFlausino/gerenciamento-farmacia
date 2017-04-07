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
    public void testConexao() throws Exception {
        System.out.println("conexao");
        String nome = "";
        String senha = "";
        Dados instance = new Dados();
        String expResult = "Erro de conexão com banco";
        try{
            Connection result = instance.conexao(nome, senha);
            fail();
        }catch(Exception e){
            assertEquals(expResult, e.getMessage());
        }
    }
}
