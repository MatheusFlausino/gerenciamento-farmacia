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
public class DAOEstoqueTest {
    
    public DAOEstoqueTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    private Estoque novoEstoque(int id) throws Exception{
        Estoque novoEstoque = new Estoque();
        novoEstoque.setIdEstoque(id);
        novoEstoque.setIdFornecedor(1);        
        novoEstoque.setIdProduto(2);
        novoEstoque.setQtdEstoque(40);
        
        return novoEstoque;
    }
    
    @Test
    public void testInsereInvalido1(){
        String expResult = "Erro ao inserir Estoque";
        try {
            Estoque outroEstoque = null;
            DAOEstoque instance = new DAOEstoque();
            boolean result = instance.insere(outroEstoque);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    
    @Test
    public void testInsereInvalido2(){
        String expResult = "ID Invalido";
        try {
            novoEstoque(-2);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    
    @Test
    public void testInsereInvalido3(){
        String expResult = "ID Invalido";
        try {
            novoEstoque(2).setIdFornecedor(0);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    
    @Test
    public void testInsereInvalido4(){
        String expResult = "Quantidade Invalida";
        try {
            novoEstoque(2).setQtdEstoque(0);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    
    @Test
    public void testInsereInvalido5(){
        String expResult = "ID Invalido";
        try {
            novoEstoque(2).setIdProduto(0);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    
    @Test
    public void testInsereValido(){
        try {
            int id = 2 + (int)(Math.random() * 10);
            DAOEstoque instance = new DAOEstoque();
            boolean expResult = true;
            boolean result = instance.insere(novoEstoque(id));
            assertEquals(expResult, result);
        } catch (Exception ex) {
            fail("Nao devia lancar Exception");
        }
    }

    @Test
    public void testAtualizarInvalido() {
        String expResult = "Erro ao Atualizar";
        try {
            Estoque outroEstoque = null;
            DAOEstoque instance = new DAOEstoque();
            boolean result = instance.atualizar(outroEstoque);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testAtualizarValido() {
        try {
            DAOEstoque instance = new DAOEstoque();
            boolean result = instance.atualizar(novoEstoque(1));
            assertTrue(result);
        } catch (Exception ex) {
            fail("Não devia lancar Exception");
        }
    }
    
    @Test
    public void testBuscarValido() {
        try {
            DAOEstoque instance = new DAOEstoque();
            Estoque result = instance.buscar(1);
            assertNotNull(result);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
    
    @Test
    public void testApagarValido() {
        try {
            int id = 2;
            DAOEstoque instance = new DAOEstoque();
            instance.apagar(id);
        } catch (Exception ex) {
            fail("Nao devia lancar Exception");
        }
        
    }

    @Test
    public void testBuscarTodosValido() throws Exception {
        DAOEstoque instance = new DAOEstoque();
        ArrayList<Estoque> result = instance.buscarTodos();
        assertNotNull(result);
    }

}
