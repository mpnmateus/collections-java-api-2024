package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codConvite;

    public Convidado(String nome, int codCOnvite) {
        Objects.requireNonNull(nome, "Nome não pode ser null");
        this.nome = nome;
        this.codConvite = codCOnvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodConvite() {
        return codConvite;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codConvite=" + codConvite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodConvite() == convidado.getCodConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodConvite());
    }
}
