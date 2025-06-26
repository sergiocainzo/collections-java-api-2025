import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    // Atributos
    private List<Item> carrinhoDeCompras;

    // Construtor
    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    // Metodos Personalizados
    // Adicionar item no carrinho
    public void adicionarItemNoCarrinho(String nome, double preco, int quantidade) {
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    // Remover item do carrinho
    public void removerItemDoCarrinho(String nome) {
        List<Item> itensRemovidos = new ArrayList<>();
        for (Item item : carrinhoDeCompras) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensRemovidos.add(item);
            }
        }
    }

    // Calculo do Valor Total do carrinho
    public void calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : carrinhoDeCompras) {
            valorTotal += (item.getPreco() * item.getQuantidade());
        }
        System.out.printf("Valor Total do Carrinho: R$%.2f\n", valorTotal);
    }

    // Descrição do Carrinho
    public void exibirItens() {
        System.out.println(carrinhoDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItemNoCarrinho("Item 1", 10.55, 7);
        carrinhoDeCompras.adicionarItemNoCarrinho("Item 2", 8.25, 10);
        System.out.println("\t--- Lista de Itens ---");
        carrinhoDeCompras.exibirItens();
        System.out.println("\t*** Valor Total do Carrinho ***");
        carrinhoDeCompras.calcularValorTotal();

    }

}
