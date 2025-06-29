import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    // Atributos
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    // Metodos Personalizados
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    // Exibir Produtos
    public void exibirProdutos() {
        System.out.println("\t ---Lista de Produtos---");
        if (estoqueProdutosMap.isEmpty()) {
            System.out.println("Lista Vazia");
        } else {
            System.out.println(estoqueProdutosMap);
        }
    }

    // Calcular Valor Total
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    // Produto mais caro
    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    // Produto Mais Barato
    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Inicio dos Testes
        estoque.exibirProdutos();

        // Adicionando Produtos
        estoque.adicionarProduto(1L, "Produto A", 10,5.0);
        estoque.adicionarProduto(2L, "Produto B", 5,10.0);
        estoque.adicionarProduto(3L, "Produto C", 2,15.0);

        // Exibindo Produtos
        estoque.exibirProdutos();

        // Valor Total do estoque
        System.out.println("Valor Total do estoque: R$"+estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: "+estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: "+estoque.obterProdutoMaisBarato());











    }

}
