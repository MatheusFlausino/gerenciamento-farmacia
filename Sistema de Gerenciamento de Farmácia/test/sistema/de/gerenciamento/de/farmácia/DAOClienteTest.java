/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.gerenciamento.de.farmácia;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mathe_56ugtvf
 */
public class DAOClienteTest {
    
    public DAOClienteTest() {
    }
    
    private Cliente novoCliente(int id) throws Exception{
        Cliente novoCliente = new Cliente();
        String data = "21/02/2000";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        novoCliente.setIdCliente(id);
        novoCliente.setNomeCliente("Fulano pra teste");
        novoCliente.setCpfCliente("462.000.456-09");
        novoCliente.setCepCliente("86300-000");
        novoCliente.setBairroCliente("Centro");
        novoCliente.setCidadeCliente("Cornélio Procópio");
        novoCliente.setComplementoCliente(" ");
        novoCliente.setDataNascCliente(new Date(format.parse(data).getTime()));
        novoCliente.setLogradouroCliente("ABC");
        novoCliente.setEstadoCliente("Paraná");
        novoCliente.setNumeroCliente(120);
        novoCliente.setTelefoneCliente("(11)97654-8165");

        return novoCliente;
    }
    
    /**
     * Test of insere method, of class DAOCliente.
     */
    @Test
    public void testInsereInvalido1(){
        String expResult = "Erro ao inserir Cliente";
        try {
            Cliente pessoaCliente = null;
            DAOCliente instance = new DAOCliente();
            boolean result = instance.insere(pessoaCliente);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido2(){
        String expResult = "ID Invalido";
        try {
            novoCliente(2).setIdCliente(-1);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido3(){
        String expResult = "Nome maior que 45 caracteres";
        try {
            novoCliente(2).setNomeCliente("Marcos Lopes Joaquim Deodoro da Fonseca Filho Júnior");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido4(){
        String expResult = "Nome Invalido";
        try {
            novoCliente(2).setNomeCliente("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido5(){
        String expResult = "CPF Invalido";
        try {
            novoCliente(2).setCpfCliente("720.834.973-8");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido6(){
        String expResult = "CPF Invalido";
        try {
            novoCliente(2).setCpfCliente("720.834.973-844");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido7(){
        String expResult = "CPF Invalido";
        try {
            novoCliente(2).setCpfCliente("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido8(){
        String expResult = "Data Invalida";
        Calendar cal = new GregorianCalendar();
        // Adiciona um mês na data atual instanciada
        cal.add(Calendar.DAY_OF_MONTH, 1);
        try {
            java.util.Date data = cal.getTime();
            novoCliente(2).setDataNascCliente(data);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido9(){
        String expResult = "CEP Invalido";
        try {
            novoCliente(2).setCepCliente("86300");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }    
    @Test
    public void testInsereInvalido10(){
        String expResult = "Logradouro maior que 45 caracteres";
        try {
            novoCliente(2).setLogradouroCliente("Rua Marcos Lopes Joaquim Deodoro Ultimo Filho Júnior");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido11(){
        String expResult = "Logradouro Invalido";
        try {
            novoCliente(2).setLogradouroCliente("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido12(){
        String expResult = "Numero Invalido";
        try {
            novoCliente(2).setNumeroCliente(0);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido13(){
        String expResult = "Bairro maior que 45 caracteres";
        try {
            novoCliente(2).setBairroCliente("Zona centralizada do Parque Joaquim Moreira Silva");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido14(){
        String expResult = "Bairro Invalido";
        try {
            novoCliente(2).setBairroCliente("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido15(){
        String expResult = "Cidade maior que 45 caracteres";
        try {
            novoCliente(2).setCidadeCliente("Zona centralizada do Parque Joaquim Moreira Silva");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido16(){
        String expResult = "Cidade Invalida";
        try {
            novoCliente(2).setCidadeCliente("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido17(){
        String expResult = "Estado maior que 45 caracteres";
        try {
            novoCliente(2).setEstadoCliente("Zona centralizada do Parque Joaquim Moreira Silva");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido18(){
        String expResult = "Estado Invalido";
        try {
            novoCliente(2).setEstadoCliente("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido19(){
        String expResult = "Telefone Invalido";
        try {
            novoCliente(2).setTelefoneCliente("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido20(){
        String expResult = "Telefone Invalido";
        try {
            novoCliente(2).setTelefoneCliente("(19)99999-999999999");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }  
    
    @Test
    public void testInsereValido(){
        try {
            int id = 2 + (int)(Math.random() * 10);
            DAOCliente instance = new DAOCliente();
            boolean expResult = true;
            boolean result = instance.insere(novoCliente(id));
            assertEquals(expResult, result);
        } catch (Exception ex) {
            fail("Nao devia lancar Exception");
        }
        
    }
        /**
     * Test of atualizar method, of class DAOCliente.
     */
    @Test
    public void testAtualizarInvalido() {
        String expResult = "Erro ao Atualizar";
        try {
            Cliente pessoaCliente = null;
            DAOCliente instance = new DAOCliente();
            boolean result = instance.atualizar(pessoaCliente);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testAtualizarValido() {
        try {
            DAOCliente instance = new DAOCliente();
            boolean result = instance.atualizar(novoCliente(1));
            assertTrue(result);
        } catch (Exception ex) {
            fail("Não devia lancar Exception");
        }
    }
    /**
     * Test of buscar method, of class DAOCliente.
     */
    @Test
    public void testBuscarValido() {
        try {
            DAOCliente instance = new DAOCliente();
            Cliente result = instance.buscar(1);
            assertNotNull(result);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
    
    /**
     * Test of apagar method, of class DAOCliente.
     */
    @Test
    public void testApagarValido() {
        try {
            int id = 0;
            DAOCliente instance = new DAOCliente();
            instance.apagar(id);
        } catch (Exception ex) {
            fail("Nao devia lancar Exception");
        }
        
    }

    /**
     * Test of buscarTodos method, of class DAOCliente.
     */
    @Test
    public void testBuscarTodosValido() throws Exception {
        DAOCliente instance = new DAOCliente();
        ArrayList<Cliente> result = instance.buscarTodos();
        assertNotNull(result);
    }
    
}