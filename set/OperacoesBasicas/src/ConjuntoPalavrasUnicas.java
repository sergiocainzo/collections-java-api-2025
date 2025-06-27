import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    // Atributos
    private Set<String> palavrasUnicas;

    // Constructor
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    // Metodos Getter and Setter
    public Set<String> getPalavrasUnicas() {
        return palavrasUnicas;
    }

    public void setPalavrasUnicas(Set<String> palavrasUnicas) {
        this.palavrasUnicas = palavrasUnicas;
    }

    // Metodos Personalizados
    // Exibição
    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas [palavrasUnicas=" + palavrasUnicas + "]";
    }

    // Verificação de id
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavrasUnicas == null) ? 0 : palavrasUnicas.hashCode());
        return result;
    }

    // Verificação de Equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
        if (palavrasUnicas == null) {
            if (other.palavrasUnicas != null)
                return false;
        } else if (!palavrasUnicas.equals(other.palavrasUnicas))
            return false;
        return true;
    }

    // Adicionar palavra
    public void adicionarPalavras(String palavra) {
        System.out.println("\t --- Adicionando Palavra ---");
        this.palavrasUnicas.add(palavra);
        System.out.printf("%s, adicionada com sucesso.\n", palavra);
    }

    // Remover Palavra
    public void removerPalavra(String palavra) {
        System.out.println("\t --- Removendo Palavra da Lista ---");
        palavrasUnicas.remove(palavra);
        System.out.printf("%s, removida com sucesso.\n", palavra);
    }

    // Verificar se palavra existe no grupo
    public void verificarPalavra(String palavra){
        System.out.println("\t --- Localizando Palavra ---");
        for (String p : palavrasUnicas) {
            if (p.equals(palavra)) {
                System.out.printf("%s, localizada dentro da lista.\n", palavra);
                break;
            }
        }
    }

    // Exibição na tela
    public void exibirPalavrasUnicas() {
        System.out.println("\t --- Lista de Palavras ---");
        for (String string : palavrasUnicas) {
            System.out.printf("%s\n", string);

        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavras("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavras("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavras("Palavra 2");
        conjuntoPalavrasUnicas.adicionarPalavras("Palavra 3");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("Palavra 1");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.verificarPalavra("Palavra 2");

    }

}
