package org.example;

public class IniciarExperimento implements Comando {

    private Experimento experimento;

    public IniciarExperimento(Experimento experimento) {
        this.experimento = experimento;
    }

    @Override
    public void executar() {
        this.experimento.iniciar();
    }

    @Override
    public void cancelar() {
        this.experimento.parar();
    }
}