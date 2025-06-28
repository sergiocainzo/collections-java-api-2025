import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    // Atributos
    private Set<Contato> contatoSet;

    // Constructor
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    // Metodos Personalizados
    // Adicionar Contato
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    // Exibir Contato
    public void exibirContatos() {
        System.out.println("\t --- Lista de Contatos ---");
        if (contatoSet.isEmpty()) {
            System.out.println("Lista está vazia");
        } else {
            for (Contato contato : contatoSet) {
                System.out.println(contato);
            }
        }
    }

    // Pesquisar por nome
    public Set<Contato> pesquisarPorNome(String nome){
        System.out.println("\t --- Pesquisa por Nome ---");
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : contatoSet) {
            if (contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        System.out.println("\t --- Atualizar Numero ---");
        Contato contatoAtualizado = null;
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos ac = new AgendaContatos();

        ac.exibirContatos();
        ac.adicionarContato("Sergio Cainzo", 998336346);
        ac.adicionarContato("Sergio Hermany", 999998899);
        ac.adicionarContato("Sergio", 999998899);
        ac.adicionarContato("Maria Silva", 0);
        ac.adicionarContato("Sergio Peter", 999998899);
        ac.exibirContatos();
        System.out.println(ac.pesquisarPorNome("Sergio"));
        System.out.println("Contato atualizado: "+ac.atualizarNumeroContato("Maria Silva", 111111111));
        ac.exibirContatos();
    }

}
