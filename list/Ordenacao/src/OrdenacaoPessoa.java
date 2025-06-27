import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    // Atributos
    private List<Pessoa> pessoaList;

    // Constructor
    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    // Metodos Personalizados
    // Adicionar Pessoa
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    // Ordenar por Idade
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    // Ordenar por Altura
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa op = new OrdenacaoPessoa();

        op.adicionarPessoa("Nome 1", 20, 1.56);
        op.adicionarPessoa("Nome 2", 30, 1.80);
        op.adicionarPessoa("Nome 3", 25, 1.70);
        op.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(op.ordenarPorIdade());
        System.out.println(op.ordenarPorAltura());
    }

}
