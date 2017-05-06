/*
 Classe com os principais dados dos produtos
 */
package sistema.de.gerenciamento.de.farmácia;

import java.io.Serializable;

/**
 *
 * @author pedro e mathues
 */
public class Produto implements Serializable {

    private int idProduto;
    private int precoProduto;
    private String fabricanteProduto;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) throws Exception {
        if (idProduto >= 0) {
            this.idProduto = idProduto;
        } else {
            throw new Exception("ID Invalido");
        }
    }

    public int getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(int precoProduto) throws Exception {
        if (precoProduto > 0) {
            this.precoProduto = precoProduto;
        } else {
            throw new Exception("Preco Invalido");
        }
    }

    public String getProdutoFabricante() {
        return fabricanteProduto;
    }

    public void setProdutoFabricante(String fabricanteProduto) throws Exception {
        if (fabricanteProduto.isEmpty()) {
            throw new Exception("Nome Invalido");
        } else if (fabricanteProduto.length() < 25) {
            this.fabricanteProduto = fabricanteProduto;
        } else {
            throw new Exception("Nome maior que 25 caracteres");
        }
    }
}
