/*
    Classe com os principais dados dos clientes
 */
package sistema.de.gerenciamento.de.farmácia;

import java.io.Serializable;

/**
 * @author pedro
 *
 */
public class Cliente implements Serializable {

    private String nomeCliente;
    private int idCliente;
    private int cpfCliente;
    private int dataNasCliente;
    private int cepCLiente;
    private String logradouroCLiente;
    private int numeroCliente;
    private String bairroCliente;
    private int telefoneCliente;

    public Cliente() {
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(int cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public int getDataNasCliente() {
        return dataNasCliente;
    }

    public void setDataNasCliente(int dataNasCliente) {
        this.dataNasCliente = dataNasCliente;
    }

    public int getCepCLiente() {
        return cepCLiente;
    }

    public void setCepCLiente(int cepCLiente) {
        this.cepCLiente = cepCLiente;
    }

    public String getLogradouroCLiente() {
        return logradouroCLiente;
    }

    public void setLogradouroCLiente(String logradouroCLiente) {
        this.logradouroCLiente = logradouroCLiente;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public int getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(int telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.idCliente;
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
        final Cliente other = (Cliente) obj;
        if (this.idCliente != other.idCliente) {
            return false;
        }
        return true;
    }

}
