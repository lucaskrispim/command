package org.example;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {

    private List<Comando> tarefas = new ArrayList<>();

    public void executarTarefa(Comando tarefa) {
        this.tarefas.add(tarefa);
        tarefa.executar();
    }

    public void cancelarUltimaTarefa() {
        if (!tarefas.isEmpty()) {
            Comando tarefa = this.tarefas.get(this.tarefas.size() - 1);
            tarefa.cancelar();
            this.tarefas.remove(this.tarefas.size() - 1);
        }
    }
}
