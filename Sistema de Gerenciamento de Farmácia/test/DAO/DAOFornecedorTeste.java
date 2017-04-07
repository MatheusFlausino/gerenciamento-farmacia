/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import sistema.de.gerenciamento.de.farmácia.Fornecedor;
import sistema.de.gerenciamento.de.farmácia.DAOFornecedor;


/**
 *
 * @author mathe_56ugtvf
 */
public class DAOFornecedorTeste {
    
    //Teste Valido Inserir Cliente
    @Test
    public void testeInserirClienteValido() throws Exception {
        Fornecedor novoFornecedor = new Fornecedor();
        DAOFornecedor daoFornecedor = new DAOFornecedor();
      
        novoFornecedor.setIdFornecedor(1);
        novoFornecedor.setNomeFornecedor("Fulano pra teste");
        novoFornecedor.setCnpjFornecedor("462.369.456-09");
        novoFornecedor.setCepFornecedor("86300-000");
        novoFornecedor.setBairroFornecedor("Centro");
        novoFornecedor.setCidadeFornecedor("Cornélio Procópio");
        novoFornecedor.setComplementoFornecedor(" ");
        novoFornecedor.setLogradouroFornecedor("ABC");
        novoFornecedor.setEstadoFornecedor("Paraná");
        novoFornecedor.setNumeroFornecedor(120);
        novoFornecedor.setTelefoneFornecedor("(11)97654-8165");
                
        assertTrue(daoFornecedor.insere(novoFornecedor));
    }
    //Teste Invalido Inserir Cliente
    @Test
    public void testeInserirClienteInvalido() throws Exception {
        Fornecedor novoFornecedor = new Fornecedor();
        DAOFornecedor daoFornecedor = new DAOFornecedor();
        
        String expResult = "Erro ao inserir Cliente";
        try{
            boolean insert = daoFornecedor.insere(novoFornecedor);
            fail();
        }catch(Exception e){
            assertEquals(expResult, e.getMessage());
        }
    }
    
    //Teste Valido Atualizar Cliente
    @Test
    public void testeAtualizarClienteValido() throws Exception {
        Fornecedor novoFornecedor = new Fornecedor();
        DAOFornecedor daoFornecedor = new DAOFornecedor();
      
        novoFornecedor.setIdFornecedor(0);
        novoFornecedor.setNomeFornecedor("Fulano pra teste");
        novoFornecedor.setCnpjFornecedor("462.000.456-09");
        novoFornecedor.setCepFornecedor("86300-000");
        novoFornecedor.setBairroFornecedor("Centro");
        novoFornecedor.setCidadeFornecedor("Cornélio Procópio");
        novoFornecedor.setComplementoFornecedor(" ");
        novoFornecedor.setLogradouroFornecedor("ABC");
        novoFornecedor.setEstadoFornecedor("Paraná");
        novoFornecedor.setNumeroFornecedor(120);
        novoFornecedor.setTelefoneFornecedor("(11)97654-8165");
                
        assertTrue(daoFornecedor.atualizar(novoFornecedor));
    }
    
    //Teste Invalido Atualizar Cliente
    @Test
    public void testeAtualizarClienteInvalido() throws Exception {
        Fornecedor novoFornecedor = new Fornecedor();
        DAOFornecedor daoFornecedor = new DAOFornecedor();
        
        String expResult = "Erro ao inserir Cliente";
        
        try{
            boolean atualizar = daoFornecedor.insere(novoFornecedor);
            fail();
        }catch(Exception e){
            assertEquals(expResult, e.getMessage());
        }
    }
    
    //Teste Valido Buscar Cliente
    @Test
    public void testeBucarClienteValido() throws Exception {
        Fornecedor novoFornecedor = new Fornecedor();
        DAOFornecedor daoFornecedor = new DAOFornecedor();

        Fornecedor busca = daoFornecedor.buscar(0);
        assertNotNull(busca);
    }
    
    //Teste Invalido Buscar Cliente
    @Test
    public void testeBucarClienteInvalido() throws Exception {
        Fornecedor novoFornecedor = new Fornecedor();
        DAOFornecedor daoFornecedor = new DAOFornecedor();

        Fornecedor busca = daoFornecedor.buscar(2);
        assertNull(busca);
    }

}
