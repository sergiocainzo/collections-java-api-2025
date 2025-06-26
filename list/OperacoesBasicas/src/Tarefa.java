public class Tarefa {
    // Atributo
    private String descricao;

    // Constructor
    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    // Metodos Getter and Setter
    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    // Metodo Personalizado
    // Exibição na tela
    @Override
    public String toString() {
        return descricao;
    }

    

}
