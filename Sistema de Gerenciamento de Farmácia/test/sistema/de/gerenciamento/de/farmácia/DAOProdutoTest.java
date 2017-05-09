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
public class DAOProdutoTest {
    
    public DAOProdutoTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    private Produto novoProduto(int id) throws Exception{
        Produto novoProduto = new Produto();
        novoProduto.setIdProduto(id);
        novoProduto.setFabricanteProduto("Um Fabricante");
        novoProduto.setNomeProduto("Pomada");
        novoProduto.setPrecoProduto(17.14);
        return novoProduto;
    }
    
    @Test
    public void testInsereInvalido1(){
        String expResult = "Erro ao inserir Produto";
        try {
            Produto outroProduto = null;
            DAOProduto instance = new DAOProduto();
            boolean result = instance.insere(outroProduto);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    
    @Test
    public void testInsereInvalido2(){
        String expResult = "Nome Invalido";
        try {
            novoProduto(2).setNomeProduto("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }

    @Test
    public void testInsereInvalido3(){
        String expResult = "Nome maior que 25 caracteres";
        try {
            novoProduto(2).setNomeProduto("Produto de passar nas assaduras de um bebe");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    
    @Test
    public void testInsereInvalido4(){
        String expResult = "Nome Invalido";
        try {
            novoProduto(2).setFabricanteProduto("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }

    @Test
    public void testInsereInvalido5(){
        String expResult = "Nome maior que 25 caracteres";
        try {
            novoProduto(2).setFabricanteProduto("FAbricante de um produto para assaduras de um bebe");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    
        @Test
    public void testInsereInvalido6(){
        String expResult = "ID Invalido";
        try {
            novoProduto(-2);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }

    @Test
    public void testInsereInvalido7(){
        String expResult = "Preco Invalido";
        try {
            novoProduto(2).setPrecoProduto(0);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    
    @Test
    public void testInsereValido(){
        try {
            int id = 2 + (int)(Math.random() * 10);
            DAOProduto instance = new DAOProduto();
            boolean expResult = true;
            boolean result = instance.insere(novoProduto(id));
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
            Produto outroProduto = null;
            DAOProduto instance = new DAOProduto();
            boolean result = instance.atualizar(outroProduto);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testAtualizarValido() {
        try {
            DAOProduto instance = new DAOProduto();
            boolean result = instance.atualizar(novoProduto(1));
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
            DAOProduto instance = new DAOProduto();
            Produto result = instance.buscar(1);
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
            int id = 2;
            DAOProduto instance = new DAOProduto();
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
        DAOProduto instance = new DAOProduto();
        ArrayList<Produto> result = instance.buscarTodos();
        assertNotNull(result);
    }

}
