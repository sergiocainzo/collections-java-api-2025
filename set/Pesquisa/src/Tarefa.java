public class Tarefa {

    // Atributos
    private String descricao;
    private boolean status;

    // Constructor
    public Tarefa(String descricao, boolean status) {
        this.setDescricao(descricao);
        this.setStatus(status);
    }

    // Metodos Getter and Setter
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getStatusDescricao(){
        if (this.status) {
            return "Concluído";
        } else {
            return "Pendente";
        }
    }

    @Override
    public String toString() {
        return "{Descrição: "+descricao+", Status: "+getStatusDescricao()+"}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + (status ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (status != other.status)
            return false;
        return true;
    }

}
