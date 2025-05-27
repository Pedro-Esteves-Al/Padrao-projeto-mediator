package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadaoTest {


    @Test
    void deveRealizarDenunciaAnonima() {
        Cidadao cidadao = new Cidadao();
        assertEquals("A Polícia agradece seu contato. "+
                "Você não será identificado. Mensagem: A seguinte denúncia ANÔNIMA foi registrada: Violência doméstica",
                cidadao.realizarDenunciaAnonima("Violência doméstica"));
    }

    @Test
    void realizarDenunciaIdentificada() {
        Cidadao cidadao = new Cidadao();
        assertEquals("A Polícia agradece seu contato. "+
                        "Essa denúncia será registrada no seu cpf. Mensagem: A seguinte denúncia foi registrada para seu cpf: Agressão física",
                cidadao.realizarDenunciaIdentificada("Agressão física"));
    }

}