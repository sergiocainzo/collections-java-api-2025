import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    // Atributos
    private Map<String, Integer> palavrasMap;

    // Constructor
    public ContagemPalavras() {
        this.palavrasMap = new HashMap<>();
    }

    // Metodos Personalizados
    public void adicionarPalavra(String palavra, Integer contagem) {
        palavrasMap.put(palavra, contagem);
    }

    // Exibição das palavras
    public void exibirListMap() {
        if (palavrasMap.isEmpty()) {
            System.out.println("Lista Vazia");
        } else {
            System.out.println(palavrasMap);
        }
    }

    // Remover Palavra
    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
        } else {
            System.out.println("Map vazio!");
        }
    }

    // Exibir contagem de Palavras
    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : palavrasMap.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    // Palavras mais frequentes
    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        // Iniciando Testes
        // Exibindo Lista Vazia
        contagem.exibirListMap();

        // Adicionando
        contagem.adicionarPalavra("Cobol", 20);
        contagem.adicionarPalavra("JavaScript", 1);
        contagem.adicionarPalavra("C#", 6);
        contagem.adicionarPalavra("Python", 8);
        contagem.adicionarPalavra("Java", 21);

        // Exibindo Lista Atualizada
        contagem.exibirListMap();

        //Contagem Total de Palavras
        System.out.println("Contagem Total: "+ contagem.exibirContagemPalavras());

        // Palavra com maior frequencia
        System.out.println("Maior Frequencia: "+contagem.encontrarPalavraMaisFrequente());

        // Excluir
        contagem.removerPalavra("C#");

        // Lista atualizada
        contagem.exibirListMap();

    }

}
