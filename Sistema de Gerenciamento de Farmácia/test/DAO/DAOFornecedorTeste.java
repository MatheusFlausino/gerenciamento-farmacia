/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import org.junit.Test;
import static org.junit.Assert.*;
import sistema.de.gerenciamento.de.farmácia.Fornecedor;
import sistema.de.gerenciamento.de.farmácia.DAOFornecedor;


/**
 *
 * @author mathe_56ugtvf
 */
public class DAOFornecedorTeste {
    
    //Teste Valido Inserir Fornecedor
    @Test
    public void testeInserirFornecedorValido() throws Exception {
        Fornecedor novoFornecedor = new Fornecedor();
        DAOFornecedor daoFornecedor = new DAOFornecedor();
      
        novoFornecedor.setIdFornecedor(1);
        novoFornecedor.setNomeFornecedor("Fulano pra teste");
        novoFornecedor.setCnpjFornecedor("72.223.484/0001-49");
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
    //Teste Invalido Inserir Fornecedor
    @Test
    public void testeInserirFornecedorInvalido() throws Exception {
        Fornecedor novoFornecedor = new Fornecedor();
        DAOFornecedor daoFornecedor = new DAOFornecedor();
        
        String expResult = "Erro ao inserir Fornecedor";
        try{
            boolean insert = daoFornecedor.insere(novoFornecedor);
            fail();
        }catch(Exception e){
            assertEquals(expResult, e.getMessage());
        }
    }
    
    //Teste Valido Atualizar Fornecedor
    @Test
    public void testeAtualizarFornecedorValido() throws Exception {
        Fornecedor novoFornecedor = new Fornecedor();
        DAOFornecedor daoFornecedor = new DAOFornecedor();
      
        novoFornecedor.setIdFornecedor(0);
        novoFornecedor.setNomeFornecedor("Fulano pra teste");
        novoFornecedor.setCnpjFornecedor("72.223.484/0001-49");
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
    
    //Teste Invalido Atualizar Fornecedor
    @Test
    public void testeAtualizarFornecedorInvalido() throws Exception {
        Fornecedor novoFornecedor = new Fornecedor();
        DAOFornecedor daoFornecedor = new DAOFornecedor();
        
        String expResult = "Erro ao inserir Fornecedor";
        
        try{
            boolean atualizar = daoFornecedor.insere(novoFornecedor);
            fail();
        }catch(Exception e){
            assertEquals(expResult, e.getMessage());
        }
    }
    
    //Teste Valido Buscar Fornecedor
    @Test
    public void testeBucarFornecedorValido() throws Exception {
        Fornecedor novoFornecedor = new Fornecedor();
        DAOFornecedor daoFornecedor = new DAOFornecedor();

        Fornecedor busca = daoFornecedor.buscar(0);
        assertNotNull(busca);
    }
    
    //Teste Invalido Buscar Fornecedor
    @Test
    public void testeBucarFornecedorInvalido() throws Exception {
        Fornecedor novoFornecedor = new Fornecedor();
        DAOFornecedor daoFornecedor = new DAOFornecedor();

        Fornecedor busca = daoFornecedor.buscar(2);
        System.out.print(busca);
        assertNull(busca);
    }

}
