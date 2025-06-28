import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // Atributo
    private Map<String, Integer> agendaContatoMap;

    // Constructor
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    // Metodos Personalizados
    // Adicionar Contato
    public void adicionarcontato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    // Remover Contato
    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("Lista Vazia.");
        }
    }

    // Exibir Contato
    public void exibirContato() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // Iniciando Testes
        agendaContatos.adicionarcontato("Camila", 123456);
        agendaContatos.adicionarcontato("Camila", 5665);
        agendaContatos.adicionarcontato("Camila Cavalcante", 11111111);
        agendaContatos.adicionarcontato("Camila DIO", 654987);
        agendaContatos.adicionarcontato("Maria Silva", 111111111);
        agendaContatos.adicionarcontato("Camila", 444444);

        //Exibir contato
        agendaContatos.exibirContato();

        // Remover
        agendaContatos.removerContato("Maria Silva");

        //Exibir contatos
        agendaContatos.exibirContato();

        System.out.println("O número é: "+agendaContatos.pesquisarPorNome("Camila DIO"));


    }

}
