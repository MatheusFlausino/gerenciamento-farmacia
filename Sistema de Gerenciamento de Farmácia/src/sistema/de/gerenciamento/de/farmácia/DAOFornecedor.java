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
public class DAOFornecedor {

    public List<Fornecedor> getList() {
        return Dados.listaFornecedor;
    }

    public boolean save(Fornecedor obj) {
        Integer id = Dados.listaFornecedor.size() + 1;
        obj.setIdFornecedor(id);
        Dados.listaFornecedor.add(obj);
        return true;
    }

    public boolean remove(Fornecedor obj) {
        Dados.listaFornecedor.remove(obj);
        return true;
    }
}
