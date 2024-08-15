package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros(){
        this.livros = new ArrayList<Livro>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<Livro>();
        if(!livros.isEmpty())
            for(Livro l : livros)
                if(l.getAutor().equalsIgnoreCase(autor))
                    livroPorAutor.add(l);
        return livroPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntevaloAnos = new ArrayList<Livro>();
        if(!livros.isEmpty())
            for(Livro l : livros)
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal)
                    livrosPorIntevaloAnos.add(l);
        return livrosPorIntevaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livros.isEmpty())
            for(Livro l : livros)
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Cem anos de solidão", "Gabriel Garcia Marquez", 1967);
        catalogoLivros.adicionarLivro("O jogo da amarelinha", "Julio Cortázar", 1963);
        catalogoLivros.adicionarLivro("Cacau", "Jorge Amado", 1933);
        catalogoLivros.adicionarLivro("Capitães da areia", "Jorge Amado", 1937);

        System.out.println(catalogoLivros.pesquisarPorAutor("Jorge Amado"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1950, 1967));

        System.out.println(catalogoLivros.pesquisarPorTitulo("O jogo da amarelinha"));

    }

}
