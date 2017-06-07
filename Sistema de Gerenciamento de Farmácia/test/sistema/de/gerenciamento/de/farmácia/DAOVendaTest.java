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
 * @author matheusflausino
 */
public class DAOVendaTest {
    
    public DAOVendaTest() {
    }
    
    private Venda novaVenda(String id) throws Exception {
        Venda novaVenda = new Venda();
        String data = "21/02/2000";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    
        novaVenda.setIdVenda(id);
        novaVenda.setIdCliente(1);
        novaVenda.setDataVenda(new Date(format.parse(data).getTime()));
        novaVenda.setDescontoVenda(0);
        novaVenda.setTotalVenda(124.00);
        novaVenda.setTipoPagVenda("Dinheiro");
        
        return novaVenda;
    }
    
    @Test
    public void testInsereInvalido2(){
        String expResult = "Erro ao inserir Venda";
        try {
            Venda novaVenda = null;
            DAOVenda instance = new DAOVenda();
            boolean result = instance.insere(novaVenda);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido3(){
        String expResult = "ID Invalido";
        try {
            novaVenda("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido4(){
        String expResult = "ID Invalido";
        try {
            novaVenda("asld123adsf34").setIdCliente(0);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido5(){
        String expResult = "Desconto Invalido";
        try {
            novaVenda("asld123adsf34").setDescontoVenda(-1);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido6(){
        String expResult = "Pagamento Invalido";
        try {
            novaVenda("asld123adsf34").setTipoPagVenda("");
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereInvalido7(){
        String expResult = "Valor Invalido";
        try {
            novaVenda("asld123adsf34").setTotalVenda(0);
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
            novaVenda("asld123adsf34").setDataVenda(data);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereValido(){
        try {
            DAOVenda instance = new DAOVenda();
            boolean expResult = true;
            boolean result = instance.insere(novaVenda("asld123adsf34"));
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
            Venda novaVenda = null;
            DAOVenda instance = new DAOVenda();
            boolean result = instance.atualizar(novaVenda);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testAtualizarValido() {
        try {
            DAOVenda instance = new DAOVenda();
            boolean result = instance.atualizar(novaVenda("asld123adsf34"));
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
            DAOVenda instance = new DAOVenda();
            Venda result = instance.buscar("asld123adsf34");
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
            int id = 0;
            DAOVenda instance = new DAOVenda();
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
        DAOVenda instance = new DAOVenda();
        ArrayList<Venda> result = instance.buscarTodos();
        assertNotNull(result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
