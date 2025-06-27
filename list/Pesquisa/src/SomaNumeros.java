import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

    // Atributos
    private List<Integer> listaNumeros;

    // Constructor
    public SomaNumeros(){
        this.listaNumeros = new ArrayList<>();
    }

    // Metodo Getter
    public List<Integer> getListaNumeros() {
        return listaNumeros;
    }
    // Metodo Setter
    public void setListaNumeros(List<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    // Metodos Personalizados
    // Adicionar Numeros
    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    // Exibir na tela
    public void exibirNumeros(){
        System.out.println("\t --- Numeros Listados ---");
        for (Integer integer : listaNumeros) {
            System.out.printf("Numero: %d\n",integer);
        }
    }

    // Somar numeros
    public void calcularSoma(){
        int somar = 0;
        System.out.println("\t --- Calcular Soma ---");
        System.out.println("Somando os números: ");
        for (Integer integer : listaNumeros) {
            System.out.printf("%d -> ",integer);
            somar+= integer;
        }
        System.out.println("Fim");
        System.out.printf("Total da soma: %d\n",somar);
    }

    // Maior número
    public void encontrarMaiorNumero(){
        int maior = Collections.max(listaNumeros);
        System.out.println("\t --- Maior número ---");
        System.out.printf("Maior número da lista: %d\n",maior);
    }

    // Menor número
    public void encontrarMenorNumero(){
        int menor = Collections.min(listaNumeros);
        System.out.println("\t --- Menor número ---");
        System.out.printf("Menor número da lista: %d\n", menor);
    }

    public static void main(String[] args) {
        SomaNumeros sm = new SomaNumeros();
        sm.exibirNumeros();
        sm.adicionarNumero(5);
        sm.adicionarNumero(8);
        sm.adicionarNumero(9);
        sm.adicionarNumero(1);
        sm.adicionarNumero(7);
        sm.exibirNumeros();
        sm.calcularSoma();
        sm.encontrarMaiorNumero();
        sm.encontrarMenorNumero();
    }

    




}
