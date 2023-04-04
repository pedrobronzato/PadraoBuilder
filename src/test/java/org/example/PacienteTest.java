package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {
    @Test
    void deveRetornarExcecaoParaPacienteSemId() {
        try {
            PacienteBuilder  pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder
                    .setNome("Paciente 1")
                    .setEmail("paciente@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Paciente Invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPacienteSemNome() {
        try {
            PacienteBuilder  pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder
                    .setId(1)
                    .setEmail("paciente@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarPacienteValido() {

        PacienteBuilder  pacienteBuilder = new PacienteBuilder();
        Paciente paciente = pacienteBuilder
                .setId(1)
                .setNome("Jose")
                .setEmail("paciente@email.com")
                .build();

        assertNotNull(paciente);
    }

}