public class Produto {

    // Atributos
    private String nome;
    private double preco;
    private int quantidade;

    // Constructor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Metodos Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

}
