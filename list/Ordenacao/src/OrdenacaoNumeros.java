import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {

    // Atributos
    private List<Integer> listaNumeros;

    // Constructor
    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    // Metodos Personalizados
    // Adicionar na lista
    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros [listaNumeros=" + listaNumeros + "]";
    }

    // Ordenar por Ascendente
    public List<Integer> ordenarAscendente() {
        List<Integer> ordenarPorOrdemAscendente = new ArrayList<>(listaNumeros);
        Collections.sort(ordenarPorOrdemAscendente);
        return ordenarPorOrdemAscendente;
        

    }
    //Ordenar por Descente
    public List<Integer> ordenarDescendente(){
        List<Integer> ordenarPorOrdemDescendente = new ArrayList<>(listaNumeros);
        Collections.sort(ordenarPorOrdemDescendente,Comparator.reverseOrder());
        return ordenarPorOrdemDescendente;
    }

    // Metodos Getter and Setter
    public List<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(List<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros on = new OrdenacaoNumeros();
        on.adicionarNumero(2);
        on.adicionarNumero(1);
        on.adicionarNumero(4);
        on.adicionarNumero(3);

        System.out.printf("Lista Original: %s\n",on.listaNumeros);
        System.out.printf("Lista Ascendente: %s\n",on.ordenarAscendente());
        System.out.printf("Lista Descendente: %s\n", on.ordenarDescendente());
    }

}
