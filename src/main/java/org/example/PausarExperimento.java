package org.example;

public class PausarExperimento implements Comando {

    private Experimento experimento;

    public PausarExperimento(Experimento experimento) {
        this.experimento = experimento;
    }

    @Override
    public void executar() {
        this.experimento.pausar();
    }

    @Override
    public void cancelar() {
        this.experimento.iniciar();
    }
}
