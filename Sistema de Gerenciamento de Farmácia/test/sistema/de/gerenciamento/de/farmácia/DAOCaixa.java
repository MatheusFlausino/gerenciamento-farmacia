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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author pedro
 */
public class DAOCaixa {

    private Caixa novoCaixa(int id) throws Exception {
        Caixa novoCaixa = new Caixa();
        String data = "21/02/2000";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        novoCaixa.setIdCaixa(id);
        novoCaixa.setDataCaixa(new Date(format.parse(data).getTime()));
        novoCaixa.setValorCaixa(100);
        return novoCaixa;
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
        String expResult = "Valor invalido";
        try {
            novoCaixa(1).setValorCaixa(-2);
            fail("Devia lancar Exception");
        } catch (Exception ex) {
            assertEquals(expResult, ex.getMessage());
        }
    }

}
