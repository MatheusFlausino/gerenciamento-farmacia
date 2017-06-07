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
 * @author matheusflausino
 */
public class DAOItemVendaTest {
    //idProduto,precoProduto,nomeProduto,idVenda,qtdProduto
    private ItemVenda novoItemVenda(String id) throws Exception{
        ItemVenda novoItem = new ItemVenda();
        
        novoItem.setIdProduto(1);
        novoItem.setIdVenda(id);
        novoItem.setNomeProduto("Qualquer produto");
        novoItem.setPrecoProduto(17.20);
        novoItem.setQtdProduto(2);
        return novoItem;
    }
    @Test
    public void testInsereInvalido1(){
        String expResult = "Erro ao inserir Venda";
        try {
            ItemVenda novoItemVenda = null;
            DAOItemVenda instance = new DAOItemVenda();
            boolean result = instance.insere(novoItemVenda);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido3(){
        String expResult = "ID Invalido";
        try {
            novoItemVenda("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido4(){
        String expResult = "ID Invalido";
        try {
            novoItemVenda("asld123adsf34").setIdProduto(0);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido5(){
        String expResult = "Nome Invalido";
        try {
            novoItemVenda("asld123adsf34").setNomeProduto("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido6(){
        String expResult = "Preco Invalido";
        try {
            novoItemVenda("asld123adsf34").setPrecoProduto(0);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido7(){
        String expResult = "Quantidade Invalida";
        try {
            novoItemVenda("asld123adsf34").setQtdProduto(0);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }

    @Test
    public void testInsereValido(){
        try {
            DAOItemVenda instance = new DAOItemVenda();
            boolean expResult = true;
            boolean result = instance.insere(novoItemVenda("asld123adsf34"));
            assertEquals(expResult, result);
        } catch (Exception ex) {
            fail("Nao devia lancar Exception");
        }
        
    }
    
        /**
     * Test of atualizar method, of class DAOVenda.
     */
    @Test
    public void testAtualizarInvalido() {
        String expResult = "Erro ao Atualizar";
        try {
            ItemVenda novoItemVenda = null;
            DAOItemVenda instance = new DAOItemVenda();
            boolean result = instance.atualizar(novoItemVenda);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testAtualizarValido() {
        try {
            DAOItemVenda instance = new DAOItemVenda();
            boolean result = instance.atualizar(novoItemVenda("asld123adsf34"));
            assertTrue(result);
        } catch (Exception ex) {
            fail("Não devia lancar Exception");
        }
    }
    /**
     * Test of buscar method, of class DAOVenda.
     */
    @Test
    public void testBuscarValido() {
        try {
            DAOItemVenda instance = new DAOItemVenda();
            ItemVenda result = instance.buscar("asld123adsf34");
            assertNotNull(result);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
    
    /**
     * Test of apagar method, of class DAOVenda.
     */
    @Test
    public void testApagarValido() {
        try {
            DAOItemVenda instance = new DAOItemVenda();
            instance.apagar("asld123adsf34");
        } catch (Exception ex) {
            fail("Nao devia lancar Exception");
        }
        
    }

    /**
     * Test of buscarTodos method, of class DAOVenda.
     */
    @Test
    public void testBuscarTodosValido() throws Exception {
        DAOItemVenda instance = new DAOItemVenda();
        ArrayList<ItemVenda> result = instance.buscarTodos();
        assertNotNull(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}