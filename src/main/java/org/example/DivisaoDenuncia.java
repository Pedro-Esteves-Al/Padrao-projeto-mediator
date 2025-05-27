package org.example;

public class DivisaoDenuncia {
    private static DivisaoDenuncia instancia = new DivisaoDenuncia();

    private DivisaoDenuncia() {}

    public static DivisaoDenuncia getInstancia() {
        return instancia;
    }

    public String receberDenunciaAnonima(String mensagem) {
        return "A Polícia agradece seu contato. Você não será identificado. Mensagem: "
                + DivisaoEspecial.getInstancia().receberDenunciaAnonima(mensagem);
    }
    public String receberDenunciaIdentificada(String mensagem) {
        return "A Polícia agradece seu contato. Essa denúncia será registrada no seu cpf. Mensagem: " +
                DivisaoEspecial.getInstancia().receberDenunciaIdentificada(mensagem);
    }
}
