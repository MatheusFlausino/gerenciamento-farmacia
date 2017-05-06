/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.gerenciamento.de.farmácia;

import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mathe_56ugtvf
 */
public class DadosTest {
    
    public DadosTest() {
    }

    /**
     * Test of conexao method, of class Dados.
     */
    //Teste Conexao de dados
    @Test
    public void testConexao() {
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
