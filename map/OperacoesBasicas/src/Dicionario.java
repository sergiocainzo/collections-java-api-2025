import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    // Atributo
    private Map<String, String> dicionarioMap;

    // Constructor
    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    // Metodos Personalizados
    // Adicionar Palavra
    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    // Remover Palavra
    public void removerPalavra(String palavra) {
        String palavraRemover = dicionarioMap.remove(palavra);
        if (dicionarioMap.isEmpty()) {
            System.out.println("Dicionado vazio.");
            return;
        }

        if (palavraRemover != null) {
            System.out.printf("A palavra: '%s - %s' foi removida com sucesso.\n", palavra, palavraRemover);
        } else {
            System.out.printf("Palavra: '%s', não localizada no Dicionario\n", palavra);
        }

    }

    // Exibir Palavras
    public void exibirPalavras() {
        System.out.println("\tDicionado de Palavras");
        if (dicionarioMap.isEmpty()) {
            System.out.println("Dicionario Vazio.");
        } else {
            System.out.println(dicionarioMap);
        }
    }

    // Pesquisar por Palavra
    public String pesquisarPorPalavra(String palavra) {
        System.out.println("\tPesquisa por Nome");
        String palavraPorNome = dicionarioMap.get(palavra);
        if (palavraPorNome == null) {
            return "Palavra não encontrada no dicionario";
        } else {
            return palavra + " - " + palavraPorNome;
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Inicio dos Testes
        // Adicionando palavra
        dicionario.adicionarPalavra("Ola", "Forma de se comprimentar");
        dicionario.adicionarPalavra("Tchau", "Forma de se despedir");

        // Exibir lista do dicionario
        dicionario.exibirPalavras();
        // Removendo Palavra existente
        dicionario.removerPalavra("Tchau");
        // Removendo palavra inexistente
        dicionario.removerPalavra("Teste");

        // Exibir Palavras
        dicionario.exibirPalavras();

        // Localizar por Nome
        System.out.println(dicionario.pesquisarPorPalavra("Ola"));
        System.out.println(dicionario.pesquisarPorPalavra("Teste"));

    }

}
