package org.example;

public class Experimento {

    private String nome;
    private String estado;

    public Experimento(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void iniciar() {
        this.estado = "Experimento iniciado";
    }

    public void parar() {
        this.estado = "Experimento parado";
    }

    public void pausar() {
        this.estado = "Experimento pausado";
    }
}
