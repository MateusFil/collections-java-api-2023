//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList = new ArrayList();

    public ListaTarefa() {
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList();
        if (!this.tarefaList.isEmpty()) {
            Iterator var3 = this.tarefaList.iterator();

            while(var3.hasNext()) {
                Tarefa t = (Tarefa)var3.next();
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover.add(t);
                }
            }

            this.tarefaList.removeAll(tarefasParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }

    }

    public int obterNumeroTotalTarefas() {
        return this.tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        if (!this.tarefaList.isEmpty()) {
            System.out.println(this.tarefaList);
        } else {
            System.out.println("A lista está vazia!");
        }

    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar para o exame");
        listaTarefa.adicionarTarefa("Fazer exercícios");
        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
        listaTarefa.obterDescricoesTarefas();
        listaTarefa.removerTarefa("Trabalhar");
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
        listaTarefa.obterDescricoesTarefas();
        listaTarefa.removerTarefa("Estudar para o exame");
        System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
    }
}
