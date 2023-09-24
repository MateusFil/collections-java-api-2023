package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //Atributo
    private Map<LocalDate,Evento> eventosMap;

    public AgendaEventos(){
        this.eventosMap = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data,evento);
    }

    public void exibirAgenda() {
        Map<LocalDate,Evento> eventostreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventostreeMap);
    }

    public void obterProximoEvento() {
        /*Set<LocalDate> dateSet = eventosMap.keySet();
        Collection<Evento> values = eventosMap.values();*/
        //eventosMap.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate,Evento > eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate,Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + entry.getValue() +"acontecera na data " + entry.getKey());
            }
        }
    }



    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(1997, Month.JUNE,6),"Nascimento","Eu");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER,30),"Contratado","Eu");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
