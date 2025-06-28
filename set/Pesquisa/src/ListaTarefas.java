import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaTarefas {

    // Atributos
    private Set<Tarefa> listaTarefas;

    // Constructor
    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    // Metodos Personalizados

    // Adicionar Tarefa
    public void adicionarTarefa(String descricao, boolean status) {
        System.out.println("\t --- Adicionando Tarefas na lista ---");
        listaTarefas.add(new Tarefa(descricao, status));
        System.out.printf("Tarefa '%s', adicionada com sucesso.\n", descricao);
    }

    // Remover Tarefa
    public void removerTarefa(String descricao) {
        System.out.println("\n\t --- Removendo da lista ---");
        Tarefa removerTarefa = null;
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getDescricao() == descricao) {
                removerTarefa = tarefa;
                System.out.printf("Removendo a tarefa '%s' ...\n", descricao);
                break;
            }
        }
        listaTarefas.remove(removerTarefa);
        System.out.println("Tarefa removida com sucesso");
    }

    // Exibição Tarefas
    public void exibirTarefas() {
        System.out.println("\n\t --- Lista de Tarefas ---");
        if (listaTarefas.isEmpty()) {
            System.out.println("Lista está vazia.");
        } else {
            System.out.println(listaTarefas);
        }
    }

    // Contar Tarefas
    public void contarTarefas() {
        System.out.println("\n\t --- Total de Tarefas ---");
        System.out.printf("Tarefas Listadas: %s\n", listaTarefas.size());
    }

    // Tarefas concluidas
    public Set<Tarefa> obterTarefasConcluidas() {
        System.out.println("\n\t --- Tarefas Concluídas ---");
        Set<Tarefa> terefasConcluidas = listaTarefas.stream().filter(Tarefa::isStatus).collect(Collectors.toSet());
        return terefasConcluidas;
    }

    // Tarefas Pendentes
    public Set<Tarefa> obterTarefasPendentes() {
        System.out.println("\n\t --- Tarefas Pendentes ---");
        Set<Tarefa> tarefasPendentes = listaTarefas.stream().filter(tarefa -> !tarefa.isStatus())
                .collect(Collectors.toSet());

        return tarefasPendentes;

    }

    // Marcar Tarefa Concluída
    public void marcarTarefaConcluida(String descricao) {
        System.out.println("\n\t --- Marcando Tarefa como Concluída ---");
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao) && !tarefa.isStatus()) {
                tarefa.setStatus(true);
                System.out.printf("Status da tarefa '%s' foi alterado com sucesso.\n", descricao);
                break;
            } else {
                System.out.printf("Tarefa: '%s' já está concluida.\n", descricao);
                break;
            }
        }
    }

    // Marcar Tarefa Pendente
    public void marcarTarefaPendente(String descricao) {
        System.out.println("\n\t --- Marcando Tarefas como Pendente ---");
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao) && tarefa.isStatus()) {
                tarefa.setStatus(false);
                System.out.printf("Status da tarefa '%s' foi alterado com sucesso.\n", descricao);
                break;
            } else {
                System.out.printf("Tarefa: %s ainda está pendente.\n", descricao);
                break;
            }
        }
    }

    // Limpando a lista de tarefas
    public void limparListaTarefas() {
        System.out.println("\n\t --- Removendo Todos os elementos da lista ---");
        System.out.println("Removendo os elementos ....");
        listaTarefas.clear();
        System.out.println("Lista zerada com sucesso.");
    }

    public static void main(String[] args) {
        ListaTarefas lt = new ListaTarefas();

        // Testes dos metodos funcionando
        // Lista vazia
        lt.exibirTarefas();

        // Adicionando Tarefas
        lt.adicionarTarefa("Teste 1", false);
        lt.adicionarTarefa("Teste 2", true);
        lt.adicionarTarefa("Teste 4", true);
        lt.adicionarTarefa("Teste 3", false);
        lt.adicionarTarefa("Teste 5", false);

        // Verificando a Lista atualizada
        lt.exibirTarefas();
        // Quantidade de Tarefas adicionadas na lista
        lt.contarTarefas();

        // Removendo Tarefa ( por descrição )
        lt.removerTarefa("Teste 5");

        // Verificando a Lista atualizada
        lt.exibirTarefas();

        // Obtendo a lista de tarefas concluidas
        System.out.println(lt.obterTarefasConcluidas());

        // Obtendo a lista de tarefas pendentes
        System.out.println(lt.obterTarefasPendentes());

        // Verificando a marcação para mudar o Status
        lt.marcarTarefaConcluida("Teste 1");
        lt.marcarTarefaConcluida("Teste 2");

        // Exibindo a lista atualizada
        lt.exibirTarefas();

        // Verificando a marcação para mudar o Status
        lt.marcarTarefaPendente("Teste 1");
        lt.marcarTarefaPendente("Teste 3");

        // Exibindo a lista atualizada
        lt.exibirTarefas();

        // Removendo todos os elementos da lista
        lt.limparListaTarefas();

        // Exibindo lista atualizada
        lt.exibirTarefas();

    }

}
