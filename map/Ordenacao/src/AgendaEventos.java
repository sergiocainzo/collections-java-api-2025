import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

    // Atributos
    private Map<LocalDate, Evento> eventosMap;

    // Constructor
    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    // Metodos Personalizados
    // Adicionar
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    // Exibir Agenda
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        // Set<LocalDate> dataSet = eventosMap.keySet();
        // Collection<Evento> values = eventosMap.values();

        // Data Atual do Sistema
        LocalDate dataAtual = LocalDate.now();

        // Atributos
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        // Ordem Crescente das datas.
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        // Lógica
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        // Inicio Testes
        //Adicionando
        agenda.adicionarEvento(LocalDate.of(2025, Month.JULY, 4), "Evento 1", "Happy Birthday");
        agenda.adicionarEvento(LocalDate.of(2020, 7, 7), "Evento 2", "Atracao 2");
        agenda.adicionarEvento(LocalDate.of(2024, Month.JULY, 10), "Evento 3", "Atracao 3");

        // Exibindo lista
        agenda.exibirAgenda();

        // Obter proximo evento
        agenda.obterProximoEvento();




    }

}
