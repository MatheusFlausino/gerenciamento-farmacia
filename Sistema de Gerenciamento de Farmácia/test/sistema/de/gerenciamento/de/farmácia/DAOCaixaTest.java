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
 * @author pedro
 */
public class DAOCaixaTest {

    private Caixa novoCaixa(int id) throws Exception {
        Caixa novocaixa = new Caixa();
        String data = "21/02/2000";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        novocaixa.setIdCaixa(id);
        novocaixa.setDataCaixa(new Date(format.parse(data).getTime()));
        novocaixa.setValorCaixa(100);
        return novocaixa;
    }

    @Test
    public void testInsereInvalido1() {
        String expResult = "ID Invalido";
        try {
            novoCaixa(1).setIdCaixa(-1);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }

    @Test
    public void testInsereInvalido2() {
        String expResult = "Data Invalida";
        Calendar cal = new GregorianCalendar();
        // Adiciona um mês na data atual instanciada
        cal.add(Calendar.DAY_OF_MONTH, 1);
        try {
            java.util.Date data = cal.getTime();
            novoCaixa(2).setDataCaixa(data);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }

    @Test
    public void testInsereInvalido3() {
        String expResult = "Valor Invalido";
        try {
            novoCaixa(1).setValorCaixa(-2);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    
    @Test
    public void testInsereInvalido4(){
        String expResult = "Erro ao inserir Caixa";
        try {
            Caixa novocaixa = null;
            DAOCaixa instance = new DAOCaixa();
            boolean result = instance.insere(novocaixa);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testInsereValido(){
        try {
            DAOCaixa instance = new DAOCaixa();
            boolean expResult = true;
            boolean result = instance.insere(novoCaixa(3));
            assertEquals(expResult, result);
        } catch (Exception ex) {
            fail("Nao devia lancar Exception");
        }
        
    }
        /**
     * Test of atualizar method, of class DAOCaixa.
     */
    @Test
    public void testAtualizarInvalido() {
        String expResult = "Erro ao Atualizar";
        try {
            Caixa novaCaixa = null;
            DAOCaixa instance = new DAOCaixa();
            boolean result = instance.atualizar(novaCaixa);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }
    @Test
    public void testAtualizarValido() {
        try {
            DAOCaixa instance = new DAOCaixa();
            boolean result = instance.atualizar(novoCaixa(1));
            assertTrue(result);
        } catch (Exception ex) {
            fail("Não devia lancar Exception");
        }
    }
    /**
     * Test of buscar method, of class DAOCaixa.
     */
    @Test
    public void testBuscarValido() {
        try {
            DAOCaixa instance = new DAOCaixa();
            Caixa result = instance.buscar(1);
            assertNotNull(result);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
    
    /**
     * Test of apagar method, of class DAOCaixa.
     */
    @Test
    public void testApagarValido() {
        try {
            int id = 0;
            DAOCaixa instance = new DAOCaixa();
            instance.apagar(3);
        } catch (Exception ex) {
            fail("Nao devia lancar Exception");
        }
        
    }

    /**
     * Test of buscarTodos method, of class DAOCaixa.
     */
    @Test
    public void testBuscarTodosValido() {
        try{
            DAOCaixa instance = new DAOCaixa();
            ArrayList<Caixa> result = instance.buscarTodos();
            assertNotNull(result);
        } catch (Exception ex) {
            fail("Nao devia lancar Exception");
        }
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

