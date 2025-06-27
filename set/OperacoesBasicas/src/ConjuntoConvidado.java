import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    // Atributos
    private Set<Convidado> convidadoSet;

    // Constructor
    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    // Metodo Personalizado
    // Adicionar Convidado
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    // Remover Convidado
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        for (Convidado convidado : convidadoSet) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        // Convidado para remover
        convidadoSet.remove(convidadoParaRemover);

    }

    // Contar Convidados
    public int contarConvidados() {
        return convidadoSet.size();
    }

    // Metodo para Exibir a lista de Convidados
    public void exibirConvidados() {
        System.out.printf("Convidados: %s\n", convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.printf("Existem %s convidados dentro do Set de Convidados.\n",conjuntoConvidado.contarConvidados());

        conjuntoConvidado.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidado.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidado.adicionarConvidado("Convidado 4", 1236);

        conjuntoConvidado.exibirConvidados();
        System.out.printf("Existem %s convidados dentro do Set de Convidados.\n",conjuntoConvidado.contarConvidados());
        conjuntoConvidado.removerConvidadoPorCodigoConvite(1234);
        System.out.printf("Existem %s convidados dentro do Set de Convidados.\n",conjuntoConvidado.contarConvidados());

        conjuntoConvidado.exibirConvidados();


    }

}
