package br.com.blog;

import java.io.Serializable;

public final class Endereco implements Serializable {

    private static final long serialVersionUID = -8742559389645814431L;

    private String logradouro;
    private Cep cep = Cep.apply("00000000");

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }

}
