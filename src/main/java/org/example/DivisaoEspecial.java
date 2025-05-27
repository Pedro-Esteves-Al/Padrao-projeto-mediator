package org.example;

public class DivisaoEspecial implements Departamento {
    private static DivisaoEspecial instancia = new DivisaoEspecial();

    private DivisaoEspecial() {}

    public static DivisaoEspecial getInstancia() {
        return instancia;
    }

    public String receberDenunciaAnonima(String mensagem) {
        return "A seguinte denúncia ANÔNIMA foi registrada: " + mensagem;
    }
    public String receberDenunciaIdentificada(String mensagem) {
        return "A seguinte denúncia foi registrada para seu cpf: " + mensagem;
    }
}
