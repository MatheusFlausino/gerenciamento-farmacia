/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.gerenciamento.de.farmácia;

import java.util.List;

/**
 *
 * @author pedro
 */
public class DAOCliente {

    public List<Cliente> getList() {
        return Dados.listaCliente;
    }

    public boolean save(Cliente obj) {
        Integer id = Dados.listaCliente.size() + 1;
        obj.setIdCliente(id);
        Dados.listaCliente.add(obj);
        return true;
    }

    public boolean remove(Cliente obj) {
        Dados.listaCliente.remove(obj);
        return true;
    }
}
