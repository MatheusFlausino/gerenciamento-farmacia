/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.text.SimpleDateFormat;
import java.sql.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import sistema.de.gerenciamento.de.farmácia.Cliente;
import sistema.de.gerenciamento.de.farmácia.DAOCliente;


/**
 *
 * @author mathe_56ugtvf
 */
public class DAOClienteTeste {
    //Teste Valido Inserir Cliente
    @Test
    public void testeInserirClienteValido() throws Exception {
        Cliente novoCliente = new Cliente();
        DAOCliente daoCliente = new DAOCliente();
        
        String data = "21/02/2010";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
      
        novoCliente.setIdCliente(1);
        novoCliente.setNomeCliente("Fulano pra teste");
        novoCliente.setCpfCliente("462.369.456-09");
        novoCliente.setCepCliente("86300-000");
        novoCliente.setBairroCliente("Centro");
        novoCliente.setCidadeCliente("Cornélio Procópio");
        novoCliente.setComplementoCliente(" ");
        novoCliente.setDataNascCliente(new Date(format.parse(data).getTime()));
        novoCliente.setLogradouroCliente("ABC");
        novoCliente.setEstadoCliente("Paraná");
        novoCliente.setNumeroCliente(120);
        novoCliente.setTelefoneCliente("(11)97654-8165");
                
        assertTrue(daoCliente.insere(novoCliente));
    }
    //Teste Invalido Inserir Cliente
    @Test
    public void testeInserirClienteInvalido() throws Exception {
        Cliente novoCliente = new Cliente();
        DAOCliente daoCliente = new DAOCliente();
        String expResult = "Erro ao inserir Cliente";
        try{
            boolean insert = daoCliente.insere(novoCliente);
            fail();
        }catch(Exception e){
            assertEquals(expResult, e.getMessage());
        }
    }
    
    //Teste Valido Atualizar Cliente
    @Test
    public void testeAtualizarClienteValido() throws Exception {
        Cliente novoCliente = new Cliente();
        DAOCliente daoCliente = new DAOCliente();
        
        String data = "21/02/2000";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
      
        novoCliente.setIdCliente(0);
        novoCliente.setNomeCliente("Fulano pra teste");
        novoCliente.setCpfCliente("462.000.456-09");
        novoCliente.setCepCliente("86300-000");
        novoCliente.setBairroCliente("Centro");
        novoCliente.setCidadeCliente("Cornélio Procópio");
        novoCliente.setComplementoCliente(" ... ");
        novoCliente.setDataNascCliente(new Date(format.parse(data).getTime()));
        novoCliente.setLogradouroCliente("ABC");
        novoCliente.setEstadoCliente("Paraná");
        novoCliente.setNumeroCliente(120);
        novoCliente.setTelefoneCliente("(11)97654-8165");
                
        assertTrue(daoCliente.atualizar(novoCliente));
    }
    
    //Teste Invalido Atualizar Cliente
    @Test
    public void testeAtualizarClienteInvalido() throws Exception {
        Cliente novoCliente = new Cliente();
        DAOCliente daoCliente = new DAOCliente();
        String expResult = "Erro ao inserir Cliente";
        
        try{
            boolean atualizar = daoCliente.insere(novoCliente);
            fail();
        }catch(Exception e){
            assertEquals(expResult, e.getMessage());
        }
    }
    
    //Teste Valido Buscar Cliente
    @Test
    public void testeBucarClienteValido() throws Exception {
        DAOCliente daoCliente = new DAOCliente();

        Cliente busca = daoCliente.buscar(0);
        assertNotNull(busca);
    }
    
    //Teste Invalido Buscar Cliente
    @Test
    public void testeBucarClienteInvalido() throws Exception {
        DAOCliente daoCliente = new DAOCliente();

        Cliente busca = daoCliente.buscar(99);
        assertNull(busca);
    }

}
