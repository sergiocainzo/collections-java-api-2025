import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    // Atributos
    private List<Livro> livrosList;

    // Construtor
    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    // Metodos Personalizados
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    // Metodo de pesquisa por Autor
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    // Pesquisa por Ano
    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    // Pesquisa por Titulo
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros cl = new CatalogoLivros();

        cl.adicionarLivro("Livro 1", "Autor 1", 2020);
        cl.adicionarLivro("Livro 1", "Autor 2", 2021);
        cl.adicionarLivro("Livro 2", "Autor 2", 2022);
        cl.adicionarLivro("Livro 3", "Autor 3", 2023);
        cl.adicionarLivro("Livro 4", "Autor 4", 1994);


        System.out.println(cl.pesquisarPorAutor("Autor 2"));
        System.out.println(cl.pesquisaPorIntervaloAnos(2020,2022));
        System.out.println(cl.pesquisarPorTitulo("Livro 1"));


    }

}
