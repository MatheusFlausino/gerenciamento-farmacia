/*
    Classe com os principais dados dos Fornecedores
 */
package sistema.de.gerenciamento.de.farmácia;

import java.io.Serializable;

/**
 *
 * @author pedro
 */
public class Fornecedor implements Serializable {

    private String nomeFornecedor;
    private int idFornecedor;
    private int cnpjFornecedor;
    private int cepFornecedor;
    private String logradouroFornecedor;
    private int numeroFornecedor;
    private String bairroFornecedor;
    private int telefoneFornecedor;

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public int getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(int cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public int getCepFornecedor() {
        return cepFornecedor;
    }

    public void setCepFornecedor(int cepFornecedor) {
        this.cepFornecedor = cepFornecedor;
    }

    public String getLogradouroFornecedor() {
        return logradouroFornecedor;
    }

    public void setLogradouroFornecedor(String logradouroFornecedor) {
        this.logradouroFornecedor = logradouroFornecedor;
    }

    public int getNumeroFornecedor() {
        return numeroFornecedor;
    }

    public void setNumeroFornecedor(int numeroFornecedor) {
        this.numeroFornecedor = numeroFornecedor;
    }

    public String getBairroFornecedor() {
        return bairroFornecedor;
    }

    public void setBairroFornecedor(String bairroFornecedor) {
        this.bairroFornecedor = bairroFornecedor;
    }

    public int getTelefoneFornecedor() {
        return telefoneFornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.idFornecedor;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fornecedor other = (Fornecedor) obj;
        if (this.idFornecedor != other.idFornecedor) {
            return false;
        }
        return true;
    }

    public Fornecedor() {
    }

    public void setTelefoneFornecedor(int telefoneFornecedor) {
        this.telefoneFornecedor = telefoneFornecedor;
    }
}
