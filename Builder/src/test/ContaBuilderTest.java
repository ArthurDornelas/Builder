package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import padrao.builder.Conta;
import padrao.builder.ContaBuilder;

import static org.junit.jupiter.api.Assertions.*;

class ContaBuilderTest {

    @Test
    void deveRetornarExcecaoParaContaSemNumeroConta() {
        try {
            ContaBuilder contaBuilder = new ContaBuilder();
            Conta conta = contaBuilder
                    .setNome("Cliente Conta 1")
                    .setEmail("client_conta1@hotmail.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número da conta inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaContaSemNome() {
        try {
            ContaBuilder contaBuilder = new ContaBuilder();
            Conta conta = contaBuilder
                    .setNumeroConta(5232400)
                    .setEmail("client_conta1@hotmail.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarContaValida() {
        ContaBuilder contaBuilder = new ContaBuilder();
        Conta conta = contaBuilder
                .setNumeroConta(5232400)
                .setNome("Client Conta 1")
                .setEmail("client_conta1@hotmail.com")
                .build();

        assertNotNull(conta);
    }
}
