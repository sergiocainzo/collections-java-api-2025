import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    // Atributos
    private Set<Produto> produtoSet;

    // Construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    // Metodos Personalizados
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    // Exibir Produtos por Nome
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    // Exibir Produtos por Preço
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cp = new CadastroProdutos();

        cp.adicionarProduto(1l, "Produto 5", 15d, 5);
        cp.adicionarProduto(2l, "Produto 0", 20d, 10);
        cp.adicionarProduto(1l, "Produto 3", 10d, 2);
        cp.adicionarProduto(9l, "Produto 9", 2d, 2);

        System.out.println(cp.produtoSet);

        System.out.println(cp.exibirProdutosPorNome());

        System.out.println(cp.exibirProdutosPorPreco());

    }

}
