public class Evento {
    // Atributos
    private String nome, atracao;

    // Constructor
    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    // Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtracao() {
        return atracao;
    }

    public void setAtracao(String atracao) {
        this.atracao = atracao;
    }

    // Metodo toString para exibição
    @Override
    public String toString() {
        return "Evento {nome=" + nome + ", atracao=" + atracao + "}";
    }

        





}
