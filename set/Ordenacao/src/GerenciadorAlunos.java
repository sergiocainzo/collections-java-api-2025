import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    // Atributos
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    // Metodos Personalizados
    // Adicionar Aluno
    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    // Remover por Matricula
    public void removerAluno(long matricula) {
        System.out.println("\n\t --- Removendo da Lista ---");
        Aluno removerAluno = null;
        for (Aluno aluno : alunoSet) {
            if (aluno.getMatricula() == matricula) {
                removerAluno = aluno;
                System.out.printf("Matricula: '%s' localizada.\n", matricula);
                break;
            }
        }

        if (removerAluno != null) {
            alunoSet.remove(removerAluno);
            System.out.printf("Matricula: %s, removida com sucesso.\n", matricula);
        } else {
            System.out.printf("Matricula: '%s' não encontrada.\n", matricula);
        }

    }

    // Exibir Aluno por Nome Alfabético
    public void exibirAlunoPorNome() {
        System.out.println("\tOrdenado por Ordem Alfabética");
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()) {
            System.out.println(alunoPorNome);
        } else {
            System.out.println("Lista Vazia!");
        }
    }

    // Exibir Aluno por Nota
    public void exibirAlunoPorNota() {
        System.out.println("\tOrdenado por Nota");
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunoSet.isEmpty()) {
            alunoPorNota.addAll(alunoSet);
            System.out.println(alunoPorNota);
        } else {
            System.out.println("Lista Vazia!");
        }

    }

    public static void main(String[] args) {
        // Atributo
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Iniciando Testes
        // Adicionando Aluno
        gerenciadorAlunos.adicionarAluno("Sergio Cainzo", 1l, 7);
        gerenciadorAlunos.adicionarAluno("Ismael Coelho", 2l, 8.0);
        gerenciadorAlunos.adicionarAluno("Bernardo Alcantara", 3l, 10);
        gerenciadorAlunos.adicionarAluno("Alberita Nunes", 4l, 9);
        gerenciadorAlunos.adicionarAluno("Abelardo Reis", 5l, 7.5);
        gerenciadorAlunos.adicionarAluno("Irinel Zucker", 6l, 6.9);
        gerenciadorAlunos.adicionarAluno("Beatriz Oliveira", 7l, 9.5);

        // Removendo aluno pela matricula
        gerenciadorAlunos.removerAluno(2);
        gerenciadorAlunos.removerAluno(8);

        // Exibindo por ordem Alfetica
        gerenciadorAlunos.exibirAlunoPorNome();

        // Exibir por Nota
        gerenciadorAlunos.exibirAlunoPorNota();

    }

}
