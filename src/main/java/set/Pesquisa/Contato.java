package main.java.set.Pesquisa;

import java.util.Objects;

public class Contato {
    private String nome;
    private int numTelefone;

    public Contato(String nome, int numTelefone) {
        this.nome = nome;
        this.numTelefone = numTelefone;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    public String getNome() {
        return nome;
    }

    public int getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(int numTelefone) {
        this.numTelefone = numTelefone;
    }

    @Override
    public String toString() {
        return "{" + nome + '\'' + numTelefone + "}";
    }
}
