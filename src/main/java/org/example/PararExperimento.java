package org.example;

public class PararExperimento implements Comando {

    private Experimento experimento;

    public PararExperimento(Experimento experimento) {
        this.experimento = experimento;
    }

    @Override
    public void executar() {
        this.experimento.parar();
    }

    @Override
    public void cancelar() {
        this.experimento.iniciar();
    }
}
