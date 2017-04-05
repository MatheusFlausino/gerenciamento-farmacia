/*
 * Classe de Teste para o Classe Fornecedor
 */
package classe;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;
import sistema.de.gerenciamento.de.farmácia.Fornecedor;

/**
 *
 * @author matheus
 */
public class fornecedorTeste {
    //Teste ID Fornecedor
    @Test
    public void testeIdFornecedorValido() throws Exception {
        Fornecedor cliente = new Fornecedor();
        cliente.setIdFornecedor(55555);
        int valorRecebido = cliente.getIdFornecedor();
        assertEquals(valorRecebido, 55555);
    }
    // Teste ID inválido para ID < 0
    @Test
    public void testeIdFornecedorInvalido() throws Exception {
        Fornecedor cliente = new Fornecedor();
        String expResult = "ID Invalido";
        try {
            cliente.setIdFornecedor(-1);
            int valorRecebido = cliente.getIdFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // Teste Nome do Fornecedor
    @Test
    public void testeNomeFornecedorValido() throws Exception {
        Fornecedor cliente = new Fornecedor();
        cliente.setNomeFornecedor("Matheus");
        String valorRecebido = cliente.getNomeFornecedor();
        assertEquals(valorRecebido, "Matheus");
    }
     
    // Teste Nome inválido estourando o limite de caracteres
    @Test
    public void testeNomeFornecedorInvalido1() throws Exception {
        Fornecedor cliente = new Fornecedor();
        String expResult = "Nome maior que 45 caracteres";
        try {
            cliente.setNomeFornecedor("Marcos Lopes Joaquim Deodoro da Fonseca Filho Júnior");
            String valorRecebido = cliente.getNomeFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // Teste Nome inválido vazio
    @Test
    public void testeNomeFornecedorInvalido2() throws Exception {
        Fornecedor cliente = new Fornecedor();
        String expResult = "Nome Invalido";
        try {
            cliente.setNomeFornecedor("");
            String valorRecebido = cliente.getNomeFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // Teste CNPJ do Fornecedor
    @Test
    public void testeCNPJFornecedorValido() throws Exception {
        Fornecedor cliente = new Fornecedor();
        cliente.setCnpjFornecedor("76.333.171/0001-02");
        String valorRecebido = cliente.getCnpjFornecedor();
        assertEquals(valorRecebido, "76333171000102");
    }
    // CNPJ inválido menor que 12 dígitos
    @Test
    public void testeCNPJFornecedorInvalido1() throws Exception {
        Fornecedor cliente = new Fornecedor();
        String expResult = "CPF Invalido";
        try {
            cliente.setCnpjFornecedor("76.333.171/0001");
            String valorRecebido = cliente.getCnpjFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // CNPJ inválido menor que 15 dígitos
    @Test
    public void testeCNPJFornecedorInvalido2() throws Exception {
        Fornecedor cliente = new Fornecedor();
        String expResult = "CPF Invalido";
        try {
            cliente.setCnpjFornecedor("76.333.171/0001-022");
            String valorRecebido = cliente.getCnpjFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // CNPJ inválido vazio
    @Test
    public void testeCNPJFornecedorInvalido3() throws Exception {
        Fornecedor cliente = new Fornecedor();
        String expResult = "CPF Invalido";
        try {
            cliente.setCnpjFornecedor("");
            String valorRecebido = cliente.getCnpjFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    //Teste CEP
    @Test
    public void testeCEPFornecedorValido() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        pessoa.setCepFornecedor("86300000");
        String valorRecebido = pessoa.getCepFornecedor();
        assertEquals(valorRecebido, "86300000");
    }
    // CEP Inválido com menos de 8 dígitos
    @Test
    public void testeCEPFornecedorInvalido1() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        String expResult = "CEP Invalido";
        try {
            pessoa.setCepFornecedor("86300");
            String valorRecebido = pessoa.getCepFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // CEP Inválido com mais de 8 dígitos
    @Test
    public void testeCEPFornecedorInvalido2() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        String expResult = "CEP Invalido";
        try {
            pessoa.setCepFornecedor("863000000");
            String valorRecebido = pessoa.getCepFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    @Test
    public void testeLogradouroFornecedorValido() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        pessoa.setLogradouroFornecedor("Rua Nacoes unidas");
        String valorRecebido = pessoa.getLogradouroFornecedor();
        assertEquals(valorRecebido, "Rua Nacoes unidas");
    }
    // Logradouro inválido estourando o limite de caracteres
    @Test
    public void testeLogradouroFornecedorInvalido1() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        String expResult = "Logradouro maior que 45 caracteres";
        try {
            pessoa.setLogradouroFornecedor("Rua Marcos Lopes Joaquim Deodoro Ultimo Filho Júnior");
            String valorRecebido = pessoa.getLogradouroFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // Logradouro inválido vazio
    @Test
    public void testeLogradouroFornecedorInvalido2() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        String expResult = "Logradouro Invalido";
        try {
            pessoa.setLogradouroFornecedor("");
            String valorRecebido = pessoa.getLogradouroFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    //Teste numero casa Fornecedor
    @Test
    public void testeNumeroFornecedorValido() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        pessoa.setNumeroFornecedor(10);
        int valorRecebido = pessoa.getNumeroFornecedor();
        assertEquals(valorRecebido, 10);
    }
    @Test
    public void testeNumeroFornecedorInvalido() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        String expResult = "Numero Invalido";
        try {
            pessoa.setNumeroFornecedor(0);
            int valorRecebido = pessoa.getNumeroFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
        @Test
    public void testeBairroFornecedorValido() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        pessoa.setBairroFornecedor("Centro");
        String valorRecebido = pessoa.getBairroFornecedor();
        assertEquals(valorRecebido, "Centro");
    }
    // Bairro inválido estourando o limite de caracteres
    @Test
    public void testeBairroFornecedorInvalido1() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        String expResult = "Bairro maior que 45 caracteres";
        try {
            pessoa.setBairroFornecedor("Zona centralizada do Parque Joaquim Moreira Silva");
            String valorRecebido = pessoa.getBairroFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // Bairro inválido vazio
    @Test
    public void testeBairroFornecedorInvalido2() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        String expResult = "Bairro Invalido";
        try {
            pessoa.setBairroFornecedor("");
            String valorRecebido = pessoa.getBairroFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    //Teste Cidade Fornecedor 
    @Test
    public void testeCidadeFornecedorValido() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        pessoa.setCidadeFornecedor("Londrina");
        String valorRecebido = pessoa.getCidadeFornecedor();
        assertEquals(valorRecebido, "Londrina");
    }
    // Cidade inválida estourando o limite de caracteres
    @Test
    public void testeCidadeFornecedorInvalido1() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        String expResult = "Cidade maior que 45 caracteres";
        try {
            pessoa.setCidadeFornecedor("Santo Antônio da Platina do Sudoeste Paranaense");
            String valorRecebido = pessoa.getCidadeFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // Cidade inválida vazia
    @Test
    public void testeCidadeFornecedorInvalido2() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        String expResult = "Cidade Invalida";
        try {
            pessoa.setCidadeFornecedor("");
            String valorRecebido = pessoa.getCidadeFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    @Test
    public void testeEstadoFornecedorValido() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        pessoa.setEstadoFornecedor("Parana");
        String valorRecebido = pessoa.getEstadoFornecedor();
        assertEquals(valorRecebido, "Parana");
    }
    // Estado inválido estourando o limite de caracteres
    @Test
    public void testeEstadoFornecedorInvalido1() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        String expResult = "Estado maior que 45 caracteres";
        try {
            pessoa.setEstadoFornecedor("Maranhão Justino Cortieri do Nordeste Praineiro");
            String valorRecebido = pessoa.getEstadoFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // Estado inválido vazio
    @Test
    public void testeEstadossoaFornecedorInvalido2() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        String expResult = "Estado Invalido";
        try {
            pessoa.setEstadoFornecedor("");
            String valorRecebido = pessoa.getEstadoFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
        @Test
    public void testeTelefoneFornecedorValido() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        String telefone = "(19)99999-9999";
        pessoa.setTelefoneFornecedor(telefone);
        String valorRecebido = pessoa.getTelefoneFornecedor();
        assertEquals(valorRecebido, "19999999999");
    }
    // Telefone inválido para menos que 10 dígitos
    @Test
    public void testeTelefoneFornecedorInvalido1() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        String expResult = "Telefone Invalido";
        try {
            String telefone = "(19)99999-99";
            pessoa.setTelefoneFornecedor(telefone);
            String valorRecebido = pessoa.getTelefoneFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // Telefone inválido para maior que 11 dígitos
    @Test
    public void testeTelefoneFornecedorInvalido2() throws Exception {
        Fornecedor pessoa = new Fornecedor();
        String expResult = "Telefone Invalido";
        try {
            String telefone = "(19)99999-99999";
            pessoa.setTelefoneFornecedor(telefone);
            String valorRecebido = pessoa.getTelefoneFornecedor();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    
    //Teste Complemento Valido
    @Test
    public void testeComplementoFornecedorValido1() throws Exception{
        Fornecedor pessoa = new Fornecedor();
        pessoa.setComplementoFornecedor("Apartamento 12");
        assertEquals("Apartamento 12", pessoa.getComplementoFornecedor());
    }
    
    
    //Teste Complemento Valido NULL
    @Test
    public void testeComplementoFornecedorValido2() throws Exception{
        Fornecedor pessoa = new Fornecedor();
        pessoa.setComplementoFornecedor("");
        assertEquals("", pessoa.getComplementoFornecedor());
    }
    
}
