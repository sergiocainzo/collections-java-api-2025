import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Atributo
    private List<Tarefa> tarefaList;

    // Constructor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Metodos Personalizados
    // Adicionando Tarefa
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    // Removendo Tarefa
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    // Numero Total de Tarefas
    public int obterNumeroTotalDeTarefa() {
        return tarefaList.size();
    }

    // Obter Descrição de Tarefas
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    



    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefa());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefa());
        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalDeTarefa());
        listaTarefa.obterDescricoesTarefas();




    }

}
