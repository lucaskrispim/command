package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaboratorioTest {

    Laboratorio laboratorio;
    Experimento experimento;

    @BeforeEach
    void setUp() {
        laboratorio = new Laboratorio();
        experimento = new Experimento("Experimento de Física");
    }

    @Test
    void deveIniciarExperimento() {
        Comando iniciarExperimento = new IniciarExperimento(experimento);
        laboratorio.executarTarefa(iniciarExperimento);

        assertEquals("Experimento iniciado", experimento.getEstado());
    }

    @Test
    void devePararExperimento() {
        Comando pararExperimento = new PararExperimento(experimento);
        laboratorio.executarTarefa(pararExperimento);

        assertEquals("Experimento parado", experimento.getEstado());
    }

    @Test
    void deveCancelarParadaExperimento() {
        Comando iniciarExperimento = new IniciarExperimento(experimento);
        Comando pararExperimento = new PararExperimento(experimento);

        laboratorio.executarTarefa(iniciarExperimento);
        laboratorio.executarTarefa(pararExperimento);

        laboratorio.cancelarUltimaTarefa();

        assertEquals("Experimento iniciado", experimento.getEstado());
    }

    @Test
    void deveCancelarIniciarExperimento() {
        Comando iniciarExperimento = new IniciarExperimento(experimento);

        laboratorio.executarTarefa(iniciarExperimento);
        assertEquals("Experimento iniciado", experimento.getEstado());

        iniciarExperimento.cancelar();
        assertEquals("Experimento parado", experimento.getEstado());
    }

    @Test
    void devePausarExperimento() {
        Comando pausarExperimento = new PausarExperimento(experimento);

        laboratorio.executarTarefa(pausarExperimento);
        assertEquals("Experimento pausado", experimento.getEstado());
    }

    @Test
    void deveCancelarPausarExperimento() {
        Comando iniciarExperimento = new IniciarExperimento(experimento);
        Comando pausarExperimento = new PausarExperimento(experimento);

        laboratorio.executarTarefa(iniciarExperimento);
        assertEquals("Experimento iniciado", experimento.getEstado());

        laboratorio.executarTarefa(pausarExperimento);
        assertEquals("Experimento pausado", experimento.getEstado());

        pausarExperimento.cancelar();
        assertEquals("Experimento iniciado", experimento.getEstado());
    }

}