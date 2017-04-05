/*
 * Classe de Teste para o Classe Cliente
 */
package classe;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;
import sistema.de.gerenciamento.de.farmácia.Cliente;

/**
 *
 * @author matheus
 */
public class clienteTeste {
    //Teste ID Cliente
    @Test
    public void testeIdClienteValido() throws Exception {
        Cliente cliente = new Cliente();
        cliente.setIdCliente(55555);
        int valorRecebido = cliente.getIdCliente();
        assertEquals(valorRecebido, 55555);
    }
    // Teste ID inválido para ID < 0
    @Test
    public void testeIdClienteInvalido() throws Exception {
        Cliente cliente = new Cliente();
        String expResult = "ID Invalido";
        try {
            cliente.setIdCliente(-1);
            int valorRecebido = cliente.getIdCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // Teste Nome do Cliente
    @Test
    public void testeNomeClienteValido() throws Exception {
        Cliente cliente = new Cliente();
        cliente.setNomeCliente("Matheus");
        String valorRecebido = cliente.getNomeCliente();
        assertEquals(valorRecebido, "Matheus");
    }
     
    // Teste Nome inválido estourando o limite de caracteres
    @Test
    public void testeNomeClienteInvalido1() throws Exception {
        Cliente cliente = new Cliente();
        String expResult = "Nome maior que 45 caracteres";
        try {
            cliente.setNomeCliente("Marcos Lopes Joaquim Deodoro da Fonseca Filho Júnior");
            String valorRecebido = cliente.getNomeCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // Teste Nome inválido vazio
    @Test
    public void testeNomeClienteInvalido2() throws Exception {
        Cliente cliente = new Cliente();
        String expResult = "Nome Invalido";
        try {
            cliente.setNomeCliente("");
            String valorRecebido = cliente.getNomeCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // Teste CPF do Cliente
    @Test
    public void testeCPFClienteValido() throws Exception {
        Cliente cliente = new Cliente();
        cliente.setCpfCliente("720.834.973-84");
        String valorRecebido = cliente.getCpfCliente();
        assertEquals(valorRecebido, "72083497384");
    }
    // CPF inválido menor que 11 dígitos
    @Test
    public void testeCPFClienteInvalido1() throws Exception {
        Cliente cliente = new Cliente();
        String expResult = "CPF Invalido";
        try {
            cliente.setCpfCliente("720.834.973-8");
            String valorRecebido = cliente.getCpfCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // CPF inválido menor que 12 dígitos
    @Test
    public void testeCPFClienteInvalido2() throws Exception {
        Cliente cliente = new Cliente();
        String expResult = "CPF Invalido";
        try {
            cliente.setCpfCliente("720.834.973-844");
            String valorRecebido = cliente.getCpfCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // CPF inválido vazio
    @Test
    public void testeCPFClienteInvalido3() throws Exception {
        Cliente cliente = new Cliente();
        String expResult = "CPF Invalido";
        try {
            cliente.setCpfCliente("");
            String valorRecebido = cliente.getCpfCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // Teste Data de nascimento
    @Test
    public void testeDataNascimentoClienteValido() throws Exception {
        Cliente cliente = new Cliente();
        Calendar cal = new GregorianCalendar();
        // Reduz um mês na data atual instanciada
        cal.add(Calendar.DAY_OF_MONTH, -1);
        Date data = cal.getTime();
        cliente.setDataNascCliente(data);
        Date results = cliente.getDataNascCliente();
        assertEquals(data, results);        
    }
    // Data inválida um mês seguinte ao mês atual
    @Test
    public void testeDataNascimentoClienteInvalido1() throws Exception {
        Cliente cliente = new Cliente();
        Calendar cal = new GregorianCalendar();
        // Adiciona um mês na data atual instanciada
        cal.add(Calendar.DAY_OF_MONTH, 1);
        String expResult = "Data Invalida";
        try {
            Date data = cal.getTime();
            cliente.setDataNascCliente(data);
            Date results = cliente.getDataNascCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    //Teste CEP
    @Test
    public void testeCEPClienteValido() throws Exception {
        Cliente pessoa = new Cliente();
        pessoa.setCepCliente("86300000");
        String valorRecebido = pessoa.getCepCliente();
        assertEquals(valorRecebido, "86300000");
    }
    // CEP Inválido com menos de 8 dígitos
    @Test
    public void testeCEPClienteInvalido1() throws Exception {
        Cliente pessoa = new Cliente();
        String expResult = "CEP Invalido";
        try {
            pessoa.setCepCliente("86300");
            String valorRecebido = pessoa.getCepCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // CEP Inválido com mais de 8 dígitos
    @Test
    public void testeCEPClienteInvalido2() throws Exception {
        Cliente pessoa = new Cliente();
        String expResult = "CEP Invalido";
        try {
            pessoa.setCepCliente("863000000");
            String valorRecebido = pessoa.getCepCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    @Test
    public void testeLogradouroClienteValido() throws Exception {
        Cliente pessoa = new Cliente();
        pessoa.setLogradouroCliente("Rua do Escambau");
        String valorRecebido = pessoa.getLogradouroCliente();
        assertEquals(valorRecebido, "Rua do Escambau");
    }
    // Logradouro inválido estourando o limite de caracteres
    @Test
    public void testeLogradouroClienteInvalido1() throws Exception {
        Cliente pessoa = new Cliente();
        String expResult = "Logradouro maior que 45 caracteres";
        try {
            pessoa.setLogradouroCliente("Rua Marcos Lopes Joaquim Deodoro Ultimo Filho Júnior");
            String valorRecebido = pessoa.getLogradouroCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // Logradouro inválido vazio
    @Test
    public void testeLogradouroClienteInvalido2() throws Exception {
        Cliente pessoa = new Cliente();
        String expResult = "Logradouro Invalido";
        try {
            pessoa.setLogradouroCliente("");
            String valorRecebido = pessoa.getLogradouroCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    //Teste numero casa Cliente
    @Test
    public void testeNumeroClienteValido() throws Exception {
        Cliente pessoa = new Cliente();
        pessoa.setNumeroCliente(10);
        int valorRecebido = pessoa.getNumeroCliente();
        assertEquals(valorRecebido, 10);
    }
    @Test
    public void testeNumeroClienteInvalido() throws Exception {
        Cliente pessoa = new Cliente();
        String expResult = "Numero Invalido";
        try {
            pessoa.setNumeroCliente(0);
            int valorRecebido = pessoa.getNumeroCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
        @Test
    public void testeBairroClienteValido() throws Exception {
        Cliente pessoa = new Cliente();
        pessoa.setBairroCliente("Centro");
        String valorRecebido = pessoa.getBairroCliente();
        assertEquals(valorRecebido, "Centro");
    }
    // Bairro inválido estourando o limite de caracteres
    @Test
    public void testeBairroClienteInvalido1() throws Exception {
        Cliente pessoa = new Cliente();
        String expResult = "Bairro maior que 45 caracteres";
        try {
            pessoa.setBairroCliente("Zona centralizada do Parque Joaquim Moreira Silva");
            String valorRecebido = pessoa.getBairroCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // Bairro inválido vazio
    @Test
    public void testeBairroClienteInvalido2() throws Exception {
        Cliente pessoa = new Cliente();
        String expResult = "Bairro Invalido";
        try {
            pessoa.setBairroCliente("");
            String valorRecebido = pessoa.getBairroCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    //Teste Cidade Cliente 
    @Test
    public void testeCidadeClienteValido() throws Exception {
        Cliente pessoa = new Cliente();
        pessoa.setCidadeCliente("Londrina");
        String valorRecebido = pessoa.getCidadeCliente();
        assertEquals(valorRecebido, "Londrina");
    }
    // Cidade inválida estourando o limite de caracteres
    @Test
    public void testeCidadeClienteInvalido1() throws Exception {
        Cliente pessoa = new Cliente();
        String expResult = "Cidade maior que 45 caracteres";
        try {
            pessoa.setCidadeCliente("Santo Antônio da Platina do Sudoeste Paranaense");
            String valorRecebido = pessoa.getCidadeCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // Cidade inválida vazia
    @Test
    public void testeCidadeClienteInvalido2() throws Exception {
        Cliente pessoa = new Cliente();
        String expResult = "Cidade Invalida";
        try {
            pessoa.setCidadeCliente("");
            String valorRecebido = pessoa.getCidadeCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    @Test
    public void testeEstadoClienteValido() throws Exception {
        Cliente pessoa = new Cliente();
        pessoa.setEstadoCliente("Parana");
        String valorRecebido = pessoa.getEstadoCliente();
        assertEquals(valorRecebido, "Parana");
    }
    // Estado inválido estourando o limite de caracteres
    @Test
    public void testeEstadoClienteInvalido1() throws Exception {
        Cliente pessoa = new Cliente();
        String expResult = "Estado maior que 45 caracteres";
        try {
            pessoa.setEstadoCliente("Maranhão Justino Cortieri do Nordeste Praineiro");
            String valorRecebido = pessoa.getEstadoCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // Estado inválido vazio
    @Test
    public void testeEstadossoaClienteInvalido2() throws Exception {
        Cliente pessoa = new Cliente();
        String expResult = "Estado Invalido";
        try {
            pessoa.setEstadoCliente("");
            String valorRecebido = pessoa.getEstadoCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
        @Test
    public void testeTelefoneClienteValido() throws Exception {
        Cliente pessoa = new Cliente();
        String telefone = "(19)99999-9999";
        pessoa.setTelefoneCliente(telefone);
        String valorRecebido = pessoa.getTelefoneCliente();
        assertEquals(valorRecebido, "19999999999");
    }
    // Telefone inválido para menos que 10 dígitos
    @Test
    public void testeTelefoneClienteInvalido1() throws Exception {
        Cliente pessoa = new Cliente();
        String expResult = "Telefone Invalido";
        try {
            String telefone = "(19)99999-99";
            pessoa.setTelefoneCliente(telefone);
            String valorRecebido = pessoa.getTelefoneCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    // Telefone inválido para maior que 11 dígitos
    @Test
    public void testeTelefoneClienteInvalido2() throws Exception {
        Cliente pessoa = new Cliente();
        String expResult = "Telefone Invalido";
        try {
            String telefone = "(19)99999-99999";
            pessoa.setTelefoneCliente(telefone);
            String valorRecebido = pessoa.getTelefoneCliente();
            fail("Deveria ter lançado uma exceção!");
        } catch(Exception e) {
            assertEquals(expResult, e.getMessage());
        }
    }
    
    //Teste Complemento Valido
    @Test
    public void testeComplementoClienteValido1() throws Exception{
        Cliente pessoa = new Cliente();
        pessoa.setComplementoCliente("Apartamento 12");
        assertEquals("Apartamento 12", pessoa.getComplementoCliente());
    }
    
    
    //Teste Complemento Valido NULL
    @Test
    public void testeComplementoClienteValido2() throws Exception{
        Cliente pessoa = new Cliente();
        pessoa.setComplementoCliente("");
        assertEquals("", pessoa.getComplementoCliente());
    }
    
}
