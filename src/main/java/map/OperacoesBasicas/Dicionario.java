package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario(){
        this.dicionarioMap = new HashMap<String, String>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        this.dicionarioMap.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        String palavraParaRemover = null;
        if(!dicionarioMap.isEmpty()) {
            palavraParaRemover = dicionarioMap.remove(palavra);
        if(palavraParaRemover == null)
            System.out.println("Palavra para remover não encontrada.");
        } else
            System.out.println("Não há como remover, dicionário vazio.");
    }

    public void exibirPalavras(){
        if(!dicionarioMap.isEmpty())
            System.out.println(dicionarioMap);
        else
            System.out.println("Não é possível exibir as palavras pois o dicionário está vazio.");
    }
    public String pesquisarPorPalavra(String palavra){
        String definicaoPorPalavra = null;
        if(!dicionarioMap.isEmpty()) {
            definicaoPorPalavra = dicionarioMap.get(palavra);
            if(definicaoPorPalavra == null) {

                return "Palavra não encontrada";
            }
        } else
            System.out.println("Dicionário vazio.");
        return definicaoPorPalavra;
    }


    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Adicionando palavras-significado:
        dicionario.adicionarPalavra("dictionary", "dicionario");
        dicionario.adicionarPalavra("sky", "Casa");
        dicionario.adicionarPalavra("sky", "Céu");
        dicionario.adicionarPalavra("mouse", "rato");
        dicionario.adicionarPalavra("element", "elemento");

        // Exibindo lista de palavras:
        dicionario.exibirPalavras();

        // Removendo Palavras do dicionário:
        dicionario.removerPalavra("lalala");
        dicionario.removerPalavra("mouse");

        // Exibindo lista de palavras:
        dicionario.exibirPalavras();

        // Pesquisando por palavra
        String palavraParaPesquisar = "element";
        System.out.println("A tradução de " + palavraParaPesquisar + " é: " + dicionario.pesquisarPorPalavra(palavraParaPesquisar));

    }
}
