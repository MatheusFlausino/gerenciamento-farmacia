/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.gerenciamento.de.farmácia;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mathe_56ugtvf
 */
public class DAOFornecedorTest {
    
    public DAOFornecedorTest() {
    }
    
    private Fornecedor novoFornecedor(int id) throws Exception{
        Fornecedor novoFornecedor = new Fornecedor();

        novoFornecedor.setIdFornecedor(id);
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

        return novoFornecedor;
    }
    
    /**
     * Test of insere method, of class DAOFornecedor.
     */
    @Test
    public void testInsereInvalido1(){
        String expResult = "Erro ao inserir Fornecedor";
        try {
            Fornecedor pessoaFornecedor = null;
            DAOFornecedor instance = new DAOFornecedor();
            boolean result = instance.insere(pessoaFornecedor);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
        
    }
    @Test
    public void testInsereInvalido2(){
        String expResult = "ID Invalido";
        try {
            novoFornecedor(2).setIdFornecedor(-1);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido3(){
        String expResult = "Nome maior que 45 caracteres";
        try {
            novoFornecedor(2).setNomeFornecedor("Marcos Lopes Joaquim Deodoro da Fonseca Filho Júnior");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido4(){
        String expResult = "Nome Invalido";
        try {
            novoFornecedor(2).setNomeFornecedor("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido5(){
        String expResult = "CNPJ Invalido";
        try {
            novoFornecedor(2).setCnpjFornecedor("720.834.973-8");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido6(){
        String expResult = "CNPJ Invalido";
        try {
            novoFornecedor(2).setCnpjFornecedor("720.834.973-844");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido7(){
        String expResult = "CNPJ Invalido";
        try {
            novoFornecedor(2).setCnpjFornecedor("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido9(){
        String expResult = "CEP Invalido";
        try {
            novoFornecedor(2).setCepFornecedor("86300");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }    
    @Test
    public void testInsereInvalido10(){
        String expResult = "Logradouro maior que 45 caracteres";
        try {
            novoFornecedor(2).setLogradouroFornecedor("Rua Marcos Lopes Joaquim Deodoro Ultimo Filho Júnior");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido11(){
        String expResult = "Logradouro Invalido";
        try {
            novoFornecedor(2).setLogradouroFornecedor("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido12(){
        String expResult = "Numero Invalido";
        try {
            novoFornecedor(2).setNumeroFornecedor(0);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido13(){
        String expResult = "Bairro maior que 45 caracteres";
        try {
            novoFornecedor(2).setBairroFornecedor("Zona centralizada do Parque Joaquim Moreira Silva");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido14(){
        String expResult = "Bairro Invalido";
        try {
            novoFornecedor(2).setBairroFornecedor("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido15(){
        String expResult = "Cidade maior que 45 caracteres";
        try {
            novoFornecedor(2).setCidadeFornecedor("Zona centralizada do Parque Joaquim Moreira Silva");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido16(){
        String expResult = "Cidade Invalida";
        try {
            novoFornecedor(2).setCidadeFornecedor("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido17(){
        String expResult = "Estado maior que 45 caracteres";
        try {
            novoFornecedor(2).setEstadoFornecedor("Zona centralizada do Parque Joaquim Moreira Silva");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido18(){
        String expResult = "Estado Invalido";
        try {
            novoFornecedor(2).setEstadoFornecedor("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido19(){
        String expResult = "Telefone Invalido";
        try {
            novoFornecedor(2).setTelefoneFornecedor("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido20(){
        String expResult = "Telefone Invalido";
        try {
            novoFornecedor(2).setTelefoneFornecedor("(19)99999-999999999");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }  
    
    @Test
    public void testInsereValido(){
        try {
            int id = 2 + (int)(Math.random() * 10);
            DAOFornecedor instance = new DAOFornecedor();
            boolean expResult = true;
            boolean result = instance.insere(novoFornecedor(id));
            assertEquals(expResult, result);
        } catch (Exception ex) {
            fail("Nao devia lancar Exception");
        }
        
    }
        /**
     * Test of atualizar method, of class DAOFornecedor.
     */
    @Test
    public void testAtualizarInvalido() {
        String expResult = "Erro ao Atualizar";
        try {
            Fornecedor pessoaFornecedor = null;
            DAOFornecedor instance = new DAOFornecedor();
            boolean result = instance.atualizar(pessoaFornecedor);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testAtualizarValido() {
        String expResult = "Erro ao Atualizar";
        try {
            DAOFornecedor instance = new DAOFornecedor();
            boolean result = instance.atualizar(novoFornecedor(1));
            assertTrue(result);
        } catch (Exception ex) {
            fail("Não devia lancar Exception");
        }
    }
    /**
     * Test of buscar method, of class DAOFornecedor.
     */
    @Test
    public void testBuscarValido() {
        try {
            DAOFornecedor instance = new DAOFornecedor();
            Fornecedor result = instance.buscar(1);
            assertNotNull(result);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
    
    /**
     * Test of apagar method, of class DAOFornecedor.
     */
    @Test
    public void testApagarValido() {
        try {
            int id = 0;
            DAOFornecedor instance = new DAOFornecedor();
            instance.apagar(id);
        } catch (Exception ex) {
            fail("Nao devia lancar Exception");
        }
        
    }

    /**
     * Test of buscarTodos method, of class DAOFornecedor.
     */
    @Test
    public void testBuscarTodosValido() throws Exception {
        DAOFornecedor instance = new DAOFornecedor();
        ArrayList<Fornecedor> result = instance.buscarTodos();
        assertNotNull(result);
    }
    
}